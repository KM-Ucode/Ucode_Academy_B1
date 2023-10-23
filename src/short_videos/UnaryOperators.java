package short_videos;

public class UnaryOperators {
    public static void main(String[] args) {

        // + Unary plus operator - positive value
        int x = +10;
        System.out.println(x);
        // or System.out.println(+x); it's still ahs the same value
        int i = +x;
        System.out.println(i); // still the same value

        // - Unary minus operator - negative value
        int n = - 5;
        System.out.println(n);
        System.out.println(-10);


       // ++ Increment operator --> Pre increment Operator and Post Increment Operator
       // Increases the value by 1

        int num2 = 10;
        ++num2;
        System.out.println(num2); // we get 11
        System.out.println(++num2); // we get 12, pre increment-it does increment before the action

        int num3 = 15;
        System.out.println(num3++);  // we still get 15;
        System.out.println(num3);   //now we get 16, post increment-it doesn't increment before the action
                                   //only after the action

        int num4 = num3 ++; // we assigned num3 to num4
        System.out.println(num4);  //we get 16
        System.out.println(num3);  //we get 17



       // -- Decrement operator --> Pre Decrement Operator and Post Decrement Operator
       // It works the same as pre/post increment operator, but it decreases the value by 1

        int inc = 20;
        -- inc;
        System.out.println(--inc);

        int n2 = inc -- ;
        System.out.println(n2);
        System.out.println(inc);



    }
}
