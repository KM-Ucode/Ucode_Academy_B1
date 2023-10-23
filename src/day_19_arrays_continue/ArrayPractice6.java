package day_19_arrays_continue;

public class ArrayPractice6 {
    public static void main(String[] args) {

        // Write a program to find the longest string from string array
        // String

        String[] strArray = {"Java", "Automation", " api", "Selenium"};

        String longStr = strArray[0];
        String shortStr = strArray[0];

        // Find Longest String
        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].length() > longStr.length()) {
                longStr = strArray[i];
            }
            if (strArray[i].length() < shortStr.length()){
                shortStr = strArray[i];
            }


        }
        System.out.println("Longest str: "+longStr);
        System.out.println("Shortest str: "+shortStr);

        }
    }
