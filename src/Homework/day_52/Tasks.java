package Homework.day_52;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {
     //Task 1:
     //Create a Map<Integer,String> called "employees" and put 5 employees with key as ID and value as name.

        Map<Integer, String> employees = new LinkedHashMap<>();

        employees.put(2424, "Mike");
        employees.put(3264, "Jessica");
        employees.put(4565, "Sarah");
        employees.put(7685, "Chris");
        employees.put(6754, "Lilly");

        System.out.println(employees);

        System.out.println("=========================");

     //Task 2:
     // Create a Map<String, String> called "cities" and add 5 city names as keys and their corresponding countries as values.

        Map<String, String> cities = new HashMap<>();

        cities.put("Washington DC", "USA");
        cities.put("Dushanbe", "Tajikistan");
        cities.put("Paris", "France");
        cities.put("Brasilia", "Brazil");
        cities.put("Amsterdam", "Netherlands");

        System.out.println(cities);

        System.out.println("====================================");

     //Task 3:
     // Create a Map<String, Double> called "products" and add 5 product names as keys and their prices as values.

        Map<String, Double> products = new HashMap<>();
        products.put("David's Bread", 11.99);
        products.put("Organic Milk", 12.99);
        products.put("Organic Apples", 5.99);
        products.put("Organic Sugar", 10.99);
        products.put("Popcorn", 12.99);

        System.out.println(products);

        System.out.println("=================================");


     //Task 4:
     // Create a Map<Integer, String> called "students" and add 5 student IDs as keys and their names as values.

        Map<Integer , String> students = new LinkedHashMap<>();

        students.put(8976, "John");
        students.put(7856, "Lisa");
        students.put(7866, "Edd");
        students.put(7986, "Max");
        students.put(8576, "Anna");

        System.out.println(students);

        System.out.println("=============================");
     //Task 5:
     // Create a Map<String, String> called "cars" and add 5 car Make as keys and their Model as values.

        Map<String, String> cars = new TreeMap<>();

        cars.put("Jeep", "Wrangler");
        cars.put("Toyota", "Sienna");
        cars.put("Porsche","911 Turbo S");
        cars.put("Audi", "A3 40");
        cars.put("BMW", "X5");

        System.out.println(cars);

        System.out.println("===============================");
     //Task 6:
     // Create a Map<String, String> called "capitals" and add 5 countries as keys and their capital cities as values.

        Map<String, String> capitals = new HashMap<>();
        capitals.put("Russia", "Moscow");
        capitals.put("Thailand", "Bangkok");
        capitals.put("Morocco", "Rabat");
        capitals.put("Iran", "Tehran");
        capitals.put("Turkey", "Ankara");

        System.out.println(capitals);

        System.out.println("=========================");
     //Task 7:
     // Create a Map<String, Integer> called "movies" and add 5 movie titles as keys and their release years as values.
     Map<String, Integer> movies = new LinkedHashMap<>();

     movies.put("Hachi", 2009);
     movies.put("Autumn in New York", 2000);
     movies.put("F9 The Fast Saga", 2021);
     movies.put("Pete's Dragon", 2016);
     movies.put("Jurassic World Dominion", 2022);

        System.out.println(movies);

        System.out.println("============================");
      //Task 8:
      // Create a Map<String, Long> called "populations" and add 5 countries as keys and their populations as values.

        Map<String, Long> populations = new Hashtable<>();

        populations.put("Vatican City", 11-312L);
        populations.put("Nauru", 12-688L);
        populations.put("Monaco", 36-686L);
        populations.put("Barbados", 281-200L);
        populations.put("Maldives", 521-457L);

        System.out.println(populations);



    }
}
