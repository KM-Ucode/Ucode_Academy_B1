package short_videos;

public class Exceptions {

    /*
    	Exception is an unwanted or unexpected event.
	Exception is a concept that breaks the normal flow of the program.

	In Java there are two type of exceptions:

	Checked exception -> This type of Exception is called Compile-Time Exception.
	                     We get Compile error/ we can Not run our code unless we handle it.

	                     Two ways to handle Checked Exceptions:

	                     1. Try and Catch Block
                      	 2. Add Exception to method signature using throws keyword followed by exception type

	Unchecked exception -> This type of exception called Run-time Exception.
                           Our code compile fine, but it occurs during the execution of a program.
	                      There is only One way to handle Unchecked exception using try and catch block.

     */

//    public static void main(String[] args) throws Exception { //There are many exceptions like,
                                             //arithmetic/interrupted and so on. This one is the parent
                                             // of all exceptions
//
//        System.out.println("Hello");
//        Thread.sleep(3000);
//        System.out.println("Hello again");
public static void main(String[] args) {
//    System.out.println("Hello");
//    try {
//        Thread.sleep(3000);
//    } catch(Exception e) {
//        System.out.println("If you see me, something happened in try block");
//    }
//    System.out.println("Hello Again");

    try{
        System.out.println(5/0);
        System.out.println("I'm try block");
    }
    catch (Exception e){
        System.out.println("If you see me something happened in try block ;)");

    }

    }
}
