package day_34_statics_continue_instance_block;

public class Blocks {
    static{
        testStatic();
    }
    public static void testStatic() {
        System.out.println("Hello");

    }
    public static void instanceTest() {
        System.out.println("Hello Instance");
        testStatic();

    }
    public static void main (String[]args){



    }
}
