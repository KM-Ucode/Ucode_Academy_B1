package day_3_variable_continue;

public class NarrowingConversion {
    public static void main (String[] args) {

        int i = 10;
        byte b = (byte) i;
        System.out.println(b);

        double num1 = 100.5;  // narrowing conversion means loss of data

        int num2 =(int) num1;
        System.out.println(num2);
    }
}
