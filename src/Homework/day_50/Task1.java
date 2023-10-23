package Homework.day_50;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

     // Task 1:
     // Write a program to remove all duplicates, keeping only the unique values.

        String[] str = {"dog", "cat", "bird", "cat","dog","cat"};
        Set<String> uVal = new LinkedHashSet<>(Arrays.asList(str));
        System.out.println(uVal);

        System.out.println("======================");

        String [] str2 = {"boy", "girl", "child", " boy", "girl", "toddler"};
        Set<String> uVal2 = new LinkedHashSet<>(Arrays.asList(str2));
        System.out.println(uVal2);

        System.out.println("=============================");

       String [] str3 = {"School", "Daycare", "University", "School", "University"};
       Set<String> uVal3 = new LinkedHashSet<>(Arrays.asList(str3));
       System.out.println(uVal3);

        System.out.println("=====================================");

        String [] str4 = {"NY", "NJ", "WA", "PA", "NY", "PA", "WA"};
        Set<String> uVal4 = new LinkedHashSet<>(Arrays.asList(str4));
        System.out.println(uVal4);

        System.out.println("============================");

        String [] str5 = {"Sarah", "John", "Leyla", "Sarah", "John"};
        Set<String> uVal5 = new LinkedHashSet<>(Arrays.asList(str5));
        System.out.println(uVal5);




    }
}
