package day_52_map_and_enum_intro;

import java.util.*;

public class ArrayListRemoveDuplicates {
    public static void main(String[] args) {
        // Write a program to remove duplicates from an ArrayList of String

        List<String> list = new ArrayList<>(Arrays.asList("aa", "aa", "bb","bb","cc","cc","dd","dd"));

        Set<String> uniques = new HashSet<>(list);
        System.out.println(uniques);

        System.out.println("=======================");

        list = new ArrayList<>(uniques);

        System.out.println(list);
    }
}
