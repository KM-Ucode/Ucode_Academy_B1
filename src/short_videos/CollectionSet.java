package short_videos;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionSet {
    public static void main(String[] args) {

        //List Vs Set
        // List and Set both child interface of Collection
        // List takes duplicates, Set does Not take Duplicate
        // List preserve the order of insertion, but Set may or may not preserve the order of insertion.
        // We can access element by index in List(has index)
        // We can Not access element by index in Set(has No index)

        List<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('a','c','b','a','a'));

        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println("=============================");

        Set<Character> set = new HashSet<>();

        set.addAll(Arrays.asList('c','a','b','a','a','a'));

        System.out.println(set);
        System.out.println(set.iterator().next());
        System.out.println(set.iterator().next());

        System.out.println("========================");

        Iterator<Character> iterator = set.iterator();

        // hasNext() - return true or false
        // next() - access/retrieve element
        // remove() - removes element

        while(iterator.hasNext()){
            //System.out.println(iterator.next());

            if (iterator.next() == 'b'){
                iterator.remove();
            }
        }
        set.forEach(x -> System.out.println(x));
        for(Character ch : set){
            System.out.println(ch);
        }
        System.out.println(set);

        System.out.println("===============================");

        Iterator<Character> i = list.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
