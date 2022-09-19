
import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest {
        private GameScore original = new OriginalScore();
        private GameScore bonus = new BonusScore();
        private GameScore power = new PowerScore();

    /**
     * OriginalScore
     * Clases de equivalencia:
     * incorrectas < 11 , puntaje = correctas-10*incorrectas
     * incorrectas >= 11 , puntaje = 0
     * Frontera: 0<=  puntaje <=100
      */
    @Test
    public void dadoUnJugador_CuandoEsteTieneMaximaPuntuacionEnOriginalScore_EntoncesRetorna100(){
        int puntaje = original.calculateScore(0,0);
        Assert.assertEquals(puntaje,100);
    }

    @Test
    public void dadoUnJugador_CuandoEsteTieneMinimaPuntuacionEnOriginalScore_EntoncesRetorna0(){
        int puntaje = original.calculateScore(0,10);
        Assert.assertEquals(puntaje,0);
    }

    @Test
    public void dadoUnJugador_CuandoEsteSaleDelRangoDePuntuacionEnOriginalScore_EntoncesRetorna0(){
        int puntaje = original.calculateScore(0,13);
        Assert.assertEquals(puntaje,0);
    }

    @Test
    public void dadoUnJugador_CuandoEsteEstaDentroDelRangoDePuntuacionEnOriginalScore_EntoncesRetornaElPuntajeObtenido(){
        int puntaje = original.calculateScore(0,3);
        Assert.assertEquals(puntaje,70);
    }

    /**
     *BonusScore
     * incorrecta< 2*correctas, puntaje = 10*correctas - 5*incorrectas
     * incorrectas >= 2*correctas , puntaje = 0
     * Frontera : puntaje <0
     */
    @Test
    public void dadoUnJugador_CuandoEsteTieneMinimaPuntuacionEnBonusScore_EntoncesRetorna0(){
        int puntaje = bonus.calculateScore(0,0);
        Assert.assertEquals(puntaje,0);
    }

    @Test
    public void dadoUnJugador_CuandoEsteSeSaleDelRangoDePuntuacionEnBonusScore_EntoncesRetorna0(){
        int puntaje = bonus.calculateScore(4,10);
        Assert.assertEquals(puntaje,0);
    }

    @Test
    public void dadoUnJugador_CuandoEsteEstaDentroDelRangoDePuntuacionEnBonusScore_EntoncesRetornaElPuntaje(){
        int puntaje = bonus.calculateScore(6,2);
        Assert.assertEquals(puntaje,50);
    }

    /**
     *PowerScore
     * 5**correctas > incorrectas*8 , puntaje = 5**correctas -8
     * incorrectas*8 >= 5**correctas, puntaje = 0
     * puntaje > 500, puntaje = 500
     * Frontera: 0<=puntaje <=500
     */
    @Test
    public void dadoUnJugador_CuandoEsteTieneMinimaPuntuacionEnPowerScoreScore_EntoncesRetorna0(){
        int puntaje = power.calculateScore(0,0);
        Assert.assertEquals(puntaje,1);
    }

    @Test
    public void dadoUnJugador_CuandoEsteTieneMaximaPuntuacionEnPowerScore_EntoncesRetorna500(){
        int puntaje = power.calculateScore(190,10);
        Assert.assertEquals(puntaje,500);
    }

    @Test
    public void dadoUnJugador_CuandoEsteSaleDelRangoDePuntuacionEnPowerScore_EntoncesRetorna0(){
        int puntaje = power.calculateScore(3,16);
        Assert.assertEquals(puntaje,0);
    }

    @Test
    public void dadoUnJugador_CuandoEsteEstaDentroDelRangoDePuntuacionEnPowerScore_EntoncesRetornaElPuntajeObtenido(){
        int puntaje = power.calculateScore(3,7);
        Assert.assertEquals(puntaje,69);
    }





}
