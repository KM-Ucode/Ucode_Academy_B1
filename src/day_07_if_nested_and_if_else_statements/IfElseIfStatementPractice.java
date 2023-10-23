package day_07_if_nested_and_if_else_statements;

public class IfElseIfStatementPractice {

    public static void main(String[] args) {
        
     int math = 39;
     int history = 34;
     int geography = 19;
     
     int totalScore = math+history+geography;
     char grade;
     
     if (totalScore >= 90 && totalScore <=100){
         grade = 'A';
         
     } else if (totalScore >= 80 && totalScore <90) {
         grade = 'B';


         // Write  a program to check if the number is greater than 50 and less than 150
         // and the number is even

         int num = 148;

         if (num > 50) {
             if (num % 2 == 0 && num < 150) {
                 System.out.println("Your number is eligible");
             } else {

             }

             System.out.println("Sorry, the number is less than 50");



         }
     }
     }
    }
