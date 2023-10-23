package day_43_exceptions_continue;

public class Exceptions1 {
    public static void main(String[] args) throws InterruptedException {
        // Handling checked exception
       // Thread.sleep(3000);
        try{
            Thread.sleep(5000);
        }catch(Exception abc){
            System.out.println("some message");

        }
        // Handling unchecked/Run-Time exception
        try {
            System.out.println(50 / 2);
        } catch(Exception abc){
           // System.out.println(abc.getMessage());
            System.out.println("cannot divide by zero");
        }
        //Using multiple catch blocks

        try {
            System.out.println(11/0);
        }
        catch (IndexOutOfBoundsException ab){
            System.out.println("Catch 1");
        }
        catch (ClassCastException bb){
            System.out.println("Catch 2");
        }
        catch (ArithmeticException aa){
            System.out.println("Catch 3");
        }
        catch (Exception abb){
            System.out.println("Hello");
        }

    }
}
