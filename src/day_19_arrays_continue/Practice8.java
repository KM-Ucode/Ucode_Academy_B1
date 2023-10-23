package day_19_arrays_continue;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {

        // Write a program to replace all 'a' with 'b' on char array

        char [] chars = {'a', 'v', 's' , 'w' , 'r', 'u', 'b', 'a'};

        System.out.println("Before replacing 'a' with 'b'");
        System.out.println(Arrays.toString(chars));

        int i = 0;

        while (i < chars.length){

            if (chars[i] == 'a'){
                chars [i] = 'b';
            }
            i++;
        }
        System.out.println("After replacing 'a' with 'b'");
        System.out.println(Arrays.toString(chars));
    }
}
