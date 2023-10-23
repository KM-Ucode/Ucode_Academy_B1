package short_videos;

public class StringClassPart2 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        String s1 = new String("java");
        String s2 = new String ("java");

//        System.out.println(s1);
//        System.out.println(str1);

        //charAt() takes index/ number, and returns the character at the specified index(position)
        // as char

        char ch1 = str1.charAt(0);
        System.out.println(ch1);

       // System.out.println(str1.charAt(2));

        // indexOf() takes a character, and returns the position of the first found occurrence
        // of specified characters in a string as int

        //int num1 = str1.indexOf('a'); // it will return index of the first 'a' only
        int num1 = str1.indexOf('a');
        System.out.println(num1);



    }
}
