package dcll.projet;

import java.util.ArrayList;

/**
 * Created by @yousra on 10/03/2016.
 */
public class BowlingGame {

    /**
     * calcul de score.
     *
     * @param frames est un tableau de frame
     * @return le score totale
     */
    public final int calculateScore(final ArrayList<Frame> frames) {
        int totalScore = 0;
        final int maxFrame = 12;
        final int frame = 10;

        int[] temp = new int[maxFrame];
        for (int i = 0; i < maxFrame; i++) {
            // temp: un tableau qui contient le score temporaire
            temp[i] = frames.get(i).getTotalScore();
        }
        for (int i = 0; i < frame; i++) {
            // Si c'est un strik
            if (frames.get(i).getStatus() == 2) {
                // Total score = Score courant + les deux prochaines scores
                totalScore += temp[i] + temp[i + 1];
                /** si le prochain Frame est aussi un Strike
                 * on doit faire le 2ème lancer ausssi
                 */
                if (frames.get(i + 1).getStatus() == 2) {
                    totalScore += frames.get(i + 2).getFirstScore();
                }
            } else if (frames.get(i).getStatus() == 1) {
                // Si c'est un spare
                int nextScore = frames.get(i + 1).getFirstScore();
                totalScore += temp[i] + nextScore;
            } else {
                //Si ce n'est ni strike ni spare
                totalScore += temp[i];
            }
        }
        return totalScore;
    }

}
