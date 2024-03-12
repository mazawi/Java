# Flow of Control : Looping
## Topics
- Event-Controlled Loops Using while
- Looping Techniques
- Type-Safe Input Using Scanner
- Constructing Loop Conditions
- Testing Techniques for while Loops
- Event-Controlled Loops Using do/while
- Count-Controlled Loops Using for
- Nested Loops

## Types of loops

<img width="640" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/01204a0b-68f7-4bf8-8b62-e7a7f55eb9d7">


### Example: The Grocery Cashier
- A grocery cashier's job is to calculate the total costs of the items in the cart.
- The cashier starts with a total of OMR 0.00.
- The cashier scans an item to get its price and adds the price to the total.
- The cashier scans the next item to get its price and adds the price to the total.
- When there are no more items to scan, the total is complete.

**Notice that the cashier is performing the same operations on each item!**

## Looping
- In computing, we often need to perform the same operations on multiple items.
- Typically, these tasks follow this pattern:
	- initialize values  (set total to 0)
	- process items one at a time (add price to total)
	- report results  (report total)
- The flow of control that programmers use to complete jobs with this pattern is called looping, or repetition.
### The while Loop

- The while loop is designed for repeating a set of operations on data items when we don't know how many data items there will be.
- When we reach the end of the items to process, we will get some signal. (For the grocery cashier, it's the divider bar.)
- The end of data items could be indicated by a special input value called a sentinel value or by reaching the end of a file.
- Receiving the signal is an event; we call this event-controlled looping.
- The condition is evaluated.
- If it is true, we execute the loop.
- Then the condition is re-evaluated.
- As long as the condition is true, we execute the loop body.
- When the condition is false, we skip to the instruction following the loop.


<img width="234" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/b3e82280-66e0-4e7e-a3e7-f787fbd63d61">


#### Operation of the while Loop
- If the condition evaluates to true, the loop body is executed, then the condition is re-evaluated
- As long as the condition evaluates to true, we continue to repeat the loop body
- The loop body usually "updates the loop condition;" that is, performs some operation that eventually will cause the loop condition to evaluate to false
- Typically, the loop update will be an attempt to read the next input value, in order to detect the sentinel value or the end of the file

#### while Loop Syntax
```java
//initialize variables

while ( boolean expression )
{
// process data (loop body)
}
//process the results
```
#### Example - Mathematical Operations selection
```java
import java.util.Scanner;
public class Math_operation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        double n1, n2, r;

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

#### iteration
- one execution of the loop body

#### loop update
- one or more statements that could cause the loop condition to evaluate to false (and thus end the looping)

#### loop termination condition
- the event that causes the loop condition to evaluate to false

### The Endless Loop

- If the loop condition never evaluates to false, the loop body is executed continuously, without end.
- We call this an endless loop or an infinite loop.
- How can we tell we have an infinite loop?
	- If the loop body has no output, the computer appears to hang
	- If the loop body produces output, the output is repeatedly written without end

- How can we stop an infinite loop?
	- Abort the program

- Avoid putting a semicolon after the condition of a while loop. Doing so creates an empty loop body and could result in an endless loop.

- This code causes an endless loop:
```java
int  i = 0;
while ( i < 10 );  // empty loop body
{

i++;  // this statement follows the loop

}
```
- The semicolon indicates an empty loop body;  i++ is never executed because it is not part of the loop body, so the condition is always true.

