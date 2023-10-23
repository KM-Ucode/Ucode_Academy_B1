package Homework;

public class Day4 {
    public static void main(String[] args) {

        //Task 1
        //Create 7 String variables for 7 days of the week and print them.
        // 3 ways you can do:
       // String monday, tuesday; and then assign value -> monday="Monday";
       // String monday ="Monday"; String tuesday ="Tuesday";
       // String monday="Monday", tuesday="Tuesday";


        String monday = "Monday", tuesday = "Tuesday", wednsday = "Wednsday", thursday= "Thursday", friday = "Friday",
                saturday = "Saturday", sunday = " Sunday ";
        System.out.println(monday);
        System.out.println(tuesday);
        System.out.println(wednsday);
        System.out.println(thursday);
        System.out.println(friday);
        System.out.println(saturday);
        System.out.println(sunday);

        System.out.println("=======================");

        // Task 2:
        //Create 12 String variables for 12 months of the year and print them.
        // 3 ways you can do:

        //String january, february; and then assign value -> january="January";
       // String january ="January"; String february ="February";
       // String january ="January", february="February";

        String january = "January", february="February", march = "March", april = "April", may = "May",
                june = "June", july = "July", august = "August", september = "September", october = "October",
                november = "November", december = "December";

        System.out.println(january);
        System.out.println(february);
        System.out.println(march);
        System.out.println(april);
        System.out.println(may);
        System.out.println(june);
        System.out.println(july);
        System.out.println(august);
        System.out.println(september);
        System.out.println(october);
        System.out.println(november);
        System.out.println(december);

        System.out.println("======================");

        // Task 3:
        //3: Create 3 of each - byte, short, int, long, float, double, char, and
        //boolean variables and print them.
        //3 ways you can do:
        //byte b1, b2; and the assign value -> b1=1; b2=2;
        //byte b1=1; byte b2=2;
        //byte b1=1, b2=2, b3=3;

        byte b1 = 5;
        byte b2 = 7;
        byte b3 = 2;
        int myInt = b1+b2+b3;
        System.out.println(myInt);



        System.out.println("==============");

        short s1 = 4;
        short s2 = 2;
        short s3 = 9;

        System.out.println(s1/s2+9);

        System.out.println("===========");

        int a1 = 24;
        int a2 = 30;
        int a3 = 5;
        int a4 = a1+a2/a3;
        System.out.println(a4);

        System.out.println("=================");

        long daysInAYear = 365;
        long daysInAMonth = 30;
        double monthInAYear = daysInAYear / daysInAMonth;

        System.out.println(monthInAYear);

        System.out.println("========================");

        double tSide1 = 2.5;
        double tSide2 = 1.5;
        double tSide3 = 2.5;

        double trianglePerimeter = tSide1+tSide2+tSide3;

        System.out.println(trianglePerimeter);

        System.out.println("=========================");

        float d = 3.9479F;
        System.out.println(d);
        System.out.println("================");

        char c = 56;
        System.out.println(c);

        int ch = 'c' + 'a';
        System.out.println(ch);
        System.out.println("=================");


        boolean isTrue = 10 > 12;
        System.out.println(isTrue);

        boolean isFalse = 56<54;
        System.out.println(isFalse);

        boolean isEqual =  45 == 45;
        System.out.println(isEqual);











    }
}
