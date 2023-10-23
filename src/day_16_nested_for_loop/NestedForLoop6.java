package day_16_nested_for_loop;

public class NestedForLoop6 {
    public static void main(String[] args) {

        //Task 2:
        //Factorial of number is the sum of multiplication of all the integers smaller than that positive integer.
        //Example: 5 is 5 * 4 * 3 * 2 * 1 which equals to 120
        //Write a program to ask user to enter a number from 5 to 20 and return
        //factorial of number

        int factorial =1;

        for (int i=5; i>=1; i--){
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
