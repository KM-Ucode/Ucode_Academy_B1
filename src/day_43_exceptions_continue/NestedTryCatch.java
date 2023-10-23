package day_43_exceptions_continue;

public class NestedTryCatch {
    public static void main(String[] args) {

        //Nested having another try & catch block inside of catch block

        try {
            System.out.println(6 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch Block");

            try {
                System.out.println(7 / 0);
            } catch (ArithmeticException eab) {
                System.out.println("Inner Catch Block");

                try {
                    Thread.sleep(1000);
                    System.out.println("Inner Inner Try Block");
                } catch (InterruptedException abc) {
                    System.out.println("Inner Inner Catch Block");
                }
            }
        }
        System.out.println("==================================================");

        try{
            System.out.println("Hello");
            try{
                System.out.println("Hello Again");
            }
            catch(Exception ab){
                System.out.println("Hi");
            }
        }
        catch (ArithmeticException abc){
            System.out.println();
        }
    }
}