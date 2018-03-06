package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        double birthRateSecs = 6.0;
        double deathRateSecs = 12;
        double immigrationRateSecs = 40;

        long population = 380123456;

        long secondPerYear = 365*24*60*60;
        long threeYearsSeconds = secondPerYear *3;

        long births = (long) (threeYearsSeconds/birthRateSecs);
        long deaths = (long) (threeYearsSeconds/deathRateSecs);
        long immigrants = (long) (threeYearsSeconds/immigrationRateSecs);

        long totalPopulation = population + births - deaths + immigrants;

        System.out.println(totalPopulation);


    }

}