package day_50_collection_list_and_set;

import java.util.*;

public class SetListPractice2 {
    public static void main(String[] args) {

        // Write a program to remove duplicate and sort elements in ArrayList

        List<Integer> list = new ArrayList<>(Arrays.asList(6,3,7,4,5,8,9,2,6,7,4,6,7,9,2,1));

        // Remove duplicate and sort it

        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);

        System.out.println("=========================");

        list = new ArrayList<>(set);
        System.out.println(list);
    }
}
