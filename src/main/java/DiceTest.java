import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DiceTest {

    @Test
    void tossAndSumTest() {
        int numberOfDice = 2;
        Dice testDice = new Dice(numberOfDice);

        Integer actual = testDice.tossAndSum();

     Assert.assertTrue(actual < 13 && actual > 1);
    }
}