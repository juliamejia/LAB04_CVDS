package hangman.model;

/**
 * @ author Julia Marcela Mejia Perez
 * clase propuesta para hacer la puntuacion
 */
public class PowerScore implements GameScore{
    int puntaje;


    /**
     * @pre el juego se inicia con 0 puntos, los parametros deben ser positivos
     * @pos la i-ésima letra correcta se bonifica con 5**i
     * se penaliza con 8 puntos cada letra incorrecta
     * si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500
     * @param correctCount numero de letras correectas que tuvo el jugador
     * @param incorrectCount numero de letras incorrectas que tuvo el jugador
     * @return puntaje que obtuvo el jugador
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        puntaje = 0;
        if (incorrectCount*8 > Math.pow(5,correctCount)){
            puntaje=0;
        }
        else if(Math.pow(5,correctCount) - incorrectCount*8>500){
            puntaje = 500;
        }
        else {
            puntaje = (int) Math.pow(5,correctCount)-incorrectCount*8;
        }
        return puntaje;
    }
}
