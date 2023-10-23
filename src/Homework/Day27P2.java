package Homework;

public class Day27P2 {
    public static void main(String[] args) {

        //Task 2:
        //Write a program to get letter, digits/numbers and special character from String
        //and store them in different String variables.

        String str = "#19@KK&17FM&12MM&27DM!";

        String letters = "";
        String numbers = "";
        String spChar = "";

        for (int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch)){
                letters += ""+ ch;
            } else if (Character.isDigit(ch)) {
                numbers += ""+ ch;
            }
            else {
                spChar += ""+ ch;
            }
        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(spChar);

        System.out.println("======================================");

        //Task 3:
        //Write a program to get sum of numbers from string (Use Character class method)

        String str1 = "765832jhrgiejrh7468937hgkfj";
        int sum = 0;

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);

            if (Character.isDigit(ch)){
                sum += Integer.parseInt(ch+"");
            }
        }
        System.out.println(sum);

        System.out.println("===============================");

        //Task 4:
        //Write a program to count number of digits and letters in given String

        String str2 = "657fkj453bhf95nkf673jhbkl96j";
        int countDigits = 0;
        int countCharacters = 0;

        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);

            if(Character.isDigit(ch)){
                countDigits++;
            } else if (Character.isLetter(ch)) {
                countCharacters++;

            }
        }
        System.out.println(countDigits);
        System.out.println(countCharacters);

        System.out.println("==========================");


        //Task 5:
        //Write a program to count number of special character in a given string

        String str3 = "4$6&hllu7@jrgb*bjb!ks";
        int spCh = 0;

        for (int i=0; i<str3.length(); i++){
            char ch = str3.charAt(i);

            if(!Character.isDigit(ch)&&!Character.isLetter(ch)){
                spCh++;
            }
        }
        System.out.println(spCh);







    }
}
