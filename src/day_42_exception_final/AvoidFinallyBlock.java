package day_42_exception_final;

public class AvoidFinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println(34/0);
            System.exit(0); // This will stop our program completely

        }
        catch(Exception e){
            System.out.println("Hello I'm catch block");
            System.exit(0); // This will stop our program completely
        }
        finally {
            System.out.println("Hello from finally block");
        }
        System.out.println("======================================");
        System.out.println("Hello I'm outside of try and catch and finally block");
    }
}
