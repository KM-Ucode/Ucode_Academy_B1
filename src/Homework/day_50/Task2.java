package Homework.day_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        //Task 2:
        //Write a program to find and print/return the maximum element/number in a list/set  of Integer.

        List<Integer> maxNum = new ArrayList<>(Arrays.asList(6,9,6,7,5,8));
        Iterator<Integer> iterator = maxNum.iterator();
        int max = maxNum.get(0);
        for(int num : maxNum){
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);

        System.out.println("====================================");

        List<Integer> maxNum2 = new ArrayList<>(Arrays.asList(6,7,8,3,4,5));
        Iterator<Integer> iterator2 = maxNum2.iterator();
        int max2 = maxNum2.get(0);
        for(int num2 : maxNum2){
            if(num2>max2){
                max2 = num2;
            }
        }
        System.out.println(max2);

        System.out.println("=============================");

        List<Integer> maxNum3 = new ArrayList<>(Arrays.asList(19,78,67,56,98,54));
        Iterator<Integer> iterator3 = maxNum3.iterator();
        int max3 = maxNum3.get(0);
        for(int num3 : maxNum3){
            if(num3>max3){
                max3 = num3;
            }
        }
        System.out.println(max3);

        System.out.println("===============================");

        List<Integer> maxNum4 = new ArrayList<>(Arrays.asList(89,67,45,78,77, 65));
        Iterator<Integer> iterator4 = maxNum4.iterator();
        int max4 = maxNum4.get(0);
        for(int num4 : maxNum4){
            if(num4>max4){
                max4 = num4;
            }
        }
        System.out.println(max4);

        System.out.println("=================================");

        List<Integer> maxNum5 = new ArrayList<>(Arrays.asList(7,6,9,4,6,12,67,45));
        Iterator<Integer> iterator5 = maxNum5.iterator();
        int max5 = maxNum5.get(0);
        for(int num5 : maxNum5){
            if(num5>max5){
                max5=num5;
            }
        }
        System.out.println(max5);

        System.out.println("==========================");

        int max6 = maxNum5.get(0);
        while(iterator5.hasNext()){ // using iterator
            int x = iterator5.next();
            if(x > max6){
                max6 = x;
            }

        }
        System.out.println(max6);

    }
}
