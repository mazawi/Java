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


