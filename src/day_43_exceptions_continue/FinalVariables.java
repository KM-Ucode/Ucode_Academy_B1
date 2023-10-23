package day_43_exceptions_continue;

public class FinalVariables {

    final static public String MONDAY = "Monday"; // final variable cannot be changed or modified once initialized
    static String monday = "Monday"; // This is not final variable, it can be changed or modified
    final int DAY_OF_THE_WEEK = 7;
    // Final Array, we can change modify individual elements, but not the whole array
    final static String[] DAYS_OF_THE_WEEK = {"Mon", "Tue","Wed","Thu","Fri","Sat","Sun"};
    static String [] abc = {"Mon", "Tue"};

    public static void main(String[] args) {
       // monday = "abc";    // it can be changed/modified
       // MONDAY = "abc"; // it cannot be changed/modified
        abc = new String[]{"Fri", "Sat"}; // we can change/modify

       // DAYS_OF_THE_WEEK [0] = new String[]{"ab", "ab"}; // we cannot change/modify
       // DAYS_OF_THE_WEEK[0] = "ABC"; // We can change/ modify individual elements

    }


}
