package day_13_string_class_continue;

public class StringTrimMethod {
    public static void main(String[] args) {

        // trim() method is used to remove/delete white space/s
        // before and after(it doesn't matter how big/small the space is)
        //it doesn't remove spaces between our string

        String word = " HTML ";
        word = word.trim();
        System.out.println(word);
        //System.out.println(word.trim());


    }
}
