package short_videos;

public class StringClassMethodsPart1Part2 {
    public static void main(String[] args) {

        String str = "java";

//        charAt()- takes index/number, and returns the character at the specified
//        index(position) as char.
//
//        indexOf() takes a character, and returns the position of the first found occurrence
//        of specified characters in a string as int(number)

        System.out.println(str.indexOf('a'));  // returns the position of the first given character

//        lastIndexOf() - returns the position of the last found occurrence of specified
//        characters in a string as int

        System.out.println(str.lastIndexOf('a')); // returns the last position of the given character
//
//        length() - returns the length of string as int

//        int num = str.length();    // we can assign and do it this way
//        System.out.println(num);

        System.out.println(str.length());  // or directly print it
//
//        concat() - Appends a string to the end of another string

//        str = str.concat(" and selenium"); // concat - adding a string to another str
//        str += " and selenium";               // same thing using shorthand operator
//        System.out.println(str);

        System.out.println(str.concat(" and slenium")); // directly printing

//        toLowerCase() - converts a string to lower case letters

            String str2 = "JAVA";
            str2 = str2.toLowerCase();
            System.out.println(str2);
//          System.out.println(str2.toLowerCase());
//
//        toUpperCase() - converts a string to upper case letters

            str2 = str2.toUpperCase();
            System.out.println(str2);
//
//        trim() - removes white space from both ends of a string

          System.out.println(str2.trim());
//
//        substring() - returns a new string which is the substring of a specified string

        String s1 = str2.substring(0,2);
        System.out.println(s1);
//
//        replace() - searches a string for a specified value, and returns a new string where the
//        specified values are replaced. //It finds all the matching characters and replaces them all

//        String s2 = str2.replace("J", "P");
//        System.out.println(s2);
        System.out.println(str2.replace("J", "P"));
////
//        replaceFirst() - replaces the first occurrence of a substring that matches the
//        given regular expression with the given replacement. // replaces only the first character

        System.out.println(str2.replaceFirst("A", "O"));

//        replaceAll() - replaces each substring of this string that matches the given regular expression
//        with the given replacement

        System.out.println(str2.replaceAll("A", "O"));

//        isEmpty() - checks whether a string is empty or not
        String s2 = "";
        System.out.println(s2.isEmpty());

//        equals() - compares two strings. Returns true if the strings are equal, and false if not

        String s3 = "Java";
        String s4 = "java";
        System.out.println(s3.equals(s4));

        System.out.println(s3 == s4); //  printing using equal equal operator

//        equalIgnoreCase() - compares two strings, ignoring considerations

        System.out.println(s3.equalsIgnoreCase(s4));

//        contains() - checks whether a string contains a sequence of characters

        System.out.println(s4.contains("ava")); // you can give a single character or multiple characters

//        startsWith() -  checks whether a string starts with specified characters

        System.out.println(s4.startsWith("jav")); // you can give a single character or multiple characters

//        endsWith() - checks whether a string ends with the specified character(s)

        System.out.println(s4.endsWith("va")); // you can give a single character or multiple characters








    }
}
