package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        // Write a program to remove all numbers between 5 and 15 from ArrayList
        // Use Predicate

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,4,6,1,7,8,9,4,5,6,7,8,12,14,15,87));

        Predicate<Integer>predicate = x -> x >= 5 && x <= 15;

        list.remove(predicate);

        System.out.println(list);

        System.out.println("====================");

        // Write a program to remove any number that is greater than 40, or it is odd number

        Predicate<Integer> predicate2 = x -> x >40 || x % 2 != 0;
        list.remove(predicate2);
        System.out.println(list);



    }
}
