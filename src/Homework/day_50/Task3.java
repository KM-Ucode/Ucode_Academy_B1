package Homework.day_50;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

    //Task 3:
    // Write a program to print/return the sum of all elements in a list/set of integers.
        List<Integer> sumEl = new ArrayList<>(Arrays.asList(6,9,3,12,8,5));
        int sum = 0;
        for(int num : sumEl){
        sum += num;
    }
        System.out.println(sum);

        System.out.println("========================");

        List<Integer> sumEl2 = new ArrayList<>(Arrays.asList(89,78,56,67,98,65));
        int sum2 = 0;
        for(int num : sumEl2){
            sum2 += num;
        }
        System.out.println(sum2);

        System.out.println("===============================");

        List<Integer> sumEl3 = new ArrayList<>(Arrays.asList(9,4,6,7,8,7));
        int sum3 = 0;
        for(int num : sumEl3){
            sum3 += num;
        }
        System.out.println(sum3);

        System.out.println("===============================");

        List<Integer> sumEl4 = new ArrayList<>(Arrays.asList(8,5,7,4,2,3));
        int sum4 = 0;
        for(int num : sumEl4){
            sum4 += num;
        }
        System.out.println(sum4);

        System.out.println("===============================");

        List<Integer> sumEl5 = new ArrayList<>(Arrays.asList(9,5,7,8,4,5));
        int sum5 = 0;
        for(int num : sumEl5){
                sum5 += num;
        }
        System.out.println(sum5);

        System.out.println("==================================");

        Set<Integer> set = new HashSet<>(Arrays.asList(67,87,45,66));

        int num = 0;
        for(int x : set){
            num += x;
        }
        System.out.println(num);



    }
}
