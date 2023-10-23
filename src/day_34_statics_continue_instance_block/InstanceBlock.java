package day_34_statics_continue_instance_block;

public class InstanceBlock {
    public static void main(String[] args) {


        InstanceBlock obj1 = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();
        System.out.println(obj1.num);
        System.out.println(obj2.num);

    }
    String name;
    int num;
    {
        name = "Java";
        num = 123;
        System.out.println("Hello, I'm Instance Block");
    }
    static {
        System.out.println("Static block from InstanceBlock Class");
    }
}
//     class TestInstanceBlock{
//     public static void main(String[] args) {
//        InstanceBlock obj1 = new InstanceBlock();
//        InstanceBlock obj2 = new InstanceBlock();
//        System.out.println(obj1.num);
//        System.out.println(obj2.num);

