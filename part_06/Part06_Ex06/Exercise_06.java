package part_06.Part06_Ex06;

public class Exercise_06 {


    public static void main(String[] args) {

        Animal genericAnimal = new Animal();
        Cat cat = new Cat();
        Fish fish = new Fish();

        Animal animalRef;

        animalRef = genericAnimal;
        animalRef.move();

        animalRef = cat;
        animalRef.move();

        animalRef = fish;
        animalRef.move();


    }
/*
//////OUTPUT//////
Animals move
Cats prowl
Fish swim
 */




}
