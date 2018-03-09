package part_05.Exercise_04;

public class Class02 {

    private int int_1;
    private String string_1;
    private boolean bool_1;

    public Class02(int int_1) {
        System.out.println("initializing int_1");

        this.int_1 = int_1;
    }

    public Class02(String string_1) {
        System.out.println("initializing string_1");
        this.string_1 = string_1;
    }

    public Class02(boolean bool_1) {
        System.out.println("initializing bool_1");
        this.bool_1 = bool_1;
    }

    public Class02(int int_1, String string_1, boolean bool_1) {
        this.int_1 = int_1;
        this.string_1 = string_1;
        this.bool_1 = bool_1;
    }

    public void setInt_1(int int_1) {
        this.int_1 = int_1;
    }

    public void setString_1(String string_1) {
        this.string_1 = string_1;
    }

    public void setBool_1(boolean bool_1) {
        this.bool_1 = bool_1;
    }


}
