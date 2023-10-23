package day_51_list_and_set_continue;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice3 {
    public static void main(String[] args) {

        // Task 4
        // remove duplicates from String

        // one way
        String str = "aabbccddee"; // -> abcde

        String result = "";

        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        for(String s : set){
            result += s;
        }
        System.out.println(result);

        System.out.println("==============================");

         // another way with set
        String str2 = "aabbccddee"; // -> abcde

        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(str2.split("")));

       // str2 = set2.toString().replace(", ","").replace("[", "").replace("]","");
        str2 = set.toString().replaceAll("[\\[\\], ]","");

       // str2 = set2.toString();
        System.out.println(str2);
    }
}
