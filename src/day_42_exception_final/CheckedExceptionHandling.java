package day_42_exception_final;

public class CheckedExceptionHandling {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        //System.out.println(a/b);

       // Thread.sleep(5000); // we put to sleep for 5 sec
        // It is used to stop/sleep/pause the code from execution for given time
        System.out.println("Hello");
        // Handling checked/compile time exception using try and catch block
        try{
            Thread.sleep(5000);
        } catch(InterruptedException abc){
            System.out.println("If you see me your code threw an Exception");
        }
        System.out.println("Hello again after 5 sec");

    }
}
