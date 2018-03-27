package part_11.RefugeeChallenge;

import java.util.ArrayList;

public class CountryData {

    private String name;
    private int year;
    private double population;
    private double refugees;
    private double ratio;

//    public ArrayList<CountryData> getCountryData() {
//        return countryData;
//    }
//
//    public void setCountryData(ArrayList<CountryData> countryData) {
//        this.countryData = countryData;


    @Override
    public String toString() {
        return "CountryData{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", population=" + population +
                ", refugees=" + refugees +
                ", ratio=" + ratio +
                '}';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getRefugees() {
        return refugees;
    }

    public void setRefugees(double refugees) {
        this.refugees = refugees;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



}
