package day_3_variable_continue;

public class Variables1 {
    public static void main(String[] args) {

        System.out.println(12);

//        int myNum;  //declare
//        myNum = 100; // assign
//        byte num = 2.5; byte, short, int, long take whole numbers
//        byte b = 150; out of range

        int myNum = 100; //declare and assign

       // float f = 100.5; // by default Java compiler takes any floating number as double

        float f = 100.5F; // when we give F it is not

        double d = 5.5;
        d += myNum;
        System.out.println("===================");
        System.out.println(d);

        String name = "Java";
        System.out.println(name + " Selenium");


        String name2 = "hello world";
        System.out.println(name2);
        System.out.println(name2+d);

        String firstName = "Jake";
        String lastName = "Smith";

        System.out.println(firstName + " "+ lastName);

        int age = 25;
        String firstName3 = "Sarah";
        String lastName3 = "Mike";

        System.out.println(firstName3+" "+lastName3+" "+age);

        byte b = 50;
        short s = 160;

        int i = b+s;

        System.out.println(i);

        System.out.println("Arithmetic operators");

        int salary = 1000000;
        double weeklySalary = salary/4;
        System.out.println(weeklySalary);

        int weeklyPay = 1790;

        long annualSalary = weeklyPay * 52;
        System.out.println(annualSalary);

        long monthlyPay = annualSalary/12;
        System.out.println(monthlyPay);

        System.out.println("================");

        // how many kg is 50 pound
        // 1 pound is equal to 500g

        int pounds = 50;
        double kg = pounds/2;
        System.out.println(kg);

        System.out.println("=====================");

        double usd;
        double tjkSomoni = 1000;
        //1 usd == 10 somoni

        usd = tjkSomoni/10;
        System.out.println(usd);

        System.out.println("===================");


        long ssn = 12345678;
        String strSsn = ""+ssn;
        System.out.println(strSsn);

        int num = 10;
        int num2 = 20;
        String word = "" + num + num2; // it's not adding just creating string
        System.out.println(word);

        int num3 = num+num2;  // now we are adding
        System.out.println(num3);

    }
}
