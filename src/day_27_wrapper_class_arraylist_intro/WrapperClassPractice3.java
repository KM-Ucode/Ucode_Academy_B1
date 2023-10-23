package day_27_wrapper_class_arraylist_intro;

public class WrapperClassPractice3 {
    public static void main(String[] args) {

        // Character.isDigit()    // this is a static method, we need to call it through the class
        // Character.isLetter()   //        -//-
        // Write  a program that takes a string and assigns character and number to two separate variable

        String  str = "lkefhoihyr837@4692kjg746";
        String numbers =  "";
        String  letters = "";
        for(int i = 0; i< str.length(); i++){

            char ch = str.charAt(i);

            boolean isDigit = Character.isDigit(ch);
            boolean isLetter = Character.isLetter(ch);
            //if (Character.isDigit(str.charAt(i))){ when we do it directly

            if (isDigit){
                numbers += ""+ ch;
            }
            if (isLetter){
                letters += "" +ch;
            }
        }
        System.out.println(numbers);
        System.out.println(letters);

        // Character.toUpperCase();
        //Character.toLowerCase();

        char chd = Character.toUpperCase('a');
        System.out.println(chd);


        // Write a program to convert lower case char to upper case to lower case and assign
        // them to separate variables

        String str2 = " ABCDEFGHIJklmnopqrstuvwxyz";
        String lowStr ="";
        String upperStr = "";

        for(int i =0; i<str2.length(); i++){
            if(str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z'){
                upperStr += ""+ Character.toUpperCase(str2.charAt(i));
            }
            if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'){
                lowStr += ""+ Character.toLowerCase(str2.charAt(i));

            }
        }
        System.out.println(upperStr);
        System.out.println(lowStr);





    }
}
