# 4 Data Types, Variables, and Constants
## 4.1 Data Types
* Declaring Variables
* Primitive Data Types
* Initial Values and Literals
* String Literals and Escape Sequences
* Constants
* For all data, assign a name (identifier) and a data type 
* Data type tells compiler:
   * How much memory to allocate
   * How to store the data
   * The types of operations you will perform on the data
* Compiler monitors use of data
   * Java is a strongly typed language
* Java eight primitive data types
   * byte, 
   * short, 
   * int, 
   * long, 
   * float, 
   * double, 
   * char, 
   * boolean
## 4.2 Declaring Variables
* Variables hold one value at a time, but that value can change
* Syntax:
```c
      dataType identifier;
    or
       dataType identifier1, identifier2, …;
```
#### Naming convention for variable names:
* first letter is lowercase 
* embedded words begin with uppercase letter
* Names of variables should be meaningful and reflect the data they will store.
   * This makes the logic of the program clearer
* Don't skimp on characters, but avoid extremely long names.
* Avoid names similar to Java keywords
## 4.3 Integer Types - Whole Numbers
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/faf91b58-21f9-44f7-a648-9e9a058fdf0e)
#### Example declarations: 
```c
  int testGrade;
  int numPlayers, highScore, diceRoll;
  short xCoordinate, yCoordinate;
  byte ageInYears;
  long cityPopulation;
```
## 4.4 Floating-Point Data Types - Numbers with fractional parts
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/7ccea97f-68d6-4859-a000-5ca5b1a8d4fb)
#### Examples
```c 
    float salesTax;
    double interestRate;
    double paycheck, sumSalaries;
```
## 4.5 _char_ Data Type - One Unicode character (16 bits - 2 bytes)
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/9116ea98-b57a-42ac-b94a-9ca61dc9b79b)
#### Examples
```c 
char finalGrade;
char newline, tab, doubleQuotes;
```
## 4.6 _boolean_ Data Type
* Two values only: 
```c 
true
false
```
* Used for decision making or as "flag" variables
#### Examples:
```c
  boolean isEmpty;
  boolean passed, failed;
```
## 4.7 Assigning Values to Variables
* Assignment operator    = 
* Value on the right of the operator is assigned to the variable on the left
* Value on the right can be a literal (text representing a specific value), another variable, or an expression (a valid combination of variables, operators, and constants
#### Examples:
```c
   x = 5;
   y = x; 
```
* Syntax for assigning initial values to variables:
```
 dataType variableName = initialValue;
or
 dataType variable1 = initialValue1, 
          variable2 = initialValue2, …;
```
##### Examples:
```c
   int age = 19;
   double taxRate = .20, salesTax = .06;
```
## 4.8 Literals
* int, short, byte
Optional initial sign (+ or -) followed by digits 0 – 9 in any combination 
* long
Optional initial sign (+ or -) followed by digits 0–9 in any combination, terminated with an L or l  
   * Integer literals that begin with 0 are considered to be octal values; 
   * Integer literals that begin with 0x are considered to be hexadecimal values.
* float
Optional initial sign (+ or -) followed by a floating-point number in fixed or scientific format, terminated by an F or f.
* double
Optional initial sign (+ or -) followed by a floating-point number in fixed or scientific format.
* char
Any printable character enclosed in single quotes
A decimal value from 0 – 65535
 '\m' , where \m is an escape sequence. For example, '\n' represents a newline, and '\t' represents a tab character.
* boolean
    true or false
### Assigning the Values of Other Variables
```       
dataType variable2 = variable1;
```
     * 1. variable1 needs to be defined before this statement appears in the source code
     * 2. variable1 and variable2 need to be compatible data types; in other words, the precision of variable1 must be lower than or equal to that of variable2 
#### Compatible Data Types
* A variable of any type in right column can be assigned to a variable of any type in left column
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/3cb62f92-dc50-4635-874a-ed86abdc9e10)
#### Examples
```c
float salesTax = .05f;
double taxRate = salesTax;
```
* This is invalid because the float data type is lower in precision than the double data type
```c
     double taxRate = .05;
     float salesTax = taxRate; 
```
## 4.9 String
* String is a class, not a basic data type; String variables are objects
* String literal: text contained within double quotes
#### Examples
```c
    "Hello" 
    "Hello world"
    "The value of x is "
```
### String Concatenation Operator (+)
* Combines String literals with other data types for printing
#### Example:
```c
  String word1 = "Hello";
  String word2 = "there!";
  String greeting = word1 + ' ' + word2;
  System.out.println( greeting );
```
**output is:**
   _Hello there!_
* String literals must start and end on the same line. This statement:
```
  System.out.println( "Never pass a water
         fountain without taking a drink" );
```
generates these compiler errors:
```
      unclosed string literal
      ')' expected
```
* Break long Strings into shorter Strings and use the concatenation operator:
```c
  System.out.println( "Never pass a water "
        + "fountain without taking a drink" );
```
## 4.10 Escape Sequences
* To include a special character in a String, use an escape sequence
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/88baade7-699a-4891-937b-098bcdda8c43)
* Declare a variable only once
* After a variable is declared, its data type cannot be changed.
* These statements: 
```c
     double twoCents;
     double twoCents = .02;
```
* generate this compiler error:
```
      twoCents is already defined
```
* After a variable is declared, its data type cannot be changed.
* These statements: 
```c
     double cashInHand;
     int cashInHand;
```
* generate this compiler error:
```
      cashInHand is already defined
```
## 4.11 Constants
* The value of a constant cannot change during program execution
   **_final dataType constantIdentifier =  assignedValue;_**
* Assigning a value when the constant is declared is optional. However, a value must be assigned before the constant is used.
**_Hints_**
   * Declare as a constant any data that should not change during program execution
   * Use all capital letters for constants and separate words with an underscore:
#### Example: 
```c
    final double TAX_RATE = .05;
```
   * Declare constants at the top of the program so their values can easily be seen
## 4.12 Expressions and Arithmetic Operators
### The Assignment Operator and Expressions
```
        target = expression;
```
* expression: operators and operands that evaluate to a single value
   - value is then assigned to target
   - target must be a variable (or constant) 
   - value must be compatible with target's data type
#### Example:
```c
  int weight = 20;
  int height = weight * 2; 
```
The following code generates the following compiler error: 
  _cannot find symbol_
```c
  int height = weight * 2; // weight is not defined
  int weight = 20;
```
## 4.13 Arithmetic Operators
<img width="578" alt="Screenshot 2023-10-07 at 02 56 59" src="https://github.com/mazawi/Teaching-Java/assets/45329653/87a48251-a4e9-4e24-95db-72cbaa3c5056">
## 4.14 Operator Precedence
* If more than one operator is used in an expression the order of evaluation is determined using operator precedence.
* Expressions in parentheses are evaluated first
* Multiplication, division, and modulus are performed before addition and subtraction
* When multiple arithmetic operators of the same precedence occur in one expression, they are evaluated left to right.
* Assignment is performed last, and is performed right to left.
<img width="656" alt="Screenshot 2023-10-07 at 02 58 55" src="https://github.com/mazawi/Teaching-Java/assets/45329653/a6deadf5-b3e0-438e-9124-f9b9d671e9d1">
#### Examples
![image](https://github.com/mazawi/Teaching-Java/assets/45329653/33fb4b49-2f35-4685-b928-80feadba56dc)
<img width="616" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/02c705cf-3629-463a-957a-2bf7094631cb">
### Integer Division and Modulus
* When two integers are divided:
*  the quotient is an integer
*  any fractional part is truncated (discarded)
* To get the remainder, use the modulus operator with the same operands
### Division by Zero
#### 1 Integer division by 0:
#### Example:   
``` 
int result = 4 / 0; 
```
* At run time, the JVM generates an ArithmeticException and the program stops executing.
#### 2. Floating-point division by 0:
* If the dividend is not 0, the result is Infinity
* If the dividend and divisor are both 0, the result is  NaN  (not a number)
