# Java Methods

## What are Java Methods?

- Java methods are blocks of code that perform specific tasks or operations.
- They encapsulate functionality and promote code organization and reusability.

**Key Characteristics:**
1. **Modularity:** Methods break down complex tasks into smaller, manageable units.
2. **Reusability:** Methods can be called multiple times from different parts of the program.
3. **Abstraction:** Methods abstract away implementation details, focusing on what needs to be done rather than how it's done.

**Example:**
- When you call the `System.out.println()` method, the system executes statements to display a message on the console.

**Benefits:**
- Improved code readability and maintainability.
- Enhanced code reuse and modularity.
- Encourages a structured approach to programming.

## Components of a Java Method
1. **Method Signature:** Defines the method's name, return type, and parameters (if any).
2. **Method Body:** Contains the statements that define the behaviour of the method.

**Method Signature:**
- **Method Name:** Identifier for the method.
- **Return Type:** Data type of the value returned by the method (void if no return value).
- **Parameters:** Input values passed to the method (optional).

**Example Method Signature:**
```java
public int calculateSum(int num1, int num2)
```

**Method Body:**
- Contains the statements enclosed within braces `{}`.
- Executes the specific task or operation defined by the method.

**Example Method Body:**
```java
{
    int sum = num1 + num2;
    return sum;
}
```
## Creating and Calling Java Methods

**Creating a Method:**
- To create a method, specify the method's signature, including its name, return type, and parameters (if any), followed by the method body.

**Example Method Creation:**
```java
public void greetUser(String name) {
    System.out.println("Hello, " + name + "!");
}
```

**Calling a Method:**
- To call (invoke) a method, use the method name followed by parentheses `()` and provide any required arguments inside the parentheses.

**Example Method Invocation:**
```java
greetUser("ABC");
```

**Output:**
```
Hello, ABC!
```

## Java Methods with Return Values and Parameters

**Return Values:**
- Some methods return a value after performing their operation.
- The return type specifies the type of value returned by the method.

**Example Method with Return Value:**
```java
public int add(int num1, int num2)
{
    int s;
    s = num1+num2;
    return s;
}
```

**Calling a Method with Return Value:**
```java
int result = add(5, 3);
System.out.println("Result: " + result); 
```

**Parameters:**
- Parameters are values passed to a method for it to use during its execution.
- They allow methods to work with different data each time they are called.

**Example Method with Parameters:**
```java
public void greetUser(String name) {
    System.out.println("Hello, " + name + "!");
}
```

**Calling a Method with Parameters:**
```java
greetUser("ABC"); 
```

## Method Overloading and Abstraction

**Method Overloading:**
- Method overloading allows multiple methods with the same name but different parameter lists to coexist within the same class.
- Overloaded methods provide flexibility and improve code readability.

**Example of Method Overloading:**
```java
public int add(int num1, int num2) {
    return num1 + num2;
}

public double add(double num1, double num2) {
    return num1 + num2;
}
```

**Abstraction:**
- Method abstraction focuses on the behaviour of a method rather than its implementation details.
- It allows programmers to work with methods at a higher level of abstraction, reducing complexity and improving code maintainability.

**Example of Method Abstraction:**
```java
public void greetUser(String name) {
    System.out.println("Hello, " + name + "!");
}
```

**Another Example of Method Abstraction:**

Consider a `Calculator` class that provides methods for performing mathematical operations. Here's how the `add()` method can be abstracted to focus on the behavior of adding two numbers:

```java
public class Calculator {

    // Method for adding two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Other methods for subtraction, multiplication, etc.
    // ...
}
```

In this example, the `add()` method abstracts the addition operation, allowing users of the `Calculator` class to simply call `add()` without needing to know the internal details of how addition is implemented. This abstraction simplifies the usage of the `Calculator` class and promotes code maintainability.

## Parameterized Methods

**Parameterized Methods:**
- Parameterized methods accept input values (parameters) that they can use during their execution.
- Parameters allow methods to work with different data each time they are called.

**Example of a Parameterized Method:**
```java
public void greetUser(String name) {
    System.out.println("Hello, " + name + "!");
}
```

**Calling a Parameterized Method:**
```java
greetUser("ABC"); 
greetUser("XYZ");   
```

**Benefits of Parameterized Methods:**
- Enhance code reusability by allowing methods to perform similar tasks with different input values.
- Increase flexibility by enabling methods to adapt to various scenarios based on provided parameters.


## Types of Methods
1.	Does not take parameters and does not return values
2.	Takes arguments and does not return values
3.	Does not take arguments and returns values
4.	Takes arguments and returns values

### Type 1 Method (Function): 
This method does not take any arguments and does not return any values when it is called. 
![image](https://user-images.githubusercontent.com/45329653/230844418-2f86f012-f4fc-4c01-8f14-e009330cc276.png)

 
Ex01: Write a method that prints a welcome message to the screen when it is called

```C++
public  class Ex01
{
	public  static  void SayHi()
	{
	System.out.println("Hi, Welcome!");
	}

public  static  void main(String[] args)
	{
	SayHi();
	}
}
```
Execution
```C++
Hi, Welcome!
```

### Type 2 Method (Function): 
This function takes arguments and does not return any values when it is called. 
 
![image](https://user-images.githubusercontent.com/45329653/230844650-4a2b5d93-b332-4260-b1f7-29f996ff8b7e.png)

Ex02: Write a Method that receives an integer and prints it

```java
public class IntegerPrinter 
{
    // Function to receive an integer and print it
    public static void printInteger(int number) 
    {
        System.out.println("The integer is: " + number);
    }

    // Main method to call the printInteger function
    public static void main(String[] args) 
    {
        // Calling the printInteger function with an integer parameter
        printInteger(10);
    }
}
```

###  Type 3 Method (Function): 
This method does not take arguments and returns values when it is called. 
 ![image](https://user-images.githubusercontent.com/45329653/230844779-86d3698f-231b-4220-8d6f-b4f4131ed49a.png)

Ex03:  A method that reads an integer and returns it 

```C++
import java.util.Scanner;
public  class Ex02
{
	public  static  int readInteger()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int number = scanner.nextInt();
	return number;
	}

	public  static  void main(String[] args)
	{
	int userInput = readInteger();
	System.out.println("The entered integer is: " + userInput);
	}
}
```
Execution
```C++
Enter an integer: 12
The entered integer is: 12
```

### Type 4 Method (Function): 
This function takes arguments and returns values when it is called. 
 ![image](https://user-images.githubusercontent.com/45329653/230844847-615797cc-6fca-4b51-9d12-702676d5323a.png)

Ex04: Write a method that receives two numbers and returns their sum

```java
public  class Ex04
{
	public  static  int sum(int num1, int num2)
	{
	return num1 + num2;
	}

	public  static  void main(String[] args) 
	{
	int s = sum(5, 3);
	System.out.println("The sum of the two numbers is: " + s);
	}
}
```


## Exercises
1.	Write a Method to find the Max of three numbers
2.	Write a Method to calculate the factorial of a number
3.	Write a Method that takes a number and checkswhether  the number is prime or not
4.	Write a Method to print the even numbers in a given range
5.	Write a Method that takes the GPA of a student and returns the Grade (fail, sat, good, very good, or excellent)
6.	Write a Method that takes the population and the increase rate of a specific country and the number of years and returns the population after the specified number of years.
7.	Write a Method that takes the width and the height of a rectangle and returns the area and perimeter
8.	Write a Method that takes the name of the bank customer and the balance he/she has in his account and prints them. 
9.	Write a Method to determine the maximum of two integers x and y. 
10.	Write a Method that returns true if the given number n is odd, otherwise, it must return false. Use the Method in the main Method to test whether a number is even or not.
11.	Write a Method that returns the power of a number e.g.,  x^y   
12.	Write a programme that has a function for each arithmetic operation (+, -, *, /). The programme asks the user to enter two integers and the operation the user wants to apply and print the result
