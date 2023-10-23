package day_36_constructors_access_modifiers;

public class Student {
    String name;
    int studentId;
    String university;

    public Student(){
        System.out.println("I'm default constructor, I get executed when instance of EncapsulationTest class is created");
    }
    {
        System.out.println("I'm Instance block, and I get executed every time object is created");
    }
    static {
        System.out.println("I'm static block");
    }

    public static void main(String[] args) {
//        EncapsulationTest student1 = new EncapsulationTest();
//        System.out.println("=============");
//        EncapsulationTest student2 = new EncapsulationTest();
    }


}
