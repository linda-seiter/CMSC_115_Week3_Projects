import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task3Tests {

    private static final double DELTA = 0.0001;

    @Test
    public void roomAreaTest1() {
        String message = "roomArea(12.0, 15.0, 10.0)";
        double expected = 720;
        double actual = PaintCalculator.roomArea(12.0, 15.0, 10.0);
        assertEquals(message, expected, actual, DELTA);
    }

    @Test
    public void roomAreaTest2() {
        String message = "roomArea(7.5, 11.5, 8.25)";
        double expected = 399.75;
        double actual = PaintCalculator.roomArea(7.5, 11.5, 8.25);
        assertEquals(message, expected, actual, DELTA);
    }

}