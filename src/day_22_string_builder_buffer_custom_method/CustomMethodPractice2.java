package day_22_string_builder_buffer_custom_method;

public class CustomMethodPractice2 {
    public static void main(String[] args) {

        sumOfTwoNumbers(178, 6987);
        sumOfTwoNumbers(867, 4877);
        sumOfTwoNumbers(111,9898);
        sumOfTwoNumbers(879, 567);

        System.out.println("==================");

        multiplyTwoNumbers(44,56);
        multiplyTwoNumbers(89,123);
        multiplyTwoNumbers(89, 23);

    }
    // Task
    // Write a void method that prints sum of two numbers

    public static void sumOfTwoNumbers(int num1, int num2){
        System.out.println(num1 +" + "+num2+" = "+(num1+num2));
    }
    // Task
    // Write a void method that prints multiplication of two numbers

    public static void multiplyTwoNumbers(int num1, int num2){
        System.out.println("Multiplication: "+num1 * num2);
    }


}
