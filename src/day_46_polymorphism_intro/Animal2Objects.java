package day_46_polymorphism_intro;

public class Animal2Objects {
    public static void main(String[] args) {

        Dog2 dog2 = new Dog2(1,"Sharik","Dog2");
        System.out.println(dog2.dogName);

        Animal2 dog3 = new Dog2(2,"Ruby","Dog3");
        dog3.methodA();

        boolean b1 = dog3 instanceof Animal2;
        boolean b2 = dog3 instanceof Animal2;


        System.out.println(b1);
        System.out.println(b2);

        System.out.println("=====================");

        Animal2 obj = new Dog2(3, "Sharik test", "Dog object");

        boolean bb1 = obj instanceof Animal2;  // expecting true in
        boolean bb2 = obj instanceof Dog2; // expecting true

        boolean bb3 = obj instanceof Cat2; //expecting false

        System.out.println("is it Instance of Animal2? "+bb1);
        System.out.println("is it Instance of Animal2? "+bb2);
        System.out.println("is it Instance of Cat2? "+bb3);

    }
}
