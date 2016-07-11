package example1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jtr82austin on 7/10/16.
 */
public class ScoreCollectionTest {
    @Test
    public void answersArithmeticMeanOfTwoNumbers()  {

        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();

        assertEquals(actualResult, 6);
    }

}