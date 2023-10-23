package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice4 {
    public static void main(String[] args) {

        // Write a program to combine 2 arrays

        char [] ch1 = {'a','b','c', 'd'};
        char [] ch2 = {'e', 'f', 'g', 'h'};

        char [] result = new char [ch1.length + ch2.length];
        //System.out.println(result.length);

        for (int i = 0; i < ch1.length; i++){  // We add all elements from ch1 into result
            result[i] = ch1 [i];
        }
       // System.out.println(Arrays.toString(result));

        for (int i = 0; i <ch2.length; i++ ){
            result [ch1.length+i]=ch2 [i];    // We add all elements from ch2 into result starting at index ch1.length+1
        }
        System.out.println(Arrays.toString(result));
    }
}
