package office_hours.day_01_java_review;

import java.util.Arrays;

public class MethodOverloading2 {
    public static void main(String[] args) {

        int [] nums ={4,1,5,6,2,3};
        nums = sort(nums, "desc");
        System.out.println(Arrays.toString(nums));
    }
    // Write a method overloading that takes 2 parameter, 1 char array, and 1 string/ or boolean(asc,desc)

    public static int [] sort(int[] arr, String str){

        //Arrays.sort(arr);  // instead we will call overloaded method that already have sort() method

        int [] re= new int [arr.length];
        int index = 0;

        if (str.equalsIgnoreCase("desc")) {
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                re[index] = arr[i];
                index++;
            }
            return re;
        }
        else {
            return  sort(arr);
        }

    }
    public static int [] sort (int [] arr){
        Arrays.sort(arr);

        return arr;
    }
}
