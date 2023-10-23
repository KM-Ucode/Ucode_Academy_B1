package day_06_logical_operator_if_statement;

public class LogicalANDOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        boolean logicalAnd = num1<num2 && num1<num3 && num2 != num3; // for logical operator all condition
                                                              // should be true to return true, otherwise it
                                                            // returns false

        boolean b1 = 79 % 2 != 0 && 79 > 80;
        System.out.println(logicalAnd);

        System.out.println("============================");
        System.out.println(b1);

        System.out.println("============================");
        System.out.println(8 > 7 && 9<19 && 1==-1);

        System.out.println("===========================");

        //Task1:
        //Write a program that checks if a number is greater than 10 and the number is even

        boolean isEven = 20>10 && 20%2 == 0;
        System.out.println(isEven);

        // Task2:
        //Write a program that checks if a number greater than 10 and the number is odd

        boolean isOdd = 15>10 && 15%2 != 0;
        System.out.println(isOdd);

        System.out.println("=======================");

        boolean b2 = 'a' != 'b' && "Java" != "java" && 6 %2 == 0;
        System.out.println(b2);

    }
}
