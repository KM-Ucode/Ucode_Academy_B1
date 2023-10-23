package day_52_map_and_enum_intro;

import java.util.*;

public class HashTreeLinkedMaps {
    public static void main(String[] args) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(2,2);
        hashMap.put(1,1);
        hashMap.put(3,3);
        hashMap.put(null, 5);
        hashMap.put(4, null);

        System.out.println(hashMap);

        System.out.println("=======================");

        Map<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(3,3);
        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(4, null);
        //treeMap.put(null, 6); // It will throw NullPointer Exception in the run time

        System.out.println(treeMap);

        System.out.println("================================");

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(4,4);
        linkedHashMap.put(1,1);
        linkedHashMap.put(3,3);
        linkedHashMap.put(2,2);
        linkedHashMap.put(null, 5);
        linkedHashMap.put(6,null);

        System.out.println(linkedHashMap);

        System.out.println("=================================");

        Map<Integer, Integer> hashTable = new Hashtable<>();
        hashTable.put(2,2);
        hashTable.put(1,1);
        hashTable.put(3,3);
        //hashTable.put(null,8); // does not allow null key and throws NullPointer Exception in the run time
        //hashTable.put(8, null); // does not allow null key and throws NullPointer Exception in the run time

        System.out.println(hashTable);

        System.out.println("========================");

        Map<Integer,Integer> addAll = new HashMap<>();
        addAll.putAll(hashMap);

        // assigning map to another map directly
        Map<Integer, Integer> map = hashMap;


    }
}
