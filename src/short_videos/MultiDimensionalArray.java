package short_videos;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        //  For Two-Dimensional Arrays we use [] [] square brackets
        // The first bracket represents the array and the second one represents
        // the index/element of that array
        int [][]temp;          // create int and give any name, we declare it and later on we can assign a value
        temp = new int[1][2];

        int [][] twoDArray1 = new int [3][3];
        // Assign Values

        twoDArray1 [0][0] = 1;
        twoDArray1 [0][1] = 2;
        twoDArray1 [0][2] = 3;

        twoDArray1 [1][0] = 4;
        twoDArray1 [1][1] = 1;
        twoDArray1 [1][2] = 1;

        twoDArray1 [2][0] = 1;
        twoDArray1 [2][1] = 1;
        twoDArray1 [2][2] = 1;

        System.out.println(twoDArray1[0][0]);
        System.out.println(twoDArray1[1][0]);


        // To create a two-dimensional array, add each array within its own
        // set of curly braces:
        // Assign values

        int [][] twoDArray2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(twoDArray2[2][1]);
        System.out.println(Arrays.deepToString(twoDArray2));
        System.out.println(Arrays.deepToString(twoDArray1));


    }
}
