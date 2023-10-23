package day_42_exception_final;

public class Practice1 {
    public static void wait(int seconds) throws InterruptedException{
        Thread.sleep((long)seconds*1000);

    }
    public static void wait2(int seconds){
        try{
            Thread.sleep((long)seconds*1000);
        }catch (Exception e){

        }
    }
    public static void main(String[] args) throws InterruptedException {

        Practice1.wait(5); // We have to handle the exception every time we call this method
                                  // because throws keyword is used in method signature to handle
                                 // checked/compile-time exception
       Practice1.wait2(5);// We don't need to handle it because try and catch block is used
        try{
            System.out.println("Hello");
        }
        finally {
            System.out.println("");
        }
    }
}
