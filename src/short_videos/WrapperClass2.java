package short_videos;

public class WrapperClass2 {
    public static void main(String[] args) {

        int n = 10;
        Integer n2 = n;   //autoboxing
        int n3 = n2;      //unboxing

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        char ch = 's';
        Character ch2 = ch;
        System.out.println(Character.isDigit(ch)); // returns false
        System.out.println(Character.isLetter(ch)); // returns true

        String str = "j12ava12";
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if (Character.isDigit(c)){   // this will print only numbers, 1212
                System.out.print(c);

            }
        }
        System.out.println();

        for (int i=0; i<str.length(); i++){
            char c1 = str.charAt(i);

            if (Character.isLetter(c1)){  // this will print ony letters
                System.out.print(c1);
            }
        }



    }
}
