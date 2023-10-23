package day_09_if_ternary_review_switch_statement;

public class IfStatementsRecap {

    public static void main(String[] args) {


        String str = "java";

        if (str == "java"){

            System.out.println("I love Java");
        }
        if (str == "java"){

            str += "and selenium";
            str = "Selenium";
        }
        else{
            str = "API";
        }
        System.out.println(str);

        //Task 1:
        // Swap to numbers n1 = 5; n2 = 10 ; --> n1 = 10; n2 = 5;
        // Hint -> use a temp var





        // Task: use nested if
        // Write a program to check if the number is greater than 50 and even number
        // if it is even number multiply it by 5
        // if it is odd multiply it by 4


        int num  = 419;
                if( num>50){
                    if (num % 2 == 0){
                        num *= 5;
                    } else{
                        num *= 4;
                    }
                }
        System.out.println(num);

        System.out.println("=================");


        // Task: use nested if
        // Write a program to check if the number is greater than 50 and even number
        // if it is even number multiply it by 5
        // if it is odd multiply it by 4


    }
}
