package short_videos;

public class NestedTernaryOperator {
    public static void main(String[] args) {

        //Ternary Operator, also called "Java Short Hand If..Else".
        //It can be used to replace multiple lines of code with a single line.
        //and it can be used to replace simple if else statements

        int score = 76;
        String result;

        if (score > 90) {
            result = "Great";
        } else if (score > 70 && score < 90) {
            result = " Very good";
        } else if (score > 60 && score < 70) {
            result = "Good";
        } else {
            result = "Not bad";
        }
        System.out.println(result);

        // Else block works if non of the condition is true, Example if we write int score = 16, it'll
        // print "Not Bad". It executes until the condition is true.

        // Now we try the same thing with ternary operator

        result = (score >90)? "Great": (score >70 && score <90)? "Very Good" :(score >60 && score <70)? "Good" : "Not bad";
        System.out.println(result);


        }
}
