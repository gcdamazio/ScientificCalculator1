package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Core;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */


public class TestMainApplication {
    @Test
    public void testInvertSign() {
        Core test = new Core();
        double result = test.invertSign(4);
        assertEquals(-4, result, 0.001);

    }

    @Test
    public void testInverse() {
        Core test = new Core();
        double result = test.inverse(4);
        assertEquals(0.25, result, 0.001);

    }

    @Test
    public void testSine() {
        Core test = new Core();
        double result = test.sine(90);
        assertEquals(1.0, result, 0.001);

    }

    @Test
    public void testCos() {
        Core test = new Core();
        double result = test.cosine(180);
        assertEquals(-1.0, result, 0.001);

    }

    @Test
    public void testTan() {
        Core test = new Core();
        double result = test.tangent(45);
        assertEquals(0.9999999999999999, result, 0.001);

    }

    @Test
    public void testinverseSine() {
        Core test = new Core();
        double result = test.inverseSine(90);
        assertEquals(1.0, result, 0.001);

    }

    @Test
    public void testinverseCos() {
        Core test = new Core();
        double result = test.inverseCosine(180);
        assertEquals(-1.0, result, 0.001);

    }

    @Test
    public void testinverseTan() {
        Core test = new Core();
        double result = test.inverseTangent(30);
        assertEquals(1.7320508075688774, result, 0.001);

    }

    @Test
    public void testFactorial() {
        Core test = new Core();
        double result = test.factorial(3);
        assertEquals(6.0, result, 0.001);
    }


}
