package short_videos;

public abstract class Polymorphism {
    /*
    Polymorphism means "many forms", and it occurs when we have many classes that are related
    to each other by inheritance.
    The most common use of polymorphism in OOP occurs when a parent class reference is used
    to refer to a child class object.
    Reference type can be class or interface, object can be any extending or implementing
    child class.
    Abstract class and interface can only be reference type, which means we cannot create
    an object of interface and abstract class.
     */
    public abstract void test();
    public void test2(){
        System.out.println("Hello, I'm Instance method");
    }

}
