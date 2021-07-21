
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class BinsTest {

    @Test
    void getBinTest() {
        int testMin = 2;
        int testMax = 12;
        int expected = testMax - testMin + 1;

        Bins testBin = new Bins(testMin,testMax);
        int actual = testBin.sumOfRolls.length;

        Assert.assertEquals(expected,actual);


    }
}