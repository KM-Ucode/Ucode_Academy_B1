package day_23_custom_method_continue;

public class MethodsWithReturnType {
    public static void main(String[] args) {

       sum(10, 20);
      int sum =  sum2(10,20);
        System.out.println(sum);
        System.out.println(sum2(29,30));
    }
    // Void method does not return any value, so we can store and reuse it
    public static void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }
    // This method with return type(int) returns int value
    // we can store in an int variable
    public static int sum2(int num1, int num2){
        int a = num1 + num2;
        return num1 + num2;

    }
}


