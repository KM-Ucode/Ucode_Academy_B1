package day_07_if_nested_and_if_else_statements;

public class IfStatementContinue {

    public static void main(String[] args) {

        char ch1 = 'C';

        if(ch1 >= 97 && ch1 <= 122){

            System.out.println("It is a lower case character: "+ch1);

        }

        boolean b1 = true;
        if (b1 == true){
            System.out.println("b1 is true");
        }

        if (b1){
            System.out.println("I'm true");
        }

        System.out.println("============");

        boolean isWeatherCold = true;

        if (isWeatherCold ==true){
            System.out.println("Put on your jacket");

            if (isWeatherCold){
                System.out.println("Put on yuor jacket");

                System.out.println("==============");

                // The triangle is valid if sum of angles are equal to 180
                // create 3 int variables and calculate sum/add them to check if it is a valid triangle

                int angle1 = 55;
                int angle2 = 79;
                int angle3 = 30;

                if (angle1+angle2+angle3 == 180){
                    System.out.println("It is a valid triangle");

                }

                System.out.println("============");

                // Task 2:
                // Write a java program to find the minimum number out of three (assume none of them are equal)

                int n1 = 5;
                int n2 = 90;
                int n3 = 11;

                if (n1 < n2 && n1 < n3){

                        System.out.println("The smallest number is: "+ n1);
                    }

                    if (n2 < n1 && n2 < n3){
                        System.out.println("The smallest number is: "+ n2);
                    }

                    if (n3 < n1 && n3 < n2){
                        System.out.println("The smallest number is: "+n3);
                    }


                }
            }
        }
    }

