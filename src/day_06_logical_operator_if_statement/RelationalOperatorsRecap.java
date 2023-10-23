package day_06_logical_operator_if_statement;

public class RelationalOperatorsRecap {
    public static void main(String[] args) {

        boolean b =  'a' > 'A'; // you get true because in ASCII table a is greater than A

        boolean b2 = 'b' <= 'c';

        System.out.println(b);
        System.out.println(b2);

        String str1 = "java";
        String str2 = "Java";

        boolean b3 = str1 != str2;
        System.out.println(b3);   //

        boolean b4  = 'a'== 97;
        System.out.println(b4);

        char  ch1 = 'c';
        ++ch1;
        System.out.println(ch1);

        String str3 = "Selenium";
        str3 += 1;  //--> str3 = str3 +1;

        System.out.println(str3);

        String str4 = "API";
        char ch4 = 'A';

        str4 += ch4 +""+ ch4;
        System.out.println(str4);

       int num = 12345;

       String str5 = "" +num;

       System.out.println(num);

       // var += var -> var = var + var;

        double d = 34.4;
                d = d + 5.6;
                d+= 7.6;

        System.out.println("=============================");

        int number1 = 122;
        int number2 = 222;
        boolean result = number1 > number2;

        //System.out.println("First number is greater than Second number-"+(number1>number2));
        System.out.println("First number is greater than Second number-"+result);




    }
}
