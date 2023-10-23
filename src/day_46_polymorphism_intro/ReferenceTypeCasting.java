package day_46_polymorphism_intro;

public class ReferenceTypeCasting {
    public static void main(String[] args) {


        //implicit and explicit casting

        double d = 3.4;
        int i = (int)d; // explicit casting

        int b = 12;
        double d2 = b; // implicit casting

        // reference type casting/ up casting and down casting

        ClassA classA = new ClassA();
        ClassB classB = (ClassB) classA; // Down casting/explicit
        ClassB obj2 = new ClassB();
        ClassA obj3 = obj2; // implicit
    }
}
class ClassA{

}
class ClassB extends ClassA{

}
