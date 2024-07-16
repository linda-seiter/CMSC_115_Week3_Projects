import java.util.Scanner;

/**
 * The PaintCalculator class calculates the cost to paint
 * the walls and ceiling of a rectangular room.
 * @author First Last
 */
public class PaintCalculator {

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("roomArea(12.0, 15.0, 10.0) = " + roomArea(12.0, 15.0, 10.0));
        System.out.println("roomArea(7.5, 11.5, 8.25) = " + roomArea(7.5, 11.5, 8.25));
    }

    /**
     * ceilingArea - Returns the ceiling area given the room length and width.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @return the ceiling area as a double.
     */
    public static double ceilingArea(double length, double width) {
        return length * width;
    }

    /**
     * wallArea - Returns the wall area given the room length, width, and height.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @param height - the room height as a double.
     * @return the wall area as a double.
     */
    public static double wallArea(double length, double width, double height) {
        return 2 * ( length + width) * height;
    }

    /**
     * roomArea - Returns the total ceiling and wall area given the room length, width, and height.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @param height - the room height as a double.
     * @return the total ceiling and wall area as a double.
     */
    public static double roomArea(double length, double width, double height) {
        return ceilingArea(length, width) + wallArea(length, width, height);
    }

    /**
     * gallonsPaint - Returns the gallons of paint needed to cover the ceiling and walls given the room length, width, and height.
     * @param length - the room length as a double
     * @param width - the room width as a double
     * @param height - the room height as a double
     * @return the gallons of paint as an int
     */
    //TODO Task#4

}
