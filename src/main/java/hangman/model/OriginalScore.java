package hangman.model;


/**
 * @ author Julia Marcela Mejia Perez
 * clase propuesta para hacer la puntuacion
 */

public class OriginalScore implements GameScore{
    private int puntaje;


    /**
     * @pre se incia con 100 puntos
     * el puntaje minimo es 0
     * @pos no se bonifican las letras correctas
     * se penaliza con 10 puntos con cada letra incorrecta
     * @param correctCount numero de letras correectas que tuvo el jugador
     * @param incorrectCount numero de letras incorrectas que tuvo el jugador
     * @return puntaje que obtuvo el jugador
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        puntaje = 100;
        if (incorrectCount>=10){
            puntaje=0;
        }
        else {
            puntaje -= incorrectCount * 10;
        }
        return puntaje;
    }
}
