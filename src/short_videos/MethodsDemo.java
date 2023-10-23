package short_videos;

public class MethodsDemo {

    public static void sayHello(){
        System.out.println("Hello");
    }
    public static void printOneToTen(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i+" ");
        }
    }
    public static void sayHello2(int num){
        for(int i = 0; i < num; i++){
            System.out.println("Hello");
        }
    }
    public static void printOneToNum(int num){ // when we assigned num, we can use any number we want to print
        for (int i=1; i<=num; i++){
            System.out.println(i);
        }

    }
    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("Sum of numbers"+sum);
    }
    public static void main(String[] args) {
        // Methods are used to perform certain actions
        // A method is a block of code which only runs when it is called
        // A method must be declared within a class

 //       sayHello();
//        printOneToTen();

        sayHello2(5);
        printOneToNum(10);
        showSum(20,10);

    }

}
