package part_06.Part_06_Exercise_03;

public class Dog extends Mammal {

    private String diet;

    public Dog(String diet) {
        super(2, 4);
        this.diet = diet;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void injuredDog(int limbs){

        super.setLimbs(limbs);

    }

    public void runs(){

        System.out.println("This dog runs on  " + getLimbs() + " legs");

    }

}
