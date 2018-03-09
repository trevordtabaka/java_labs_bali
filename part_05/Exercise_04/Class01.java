package part_05.Exercise_04;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */
class Class01{


    public static void main(String[] args) {
        Class02 class02_1 = new Class02(10);

        Class02 class02_2 = new Class02("class02_2");

        Class02 class02_3 = new Class02(true);

        Class02 class02_4 = new Class02(20,"class02_4", false);

        class02_1.setBool_1(true);

        class02_2.setInt_1(6);

        class02_3.setString_1("class02_3 changed this");

        class02_4.setInt_1(8);




    }

}