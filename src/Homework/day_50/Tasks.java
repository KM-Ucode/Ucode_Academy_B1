package Homework.day_50;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {

         // Task 1:
        // Write a program to remove all duplicates, keeping only the unique values.

    String [] str = {"dog", "cat", "bird", "dog", "bird", "cat", " pets"};
    Set<String> uValues = new LinkedHashSet<>(Arrays.asList(str));

        System.out.println(uValues);


         //Task 2:
        //Write a program to find and print/return the maximum element/number in a list/set  of Integer.

        List<Integer> maxNum = new ArrayList<>(Arrays.asList(6,9,3,12,8,5));
        Iterator<Integer> iterator = maxNum.iterator();
        int max = maxNum.get(0);
        for(int num : maxNum){
            if (num > max){
                max= num;
            }
                    }
        System.out.println(max);


        //Task 3:
        // Write a program to print/return the sum of all elements in a list/set of integers.

        int sum = 0;
        for(int num : maxNum){
            sum+=num;
        }
        System.out.println(sum);

       //Task 4:
       //Write a program to sort List of String in alphabetical order, and then print/return the sorted list.

        List<String> string = new ArrayList<>(Arrays.asList("dog", "cat", "bird", "fish"));
        Collections.sort(string);
        System.out.println(string);

        //Task 5:
        // Write a program to reverse  elements in  list/set String.

        for(int i = 0; i<string.size(); i++){
            String str1 = string.get(i);
           str1 =  new StringBuilder(str1).reverse().toString();
            string.set(i, str1);
        }
        System.out.println(string);

        //Task 6:
        //Write a program to merge two list into one list and sort it.

        List<Integer> list1 = new ArrayList<>(Arrays.asList(7,4,5,9,3,6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(8,6,9,4,3,1));

        List <Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        Collections.sort(list3);

        System.out.println(list3);

        //Task 7:
     //Write a program to remove all elements from a list/set of Integer that are greater than 15.

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(78,45,12,11,14,13,18,89));

       // list4.removeIf(x -> x > 15); // Useful method

        Iterator<Integer> num2 = list4.iterator();

        while(num2.hasNext()){
            int num3 = num2.next();
            if(num3>15){
                num2.remove();
            }
        }
        System.out.println(list4);

    //Task 8:
    //Write a program to check if two lists/sets are equal (contain the same elements in the same order).


        boolean b = list1.equals(list2);
        System.out.println(b);

    //Task 9:
    //Write a program to remove all occurrences of a specific value from a list/set of Integer.

        System.out.println(list3);
        list3.removeIf(x -> x == 3);

        System.out.println(list3);

    //Task 10:
    //Write a program to find and print/return the average of the positive numbers from List/Set of Integer.

        Integer average = 0;
        for(int i : list3){
            average+=i;
        }
        average/= list3.size();

        System.out.println(average);
    }
}
