package day_05_unary_shorthand_operators;

public class UnaryOperators2 {
    public static void main(String[] args) {

        int number1 = 10;

        int number2 = number1++;

        System.out.println(number2);

        System.out.println(number1);

        System.out.println("=======");

        int number3 = 78;
        System.out.println(number3++);
        System.out.println(number3);

        System.out.println("=======");

        int number4 = 89;

        int number5 = number4--;

        System.out.println(number5);

        System.out.println(number4--);

        System.out.println(number4);

        System.out.println("=======");

        int a =1;

        a = -a -- + a ++ / -a -- * --a;

        System.out.println(a);

        System.out.println("=======");

        int b = 50;

        b = --b + b++ + b-- +b++;
        System.out.println(a);

        System.out.println("=======");

        int x = 4;
        int y = x *4 - x++;
        System.out.println(y);



    }
}
