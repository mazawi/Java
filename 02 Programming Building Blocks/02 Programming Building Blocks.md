# 2 Programming Building Blocks
## 2.1 Java Application Structure
* All programs consist of at least one class.
#### Example
```c
package labexe2;
public class Labexe2 {

    public static void main(String[] args) {
        int num1 =125;
        int num2=28;
        int num3=-25;
        int avg=(num1+num2+num3)/3;
        
        System.out.println("Num1 = "+ num1);
        System.out.println("Num2 = "+ num2);
        System.out.println("Num3 = "+ num3);
        System.out.println("Average = "+ avg); 
    } 
}
```
* Java source code file must have same name as class with  _\.java_  extension\.

## 2.2 Identifiers - Symbolic Names

* <span style="color:#000000">Identifiers are used to name classes\,  variables\, and methods</span>
* Identifier Rules:
  * Must start with a Character 
    * A \- Z\, a \- z\, \_\, $\, and Unicode letters
  * Can contain essentially any number of letters and digits\, but no spaces
  * Case sensitive
    * _Number1_  and  _number1_  are different
  * Cannot be keywords or reserved words
#### Examples

* Are these identifiers valid?
```c
taxRate
```
  * Yes\.
```c
char
```
  * No\.  _char_  is a keyword
```c
intNumber
```
  * Yes\, The keyword  _int_  is embedded\, but the identifier is not identical to a keyword\.
```c
2008Taxrate
```
  * No\. The identifier starts with a digit
### A Simple Java Program
```c
public class Hello
{   
public static void main(String\[] args)
  {   
   System.out.println("Hello World!");
  }
}
```
## 2.3 Structure of Java programs
```c
public class <name>
{
    public static void main(String[] args) 
   {
        <statement(s)>;
    }
}
```
Every executable Java program consists of a class...
that contains a method named main...
that contains the statements to be executed
The previous program is a class named Hello, whose main method executes one statement named System.out.println
```
System.out.println
```
* Java programs use a statement called System.out.println to instruct the computer to print a line of output on the console
* Two ways to use System.out.println :
```c 
System.out.println("<Message>");
```
Prints the given message as a line of text on the console.
```c
System.out.println();
```
Prints a blank line on the console.
### Scanner for Input
```c
import java.util.Scanner;
public class Aaa 
{
public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      int rollno=sc.nextInt();
      System.out.println ("you inter:   "  + rollno); 
    }
}
```
## 2.2 Program Building Blocks
### The Statement
* Performs some action
* Terminates with a semicolon (;)
* Can span multiple lines
#### Example:
```c
  System.out.println( “Programming is ”  + “not a spectator sport” );
```
### The Block
* 0, 1, or more statements
* Begins and ends with curly braces { }
* Can be used anywhere a statement is allowed
#### Example:
```c
public static void main( String [ ] args )
{
   System.out.println( “Hello” );
}
```
### White Space
* Space, tab, newline are white space characters
* At least one white space character is required between a keyword and identifier
* Any amount of white space characters are permitted between identifiers, keywords, operators, and literals
#### Examples:
```c
 int a
 1 + 2
 public static void main( String [] args)
```
### Comments
* Comments explain the program to yourself and others
* Block comments
* Can span several lines
   * Begin with  /* 
   * End with  */
* Compiler ignores all text between /* and */
#### Example:
```c
   /* This program will print a message
     Anderson, Franceschi 
 */
```
* Line comments
   * Start with  //
* Compiler ignores all text from // to the end of the line
#### Example
```c
  System.out.println( “Hello” ); // print Hello
```
## Data Types, Variables, and Constants
### Declaring Variables
* Primitive Data Types
* Initial Values and Literals
* String Literals and Escape Sequences
* Constants
- For all data, assign a name (identifier) and a data type 
- Data type tells compiler:
- How much memory to allocate
- How to store the data
- The types of operations you will perform on the data
- Compiler monitors use of data
- Java is a strongly typed language
- Java eight primitive data types
- byte, short, int, long, float, double, char, boolean
  
**Variables hold one value at a time, but that value can change**
    ``` Syntax:
      dataType identifier;
    or
       dataType identifier1, identifier2, …;
    ```
- Naming convention for variable names:
```first letter is lowercase``` 
- embedded words begin with uppercase letter

## Integer Types - Whole Numbers
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/08492313-d601-45db-ae74-39e1207250d5)

### Example declarations: 
  ```
  int testGrade;
  int numPlayers, highScore, diceRoll;
  short xCoordinate, yCoordinate;
  byte ageInYears;
  long cityPopulation;
```
## Floating-Point Data Types
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/7c55dd2e-9c45-43cd-b014-a8f5b66f52f9)
### Example declarations: 
    ```
    float salesTax;
    double interestRate;
    double paycheck, sumSalaries;
    ```
## char Data Type
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/2168d085-39a6-48b0-a7a6-6d56cf611bef)
### Example declarations: 
```
 char finalGrade;
 char newline, tab, doubleQuotes;  
```
## boolean Data Type
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/6f9cd3a4-aa27-45b8-b70f-60e06407fbc6)
- Used for decision making or as "flag" variables

### Example declarations:
`
  boolean isEmpty;
  boolean passed, failed;
`
## Assigning Values to Variables
### Assignment operator    = 
- Value on the right of the operator is assigned to the variable on the left
- Value on the right can be a literal (text representing a specific value), another variable, or an expression (a valid combination of variables, operators, and constants -- explained in detail later)
### Examples:
```
   x = 20;
   y = x;
```

### Syntax for assigning initial values to variables:

```
 dataType variableName = initialValue;
 ```
or
```
 dataType variable1 = initialValue1, variable2 = initialValue2, …;
 ```
### Examples:
```
   int age = 19;
   double taxRate = .20, salesTax = .06;
```
## Literals
### int, short, byte
- Optional initial sign (+ or -) followed by digits 0 – 9 in any combination 
### long
- Optional initial sign (+ or -) followed by digits 0–9 in any combination, terminated with an L or l  
- Integer literals that begin with 0 are considered to be octal values; Integer literals that begin with 0x are considered to be hexadecimal values.

## Floating-Point Literals
### float
- Optional initial sign (+ or -) followed by a floating-point number in fixed or scientific format, terminated by an F or f.
### double
- Optional initial sign (+ or -) followed by a floating-point number in fixed or scientific format.

## char and boolean Literals
### char
- Any printable character enclosed in single quotes
- A decimal value from 0 – 65535
- '\m' , where \m is an escape sequence. For example, '\n' represents a newline, and '\t' represents a tab character.
### boolean
- true or false

## Assigning the Values of Other Variables
*Syntax:*

`dataType variable2 = variable1;`

 - Rules:
1. variable1 needs to be defined before this statement appears in the source code
2.  variable1 and variable2 need to be compatible data types; in other words, the precision of variable1 must be lower than or equal to that of variable2

## Compatible Data Types
A variable of any type in right column can be assigned to a variable of any type in left column:
| Data Type | Compatible Data Types |
|--|--|
| byte |byte  |
|short | byte, short|
|int  |byte, short, int, char|
|long  |byte, short, int, long, char|
|float|  float, byte, short, int, long, char|
|double | float, double, byte, short, int, long, char|
|boolean | boolean|
|char|  char|
**Examples:**
- This is a valid assignment:
```
float salesTax = .05f;
double taxRate = salesTax;
```
- This is invalid because the float data type is lower in precision than the `
```
double data type:
double taxRate = .05;
float salesTax = taxRate;
```
## String Literals
 - String is a class, not a basic data type; String variables are objects
 - String literal: text contained within double quotes
**Examples** 
```
"Hello"
"Hello world"
"The value of x is "
```
### String Concatenation Operator (+)
 - Combines String literals with other data types for printing
**Example**
```
String word1 = "Hello";
String word2 = "there!";
String greeting = word1 + ' ' + word2;
System.out.println( greeting );
```
**output is:**
```
Hello there!
```
**Important**
 - String literals must start and end on the same line. This statement:
```
System.out.println( "Never pass a water
fountain without taking a drink" );
```
generates these compiler errors:
```
unclosed string literal
')' expected
```
 - Break long Strings into shorter Strings and use the concatenation operator:
```
System.out.println( "Never pass a water "
                    + "fountain without taking a drink" );
 ```
 ### Escape Sequences
 - To include a special character in a String, use an escape sequence
 Escape 
 
| Character  | Sequence |
|--|--|
| Newline   | `\n` |
|Tab|  `\t`|
|Double quotes|  `\"`|
|Single quote| `\'`|
|Backslash| `\\`|
|Backspace| `\b`|
|Carriage return | `\r`|
|Form feed | `\f`|
 - Declare a variable only once
 - After a variable is declared, its data type cannot be changed.
 - These statements:
```
double twoCents;
double twoCents = .02;
```
**generate this compiler error:**
`twoCents is already defined`
 - After a variable is declared, its data type cannot be changed.
 - These statements:
```
double cashInHand;
int  cashInHand;
```
**generate this compiler error:**
`cashInHand is already defined`
 - The value of a constant cannot change during program execution
*Syntax:*
`final  dataType  constantIdentifier =assignedValue;`
 - Note: assigning a value when the constant is declared is optional. However, a value must be assigned before the constant is used.
 - Declare as a constant any data that should not change during program execution
 - Use all capital letters for constants and separate words with an underscore:
**Example:**
`final double TAX_RATE = .05;`
 - Declare constants at the top of the program so their values can easily be seen
## Expressions and Arithmetic Operators
 - The Assignment Operator and Expressions
- Arithmetic Operators
- Operator Precedence
- Integer Division and Modulus
- Division by Zero
- Mixed-Type Arithmetic and Type Casting
- Shortcut Operators
### Assignment Operator
*Syntax:*
`target = expression;`
- expression: operators and operands that evaluate to a single value
-- value is then assigned to target
-- target must be a variable (or constant)
-- value must be compatible with target's data type
**Examples**
```
int  numPlayers = 10; // numPlayers holds 10
numPlayers = 8;  // numPlayers now holds 8
int  legalAge = 18;
int  voterAge = legalAge;
```
**The next statement is illegal**
```
int height = weight * 2; // weight is not defined
int weight = 20;
```
- and generates the following compiler error: `cannot find symbol`
















