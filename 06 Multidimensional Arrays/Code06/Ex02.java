public class Ex02 
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

        // Print the element above the diagonal 
        System.out.print("Elements above the Diagonal\n");
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (i<j)
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }

        // Print the element on the diagonal 
        System.out.print("Elements on the Diagonal\n");
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (i==j)
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        // Print the element below the diagonal 
        System.out.print("Elements below the Diagonal\n");
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (i>j)
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        
        
    }
    
}
