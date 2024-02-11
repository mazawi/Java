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
2. **Method Body:** Contains the statements that define the behavior of the method.

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
