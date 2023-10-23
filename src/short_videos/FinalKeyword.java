package short_videos;

public class FinalKeyword {
    /*
    	Final keyword is used for classes, methods, and variables which makes them non-changeable

	When a variable is declared as final, its value cannot be changed once it has been initialized
	variable that has final keyword is called constant variable

	When a method is declared as final, it cannot be overridden by a subclass

	When a class declared as final, it cannot be extended by a subclass

     */

    public final void iAmFinal(){
        System.out.println("Hello");
    }
    final String DATE_OF_BIRTH = "DECEMBER 1, 1990";
//    public static void main(String[] args) {
//
//        final String DATE_OF_BIRTH = "December 1, 1990";
//        String dateOfBirth = "August 5th, 1989";
//        dateOfBirth = "May 6, 1991";
        //DATE_OF_BIRTH = "January 2, 1991";// it gives compile error because we cannot change final

        // final int NUM = 10;
       // NUM = 20;
    }

