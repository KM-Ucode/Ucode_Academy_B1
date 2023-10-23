package short_videos;

public class IfAndElseIfStatements {
    public static void main(String[] args) {

        // Else statement gets executed if all the above conditions are false.
        // First it checks if condition is true, then it runs the code and doesn't
        //    go to else if block.
        // Else IF statement is used to specify a new condition if the first condition is false.
        // If condition is true ELSE IF block will be executed (code inside {} will run).
        // We can have as many else if statements as we want.  We can Not have
        // ELSE IF without IF statement

        int score = 76;
        if (score >= 90){
            System.out.println("Great");

        } else if (score < 90 && score >=80) {
            System.out.println("Very good");

        } else if (score<80 && score >= 70) {
            System.out.println("Good");

        } else if (score > 50 && score <70) {
            System.out.println("Not Bad");

        } else {
            System.out.println("Your score is not in the range");
        }


    }
}
