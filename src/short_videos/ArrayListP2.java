package short_videos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListP2 {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();

        //numList.add(1);

        numList.addAll(Arrays.asList(1,2,3,4,5));

        for(int i=0; i<numList.size(); i++){
            System.out.println(numList.get(i));
        }
        System.out.println();

        System.out.println(numList);

        System.out.println(numList.get(1)); // gets the number from index 1
        System.out.println(numList.size());
        System.out.println();

        numList.set(2,50);   // index 2 (number is 3), we are replacing with the number 50
        System.out.println(numList);

        numList.remove(2); // removing number from index 2. This method removes one by one
        System.out.println(numList);

        numList.removeAll(Arrays.asList(1,2)); // it removes element 1 and 2/ not index
        System.out.println(numList);

        numList.clear();
        System.out.println(numList);

        numList.add(1);
        System.out.println(numList.isEmpty());

        // add()
        // addAll()
        // get()
        // size()
        // set()
        // remove()
        // removeAll()
        // clear()
        // equals()
        // is Empty()
    }
}
