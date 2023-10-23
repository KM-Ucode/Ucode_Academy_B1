package day_05_unary_shorthand_operators;

public class Variables {
    public static void main(String[] args) {

        int num = 60 / 2; //?
        System.out.println(num);

        System.out.println("==========");

        int num2 = 5+5;
        System.out.println(num2);

        System.out.println("==========");

        int num3 = 10 - 3;
        System.out.println(num3);

        System.out.println("==========");

        int num4 = 15 / 5 ;
        System.out.println(num4);

        System.out.println("==========");

        int num5 = 15 % 10 ;
        System.out.println(num5);

        System.out.println("==========");


        int n1 = 20 ;
        int n2 = 30 ;

        boolean b1 = n1 == n2;
        System.out.println(b1);

        System.out.println("==========");

        int n3 = 5 % 2 * 2;
        System.out.println(n3);

        // Task :
        // Find if a number is even

        int n4 = 19;
        System.out.println(n4 % 2 == 0);

        int n5 = 20;
        System.out.println( n5 % 2 == 0);

        int n6 = 22 ;
        int n7 = n6 % 2;

        boolean b2 = n6 == 0;
        System.out.println(b2);

        System.out.println("==========");

        // Task:
        // Find if the reminder of odd number is greater than 1

        int n8 = 11;
        int n9 = n8 % 10;
        boolean b3 = n9 > 1;

        System.out.println(n9);

        System.out.println("is this number greater than 1?"+b3);

        // Task:
        // Write a programm that atkes the reminder of odd number and multiply it by itself

        int n10 = 23;

        int n11 = n10 % 10;

        int n12 = n11 * n11;
        System.out.println(n12);


    }
}
