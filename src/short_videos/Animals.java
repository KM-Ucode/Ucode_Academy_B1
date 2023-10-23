package short_videos;

public abstract class Animals {
    /*
    	Abstraction is a concept in object-oriented programming(OOP) that allows you to hide the
    	implementation details of a class from its user.
	Abstraction is hiding the implementation details and showing only functionality to the user.

	abstract keyword is used to create an abstract class and method
	abstract method: a method without the body "{}"
	abstract method meant to be overridden in subclass
	abstract class meant to be inherited
	We cannot create an object of abstract class
	When abstract class extended by a class, you must override all abstract methods in subclass

    There are two ways to achieve Abstraction:
    1. Abstract Class
    2. Interface
*/
    public abstract void makeSound();


}
