package hangman.model;

/**
 * @ author Julia Marcela Mejia Perez
 * clase propuesta para hacer la puntuacion
 */
public class BonusScore implements GameScore{
    public int puntaje;


    /**
     * @pre se incia en 0 puntos
     * el puntaje minimo es 0
     * @pos se bonifica con 10 puntos cada letra correcta
     * se penaliza con 5 puntos cada letra incorrecta
     * @param correctCount numero de letras correectas que tuvo el jugador
     * @param incorrectCount numero de letras incorrectas que tuvo el jugador
     * @return puntaje que obtuvo el jugador
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        puntaje = 0;
        if (incorrectCount*2 < correctCount){
            puntaje = (correctCount*10)-(incorrectCount*5);
        }
        else{
            puntaje = 0;
        }
        return puntaje;
    }
}
