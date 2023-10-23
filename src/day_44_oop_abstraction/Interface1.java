package day_44_oop_abstraction;

public interface Interface1 {

    // public abstract is given by default
    public abstract void sayHello();
    //public is given by default, and static method must have body
    static void someMethod(){
    }
    default void defaultMethod(){
    }
    //public static final are given by default, not necessary to provide it
    //public static final String name = "Java";
    String name = "Java";
    //public static final are given by default, not necessary to provide it
    int num = 123;
}
class TestInterface implements Interface1{
    public void sayHello(){


    }
    public void defaultMethod(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.defaultMethod();
    }
}