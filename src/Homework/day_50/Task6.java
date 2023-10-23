package Homework.day_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {

        //Task 6:
        //Write a program to merge two list into one list and sort it.

        List<Integer> list1 = new ArrayList<>(Arrays.asList(7,4,5,9,3,6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(8,6,9,4,3,1));

        List <Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        Collections.sort(list3);

        System.out.println(list3);

        System.out.println("=====================================");


        List<Integer> l1 = new ArrayList<>(Arrays.asList(6,8,3,6));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3,2,1,5));

        List<Integer> m1 = new ArrayList<>();
        m1.addAll(l1);
        m1.addAll(l2);

        Collections.sort(m1);

        System.out.println(m1);

        System.out.println("========================================");

        List<Integer> l3 = new ArrayList<>(Arrays.asList(0,3,1,2,4));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(9,7,6,8,10));

        List<Integer> m2 = new ArrayList<>();

        m2.addAll(l3);
        m2.addAll(l4);

        Collections.sort(m2);
        System.out.println(m2);

        System.out.println("=============================");

        List <Integer> l5 = new ArrayList<>(Arrays.asList(2,5,6,4));
        List<Integer> l6 = new ArrayList<>(Arrays.asList(9,6,4,6));

        List<Integer> m3 = new ArrayList<>();

        m3.addAll(l5);
        m3.addAll(l6);

        Collections.sort(m3);
        System.out.println(m3);

        System.out.println("=========================");

        List<String> str = new ArrayList<>(Arrays.asList("aa", "bb", "dd", "ff"));
        List<String> str2 = new ArrayList<>(Arrays.asList("cc","ee","gg", "hh"));

        List<String> m4 = new ArrayList<>();
        m4.addAll(str);
        m4.addAll(str2);

        Collections.sort(m4);
        System.out.println(m4);

        System.out.println("=================================");

        List<Integer> l7 = new ArrayList<>(Arrays.asList(20,50,70,10));
        List<Integer> l8 = new ArrayList<>(Arrays.asList(30,60,40,80 ));

        List<Integer> m5 = new ArrayList<>();
        m5.addAll(l7);
        m5.addAll(l8);

        Collections.sort(m5);
        System.out.println(m5);



    }
}
