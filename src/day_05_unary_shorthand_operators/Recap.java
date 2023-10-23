package day_05_unary_shorthand_operators;

public class Recap {
    public static void main(String[] args) {

        int z = 199;

        boolean b1 = z % 2 == 0;

        System.out.println("is this number even?"+ b1);

        System.out.println( z % 2 == 0);

        System.out.println("=======");

        byte a = 30;
        int b = 0;
        b += a;

        System.out.println();

        // Task Salary calculator
        //create an int variable hours
        //create a double rate
        //create a double result
        //int months
        // Find out how much you make in a year

        int month = 12; // don't worry about doing it for now


        int hours = 40;

        double rate = 75.5;

        int weeks = 52;

        double annualSalary = hours * rate * weeks;

        System.out.println(annualSalary);

        System.out.println(annualSalary / month);

        System.out.println("=========");

        // Convert seconds to hours, and minutes;

        int seconds = 3500;
        int minute = seconds/ 60;
        int hour = minute/ 60;

        System.out.println();

        System.out.println("=========");

        // Task write a programm that check if  a number evenly divisible by 2, 3, 5

        int number = 30;

        boolean isDivisible2 = number % 2 ==0;
        boolean isDivisible3 = number % 3 ==0;
        boolean isDivisible5 = number % 5 ==0;

        System.out.println(isDivisible2);
        System.out.println(isDivisible3);
        System.out.println(isDivisible5);

        System.out.println("=========");







    }


}
