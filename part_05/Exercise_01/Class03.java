package part_05.Exercise_01;

public class Class03 {
    private String class3String;
    private int class3int;
    private boolean class3Bool = true;


    public Class03() {
        System.out.println("class3 constructed");
    }

    public String getClass3String() {
        System.out.println(class3String);
        return class3String;
    }

    public void setClass3String(String class3String) {
        this.class3String = class3String;
        System.out.println(class3String);
    }

    public int getClass3int() {
        System.out.println(class3int);
        return class3int;
    }

    public void setClass3int(int class3int) {
        this.class3int = class3int;
        System.out.println(class3int);
    }

    public boolean isClass3Bool() {
        System.out.println(class3Bool);
        return class3Bool;
    }

    public void setClass3Bool(boolean class3Bool) {
        this.class3Bool = class3Bool;
        System.out.println(class3Bool);
    }
}
