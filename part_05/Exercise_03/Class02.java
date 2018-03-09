package part_05.Exercise_03;

public class Class02 {

    private int c2int;
    private String c2String;

    public int setVars(int c2int) {
        this.c2int = c2int;
        System.out.println(c2int);
        System.out.println("returning first setVars returning 10");
        return this.c2int;
    }

    public String setVars(String c2String) {
        this.c2String = c2String;
        System.out.println(c2String);
        System.out.println("returning setVars string");
        return this.c2String;
    }

    public int setVars(int c2int, String c2String) {
        this.c2int = c2int;
        this.c2String = c2String;
        System.out.println(c2int*2 + " "+ c2String);
        System.out.println("returning second setVars returning 20");
        return c2int + this.c2int;
    }
}
