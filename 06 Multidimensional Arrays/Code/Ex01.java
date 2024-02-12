/* Programme to defind a 5X5 array and prints the array */

public class Ex01 
{

    public static void main(String[] args) {
        // Define and initialize a 2D array with numbers
        int[][] array2D = 
        {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        // Print the 2D array
        
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
