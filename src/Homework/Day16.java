package Homework;

public class Day16 {
    public static void main(String[] args) {

        // Task 1:
        // Write a program to print from 1 to 30
        // if a number is divisible by 3 print "FIN"
        // if number is divisible by 5 print "RA"
        // if number is divisible by 3 and 5 print "FINRA"
        //  example -> 1 2 FIN 4 RA FIN...

        int i;
        for(i=1; i<=30; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i % 3 ==0) {
                System.out.println("FIN");

            } else if (i % 5 == 0) {
                System.out.println("RA");

            }else {
                System.out.println(i);
            }

        }

        //Task 2:
        // Write a program to take a number, if the number is even
        // print 1 to given number
        //1
        //12
        //123
        //1234
        // if the number is odd print 1 to given number
        //12345678910
        //123456789
        //12345678


    }
}

