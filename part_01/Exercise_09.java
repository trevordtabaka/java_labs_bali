package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] args) {

        double area;
        double perimeter;

        double width = 2.4;
        double height = 6.4;

        area = width *height;

        perimeter = 2*width + 2 * height;

        System.out.println("Area is: "+ area);

        System.out.println("Perimeter is: " + perimeter);

    }


}