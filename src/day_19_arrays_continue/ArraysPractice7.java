package day_19_arrays_continue;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice7 {
    public static void main(String[] args) {

        // Write a program that asks user to enter an array length
        // and declare an array based on user's input
        // and add from 1 to given number into array

        System.out.println("Please enter an array size/length");

        int num  = 0;
        Scanner scan  = new Scanner(System.in);
        num =  scan.nextInt();

        int [] numArray = new int[num];

        for (int i = 0 ; i < num; i ++){
            numArray [i] = i +1;
        }
        System.out.println(Arrays.toString(numArray));


    }
}
