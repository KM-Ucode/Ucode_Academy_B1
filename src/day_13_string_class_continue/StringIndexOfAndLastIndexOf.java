package day_13_string_class_continue;

public class StringIndexOfAndLastIndexOf {
    public static void main(String[] args) {

        String str = "selenium";

        int num = str.indexOf('i');

        System.out.println(str.indexOf("i"));

        // System.out.println(str.indexOf("w")); Example
        // When you give any char that is not given in the String you get -1(meaning false);


        System.out.println(num);

        System.out.println("=====================");

        int num2 = str.indexOf('e'); // indexOf(), returns index of the first matching char if there is more than one matching char
        System.out.println(num2);

        int num3 = str.lastIndexOf('e');
        System.out.println(num3);


    }
}
