package short_videos;

public class StringConcatenation {
    public static void main(String[] args) {

        // String is used store a sequence of characters
        // We can store characters, numbers, special character in String using double quotes ""
        // Concatenation - we can add strings by using + Operator
        // + String concatenation operator

        String name = "John";
        String sentence = "123452 dkhlsd*%)";
        System.out.println(name+ " Mike");
        //System.out.println(sentence);
        System.out.println(name);
        name = name + " Jack";  // assign and add; string concatenation
        System.out.println(name);
        System.out.println("Hello "+name); //longer way
        name += " Jhon "; // shorthand operator
        System.out.println(name);

        System.out.println("Hello "+ 123);

        name += 123;
        System.out.println(name);

        int num = 123;
        String name2 = "Mike";
        //System.out.println(num+" "+name2); //or; // " " we use to give a space
        //System.out.println(name2+" "+num);

        name2 += num;
        //num += name2 // we can store number in a string but can't store string in a number(int),
        // cause integer takes only numbers vs string that takes numbers, characters or anything;
        System.out.println(name2);

        System.out.println(num +name2);   // it doesn't complain, because print statement just prints
                                         // it doesn't concat


    }
}
