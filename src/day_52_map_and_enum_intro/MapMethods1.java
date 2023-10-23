package day_52_map_and_enum_intro;

import java.util.HashMap;

public class MapMethods1 {
    public static void main(String[] args) {

        HashMap<Integer, Character> map = new HashMap<>();

        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'w'); // keys cannot be duplicates, they should be unique. When wew write duplicates
                         // it'll print the last one.

        map.put(3,'c');
        System.out.println(map);
        map.put(3, 'y');

        map.put(4, 'a'); // values can be duplicate
        map.put(5, 'a');

       // map.remove(1);

        // remove(); it returns the value and removes it
        char ch = map.remove(1);
        System.out.println(ch);

        System.out.println(map);

        System.out.println(map.remove(10));// it'll return null when you give a key that is not existed

        System.out.println("====================");

        boolean b =  map.containsKey(2);
        System.out.println(b);

        System.out.println("======================");

        boolean b2 = map.containsValue('b');
        System.out.println(b2);

    }
}
