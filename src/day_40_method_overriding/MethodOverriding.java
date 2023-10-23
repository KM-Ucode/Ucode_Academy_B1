package day_40_method_overriding;

public class MethodOverriding {
    public void sayBye(){
        System.out.println("Bye");
    }
    public void sayHi(){
        System.out.println("Hi");
    }
    public String returnInput(String str){
        return str;
    }
}
class TestOverriding extends MethodOverriding{
    @Override  // it's good to give annotation to override method for others to test

    public void sayBye(){
        System.out.println("Good Bye, and Have a nice day");
    }
    public void sayHi(){
        System.out.println("Hello, how are you?");
    }
    public String returnInput(String str){
        return"Hello "+str;
    }
    //@Override // it will show an error, because the method is not Overridden
    public void test1(){
        System.out.println("Hello");
    }

    public static void main(String[]args){

        TestOverriding obj1 = new TestOverriding();
        obj1.sayBye();
        obj1.sayHi();
        System.out.println(obj1.returnInput("Java"));

    }
}
