package part_05.Exercise_01;

public class Class01 {

    public static void main(String[] args) {
        System.out.println("Making class 2");
        Class02 newClass2 = new Class02();
        System.out.println("getting and setting class2 variables");

        newClass2.isClass2Bool();
        newClass2.setClass2Bool(false);

        newClass2.getClass2int();
        newClass2.setClass2int(10);

        newClass2.getClass2String();
        newClass2.setClass2String("class2String");

        System.out.println("Class2 adding class3");
        newClass2.addClass03();





    }

}
