package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Day27 {
    public static void main(String[] args) {

        //Task 1:
        //Create an empty ArrayList of type String and
        //Add three different names ("Mike", "Jame", "Tom") to the ArrayList.
        //Print the size of the ArrayList.
        //Check if the ArrayList is empty and print the result.
        //Access and print the second element of the ArrayList.
        //Add another name ("Sara") to the ArrayList at index 1.
        //Remove the element at index 3 from the ArrayList.
        //Check if you can remove "Bob" and print the result.

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(Arrays.asList("Mike","Jame", "Tom"));
        System.out.println(strList.size());

        boolean b1 = strList.isEmpty();
        System.out.println(b1);

        System.out.println(strList.get(1));
        strList.add(1, "Sara");
        System.out.println(strList);

        strList.remove(3);
        System.out.println(strList);

        boolean b2 = strList.remove("Bob");
        System.out.println(b2);




        //Task 2:
        //Write a program to get letter, digits/numbers and special character from String
        //and store them in different String variables.

        String str1 = "kjgfh740398jlkdjg@%!";
        String letters = "";
        String numbers = "";
        String spChar = "";

        for (int i = 0; i< str1.length(); i++){
            char ch = str1.charAt(i);

            if (Character.isLetter(ch)){
                letters += ""+ ch;
            }
            else if (Character.isDigit(ch)) {
                numbers += ""+ ch;

            }
            else {
                spChar += ""+ ch;
            }


        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(spChar);


        //Task 3:
        //Write a program to get sum of numbers from string (Use Character class method)

        String str2 = "lskdhfkjsg869870490";

        int sum = 0;

        for(int i = 0; i<str2.length(); i++){
            char ch1 = str1.charAt(i);
            if (Character.isDigit(ch1)){
              sum += Integer.parseInt(ch1+"");
            }
        }
        System.out.println(sum);


        //Task 4:
        //Write a program to count number of digits and letters in given String

        int countDigits = 0;
        int countCharacters = 0;

        for (int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(Character.isDigit(ch)){
                countDigits ++;

            }
            else if (Character.isLetter(ch)){
                countCharacters++;

            }

        }
        System.out.println(countCharacters);
        System.out.println(countDigits);
        //Task 5:
        //Write a program to count number of special character in a given string

        String str3 = "@#689709$kurgho5*";

        int specialCh = 0;
         for(int i = 0; i<str3.length(); i++){
             char ch = str3.charAt(i);
             if(!Character.isDigit(ch) && !Character.isLetter(ch)){
                 specialCh++;
             }
         }
        System.out.println(specialCh);
    }
}
