package part_07;

public class Bear extends Animal{

    private boolean isHibernating;

    public Bear(boolean isBreathing, int height, int weight, boolean isDangerous, boolean isHibernating) {
        super(isBreathing, height, weight, isDangerous);
        this.isHibernating = isHibernating;

    }


    public void searchForFood(){

        System.out.println("A hungry bear is searching for food");

    }

    public void eat(String food){

        System.out.println("Bear is eating " + food);

    }

    private void standOnTwoLegs(){
        System.out.println("Bear is standing on two legs. He may be upset");
    }

    public boolean isHibernating() {
        return isHibernating;
    }

    public void setHibernating(boolean hibernating) {
        isHibernating = hibernating;
    }
}
