package day_18_nested_loop_arrays_intro;

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {

        //Create an array and store 5 student name

        String[] students = {"Mike","James","Smith","David", "Ross"};

        System.out.println(students[4]);

        System.out.println("========");

        System.out.println(Arrays.toString(students));

        System.out.println("============");

        students[1] = "Paul"; // Assigning a new value/element

        System.out.println(Arrays.toString(students));
    }
}