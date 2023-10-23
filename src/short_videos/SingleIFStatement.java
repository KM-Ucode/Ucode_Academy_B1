package short_videos;

public class SingleIFStatement {
    public static void main(String[] args) {

        // If Statement returns boolean (true or false).
        //It allows us to check the condition (true or false) before taking some action.
        //If the condition is true the code inside of IF block (curly brace {some action here} )
        // will get executed.
        //If the condition is false the code inside of IF block will not be executed.

        int score = 10;
        if (score > 5){
            System.out.println("Hello there!");
            System.out.println("You won!");
            System.out.println("Your score is");
            System.out.println(score);
        }
        if (score < 5){
            System.out.println("I'm second if statement");
        }
    }
}
