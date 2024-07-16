import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task4Tests {

  @Test
  public void gallonsPaintTest1() {
    String message = "gallonsPaint(12.0, 15.0, 10.0)";
    int expected = 3;
    int actual = PaintCalculator.gallonsPaint(12.0, 15.0, 10.0);
    assertEquals(message, expected, actual);
  }

  @Test
  public void testCalculatePaintGallons2() {
    String message = "gallonsPaint(7.5, 11.5, 8.25)";
    int expected = 2;
    int actual = PaintCalculator.gallonsPaint(7.5, 11.5, 8.25);
    assertEquals(message, expected, actual);
  }

}