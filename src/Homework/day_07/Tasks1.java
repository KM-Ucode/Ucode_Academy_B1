package Homework.day_07;

public class Tasks1 {
    public static void main(String[] args) {

        // 1. Write a Java program:
        // 2. Display whether the number is an odd number or even number.

        int num = 23;

        if(num % 2 == 0){
            System.out.println("It's even number");
        }else{
            System.out.println("It's odd number");
        }




        //  2. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
        //    program that declares three integers as angles and check whether a triangle is valid or not.

        int n1 = 45;
        int n2 = 45;
        int n3 = 90;

        if (n1+n2+n3 == 180){
            System.out.println("The triangle is valid");
        }else{
            System.out.println("The triangle not valid");
        }


        //3. Write a Java program to implement following logic using if-else statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        //3. if hour is greater than or equal to 3 pm, greet with Good Evening

       int hours = 1;

        if (hours < 12){
            System.out.println("Good morning");
        }else if (hours >= 12 && hours < 15){
            System.out.println("Good afternoon");
        }else if(hours >= 15 && hours <= 23){
            System.out.println("Good evening");
        }else{
            System.out.println("Hours are invalid");
        }
    }
}
