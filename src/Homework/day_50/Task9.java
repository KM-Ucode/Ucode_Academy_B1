package Homework.day_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {

        //Task 9:
        //Write a program to remove all occurrences of a specific value from a list/set of Integer.

        List<Integer> list3 = new ArrayList<>(Arrays.asList(3,4,5,6,3,5,7));
        System.out.println(list3);
        list3.removeIf(x -> x == 3);

        System.out.println(list3);

        System.out.println("=============================");

        List<Integer> l1 = new ArrayList<>(Arrays.asList(2,6,4,6,4,2));
        System.out.println(l1);

        l1.removeIf(x -> x == 6);
        System.out.println(l1);

        System.out.println("==================================");

        List<Integer> l2 = new ArrayList<>(Arrays.asList(7,5,9,5,7,9));
        System.out.println(l2);

        l2.removeIf(x -> x == 9);
        System.out.println(l2);

        System.out.println("========================");

        List<Integer> l3 = new ArrayList<>(Arrays.asList(4,6,8,4,6,8));
        System.out.println(l3);

        l3.removeIf(x -> x == 4);
        System.out.println(l3);

        System.out.println("========================");

        List<Integer> l4 = new ArrayList<>(Arrays.asList(5,10,15,5,10,15));
        System.out.println(l4);

        l4.removeIf(x -> x == 15);
        System.out.println(l4);

        System.out.println("========================");

        List<Integer> l5 = new ArrayList<>(Arrays.asList(1,2,2,3,4,5));
        System.out.println(l5);

        l5.removeIf(x -> x == 2);
        System.out.println(l5);
    }
}
