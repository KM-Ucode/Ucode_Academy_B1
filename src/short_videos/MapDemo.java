package short_videos;

import java.util.*;
import java.util.ArrayList;

public class MapDemo {
    public static void main(String[] args) {
        /*
        Map is a Data structure based on key + value pairs
        Map interface does not extend Collection interface
        Map doesn't accept duplicate key, but it accepts duplicate values
        Map doesn't have index, we can use key to get value

        Map Methods:

	- put(key, value); ->  to add key and value into the map; key and value of datatype must match
	- get(key); -> to get value from the map. It takes key as an argument and gets/returns value for matching key from the map.
	                      If the key does not exist in the map, it returns null '0'.
	- size(); -> to return the size/number of key/ value pairs available in the map
	- remove(key); -> to remove the given key and its value from Map.
	                  If the key does not exist in the map, it returns null '0'.
	- containsKey(key); -> to check if Map contains given key, and returns boolean
	- containsValue(value); -> to check if Map contains given value, and returns boolean
 */
        HashMap<Character, Character> map = new HashMap<>();
        map.put('a', 'b');
        System.out.println(map);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1,"Java");
        map2.put(2, "Selenium");
        System.out.println(map2);
        System.out.println("Using get method");
        System.out.println(map.get('a'));
        System.out.println(map2.get(1));

        System.out.println("size()");
        System.out.println(map2.size());

        System.out.println("remove(key)");
        map2.remove(2);
        System.out.println(map2);

        System.out.println("containsKey(key)");
        System.out.println(map2.containsKey(1));

        System.out.println("containsValue(value)");
        System.out.println(map2.containsValue("Java"));


        Map<Integer, Integer> map3 = new HashMap<>();
        map3.put(1,1);
        map3.put(2,2);
        map3.put(3,3);

        System.out.println("keySet()");

        Set<Integer> set = map3.keySet();
        System.out.println("set");
        System.out.println(set);

         List<Integer> list = new ArrayList<>(map3.values());
         // List<Integer> list = new ArrayList<>();
        // list.addAll(map3.values());

        System.out.println("List");
        System.out.println(list);
    }
}
