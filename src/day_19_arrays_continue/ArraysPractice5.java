package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice5 {
    public static void main(String[] args) {

        // Write a program to take all even number from int array and store into another array

         int [] nums = {345, 765, 987, 4,6,8,654, 10};

         // 1.We need to count how many even numbers in the array
        //  2. We need to declare an array length of (count of even numbers

        int evenCount = 0;
        for (int i =0; i< nums.length; i++ ){
            if (nums[i] % 2 == 0 ){
                evenCount ++;
            }
        }
        int [] evenNums = new int [evenCount];
        int index = 0;

        for(int i = 0; i <nums.length; i++){

            if (nums[i] % 2 ==0){
                evenNums[index]= nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(evenNums));
    }
}
