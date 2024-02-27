/// write a code that intialise an array of 5 numbers, multiply the elements by 2 and store them in a new array

public class Ex06 {
    public static void main(String[] args) {
        // Initialize an array of 5 numbers
        int[] originalArray = {10, 20, 30, 40, 50};

        // Print the original array elements 
        System.out.println("Original Array Elements: ");
        for (int i = 0; i < originalArray.length; i += 1) 
        {
            System.out.println(originalArray[i]);
        }

        // Store every second element in a new array
        int[] newArray = new int[originalArray.length];
        
        for (int i = 0; i < originalArray.length; i += 1) 
        {
            newArray[i] = originalArray[i]*2;
        }

        // Print the elements of the new array
        System.out.println("\nElements of the New Array (created from every second element):");
        for (int i = 0; i < originalArray.length; i += 1) 
        {
            System.out.println(newArray[i]);
        }
    }
}
