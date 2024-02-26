# Array Exercises and Tutorial

## Array Declaration and Initialisation
```c
public class Ex01
{
    // Printing All Elements of an Array
    public static void main(String[] args) 
    {
        // Declare an array of integers
        int[] numbers;

        // Instantiate the array with a size of 5
        numbers = new int[5];

        // Assign values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
        
    }
}
```