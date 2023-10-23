package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysUtilClassSort {
    public static void main(String[] args) {

        int[] nums = {4,3,2,6,7,1,5};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);   // This  method just sorts the array in ascending order
        System.out.println("Print Array after sorting");
        System.out.println(Arrays.toString(nums));

        String str [] = {"java", "hello", "hi", "bye"};
        System.out.println("Print Array before sorting");
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);
        System.out.println("Print Array after sorting");
        System.out.println(Arrays.toString(str));

        char [] chars = {'d','c','a', 'e'};
        System.out.println("Print before after sorting");
        System.out.println(Arrays.toString(chars));

        Arrays.sort(chars);
        System.out.println("Print Array after sorting");
        System.out.println(Arrays.toString(chars));


    }

}
