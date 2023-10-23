package short_videos;

public class Demo1 extends Polymorphism implements Demo2 {
    public void demo1(){
        System.out.println("Hello, I'm override in child class");
    }
    public void test(){
        System.out.println("Hello, I'm override");
    }
    public static void main(String[] args){

        Polymorphism obj1 = new Demo1();
        obj1.test();
        obj1.test2();

        Demo2 obj2 = new Demo1();
        obj2.demo1();
    }

}
