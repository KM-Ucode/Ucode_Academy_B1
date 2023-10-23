package day_54_java_versions_features;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(7, "API");

        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1, "Java");
        map2.put(7, "API");

        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(1, "Java");
        map3.put(7, "API");

        // equals() method
        System.out.println(map.equals(map2));
        System.out.println(map2.equals(map3));

        map3.replace(7, "TestNG");
        System.out.println(map3);

        System.out.println("=============================");

        map3.replace(7, "Testng", "Selenium");// since we gave wrong old value it won't replace it

        System.out.println(map3);

        System.out.println("=============================");

        Map<Integer, String> test = new HashMap<>();
        test.put(2, "JAVA");
        test.put(5, "SQL");
        test.put(9, null);

        test.putIfAbsent(5, "Jenkins");

        System.out.println(test);

        test.putIfAbsent(9, "HTML");
        System.out.println(test);

        test.putIfAbsent(19, "Cucumber");
        System.out.println(test);

        System.out.println("=============================");

        System.out.println(test.isEmpty());
        test.clear();
        System.out.println(test.isEmpty());
        System.out.println(test);
    }
}
