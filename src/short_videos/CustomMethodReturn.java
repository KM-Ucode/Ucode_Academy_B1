package short_videos;

public class CustomMethodReturn {


    public static void sum(int num1, int num2){
        System.out.println(num1 + num2);   // void does some action but doesn't return anything,
                                          // so you can't store or print

    }
    public static int sum2(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {
        sum(5,5);

        int total = sum2(5,5);  // return method returns and you can always store it inside a variable
        System.out.println(total);
        // or we can directly print it
        System.out.println(sum2(10,10));

    }
}
