package day_07_if_nested_and_if_else_statements;

public class IfElseIfStatements {

    public static void main(String[] args) {

        // 1. Program : Declare 3 numbers
        // Program should display which one is largest

        int num1 = 56;
        int num2 = 78;
        int num3 = 88;

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + "is largest");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + "is largest");
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + "is largest");
        }

        // 2. Write a Java Program for the following logic:
        // If marks < 60 , then print "Fail"
        // If marks >= 60, but less than 90, then print "Pass"
        // If marks >= 90, then print "Past with Distinction"

        int marks = 91;

        if (marks < 60){
            System.out.println("Fail");
        }

        else if (marks >=60 && marks < 90 ){
            System.out.println("Pass");
        }
        else {
            System.out.println("Passed with Distinction");
        }



    }
}
