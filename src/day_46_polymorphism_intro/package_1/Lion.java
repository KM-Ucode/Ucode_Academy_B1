package day_46_polymorphism_intro.package_1;

public class Lion extends Animal implements WildAnimal {

    // A lion IS-A Animal
    // A lion IS-A wild animal
    // A lion IS-A lion
    // A Lion IS-A object

    public static void main(String[] args) {
        Animal a1 = new Lion();
        WildAnimal a2 = new Lion();
        Lion a3 = new Lion();
        Object a4 = new Lion();

        boolean b1 = a1 instanceof Animal;
        boolean b2 = a2 instanceof WildAnimal;
        boolean b3 = a3 instanceof Lion;
        boolean b4 = a4 instanceof Object;

        Animal animal = new Animal();
        boolean bb1 = animal instanceof Lion;


        System.out.println("=====================");

        Lion obj = new Lion();
        Animal obj2 = obj;
        Object obj3 = obj;
        WildAnimal obj4 = obj;
        // all reference variable refer to same Lion object in the heap



    }

}
