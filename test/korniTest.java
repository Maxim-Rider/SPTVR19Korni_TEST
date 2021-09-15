import org.junit.Assert;
import org.junit.Test;
import static korni.korni.arvutus;
public class korniTest
{
    @Test public void testNoSolutions() {
        Assert.assertNull(" нет решений ",
                           arvutus(1, 1, 1)); }

    @Test public void testOneSolution() {
        Assert.assertArrayEquals("одно решение,",
                                new double[]{1}, //одно решение 
                              arvutus(1, -2, 1), 0.001);}

    @Test public void testTwoSolutions() {
        Assert.assertArrayEquals("Два решения ",
                                 new double[]{-1, 7}, //Два решения
                                 arvutus(-1, 2, 3), 0.001);} }