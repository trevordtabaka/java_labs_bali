package part_06.Part06_Ex06;

import part_06.Part_06_Exercise_03.Animal;

public class MethodDispatch {

    class Animal{

        void move(){

            System.out.println("Animals move");

        }
    }

    class Cat extends Animal{

        void move(){

            System.out.println("Cats prowl");

        }

    }

    class Fish extends Animal{

        void move(){

            System.out.println("Fish swim");

        }

    }


}
