package day_19_arrays_continue;

public class ArraysPractice6 {
    public static void main(String[] args) {

        // Write a program to find average number from int array

        int [] nums = {5, 8, 9, 10, 12, 24, 56, 7, 9,};

        int average = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        average += sum/ nums.length;

        System.out.println(average);

        System.out.println("=============");

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Max int:"+maxInt);
        System.out.println("Minint:"+minInt);
    }
}
