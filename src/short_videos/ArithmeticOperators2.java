package short_videos;

public class ArithmeticOperators2 {
    public static void main(String[] args) {

        // byte > short > int > long > float > double

        double d = 5.5;
        float f = 3.25F;
        double c = f;
        float f2 = (float)d; //explicitly casting
        System.out.println(f2);

        int i = 10;
        byte b = (byte) i;
        int j = (int)c;
        System.out.println(b);
        System.out.println(j);

        int k =(int) 2.9;
        System.out.println(k);
        byte b2 = (byte)k;
        System.out.println(b2);

        int result = 12 + 6 / 3;
        System.out.println(result);

        int result2 = 5+5 *4;
        System.out.println(result2);
        int result3 = 10 / 2 - 3;
        System.out.println(result3);

        System.out.println (2+4 / 2);

        int result4 = 8+12*2-4;
        System.out.println(result4);
        System.out.println(4+17 % 2 -1);

        int result5 = 6 - 3 * 2 + 7 -1;
        System.out.println(result5);

        int result6 = (8+12) * 2 - 4;
        System.out.println(result6);

        int result7 = (5-1)+(10-5)*2 / 2;
        System.out.println(result7);

        int result8 = (10*2)*2 / 4 + 5 - 3 + 2;
        System.out.println(result8);

    }
}
