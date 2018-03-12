package part_07;

public class Controller {



    public static void main(String[] args) {
        Bear wildBear = new Bear(true, 300,200, true, false);
        Human human = new Human(true, 175, 70, "Trevor");
        CareBear careBear = new CareBear(true, 80, 40, false,false,"Love Bear");

        human.sensesAnimal(careBear);
        careBear.sensesAnimal(wildBear);




    }


}
