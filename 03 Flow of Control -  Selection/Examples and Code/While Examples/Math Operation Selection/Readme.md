# Mathematical Operation Selection
in this example, it is required to develop a programme that takes two numbers and the operation and finds the result of applying the selected operation on the entered numbers
1. Prepare your programme, 
    - a. import the necessary libraries, 
    - b. define the class
    - c. declare the necessary variables
    - d. initialise the variables (if needed)

```java
import java.util.Scanner;
public class Math_operation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        double n1, n2, r;
```
2. define the *while* loop and select the sentinel (let's say when the user enters 5)
3. provide the user with menue to inform him/her of what to select
4. read the numbers and the choice of the user

```java
while (choice != 5) 
        {
            System.out.print("Enter First Number ");
            n1 = input.nextDouble();
            System.out.print("Enter Second Number ");
            n2 = input.nextDouble();
            // Display the menu
            System.out.println("Math Operation Menu:");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Exit");

            // Prompt the user for their choice
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
```

5. use `if`, `else if` and `else` to make decision 

```java
// Perform the selected operation or exit
            if (choice == 1) 
            {
                r = n1+n2;
                System.out.println("You have selected addition, result is: "+r);
            } 
            else if (choice == 2) 
            {
                r = n1-n2;
                System.out.println("You have selected Subtraction, result is: "+r);            
            } 
            else if (choice == 3) 
            {
                r = n1*n2;
                System.out.println("You have selected Multiplication, result is: "+r);
            } 
            else if (choice == 4) 
            {
                r = n1/n2;
                System.out.println("You have selected division, result is: "+r);
            } 
            else if (choice == 5) 
            {
                System.out.println("Exiting the program. Goodbye!");
            } 
            else 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        input.close();
    }

    
}
```