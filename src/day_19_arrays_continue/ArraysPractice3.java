package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice3 {
    public static void main(String[] args) {

        int [] arr1 = {4,2,1,3};
        int [] arr2 = {1,2,3,4};

        boolean b = Arrays.equals(arr1,arr2);
        System.out.println(b);

        String [] str1 = {"java", "selenium", "api"};
        String [] str2 = {"api", "java", "selenium", "hello"};

        System.out.println(Arrays.equals(str1,str2));

         // Arrays.sort(str1, Comparator.comparing(String::length));
        // System.out.println(Arrays.toString(str1));


    }
}
