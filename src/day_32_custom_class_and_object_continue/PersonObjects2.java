package day_32_custom_class_and_object_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObjects2 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setPersonInfo("Tom", "James", 47, "Male", 5.1);
        p1.getPersonInfo();

        Person p2 = new Person();
        p2.setPersonInfo("Amanda", "Jackson",66, "Female", 5.2);

        Person p3 = new Person();
        p3.setPersonInfo("John", "Mike", 45, "Male", 5.3);

        Person [] people = {p1,p2,p3};
        //people[0].firstName -> p1.firstName

        for(int i = 0; i <people.length; i++){
            //System.out.println(people[i].firstName);
           // people[i].getPersonInfo();
            if (people[i].firstName.equals("John")){
                people[i].firstName = "Jack";
            }
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("======================");

        // If we want to Assign new info/name to p2 first name
        p2.firstName = "Ronda";
        System.out.println(p2.firstName);

        System.out.println("===============================================");

        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3));


        for (int i =0; i< personList.size(); i++){
            if (personList.get(i).firstName.equals("Ronda")){
                personList.get(i).firstName = "ABC";
            }

        }
        System.out.println(personList);

    }
}
