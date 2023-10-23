package short_videos;

import java.util.Scanner;

public class ScannerClass2 {
    public static void main(String[] args) {


        //	next() vs nextLine()

//	next() can read the input only till space. It can't read two words
//	separated by a space.
//	Also, next() places the cursor in the same line after reading the input.

//	nextLine() reads input including space between the words (it reads till
//	the end  of line\n).
//	Once the input is read, nextLine() positions the cursor in the next line
//  If you use next() followed by nextLine() the behavior can be affected.
//  Solution: After the last next() we write input.nextLine(); - empty nextLine();
//   Example:

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your first name");
//
//        String firstName = input.next();
//
//        System.out.println("Enter your last name");
//
//        String lastName = input.next();
//        input.nextLine();
//
//        System.out.println("Enter your date of birth");
//
//        String birthDate = input.nextLine();
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(birthDate);

//      Or use this method instead: (preferred method to use)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = input.nextLine();

        System.out.println("Enter your last name");

        String lastName = input.nextLine();

        System.out.println("Enter your date of birth");

        String birthDate = input.nextLine();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(birthDate);

        // Always do at the end when you are done with your scanner :
        input.close();




    }
}
