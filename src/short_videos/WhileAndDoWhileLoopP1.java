package short_videos;

public class WhileAndDoWhileLoopP1 {
    public static void main(String[] args) {

        int i = 1;     //i=100;                 //while loop, first it checks the condition, if the condition is true
                                        // and then the statement inside the loop body gets executed.
        while (i <=10){
            System.out.println("Hello World");
            i++;
        }
        System.out.println("=========");

        //do while loop, gets executed at least once when we initially start our code even
        // if the condition is not true;
        int j =1; //j=100;
        do{
            System.out.println("Hello World");
            j++;
        } while(j<=10);
    }
}
