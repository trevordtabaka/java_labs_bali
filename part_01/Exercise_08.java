package part_01;
import java.lang.Math;
/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {
        double area;
        double perimeter;


        area = Math.PI*Math.PI*Math.PI;

        System.out.println("Area is: "+ area);

        perimeter = 2*Math.PI*Math.PI;

        System.out.println("Perimeter is: " + perimeter);
    }





}
