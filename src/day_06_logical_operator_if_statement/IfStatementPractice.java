package day_06_logical_operator_if_statement;

public class IfStatementPractice {
    public static void main(String[] args) {


        // 1.Write a Java Program that will accept two numbers and check if two numbers are equal or not.

        int num1 = 45;
        int num2 = 45;

        if (num1 == num2){
            System.out.println("These numbers are equal");
        }
        System.out.println("==================================");
        // 1.2. Write a Java Program to multiply two numbers  if they are equal print them

        if (num2 == num1){
            num1 *= num2;
            System.out.println("The result of multiplication:"+ num1);
        }
        System.out.println("============================");
        // 1.3. if num1 is greater  than num2 subtract num1 from num2
        int res;
        if(num1 > num2){
            res = num1 - num2;
            // num1 -= num2;
            System.out.println(" Subtract result:" + res);
        }
        System.out.println("==================================");

        /* 2. Write a Java Program to implement following logic using If statement:
           1. if hour is less than 12 noon, greet with Good Morning
           2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
           3. if hour is greater than or equal to 3 pm , greet with Good Evening
         */

        int hour = 11;
        if(hour<12){
            System.out.println("Good Morning");
        }
        if(hour >= 12 && hour < 3){
            System.out.println("Good Afternoon");
        }

        if(hour >= 3){
            System.out.println("Good Evening");
        }
    }
}
