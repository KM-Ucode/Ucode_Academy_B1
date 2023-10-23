package short_videos;

public class WhileAndDoWhileLoopP3 {
    public static void main(String[] args) {
        // while loop
        int num = 1;
        while (num <= 20){
            if (num == 10){
                break;
            }
            System.out.println(num+" ");
            num++;
        }
        System.out.println();
        System.out.println("=============");

        //do while loop
        int i = 1;
        do{
            if(i == 10){
                break;
            }
            System.out.println(i+" ");
            i++;
        } while (i<=20);


        // break:
        // We use break in switch statement. It is used to jump out/break of a switch statement.
        // The break statement can also be used to jump out/break of a loop.

    }
}
