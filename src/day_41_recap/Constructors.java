package day_41_recap;

public class Constructors {
    public Integer num;
    public static void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }

    public Constructors(int a){
        num = 123;
    }
    public Constructors(String str){
        method1();
        method2();
    }
    public static void main(String[] args){
        Constructors object = new Constructors(1);
        System.out.println(object.num);
    }
}
class Test extends Constructors{   //inheritance
    public Test(){
        super(12);
    }
}
