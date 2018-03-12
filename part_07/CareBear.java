package part_07;

public class CareBear extends Bear{

    private String name;
    private boolean isDangerous;

    public CareBear(boolean isBreathing, int height, int weight,boolean isDangerous, boolean isHibernating, String name) {
        super(isBreathing, height, weight, isDangerous,isHibernating);
        this.name = name;
    }

    @Override
    public void searchForFood() {
        System.out.println(name + " is searching for food");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public void escape() {
        System.out.println(name + " is moving");
    }
}
