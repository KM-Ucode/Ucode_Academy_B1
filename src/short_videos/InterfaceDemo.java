package short_videos;

public interface InterfaceDemo {
    /*
    Abstraction Class vs Interface

	- both used to achieve abstraction
	- both cannot be final(we cannot use final keyword)
	- both meant to be inherited

abstract class
	- can have constructor
	- instance method
	- blocks
	- instance variables
	- all access modifiers

interface
	- default method, we have to give the body(default keyword)
	- abstract method
	- static method, we need to give the body
	- public access modifiers is given by default to methods and variables
	- variables are static and final by default

To inherit class or abstract class, we need to use extends keyword
To inherit interface we need to use implements keyword

We can only inherit one class/abstract class, but we can inherit multiple interfaces using implements
keyword.
     */

    void makeSound();

    default void someMethod(){
        System.out.println("Hello I'm default method");
    }
    static void staticMethod(){
        System.out.println("Hello I'm static method");
    }
}
