package short_videos;

public class NestedLoop {
    public static void main(String[] args) {

//        Nested loop is a loop inside another loop
//        The outer loop controls the number of iterations,
//        while the inner loop executes its statements repeatedly for each iteration of  the outer loop.

        for (int i=1; i<=5; i++){ // when we start i ==1; i<=5 is true
           for(int j=1; j<=5; j++){
               System.out.println(j);
           }
            System.out.println("================");
        }



    }
}
