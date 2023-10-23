package day_08_if_statements_ternary_operators;

public class IfAndTernaryPractice {

    public static void main(String[] args) {

        // Task 1:
        // Write a program to check if char is lower or upper case

        char ch1 = 'T';
        String result;

        // first way using char numbers from ASCII table
        if (ch1 >= 97 && ch1 <= 122){
            result = ch1 + "It is lower case letter";
        }
        else{
            result = ch1 + "It is upper case letter";
        }
        System.out.println(result);

        System.out.println("================");

        // Second way using chars (a-z or A-Z)

        if (ch1 >= 'A' && ch1 <='Z'){
            System.out.println(ch1 + "is Upper case letter");
        } else {
            System.out.println(ch1 + "is Lower case letter");
        }
        System.out.println("================");


        // Write a program to check if char is lower or upper case using Ternary Operator

        String str2;
        char ch2 = 'o';

        // first way using ASCII table number for chars

        str2 = (ch2 >= 97 && ch2 <= 122) ? "It is lower case letter" : "It is upper case letter";

        System.out.println(str2);

        System.out.println("============");

        //second way using chars(a-z)

        String str3;

        System.out.println("==========");

        str3 = (ch2 >= 'a' && ch2 <= 'z') ? "It is lower case letter" : "It is upper case letter";

        System.out.println(str3);

        // Task2:
        // Write a program to check if character is digit / number
        // Assume the value of char variable is either char or number

        char ch4 = ')';

        // using Decimals from ASCII Table for number 0-9

        if ( ch4 >= 48 && ch4 <= 57){
            System.out.println("It is number");
        }else{
            System.out.println("It is letter");
        }
        System.out.println("==========");

        String s;

        s = (ch4 >= 48 && ch4 <= 57) ? "It is a Number" : "It is a letter";
        System.out.println(s);

        System.out.println("==========");

        // Write a program to check if the char is letter , number or special character
        // )(*^$#!%<>?":|

        String word;

        char c = '7';

        word = (c >= 'a' && c <= 'z') ? c+ "It is character" : ( c >= 48 && c <= 57)? c+
                " It is a number": c+ "It is special character";
        System.out.println(word);







    }
}
