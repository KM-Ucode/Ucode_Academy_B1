package short_videos;

public class Animal {

    //	Extends: keyword is used to inherit the feature/properties of a class(all instance variables and methods).
    //	In OOP, inheritance is used to create "IS-A" relationship among classes.
    //	Inheritance is one of OOP principle/concept in Java which allows one class to inherit from another class.

    protected String name;
    protected String body;

    protected String size;

    protected int weight;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void move(){
        System.out.println(name+" is moving");
    }

    public void sound(){
    System.out.println("Hello Animals");    // Override Method

    }
}

