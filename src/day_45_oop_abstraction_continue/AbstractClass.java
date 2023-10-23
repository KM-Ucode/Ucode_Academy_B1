package day_45_oop_abstraction_continue;

public abstract class AbstractClass {
    abstract void sound();
    public void method1(){
        System.out.println("Hello");
    }

//    public static void main(String[] args) { // you can create main method in abstract class, but you don't
//        System.out.println("Hello World");   // have too


}
class Dog extends AbstractClass{
    public void sound(){
        System.out.println("Woof woof");
    }
}
class Cat extends  AbstractClass{
    public void sound(){
        System.out.println("Meow, meow");
    }
}
