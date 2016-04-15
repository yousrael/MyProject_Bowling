package dcll.projet;

/**
 * Created by @yousra 10/03/2016.
 */

public class Frame {
    /**
     * score du premier essai.
     */
    private int lancerun = 0;
    /**
     * score du deuxieme essai.
     */
    private int lancerdeux = 0;
    /**
     * score maximum.
     */
    static final int MAX_SCORE = 10;

    /**
     * constructeur.
     *
     * @param firstThrow the lancerun
     * @param secondThrow the lancerdeux
     */
    public Frame(final int firstThrow, final int secondThrow) {
        lancerun = firstThrow;
        lancerdeux = secondThrow;
    }

    /**
     * Acceder au score de premier essai.
     *
     * @return lancerun
     */
    final int getFirstScore() {
        return lancerun;
    }

    /**
     * Score totale de chaque frame.
     *
     * @return lancerun + lancerdeux
     */
    final int getTotalScore() {
        return lancerun + lancerdeux;
    }

    /**
     * retourner le status de la frame.
     *
     * @return status
     */
    final int getStatus() {
        if (getFirstScore() == MAX_SCORE) {
            return 2; // c'est un strike
        }
        if (getTotalScore() == MAX_SCORE) {
            return 1; // c'est un spare
        }
        return 0; // c'est normal
    }
}
