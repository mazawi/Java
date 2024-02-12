package Code;
public class Ex04 
{
    public static void drawBarChart(int[][] data) {
        for (int[] row : data) {
            // Iterate through each element of the row
            for (int value : row) {
                // Draw bars based on the value
                for (int i = 0; i < value; i++) {
                    System.out.print("*"); // Print asterisks to represent bars
                }
                System.out.print("  "); // Add space between bars
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        // Example 2D array representing data for the bar chart
        int[][] data = {
            {3, 2, 5},  // First row represents values for the first category
            {4, 1, 6},  // Second row represents values for the second category
            {2, 3, 4}   // Third row represents values for the third category
        };

        // Draw the bar chart using the provided data
        drawBarChart(data);
    }
}
