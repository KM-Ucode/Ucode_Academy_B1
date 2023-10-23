package Homework.day_07;

public class Tasks {
    public static void main(String[] args) {
       // write a program that checks the equality of the three given numbers
        //declare 3 numbers n1, n2, n3
        //if n1 and n2 are equal print n1&n2 are equal
        //if n2 and n3 are equal print n2&n3 are equal
        // if n3 and n1 are equal print n3&n1 are equal
        //if all equal print all equal
        // if none of them are equal ==> none of them are equal

        int n1 = 60;
        int n2 = 65;
        int n3 = 60;

        if(n1==n2){

            System.out.println("n1&n2 are equal");

        } else if (n2==n3){

            System.out.println("n2&n3 are equal");
        }
        else if(n3==n1){

            System.out.println("n3&n1 are equal");
        }
        else if (n1 == n2 && n2==n3 && n3==n1){
            System.out.println("All equal");
        }
        else{
            System.out.println("None of them Equal");
        }



        //write a program that can find the number of days in a month
        //  use if else statements
        //   (Assume that Feb has 28 days)
        // Example -> int month = 1; it's December and it has 31 days
        // if(month ==1){
        //  print(it has 31 days)
        // } if else()....

        //  28 days: 2
        //  30 days: 4,6,9,11
        //  31 days: 1,3,5,7,8,10,12

        int month = 2;
        if(month == 2){
            System.out.println("It has 28 days");
        }
        else if (month==4 || month==6 || month==9 || month==11) {
            System.out.println("It has 30 days");

        }else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("It has 31 one days");

        } else {
            System.out.println("Invalid days in a month");

        }
    }
}
