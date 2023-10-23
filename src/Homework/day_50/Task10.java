package Homework.day_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {

        //Task 10:
        //Write a program to find and print/return the average of the positive numbers from List/Set of Integer.

        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,6,3,5,7));
        Integer average = 0;
        for(int i : list){
            average+=i;
        }
        average/= list.size();

        System.out.println(average);

        System.out.println("=============================");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(8,4,6,8,6,4));
        Integer avNum = 0;
        for(int i : list1){
            avNum += i;
        }
        avNum /= list1.size();
        System.out.println(avNum);

        System.out.println("==============================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(48,66,64,34));
        Integer avNum2 = 0;
        for(int i : list2){
            avNum2 += i;
        }
        avNum2 /= list2.size();
        System.out.println(avNum2);

        System.out.println("=============================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(8,6,4,6,8,6));
        Integer avNum3 = 0;
        for(int i : list3){
            avNum3 += i;
        }
        avNum3 /= list3.size();
        System.out.println(avNum3);

        System.out.println("==================================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(16,18,20,22,24));
        Integer avNum4 = 0;
        for(int i : list4){
            avNum4 += i;
        }
        avNum4 /= list4.size();
        System.out.println(avNum4);

        System.out.println("===============================");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(88,64,24,16));
        Integer avNum5 = 0;
        for(int i : list5){
            avNum5 += i;
        }
        avNum5 /= list5.size();
        System.out.println(avNum5);
    }
}
