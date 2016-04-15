package dcll.projet;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mousa on 15/04/2016.
 */

import java.util.ArrayList;

/**
 * Created by @yousra on 10/03/16.
 */
public class BowlingGameTest {

    @Test
    public void testCalculateScore() throws Exception {
        ArrayList<Frame> score = new ArrayList<Frame>();
        BowlingGame bg = new BowlingGame();

        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        score.add(new Frame(10, 0));
        int scoreFinal = bg.calculateScore(score);
        assertEquals(scoreFinal, 300);

        ArrayList<Frame> myScore1 = new ArrayList<Frame>();

        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(5, 5));
        myScore1.add(new Frame(0, 0));

        int score1 = bg.calculateScore(myScore1);
        assertEquals(score1, 150);


        ArrayList<Frame> myScore2 = new ArrayList<Frame>();
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(9, 0));
        myScore2.add(new Frame(0, 0));
        myScore2.add(new Frame(0, 0));

        int score2 = bg.calculateScore(myScore2);
        assertEquals(score2, 90);
        ArrayList<Frame> myScore3 = new ArrayList<Frame>();
        myScore3.add(new Frame(9, 0));
        myScore3.add(new Frame(9, 1));
        myScore3.add(new Frame(8, 2));
        myScore3.add(new Frame(9, 0));
        myScore3.add(new Frame(10, 0));
        myScore3.add(new Frame(7, 0));
        myScore3.add(new Frame(9, 0));
        myScore3.add(new Frame(10, 0));
        myScore3.add(new Frame(6, 4));
        myScore3.add(new Frame(3, 0));
        myScore3.add(new Frame(0, 0));
        myScore3.add(new Frame(0, 0));

        int score3 = bg.calculateScore(myScore3);
        assertEquals(score3, 124);
    }
}