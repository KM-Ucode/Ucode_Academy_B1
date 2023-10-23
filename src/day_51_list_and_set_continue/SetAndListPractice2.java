package day_51_list_and_set_continue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndListPractice2 {
    public static void main(String[] args) {

        //Task 3
        //remove all even number from set using for each loop
        // Using for each loop, we cannot remove element from Set
        // We need to use removeIf or Predicate

        Set<Integer> set = new HashSet<>(Arrays.asList(4,3,6,8,9,24,66,88,89));

        set.removeIf(x -> x % 2 == 0);
        System.out.println(set);

        System.out.println("===========================");

        // Task4
        // Sort in Ascending order

        // One way
        String str = "bdcea"; //abcde
        char [] ch = str.toCharArray();
        Arrays.sort(ch);
        str = new String(ch);
        System.out.println(str);

        System.out.println("=====================");

        // second way with Set(TreeSet)

        String str2 = "edbac"; //abcde

        Set<String> set2 = new TreeSet<>();

        set2.addAll(Arrays.asList(str2.split("")));
        String result = "";

        for (String s : set2){
            result += s;
        }
        System.out.println(result);

        System.out.println(set.size());


    }
}
