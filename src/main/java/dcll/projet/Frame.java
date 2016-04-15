package dcll.projet;

/**
 * Created by @yousra 10/03/2016.
 */

public class Frame {
    /**
     * score du premier essai.
     */
    private int Lancer1 = 0;
    /**
     * score du deuxieme essai.
     */
    private int Lancer2 = 0;
    /**
     * score maximum.
     */
    static final int MAX_SCORE = 10;

    /**
     * constructeur.
     *
     * @param firstThrow the Lancer1
     * @param secondThrow the Lancer2
     */
    public Frame(final int firstThrow, final int secondThrow) {
        Lancer1 = firstThrow;
        Lancer2 = secondThrow;
    }

    /**
     * Acceder au score de premier essai.
     *
     * @return Lancer1
     */
    final int getFirstScore() {
        return Lancer1;
    }

    /**
     * Score totale de chaque frame.
     *
     * @return Lancer1 + Lancer2
     */
    final int getTotalScore() {
        return Lancer1 + Lancer2;
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
