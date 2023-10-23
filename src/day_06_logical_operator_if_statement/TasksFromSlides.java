package day_06_logical_operator_if_statement;

public class TasksFromSlides {
    public static void main(String[] args) {

        //Task1
        int ApplesCount = 50;
        int OrangesCount = 60;
        int PearsCount = 60;

        boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
        System.out.println(comp);

        System.out.println("=================================");

        //Task2

        String outsideWeather;
        int degree;
        outsideWeather = "Shiny";
        degree = 70;

        boolean comp2 = (!(outsideWeather == "Shiny" || degree == 70));

        System.out.println(comp2);

        System.out.println("====================");

        //Task3

        int b = 2;
        boolean b1 = ++b == 2 || --b == 2 && --b == 2;
        System.out.println(b1);

        System.out.println("======================================");

        //Task4

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) || (z = false);
        System.out.println(x);

        System.out.println("==============================");

        //Task5
        /* 1.Create a double variable with the value 20
        2.Create a second variable of type double with the value 80
        3.Add both numbers up and multiply by 25
        4.Use the remainder operator to figure out the remainder from the sum of #3 divided
          by 40
        5.Print remaining total (#4) is equal to 20 or less : true/ false
         */

        double d1 = 20;
        double d2 = 80;
        double sum = (d1 + d2) * 25;
        double rem = sum % 40;
        boolean isEq = rem <= 20;
        System.out.println(isEq);


        //If statement task:

        int numOfApples;
        boolean lotsOfApples;
        lotsOfApples = false;
        numOfApples = 50;

        if(numOfApples >= 20){
            System.out.println("I have more than 20 apples");
            lotsOfApples = true;
        }
        if(lotsOfApples){
            System.out.println("Enjoy");
        }
        if(lotsOfApples== false){
            System.out.println("I need more apples");
        }
    }
}
