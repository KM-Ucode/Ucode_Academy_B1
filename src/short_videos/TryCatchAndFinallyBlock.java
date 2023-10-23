package short_videos;

public class TryCatchAndFinallyBlock {

    //	Try and catch and final block
    //	try block/statement is used to handle errors/exception while executing our code
    //	catch block/statement Only gets executed when an error /exception occurs in the try block
    //	we can use multiple catch blocks

    //	finally block always gets executed no matter what

    //	Thread.sleep() -> is used to stop the execution of our code for given time

    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
           try{                              //nested
               System.out.println(10/0);
           }
           catch(Exception a){
               System.out.println("I'm nested try catch");
           }
        }
        catch(Exception e){
            System.out.println("Hello");
        }
        finally {
            System.out.println("I always get executed no matter what");
        }
        // We also can use finally and just try block without catch block
    }

}
