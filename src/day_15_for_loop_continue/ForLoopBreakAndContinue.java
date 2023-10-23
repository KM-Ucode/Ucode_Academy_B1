package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopBreakAndContinue {
    public static void main(String[] args) {

        // Write a program to ask user to enter a string and print vowels only
        // if you find "Y" break from the loop


        String vowels = "aeiou";
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'y') {
                break;
            } else if (vowels.contains("" + str.charAt(i))) {

                System.out.println("Found vowel, printing it");
                System.out.println(str.charAt(i));
            }
        }


    }
}

