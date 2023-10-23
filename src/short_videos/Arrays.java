package short_videos;

public class Arrays {
    public static void main(String[] args) {

        // Arrays are used to store multiple values in a single variable,
        // instead of declaring separate variables for each value.
        // You can access an array element by referring to the index number

        int  score = 10;
 //       int[] scores = new int[5]; // we can store 10 elements in it


        // 1st way
//        int a = scores[3];
//        System.out.println(scores[1]);
//        System.out.println(scores[3]);
//        System.out.println(a);

        // 2nd way

        int [] scores = {10, 15, 23, 55, 19}; // when you know the numbers that you are adding you can
//        System.out.println(scores[1]);          // directly use this way
 //         String [] str = new String [5];
//        str [0] = "java";
//        str [1] = " selenium";
//        str [2] = "JUnit";
//        str [3] = "python";
//        str [4] = "maven";
//
//        System.out.println(str[2]);
//        String s = str [0];
//        System.out.println(s);

        String str [] = {"java", "selenium","JUnit", "python","maven"};
//        System.out.println(str[4]);
//        String s = str [4];
//        System.out.println(s);

        for (int i = 0; i<str.length; i++){
            System.out.println(str[i]);
        }
        for (int i=0; i<scores.length; i++){
            System.out.println(scores[i]);
        }
    }
}
