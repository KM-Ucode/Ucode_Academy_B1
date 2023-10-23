package day_43_exceptions_continue;

public class CustomException2 {
    public static void main(String[] args) throws InterruptedException {

        //Thread.sleep(4000);

        // This is checked / Compile time exception, we still have to handle it even though we are
        // throwing it explicitly/manually. This exception is the same as using Thread.sleep();
        throw new InterruptedException("Interrupted Exception");
    }
}