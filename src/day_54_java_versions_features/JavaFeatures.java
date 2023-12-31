package day_54_java_versions_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaFeatures {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2,33,34,5,66,78));

                    // Lambda Expression
        list.removeIf(x -> x % 2 == 0);

        System.out.println(list);

        System.out.println("=========================");

        int[] arr = {3,4,9,9,9,55,6,7,8,9};

                     // Stream API
        arr = Arrays.stream(arr).distinct().sorted().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
interface TestInterface{
    void method();
    default void method2(){

    }
    static void method3(){

    }
    private void privateMethod(){ // private method was added in Java 9

    }

}
