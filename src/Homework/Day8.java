package Homework;

public class Day8 {
    public static void main(String[] args) {

        //Tasks:
        // 1. write a program that can return the average age of person:
        // -> p1 =23, p2=45, p3=67, p4=51;

        int p1 = 23;
        int p2 = 45;
        int p3 = 67;
        int p4 = 51;

        int avg = (p1 + p2 + p3+p4) / 4;
        System.out.println("Average person's age :" +avg);

        // 2. Write a program that can return the difference between
        //Smallest and Largest number. Assume two numbers are not equal
        //  -> num1 = 25; num2 = 65; -> find difference between them

        int num1 = 85;
        int num2 = 65;
        int num3 = 0;
        if(num1 > num2){
            num3 = num1 - num2;
        }else{
            num3 = num2 - num1;
        }
        System.out.println(num3);

        //   3. Write a program to find Max and Min number. Note declare 2 additional variables to assign max and min numbers
            int min = 0;
            int max = 0;

            if(num1 > num2){  // 85 > 65 == true
                max = num1;   // max = 85
                min = num2;   // min = 65

            }else{
                max = num2;
                min = num1;
            }
        System.out.println(max);
        System.out.println(min);
        System.out.println("========================");


        // 4. Declare 2 numbers and one operator and assign them values, and calculate
        // 2 numbers based on Operator (-, +, *, /, %)
        // if operator is not between (-, +, *, /, %) output should be "Invalid Operator". Note use If else or Ternary operator.

        // Example: n1 = 10; n2 = 20; char operator = '+'; n1 + n2;

        int n1 = 20;
        int n2 = 40;
        char ch = '+';
        if(ch == '+'){
            System.out.println(n1+n2);
        }else if(ch == '-'){
            System.out.println(n1-n2);
        }else if(ch == '*'){
            System.out.println(n1*n2);
        }else if(ch == '/'){
            System.out.println(n1/n2);
        }else if(ch== '%'){
            System.out.println(n1%n2);
        }else{
            System.out.println("Invalid operator");
        }
    }
}
