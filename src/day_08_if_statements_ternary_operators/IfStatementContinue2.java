package day_08_if_statements_ternary_operators;

public class IfStatementContinue2 {

    public static void main(String[] args) {

        // Write a program to define the age of people
        // age 1-5 is toddler
        // age 6-11 kid
        // age 12 - 15 is teenager
        // age 16 -20 is young adult
        // age 21 - 39 adult
        // age 40 - 50 middle age
        // age 50 - 70 and over is senior

        int age = 15;

        int num = 0;
        if (age < 2 || age > 70) {

            System.out.println("Invalid age");
        } else if (age >= 2 && age <= 5) {
            System.out.println("Toddler");
        } else if (age >= 5 && age <= 11) {
            System.out.println("Kid");

            num = 19;

            // Single if statement
            if (num > 14) ;
            System.out.println("Hello");
        }

        // if else statement (it has two options true or false)
        if (num > 17) {
            System.out.println("It is greater than 17");
        } else {

        }
        System.out.println("It is less than 17");


        // Nest if statements used to check precondition
        // inner if statements gets executed if outer if statements returns true

    }
    }
