package Homework.day_50;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        //Task 5:
        // Write a program to reverse  elements in  list/set String.

        List<String> string = new ArrayList<>(Arrays.asList("raspberry", "watermelon", "plum", "peach"));
        for(int i = 0; i<string.size(); i++){
            String str1 = string.get(i);
            str1 =  new StringBuilder(str1).reverse().toString();
            string.set(i, str1);
        }
        System.out.println(string);

        System.out.println("=================================");

        List<String> str2 = new ArrayList<>(Arrays.asList("apple", "banana", "grapes"));
        for(int i = 0; i < str2.size(); i++){
            String str = str2.get(i);
            str = new StringBuilder(str).reverse().toString();
            str2.set(i, str);
        }
        System.out.println(str2);

        System.out.println("=======================================");

        List<String> str3 = new ArrayList<>(Arrays.asList("John", "Sarah", "Max", "Bill"));
        for(int i = 0; i < str3.size(); i++){
            String str = str3.get(i);
            str = new StringBuilder(str).reverse().toString();
            str3.set(i, str);
        }
        System.out.println(str3);

        System.out.println("===================================");

        List<String> str4 = new ArrayList<>(Arrays.asList("dog", "cat", "bird", "fish"));
        for(int i = 0; i<str4.size(); i++){
            String str = str4.get(i);
            str = new StringBuilder(str).reverse().toString();
            str4.set(i, str);
        }
        System.out.println(str4);

        System.out.println("==========================================");

        List<String> str5 = new ArrayList<>(Arrays.asList("Amboy", "Goodwill", "Egert", "Chester"));
        for(int i = 0; i< str5.size(); i++){
           String str = str5.get(i);
           str = new StringBuilder(str).reverse().toString();
           str5.set(i, str);
        }
        System.out.println(str5);

        System.out.println("===============================");

        Set<String> str6 = new HashSet<>(Arrays.asList("Amboy", "Goodwill", "Egert", "Chester"));
        Set<String> reverse = new HashSet<>();
        for(String each : str6){
            each = new StringBuilder(each).reverse().toString();
            reverse.add(each);
        }
        System.out.println(reverse);



        }
    }