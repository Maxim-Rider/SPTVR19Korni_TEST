import org.junit.Assert;
import org.junit.Test;
import static korni.korni.calc;

public class korniTest {
    @Test public void testNoSolutions() {
        Assert.assertNull(" нет решений ",
                           calc(1, 1, 1)); }

    @Test public void testOneSolution() {
        Assert.assertArrayEquals("одно решение,",
                                new double[]{1, 1},
                              calc(1, -2, 1), 0.001);}

    @Test public void testTwoSolutions() {
        Assert.assertArrayEquals("Два решения ",
                                 new double[]{-1, 3},
                                 calc(-1, 2, 3), 0.001);} 
    }