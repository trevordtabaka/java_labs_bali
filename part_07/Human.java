package part_07;

public class Human extends Animal{

    private String name;

    public Human(boolean isBreathing, int height, int weight, String name){
        super(isBreathing,height,weight, false);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){

        System.out.println(name + " is running");
    }

    public void hug(Animal animal){

        System.out.println(name + " gives a hug to ");
    }
    @Override
    public void searchForFood() {
        System.out.println(name + " is searching for food");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void escape() {
        run();
    }
}
