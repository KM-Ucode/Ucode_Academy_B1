package day_17_while_do_while_loops;

import java.util.Scanner;

public class WhileDoWhileLoop7 {
    public static void main(String[] args) {

        //Task:
        // Write a program to get input from user from 1 to 7
        // and print day of the week for the given number
        // example -> 1 Mon, 2 Tue

        // For HW:
        // Validate that it is  a valid number, and it is from 1 to 7
        // Make sure it has a number

        int dayOfWeek = 0;

        System.out.println("Please enter from 1 to 7");

        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) { //Make sure it is a number

            dayOfWeek = scan.nextInt();
        }

        while ( dayOfWeek >= 1 && dayOfWeek<=7){  // Make sure it is from 1 to 7

            switch(dayOfWeek){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednsday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
                    break;


            }
        }
    }
}
