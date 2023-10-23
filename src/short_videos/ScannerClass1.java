package short_videos;

import java.util.Scanner;

public class ScannerClass1 {
    public static void main(String[] args) {


//        Method Name	            Description
//        nextByte()	Returns input as a byte value from the user
//        nextShort()	Returns input as a short value from the user
//        nextInt() 	Returns input as an int value from the user
//        nextLong()	Returns input as a long value from the user
//        nextBoolean()	Returns input as a boolean value from the user
//        nextFloat()	Returns input as a float value from the user
//        nextDouble()	Returns input as a double value from the user
//        next()	    Returns input (single word) as a String/ Reads value from the user
//        nextLine()    Returns input as a String

//	next() vs nextLine()
//	next() can read the input only till space. It can't read two words
//	separated by a space.
//	Also, next() places the cursor in the same line after reading the input.
//	nextLine() reads input including space between the words (it reads till
//	the end  of line\n).
//	Once the input is read, nextLine() positions the cursor in the next line

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a score");

//        byte myByte = input.nextByte();

//        String word = input.next();

//        System.out.println(word);

//        int myNum = input.nextInt();
//        System.out.println(myNum);

        int score = input.nextInt();
        if(score >90){
            System.out.println("Great");
        }
        else if (score >= 70 && score <90){
            System.out.println("Very good");
        }
        else
            System.out.println("Your score is below 70 ");







    }
}
