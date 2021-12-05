import PACKAGE_NAME.Turtles;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {


    @Test
    public void testFactorial() {
        //given
        PACKAGE_NAME.Turtles turtles = PACKAGE_NAME.Turtles.getInstance();
        int n = 5;
        int expected = 120;


        //when
        Instant start = Instant.now();
        int actual = turtles.factorial(n);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();


        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial2() {
        //given
        PACKAGE_NAME.Turtles turtles = PACKAGE_NAME.Turtles.getInstance();
        int n = 7;
        int expected = 5040;


        //when
        Instant start = Instant.now();
        int actual = turtles.factorial(n);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();


        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCDa() {
        //given
        Turtles turtles = Turtles.getInstance();
        int x = 8;
        int y = 6;
        int expected = 2;


        //when
        Instant start = Instant.now();
        int actual = turtles.GCD(x, y);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();


        //then
        Assert.assertEquals(expected, actual);
        System.out.println(timeElapsed);
    }

    @Test
    public void testGCDb() {
        //given
        Turtles turtles = Turtles.getInstance();
        int x = 1210;
        int y = 44;
        int expected = 22;


        //when
        Instant start = Instant.now();
        int actual = turtles.GCD(x, y);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        //then
        Assert.assertEquals(expected, actual);
        System.out.println(timeElapsed);
    }

    @Test
    public void testGCD2a() {
        //given
        Turtles turtles = Turtles.getInstance();
        int x = 8;
        int y = 6;
        int expected = 2;


        //when
        Instant start = Instant.now();
        int actual = turtles.GCD2(x, y);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        //then
        Assert.assertEquals(expected, actual);
        System.out.println(timeElapsed);
    }

    @Test
    public void testGCD2b() {
        //given
        Turtles turtles = Turtles.getInstance();
        int x = 1210;
        int y = 44;
        int expected = 22;


        //when
        Instant start = Instant.now();
        int actual = turtles.GCD2(x, y);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        //then
        Assert.assertEquals(expected, actual);
        System.out.println(timeElapsed);
    }

}