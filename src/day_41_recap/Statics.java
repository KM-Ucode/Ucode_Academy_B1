package day_41_recap;

public class Statics {
    public static String name = "Java";
    public String name2 = "Java";
    public static int num;
    static{
        num = 100;
        method1(); // we can call method too in the static block
        method2(10);
    }
    public static void method1(){
        System.out.println("Hello");
    }
    public static int method2(int num){
       // method3(); // static cannot call instance method directly
        return num;
    }
    public void method3(){
        System.out.println("Instance Method");
        method1();   // Instance method can access/call static method directly
        name = "API"; // IM can access static variable directly.
    }
}
class TestStatic{
    public static void main(String[] args) {

        System.out.println(Statics.name);

        System.out.println("==========================");

        Statics obj = new Statics();

        System.out.println(obj.name);

        Statics.method1();
        obj.method1(); // or we can call it through the object

        //Static.method3(); // can not call instance method through the class
        System.out.println(Statics.num);
    }

}
