package Homework;

public class Day20 {
    public static void main(String[] args) {

         //  Use all loops that we cover including for each loop:
        // Task 1:
       // Write a program to find the longest and the shortest word from a sentence // use split method

        String str = "It is a beautiful day!";
        String lonWord = "";
        for(String each : str.split(" ")){

            if (each.length() > lonWord.length()){
                lonWord = each;
            }
            System.out.println(lonWord);


       // String [][] strArray= {{"Dushanbe","Alma-Ata" },{"Bishkek", "Tashkent"}};
      //  String longName = "";
      //  for(int i=0; i < strArray.length; i++){

     //       for (int j=0; j< strArray[i].length; j++){

      //          if (strArray[i][j].length() > longName.length()){
      //              longName = strArray [i][j];
        //        }
        //    }
      //  }
        //  System.out.println(longName);


        //Task 1:
        //Write a program to reverse each word in string array (One-Dimensional array)

        //Task 2:
        //Write a program to reverse each word in two-dimensional string array


        //Task 3:
        //Write a program to replace all odd numbers  with 1 in int array

        //Task 4:
        //Write a program to replace all even numbers with 2 in two-dimensional array


        //Task 5:
        //Write a program to sort each word in ascending/alphabetical order in string array


        //Task 6:
        //Write a program to sort each array in Multi-Dimensional int array

        //Task 7:
        //Write a program to return sum of all arrays from multi-dimensional int array

        //Task 8:
        //Write a program to return sum of each array from multi-dimensional int array
    }
}}