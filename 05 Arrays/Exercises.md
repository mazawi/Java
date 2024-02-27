# Array Exercises and Tutorial

## Array Declaration and Initialisation
### Ex01
Write a programme in Java that define and initialise an array that contains 5 integer and print them

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

### Ex02
Write a Java programme that reads the marks of 5 students from the user and stores them in an array, then the programme prints the marks on the screen

```java
// Java example that reads the marks of 5 students from the user and stores them in an array

import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store marks of 5 students
        int[] studentMarks = new int[5];

        // Read and store marks for each student
        for (int i = 0; i < studentMarks.length; i++) 
        {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            studentMarks[i] = scanner.nextInt();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display the entered marks
        System.out.println("Entered marks for 5 students:");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentMarks[i]);
        }
    }
}
```
### Ex03
Write a Java programme that reads the marks of 5 students from the user and stores them in an array, then the programme finds the sum of the marks

```java
// Java example that reads the marks of 5 students and finds the sum of the marks

import java.util.Scanner;

public class Ex03 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store marks of 5 students
        int[] studentMarks = new int[5];

        // Read and store marks for each student
        for (int i = 0; i < studentMarks.length; i++) 
        {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            studentMarks[i] = scanner.nextInt();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the total 
        int sum = 0;
        for (int i = 0; i < studentMarks.length; i++) 
        {
            sum+=studentMarks[i];
            
        }
        System.out.println("The total sum of the marks is: "+ sum);
    }
}
```
### Ex04
Write a Java programme that reads the marks of 5 students from the user and stores them in an array, then the programme finds the Average of the marks

```java
import java.util.Scanner;

public class Ex04 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store marks of 5 students
        int[] studentMarks = new int[5];

        // Read and store marks for each student
        for (int i = 0; i < studentMarks.length; i++) 
        {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            // Ensure that the input is an integer

            studentMarks[i] = scanner.nextInt();
        }

        // Calculate the average of the entered marks
        double sum = 0;
        for (int i = 0; i < studentMarks.length; i++) 
        {
            sum += studentMarks[i];
        }
        double average = sum / studentMarks.length;

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display the calculated average
        System.out.println("Average marks: " + average);
    }
}
```
### Ex05
Write a Java programme that reads 5 numbers from the user and stores them in an array, then the programme finds the Maximum Number


```java
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        // Read and store values in the array
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum number in the array
        int maxNumber = numbers[0]; // Assume the first element is the maximum initially

        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Display the maximum number
        System.out.println("Maximum number in the array: " + maxNumber);
    }
}
```
### Ex06
write a code that intialise an array of 5 numbers, multiply the elements by 2 and store them in a new array
```java
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
        System.out.println("\nElements of the New Array :");
        for (int i = 0; i < originalArray.length; i += 1) 
        {
            System.out.println(newArray[i]);
        }
    }
}

```
### Ex07
Write a Java program that initializes an array containing the prices of 10 items, adds a 5% tax to each price, and saves the updated prices in a new array

```java
// Java program that initializes an array containing the prices of 10 items, adds a 5% tax to each price, and saves the updated prices in a new array
public class Ex07
{
    public static void main(String[] args) 
    {
        // Initialize an array with the prices of 10 items
        double[] itemPrices = {25.50, 15.75, 30.00, 12.99, 8.49, 50.25, 19.99, 5.50, 42.75, 10.00};

        // Calculate prices with 5% tax and store in a new array
        double[] pricesWithTax = new double[itemPrices.length];

        for (int i = 0; i < itemPrices.length; i++) 
        {
            // Add 5% tax to each item price
            pricesWithTax[i] = itemPrices[i] * 1.05;
        }

        // Display the original and updated prices
        System.out.println("Original Prices of 10 Items:");
        for (int i = 0; i < itemPrices.length; i++) 
        {
            System.out.println("The price of item "+ (i+1) + " Was "+itemPrices[i] +" Bacame afte adding tax: "+ pricesWithTax[i]);
        }

        
    }

}
```


## Questions
1. Write Java code to declare and initialize an array of integers named data with values 10, 20, 30, 40, and 50. Print the elements of the array.
2. Create an array of strings named colors and initialize it with the values "Red," "Green," "Blue," "Yellow," and "Orange." Print the elements in reverse order.
3. Write a Java program to find the sum of all elements in an array of integers with 6 elemets.
