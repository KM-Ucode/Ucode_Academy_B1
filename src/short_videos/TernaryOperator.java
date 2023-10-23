package short_videos;

public class TernaryOperator {
    public static void main(String[] args) {

        //Ternary Operator, also called "Java Short Hand If..Else".
        //It can be used to replace multiple lines of code with a single line.
        //and it can be used to replace simple if else statements

        int score = 50;
        String result;
        if (score > 400){
            result = "Great";
        }else {
            result = "Good";
        }
        System.out.println(result);


        result = (score > 40)? "Great" : "Good"; //Ternary operator, works exactly the same
                                                 // way as above
        System.out.println(result);
    }
}
