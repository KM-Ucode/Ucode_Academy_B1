package short_videos;

public class WhileAndDoWhileLoopP2Continue {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 20) {
            if (i % 2 != 0) {       // if we want to print even numbers.
                i++;              // if we want to print odd number instead of != ,  we use ==
                continue;
            }
            System.out.print(i + " ");
            i++;


            //continue:
            // continue statement breaks one iteration (in the loop)
            // if a specified condition occurs, and continues with the next iteration in the loop.
            // if the condition is true, it just skips it and continues to the next character


        }
    }
}


