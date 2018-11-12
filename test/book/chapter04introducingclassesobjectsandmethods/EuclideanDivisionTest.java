package book.chapter04introducingclassesobjectsandmethods;


import org.junit.Assert;
import org.junit.Test;

public class EuclideanDivisionTest {

    
    @Test
    public void negativeDividendByPositiveDivisorEuclideanDivisionTest() {
        Assert.assertEquals(-3, EuclideanDivision.quotion(-7, 3));
        Assert.assertEquals(2, EuclideanDivision.remainder(-7, 3));
    }

    @Test
    public void positiveDividentByPositiveDivisorEuclideanDivisionTest() {
        Assert.assertEquals(6, EuclideanDivision.quotion(27, 4));
        Assert.assertEquals(3, EuclideanDivision.remainder(27, 4));
    }

    @Test
    public void positiveDividentByNegativeDivisorEuclideanDivisionTest() {
        Assert.assertEquals(-37, EuclideanDivision.quotion(113, -3));
        Assert.assertEquals(2, EuclideanDivision.remainder(113, -3));
    }

    @Test
    public void negativeDividendByNegativeDivisorEuclideanDivisionTest() {
        Assert.assertEquals(3, EuclideanDivision.quotion(-7, -3));
        Assert.assertEquals(2, EuclideanDivision.remainder(-7, -3));
    }

    @Test
    public void zeroDividendByNegativeDivisorEuclideanDivisionTest() {
        Assert.assertEquals(0, EuclideanDivision.quotion(0, -7));
        Assert.assertEquals(0, EuclideanDivision.remainder(0, -7));
    }

    @Test
    public void zeroDividendByPositiveDivisorEuclideanDivisionTest() {
        Assert.assertEquals(0, EuclideanDivision.quotion(0, 7));
        Assert.assertEquals(0, EuclideanDivision.remainder(0, 7));
    }

    @Test (expected = ArithmeticException.class)
    public void positiveDividendByZeroDivisorEuclideanDivisionTest() {
        EuclideanDivision.quotion(7, 0);
        EuclideanDivision.remainder(7, 0);
    }

    @Test (expected = ArithmeticException.class)
    public void negativeDividendByZeroEuclideanDivisionTest() {
        EuclideanDivision.quotion(-7, 0);
        EuclideanDivision.remainder(-7, 0);
    }

    @Test (expected = ArithmeticException.class)
    public void zeroDividendByZeroEuclideanDivisionTest() {
        EuclideanDivision.quotion(0, 0);
        EuclideanDivision.remainder(0, 0);
    }


    @Test // rounds towards zero instead of the floor
    public void divisionTest() {

        Assert.assertEquals(2 , 7 / 3);
        Assert.assertEquals(-2 , -7 / 3);
        Assert.assertEquals(-2 , 7 / -3);
        Assert.assertEquals(2 , -7 / -3);

        Assert.assertEquals(2, (int) (7.0 / 3.0));
        Assert.assertEquals(-2, (int) (-7.0 / 3.0));
        Assert.assertEquals(-2, (int) (7.0 / -3.0));
        Assert.assertEquals(2, (int) (-7.0 / -3.0));
    }
}
