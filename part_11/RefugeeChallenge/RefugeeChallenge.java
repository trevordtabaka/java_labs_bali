package part_11.RefugeeChallenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RefugeeChallenge {

    public static void main(String[] args) {

        ArrayList<Refugees> refugees = new ArrayList<>();

        String path = "/Users/trevortabaka/Downloads/refugees_per_capita.csv";
        int population = 0;
        try (FileReader fr = new FileReader(path); BufferedReader bufferedReader = new BufferedReader(fr)) {

            String currentLine;

            while ((currentLine = bufferedReader.readLine()) != null) {
                /////get the next line in csv and split it into a new String array
                String[] data = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                ///// Make a new Refugee object
                Refugees obj = new Refugees();
                ///// Set the refugee object values from the string array data
                try {

                    if (data.length < 6) {

                        System.out.println("not enough info " + data[0]);
                    } else {


                        obj.setYear(Integer.valueOf(data[1]));


                        obj.setCountry(data[2]);


                        obj.setPopulation(Double.valueOf(data[3]));
                        obj.setRefugees(Double.valueOf(data[4]));
                        obj.setRefPerCap(Double.valueOf(data[5]));

                        refugees.add(obj);
                    }
                } catch (NullPointerException e) {
                    System.out.println("Issue here");

                }


            }


        } catch (IOException e) {


        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("skipped");
        }


        yearlyRatios(refugees);

        System.out.println(setCountryData("Austria", refugees).toString());
        


    }

    public static double populationAtYear(int year, ArrayList<Refugees> refList) {
        double population = 0;
        int count = 0;
        for (Refugees r : refList) {


            if (r.getYear() == year) {
                count++;
                population += r.getPopulation();
            }
        }

        return population;
    }

    public static double refugeesAtYear(int year, ArrayList<Refugees> refList) {
        double refugees = 0;
        int count = 0;
        for (Refugees r : refList) {


            if (r.getYear() == year) {
                count++;
                refugees += r.getRefugees();
            }
        }

        return refugees;
    }


    public static void yearlyRatios(ArrayList<Refugees> refList) {

        for (int i = 2001; i < 2016; i++) {
            double pop = populationAtYear(i, refList);
            double refPop = refugeesAtYear(i, refList);
            System.out.println(i + " total population among qualifying countries: " + pop);
            System.out.println(i + " total refugee population among qualifying countries: " + refPop);
            System.out.println(i + " refugee to pop ratio: " + refPop / pop);
            System.out.println("____________________________________________");
        }

    }

    public static ArrayList<CountryData> setCountryData(String country, ArrayList<Refugees> refList) {

        ArrayList<CountryData> retList = new ArrayList<CountryData>();


        for (Refugees r : refList) {

            if (r.getCountry().equalsIgnoreCase(country)) {
                CountryData countryData = new CountryData();

                countryData.setName(country);
                countryData.setYear(r.getYear());
                countryData.setPopulation(r.getPopulation());
                countryData.setRefugees(r.getRefugees());
                countryData.setRatio(r.getRefPerCap());

                retList.add(countryData);
            }


//        countryData.setCountryData(countryData.getYear(),
//                countryData.getPopulation(), countryData.getRefugees(), countryData.getRatio());
        }

        return retList;
    }

}
