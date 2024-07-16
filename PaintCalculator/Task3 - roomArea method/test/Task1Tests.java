import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task1Tests {

  private static final double DELTA = 0.0001;

  @Test
  public void ceilingAreaTest1() {
    String message = "ceilingArea(12.0, 15.0)";
    double expected = 180.0;
    double actual = PaintCalculator.ceilingArea(12.0, 15.0);
    assertEquals(message, expected, actual, DELTA);
  }

  @Test
  public void ceilingAreaTest2() {
    String message = "ceilingArea(7.5, 11.5)";
    double expected = 86.25;
    double actual = PaintCalculator.ceilingArea(7.5, 11.5);
    assertEquals(message, expected, actual, DELTA);
  }

}