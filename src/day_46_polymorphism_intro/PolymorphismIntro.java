package day_46_polymorphism_intro;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog2 = new Dog();  // Normal way we create.
        Cat cat2 = new Cat();

        Animal dog = new Dog();  // Parent class reference to child class's object
        Animal cat = new Cat();  // There Must be IS-A relationship(inheritance)


        Creature dog3 = new Dog();  // Grandparent class reference to grandchild class's object
        Creature cat3 = new Cat();

        Object dog4 = new Dog();  // Can we do this? Yes. Every class has object as a super class.

        Animal[] animals = {dog, cat, dog2, cat2};
    }
}
class Creature{

}

class Animal extends Creature{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
