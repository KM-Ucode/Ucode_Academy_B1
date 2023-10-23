package day_19_arrays_continue;

public class ArraysPractice2 {
    public static void main(String[] args) {

        // Write a program to print all number greater than 6 from int array

        int[] nums = {3,5,6,9,7,8,88,78,67,89};

        for(int i = 0; i < nums.length; i++){
            if (nums[i]>6){
                System.out.println(nums[i]);
            }
        }
        System.out.println("===========");
        // Write a program to find min and max number from int array;


        int min = nums[0];  // we just need any number from int array
        int max = nums[0];  // we just need any number from int array

        for (int i = 0; i < nums.length; i++){
            if (min > nums[i]){
                min = nums[i];
            }
            if (max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min"+min);

    }
}
