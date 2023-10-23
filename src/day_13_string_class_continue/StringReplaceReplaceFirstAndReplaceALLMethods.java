package day_13_string_class_continue;

public class StringReplaceReplaceFirstAndReplaceALLMethods {
    public static void main(String[] args) {

        String str = "java";

        String str2 = str.replace("a","A"); // replace(); replaces given matching value with new value

        System.out.println(str2);

        String str3 = "selenium java api and java and api";

        String str4 = str3.replaceFirst("java", "JAVA");

        System.out.println(str4);

        System.out.println("===============");

        String str5 = str3.replace("ia", "o"); //doesn't work, it doesn't have ia
        System.out.println(str5);

        System.out.println("========");

        String str6 = str3.replaceAll("[ia]", "T");
        System.out.println(str6);

        String a = "He is doing some java";

        String str7 = a.replace("is", "was");
        System.out.println(str7);

        System.out.println("=========");

        String a1 = "He is doing some java";

        String str8 = a1.replaceAll("[is]", "was");
        // replaceALL(), it will replace multiple matching values with new values, it doesn't work if you want
        // to use it just for one sentence

        System.out.println(str8);

        System.out.println("============");

        String word="12345667789";

        String result=word.replaceAll("[1-9]","Hello");

        System.out.println(result);








    }
}
