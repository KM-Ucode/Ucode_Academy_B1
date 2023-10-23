package day_06_logical_operator_if_statement;

public class SingleIfStatement {
    public static void main(String[] args) {


        int age = 29;
        if(age >= 18){

            System.out.println("You are eligible to vote");
        }
        System.out.println("==================================");

        // Only people between 18 and 30 can vote

        if (age >= 18 && age <=30){
            System.out.println("You are eligible to vote");
            System.out.println("You are "+age+" years old");
        }

        /* Write a Java program that will accept three numbers and return the greatest number.
        Input: num1 : 4
               num2 : 8
               num3 : 1
        Output:
        The greatest number is 8
         */

        int num1 = 4;
        int num2 = 8;
        int num3 = 1;

        if (num1 > num2 && num1 > num3){ // if num1 greater num2 and num3, then the code will be executed
            System.out.println("The greatest number is:"+ num1);
        }
        if( num2 > num1 && num2 > num3){ // if num2 greater num1 and num3, then the code will be executed
            System.out.println("The greatest number is:"+ num2);
        }
        if(num3 > num1 && num3 > num2){ // if num3 greater num1 and num2, then the code will be executed
            System.out.println("The greatest number is:"+ num3);

        }

    }
}
