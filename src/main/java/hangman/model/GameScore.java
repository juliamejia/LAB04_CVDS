package hangman.model;

/**
 * @ author Julia Marcela Mejia Perez
 * clase propuesta para hacer la puntuacion
 */
public interface GameScore {
    /**
     * @param correctCount numero de letras correectas que tuvo el jugador
     * @param incorrectCount numero de letras incorrectas que tuvo el jugador
     * @return puntaje que obtuvo el jugador
     */
    public int calculateScore(int correctCount, int incorrectCount) ;
}

