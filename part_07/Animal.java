package part_07;

public class Animal implements LivingCreature{

    private int heightCm;
    private int weightKg;
    private boolean isBreathing;
    private boolean isDangerous;

    public Animal(boolean isBreathing, int height, int weight, boolean isDangerous) {
        this.isBreathing = isBreathing;
        heightCm = height;
        weightKg = weight;
        this.isDangerous = isDangerous;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        heightCm = heightCm;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        weightKg = weightKg;
    }

    public boolean isBreathing() {
        return isBreathing;
    }

    public void setBreathing(boolean breathing) {
        isBreathing = breathing;
    }

    @Override
    public void searchForFood() {
        System.out.println("Animal is searching for food");
    }

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public void escape() {
        System.out.println("This animal sensed danger and is attempting to escaping");
    }

    @Override
    public void sensesAnimal(Animal animal) {

        if(animal.isDangerous && animal.getHeightCm() > this.getHeightCm() && this.isDangerous == false){
            escape();
        }else{
            System.out.println("Animal seems non-dangerous");
        }


    }
}
