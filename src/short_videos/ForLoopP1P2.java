package short_videos;

public class ForLoopP1P2 {
    public static void main(String[] args) {

        for (int i= 1; i <= 10; i++){
            System.out.println("Hello World");
        }
        //charAt
        String s = "javaAndSelenium";
        //for(int j=0;j<=3; j++) { or we can use string length method when the characters ar longer

//        for (int j=0; j<s.length(); j++){ // if you want to do less than or equal you need use(<=) -1
//            System.out.println(s.charAt(j));

        for (int j=s.length()-1; j>=0; j--){ // if you want to print in reverse
          //  System.out.println(s.charAt(j));
        }
        for (int i=0; i<s.length(); i++){             //using break
            if(s.charAt(i) == 'n'){
                break;
            }
            else{
                System.out.print(s.charAt(i));
            }

        }
        System.out.println();
        System.out.println("============");

        for(int i = 0; i<s.length();i++){       //continue
            if(s.charAt(i) == 'a'){
                continue;
            }
            else{
                System.out.print(s.charAt(i));
            }
        }

        // break:
        // We use break in switch statement. It is used to jump out/break of a switch statement.
        // The break statement can also be used to jump out/break of a loop.


        //continue:
        // continue statement breaks one iteration (in the loop)
        // if a specified condition occurs, and continues with the next iteration in the loop.
        // if the condition is true, it just skips it and continues to the next caharacter



    }
}
