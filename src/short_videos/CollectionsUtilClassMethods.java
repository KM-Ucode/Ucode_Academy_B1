package short_videos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class CollectionsUtilClassMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.addAll (Arrays.asList(3,8,5,1,6,2,4, 4, 4,7));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int min = Collections.min(list);
        System.out.println(min);

        int max = Collections.max(list);
        System.out.println(max);

        int count = Collections.frequency(list, 4);
        System.out.println(count);


        //	Collections.sort() --> To sort Collection/List;
        //	Collections.min() --> To return Min object from Collection/List
        //	Collections.max() --> To return Max number from Collection/List
        //	Collections.frequency() --> To return frequency of elements in Collection/List

        //	Lambda Expression
        //	Predicate: can be applied to any collection-Type/List
        //	number % 2  != 0
        //	Predicate <Integer>  oddNumber = p -> p %2 != 0;

        // 1st way
        Predicate<Integer>even = p -> p % 2 == 0;// this "==" removes even numbers
                                                 // != removes odd numbers
       // list.removeIf(even);
        list.removeIf(x->x % 2 != 0);      // 2nd way
        System.out.println(list);
        //	removeIf(predicate) removes everything that matches with the expression of predicate



    }
}
