package Homework.day_50;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        //Task 4:
        //Write a program to sort List of String in alphabetical order, and then print/return the sorted list.

        List<String> string = new ArrayList<>(Arrays.asList("dog", "cat", "bird", "fish"));
        Collections.sort(string);
        System.out.println(string);

        System.out.println("===============================");

        List<String> str2 = new ArrayList<>(Arrays.asList("raspberry", "watermelon", "plum", "peach"));
        Collections.sort(str2);
        System.out.println(str2);

        System.out.println("==================================");

        List<String> str3 = new ArrayList<>(Arrays.asList("Ali","Max","Banu", "Lidiya"));
        Collections.sort(str3);
        System.out.println(str3);

        System.out.println("=================================");

        List<String> str4 = new ArrayList<>(Arrays.asList("Amboy", "Goodwill", "Egert", "Chester"));
        Collections.sort(str4);
        System.out.println(str4);

        System.out.println("====================================");

        List<String> str5 = new ArrayList<>(Arrays.asList("appple", "cherry", "banana", "grapes", "blueberry"));
        Collections.sort(str5);
        System.out.println(str5);

        System.out.println("==============================");

       Set<String> str6 = new TreeSet<>(str5);
        System.out.println(str6);

    }
}
