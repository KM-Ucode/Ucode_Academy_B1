package day_12_string_class;

import java.util.Scanner;

public class StringMethodWithScanner {
    public static void main(String[] args) {

        // Task:
        // Write a program to ask user to enter a String (eny length)
        // if the length is even print the first char if not print the last char

        Scanner scan =  new Scanner(System.in);

        System.out.println("Please enter a String/sentence");

        String word = scan.nextLine();

        int lengthOfWord = word.length();

        if (lengthOfWord % 2 == 0){
            System.out.println(word.charAt(0));
        }
        else {
            System.out.println(lengthOfWord-1);
            System.out.println(lengthOfWord);
        }
    }
}
