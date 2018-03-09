package part_05.Exercise_01;

public class Class02 {
    private String class2String;
    private int class2int;
    private boolean class2Bool = true;

    public Class02() {
        System.out.println("class2 constructed");

    }

    public String getClass2String() {
        System.out.println(class2String);
        return class2String;
    }

    public void setClass2String(String class2String) {

        this.class2String = class2String;
        System.out.println(class2String);
    }

    public int getClass2int() {
        System.out.println(class2int);
        return class2int;
    }

    public void setClass2int(int class2int) {

        this.class2int = class2int;
        System.out.println(class2int);
    }

    public boolean isClass2Bool() {
        System.out.println(class2Bool);
        return class2Bool;
    }

    public void setClass2Bool(boolean class2Bool) {
        this.class2Bool = class2Bool;
        System.out.println(class2Bool);
    }
    public void addClass03(){
        System.out.println("Making class 3");
        Class03 newClass03 = new Class03();
        System.out.println("getting and setting class3 variables");

        newClass03.isClass3Bool();
        newClass03.setClass3Bool(false);

        newClass03.getClass3int();
        newClass03.setClass3int(3);

        newClass03.getClass3String();
        newClass03.setClass3String("class3String");
    }
}
