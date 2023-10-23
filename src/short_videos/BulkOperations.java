package short_videos;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();

        //numList.add(1);  // when we are adding one by one

        numList.addAll(Arrays.asList(1,2,3,4,5)); // addAll

        // numList.remove(0);                   // removes one element at the given index

//        numList.removeAll(Arrays.asList(1,2,3)); // removeAll
//
//        numList.contains(3);
//
//        numList.containsAll(Arrays.asList(1,2,3));

        //1st way for loop

        for (int i = 0; i < numList.size(); i++){  // in this method we can add by 1/2 or 3 or give condition
            System.out.println(numList.get(i));
        }
        System.out.println("================");

        // 2nd way

        for (Integer i:numList){  //we can either give Integer or int // we can't give condition/increment/decrement inthis method
            System.out.println(i);

        }
        System.out.println("==================");

        // 3rd way forEach method

        numList.forEach(i-> System.out.println(i)); //we can't give condition



        //	Bulk operations  in Java refer to a set of operations that can be performed
        //	on a collection as whole, rather than operating on a individual elements one by one.

        //	Some commonly used bulk operations in Java include:
        //	addAll()
        //	removeAll()
        //	containsAll()
        //	retainAll()


        // foreach

    }
}
