package day_07_if_nested_and_if_else_statements;

public class IfElseStatements {

    public static void main(String[] args) {



        byte b1 = 14;
         if (b1 % 2 == 0) {
             System.out.println( b1 + "is Even number");
         }
         else {
             System.out.println(b1 + "is Odd number");
         }

        System.out.println("============");

        // The triangle is valid if sum of angles are equal to 180
        // create 3 int variables and calculate sum/add them to check if it is a valid triangle

        int angle1 = 45;
        int angle2 = 56;
        int angle3 = 79;
        int triangle = angle1+angle2+angle3;

        if (triangle==180) {
            System.out.println("It is a Valid Triangle" + triangle);
        }
        else{

            System.out.println(" This is not a Valid Triangle"+ triangle);
        }
    }
}
