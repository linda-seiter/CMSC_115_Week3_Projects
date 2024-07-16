import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Task5Tests {

    private final InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private static void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMain1() {
        String input = "12.0 15.0 10.0";
        String output = "Enter length, width and height: " +
                "Buy 3 gallons of paint.";

        System.setOut(new PrintStream(outputStreamCaptor));
        provideInput(input);
        PaintCalculator.main(new String[]{});
        assertEquals(output, outputStreamCaptor.toString().trim());
        System.setIn(standardIn);
        System.setOut(standardOut);
    }

    @Test
    public void testMain2() {
        String input = "7.5 11.5 8.25";
        String output = "Enter length, width and height: " +
                "Buy 2 gallons of paint.";

        System.setOut(new PrintStream(outputStreamCaptor));
        provideInput(input);
        PaintCalculator.main(new String[]{});
        assertEquals(output, outputStreamCaptor.toString().trim());
        System.setIn(standardIn);
        System.setOut(standardOut);
    }
}
