package Homework;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {

        // Use Scanner and For Loop

        // Task 1:
        // Write a program to take a string from user and reverse it
        // example "java" -> "avaj"

        //Task 2:
        //Write a program to ask user to enter a number from 50 to 100 and print even numbers from 1 to given number:
        //example: if user enters 60 print even numbers from 1 to 60

        System.out.println("Enter a number from 1 to 100 ");
        int sumOfEvens = 0;
        int num = 0;

        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            num = input.nextInt();
        } else {
            System.out.println("Please enter a valid number");
        }
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
                System.out.println("" + 'i');
                System.out.println(i);
            }

            // Task 3:
            // Write a program to ask user to enter a number from 50 to 100 and print odd numbers from 1 to given number:
            // example: if user enters 60 print odd numbers from 1 to 60


            //Task 4:
            // Write a program to ask user to enter a string and count how man 'a'
            //that string has

            //Task 5:
            // Write a program to return sum of all even and odd number from 1 to 50
            // Hint: create one variable for even and one for odd, sum even numbers to
            //even variable and odd numbers to odd variable

            // Task 6:
            // Write a program to print from 'a' to 'z' and from 'A' to 'Z'

            // Task 7:
            // Write a program to count how many times "java" appears in a sentence
        }
    }
}
