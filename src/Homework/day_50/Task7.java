package Homework.day_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

        //Task 7:
        //Write a program to remove all elements from a list/set of Integer that are greater than 15.

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(78, 45, 12, 11, 14, 13, 18, 89));

        // list4.removeIf(x -> x > 15); // Useful method

        Iterator<Integer> num2 = list4.iterator();

        while (num2.hasNext()) {
            int num3 = num2.next();
            if (num3 > 15) {
                num2.remove();
            }
        }
        System.out.println(list4);

        System.out.println("============================");

        List<Integer> l1 = new ArrayList<>(Arrays.asList(6,12,45,67,13,9,8,15));

       // l1.removeIf(x -> x > 18);

        Iterator<Integer> num = l1.iterator();
        while(num.hasNext()){
            int num1 = num.next();
            if(num1 > 18){
                num.remove();
            }
        }
        System.out.println(l1);

        System.out.println("============================");

        List<Integer> l2 = new ArrayList<>(Arrays.asList(60,30,40,50,80));

        //l2.removeIf(x -> x > 50);

        Iterator<Integer> n2 = l2.iterator();
        while(n2.hasNext()){
            int num3 = n2.next();
            if(num3 > 50){
                n2.remove();
            }
        }
        System.out.println(l2);

        System.out.println("==============================");

        List<Integer> l3 = new ArrayList<>(Arrays.asList(5,10,15,20,25,30));

        //l3.removeIf(x -> x > 20);

        Iterator<Integer> n3 = l3.iterator();
        while(n3.hasNext()){
            int num4 = n3.next();
            if(num4 > 20){
                n3.remove();
            }
        }
        System.out.println(l3);

        System.out.println("==============================");

        List<Integer> l4 = new ArrayList<>(Arrays.asList(6,12,18,24,30,36,42));

        //l4.removeIf(x -> x > 30);

        Iterator<Integer> n4 = l4.iterator();
        while(n4.hasNext()){
            int num5 = n4.next();
            if(num5 > 30){
                n4.remove();
            }
        }
        System.out.println(l4);

        System.out.println("====================================");

        List<Integer> l5 = new ArrayList<>(Arrays.asList(7,14,21,28,35));

        //l5.removeIf( x -> x > 28);

        Iterator<Integer> n5 = l5.iterator();
        while(n5.hasNext()){
            int num6 = n5.next();
            if(num6 > 21){
                n5.remove();
            }
        }
        System.out.println(l5);

        System.out.println("====================================");
    }
}
