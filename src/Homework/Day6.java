package Homework;

public class Day6 {
    public static void main(String[] args) {

        // Task1: Write a program that checks if a number is greater than 10 and the number is even

        boolean b1 = 40 > 10 && 40 % 2 == 0;
        System.out.println(b1);

        System.out.println("===========================");

        // Task2: Write a program that checks if a number greater than 10 and the number is odd

        boolean b2 = 26>10 && 26 % 2 != 0;
        System.out.println(b2);

        System.out.println("===================================");

        // Task 3: create 1 int variable and check if the variable is greater than 20 OR the variable is even
        int num1 = 60;
        boolean b3 = num1 > 20 || num1 % 2 == 0;
        System.out.println(b3);

        System.out.println("================================");

        // Task 4: create 1 int variable and check if the variable is greater than 10 OR the variable is odd
        int num2 = 35;
        boolean b4 = num2 > 10 || num2 % 2 != 0;
        System.out.println(b4);

        System.out.println("=================================");


        // Task 5: Create 2 variables num1, num2
        // 1: Write a program to check if num1 is greater than num2
        // if true increment num2 by 1 (use ++) and print it
        // 2: Write a program to check if num1 is greater than num2 and num1 is even
        // if true add 2 to num1 and print it

        int n1 = 66;
        int n2 = 60;
        if(n1>n2){
            n2++;
            System.out.println(n2);
        }
        if(n1>n2 && n1 % 2 == 0){
            n1++;
            System.out.println(n1);
        }
        System.out.println("===================================");

        // Task 6: Write a program to check if given number is greater than 10 and it's even number

        int n3 = 80;
        boolean eN = n3 > 10 && n3 % 2 == 0;
        System.out.println(eN);

        System.out.println("=========================================");


        // Task 7: Write a program to check if given number is greater than 10 and less than 50
        // and it's odd number

        int n4 = 45;
        boolean oN = n4 > 10 && n4 < 50 && n4 != 0;
        System.out.println(oN);

        System.out.println("============================");

        //8: Write a program to check if 2 given numbers are even

        int n5 = 80;
        int n6 = 40;
        if( n5 % 2 == 0 && n6 % 2 == 0){
            System.out.println("The numbers are even");
        }
        System.out.println("===============================");


        //9: Write a program to check if 2 given numbers are odd

        int n7 = 55;
        int n8 = 77;
        if( n7 % 2 != 0 && n8 % 2 != 0 ){
            System.out.println("The numbers are odd");
        }
        System.out.println("================================");

        //10: Write a program to check if num1 OR num2 is greater than 50

        int number1 = 40;
        int number2 = 60;

        boolean isG = number1 > 50 || number2 > 50;
        System.out.println(isG);

        System.out.println("===========================");

        //11: Write a program to check if 2 given char are equal

        char ch1 = 'a';
        char ch2 = 'B';

        boolean eCh = ch1 == ch2;
        System.out.println(eCh);

        System.out.println("==============================");

        //12: Write a program to check if one char is greater than another char

        boolean gCh = ch1 > ch2;
        System.out.println(gCh);

        System.out.println("==========================================");

        //13: Write a program to check if 2 given Strings are equal

        String str1 = "Java";
        String str2 = "java";

        boolean aE = str1 == str2;
        System.out.println(aE);

        System.out.println("======================================");

        if(str1 == str2){
            System.out.println("Equal");
        }
        //14: Write a program to check if 2 given Strings are Not equal

        boolean nE = str1 != str2;
        System.out.println(nE);

        System.out.println("======================");

        if (str1 != str2){
            System.out.println("Not Equal");
        }
    }
}
