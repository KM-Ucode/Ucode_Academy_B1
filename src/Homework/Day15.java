package Homework;

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {

        //Task 1:
        //Write a program to ask user to enter a sentence, and count how many
        //times "java" appears in the sentence, and replace "java" with "selenium"
        //Hint: increment your variable/counter and use replaceFirst()

        //Task 2:
        //Factorial of number is the sum of multiplication of all the integers smaller than that positive integer.
        //        Example: 5 is 5 * 4 * 3 * 2 * 1 which equals to 120
        // Write a program to ask user to enter a number from 5 to 20 and return
        //        factorial of number



        //Task 2:
       //Write a program to ask user to enter a number from 50 to 100 and print even numbers from 1 to given number:
       //example: if user enters 60 print even numbers from 1 to 60

        System.out.println("Enter a number from 1 to 100 ");
         int sumOfEvens = 0;
         int num = 0;

         Scanner input = new Scanner(System.in);
         if (input.hasNextInt()){
             num = input.nextInt();
         }else{
             System.out.println("Please enter a valid number");
         }
         for (int i = 1 ; i <= num; i++){
             if(i % 2==0){
                 sumOfEvens += i;
                 System.out.println("" + 'i');
                 System.out.println(i);
             }
         }
    }
}
