package part_05.Exercise_02;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 *
 * Output:
 create class02
 call method01
 setting class02int to 5
 5
 setting class02String to method01Set
 method01Set
 passing class02 to method02
 method02 manipulation
 setting class02int to 10
 10
 setting class02String to method02Set
 method02Set
 End method02
 End method01
 *
 *
 *
 *
 */



class Class01{

    public static void main(String[] args) {


        System.out.println("create class02");
        Class02 newClass02 = new Class02();
        System.out.println("call method01");
        Class01.method01(newClass02);
    }

    public static void method01(Class02 class02){
        System.out.println("setting class02int to 5");
        class02.setClass02Int(5);
        System.out.println(class02.getClass02Int());

        System.out.println("setting class02String to method01Set");
        class02.setClass02String("method01Set");
        System.out.println(class02.getClass02String());

        System.out.println("passing class02 to method02");
        method02(class02);

        System.out.println("End method01");
    }

    public static void method02(Class02 class02) {
        System.out.println("method02 manipulation");

        System.out.println("setting class02int to 10");
        class02.setClass02Int(10);
        System.out.println(class02.getClass02Int());

        System.out.println("setting class02String to method02Set");
        class02.setClass02String("method02Set");
        System.out.println(class02.getClass02String());


        System.out.println("End method02");

    }

}