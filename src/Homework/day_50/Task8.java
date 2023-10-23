package Homework.day_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {

        //Task 8:
        //Write a program to check if two lists/sets are equal (contain the same elements in the same order).

        List<String> list1 = new ArrayList<>(Arrays.asList("Dog", "Cat", "Bird"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Dog", "Cat", "Bird"));

        boolean b1 = list1.equals(list2);
        System.out.println(b1);

        System.out.println("==================================");

        List<Integer> num1 = new ArrayList<>(Arrays.asList(3,6,9,12));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(2,4,6,8));

        boolean b2 = num1.equals(num2);
        System.out.println(b2);

        System.out.println("===============================");

        List<Character> ch1 = new ArrayList<>(Arrays.asList('a','b','c'));
        List<Character> ch2 = new ArrayList<>(Arrays.asList('a','b','c'));

        boolean b3 = ch1.equals(ch2);
        System.out.println(b3);

        System.out.println("====================================");

        List<Integer> num3 = new ArrayList<>(Arrays.asList(5,10,15,20));
        List<Integer> num4 = new ArrayList<>(Arrays.asList(3,6,9,12));

        boolean b4 = num3.equals(num4);
        System.out.println(b4);

        System.out.println("====================================");

        List<String> str1 = new ArrayList<>(Arrays.asList("apple", "bread", "carrots"));
        List<String> str2 = new ArrayList<>(Arrays.asList("banana", "bread", "berries"));

        boolean b5 = str1.equals(str2);
        System.out.println(b5);



    }
}
