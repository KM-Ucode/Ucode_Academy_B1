package Homework.Day_32;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.firstName = "Vanessa";
        person1.lastName = "Mae";
        person1.gender = "Female";
        person1.age = 44;
        person1.height = 5.2;
        person1.profession = "Musician";

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.gender);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.profession);

        person1.play();
        person1.run();
        person1.eat();
        person1.drive();

        System.out.println("================================================");

        Person person2 = new Person();
        person2.setPersonInfo("Sarah","Michelle", "Female", 30, 5.7, "Blue","Model");

        person2.drive();
        person2.run();
        person2.eat();
        person2.getPersonInfo();

        System.out.println("====================================");
        System.out.println(person2);


    }
}
