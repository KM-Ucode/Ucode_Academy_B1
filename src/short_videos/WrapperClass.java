package short_videos;

public class WrapperClass {
    public static void main(String[] args) {


        String numberAsString = "2023";
        System.out.println(numberAsString); //2023

        int number = Integer.parseInt(numberAsString);
        System.out.println(number);  //2023

        numberAsString += 1; //20231 because we are adding to the string it just appends it.
        System.out.println(numberAsString);

        number += 1; //2024 // when we add to number(int), it adds it and becomes 2024
        System.out.println(number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println(doubleNumber); //20231.0
    }
}
