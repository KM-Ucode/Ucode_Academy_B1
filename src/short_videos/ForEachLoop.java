package short_videos;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers)); // if we want to print arrays directly

//        for (int i=0; i< numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
        for(int each : numbers){             //using for-each loop
            System.out.println(each);
        }
        System.out.println("=====================");

        String [] str = {"java", "python", "selenium"};

        System.out.println(Arrays.toString(str));

//        for (int i=0; i<str.length; i++){
//            System.out.println(str[i]);
//        }
        for(String each : str){
            System.out.println(each);
        }

    }
}
