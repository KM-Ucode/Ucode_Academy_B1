package day_51_list_and_set_continue;

import java.util.*;
import java.util.function.Predicate;

public class SetAndListPractice {
    public static void main(String[] args) {

        // Task1:
        // remove all even numbers from set using iterator

        Set<Integer> set = new HashSet<>(Arrays.asList(3,2,1,3,7,5,4,4,8,9));
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            Integer x = iterator.next();

            if(x % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(set);

        System.out.println("=====================================");

        // Task2
        // Remove all even numbers using removeIf(), using lambda expression with x->x

        Set<Integer> set2 = new TreeSet<>(Arrays.asList(4,6,7,8,9,2,3,4,5,6,7,9,5,1,2,4));
        // Creating predicate         lambda expression
        Predicate<Integer> predicate = x -> x %2 == 0;
        set2.removeIf(predicate);
        System.out.println(set2);

        System.out.println("==================================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,6,7));

        set.remove(1);
        System.out.println(set);

        list.remove(1);
        System.out.println(list);

        Integer x = 7;
        list.remove(x);

        System.out.println(list);

        list.add(1,77);
        System.out.println(list);


    }
}
