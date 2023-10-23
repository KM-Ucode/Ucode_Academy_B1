package Homework;

import java.util.ArrayList;

public class Day27P1 {
    public static void main(String[] args) {
        //Task 1:
        //Create an empty ArrayList of type String and
        //Add three different names ("Mike", "Jame", "Tom") to the ArrayList.
        //Print the size of the ArrayList.
        //Check if the ArrayList is empty and print the result.
        //Access and print the second element of the ArrayList.
        //Add another name ("Sara") to the ArrayList at index 1.
        //Remove the element at index 3 from the ArrayList.
        //Check if you can remove "Bob" and print the result.

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Mike");
        strList.add("Jame");
        strList.add("Tom");
        System.out.println(strList);

        //strList.addAll(Arrays.asList("Mike", "Jame", "Tom")); // to add all at once

        System.out.println("=========================");

        System.out.println(strList.size());

        System.out.println("============================");

        boolean isEmpty = strList.isEmpty();
        System.out.println(isEmpty);

        System.out.println("==========================");

        System.out.println(strList.get(1));

        System.out.println("=========================");

        strList.add(1, "Sara");
        System.out.println(strList);

        System.out.println("===========================");

        strList.remove(3);
        System.out.println(strList);

        System.out.println("==============================");

        boolean ifTrue = strList.remove("Bob");
        System.out.println(ifTrue);

    }
}
