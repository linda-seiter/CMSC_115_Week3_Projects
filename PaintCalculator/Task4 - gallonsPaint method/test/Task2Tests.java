import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task2Tests {

  private static final double DELTA = 0.0001;

  @Test
  public void wallAreaTest1() {
    String message = "wallArea(12.0, 15.0, 10.0)";
    double expected = 540.0;
    double actual = PaintCalculator.wallArea(12.0, 15.0, 10.0);
    assertEquals( message, expected, actual, DELTA);
  }

  @Test
  public void wallAreaTest2() {
    String message = "wallArea(7.5, 11.5, 8.25)";
    double expected = 313.5;
    double actual = PaintCalculator.wallArea(7.5, 11.5, 8.25);
    assertEquals(message, expected, actual, DELTA);
  }

}