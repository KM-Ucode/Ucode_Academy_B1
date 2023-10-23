package day_13_string_class_continue;

public class StringSubStringMethod {
    public static void main(String[] args) {

        String str = "hello I am doing some java";

       String str2 = str.substring(0,3);  //takes from index 0 until index 3 not including index 3

        System.out.println(str2);

        System.out.println("============");

        String str3 = str.substring(3);

        System.out.println(str3);

        System.out.println(str.substring(str.length()-1));

        System.out.println("================");

        char ch = str.charAt(0);

        System.out.println(ch);




    }
}
