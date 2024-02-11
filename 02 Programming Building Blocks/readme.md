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

| Type | Size in Bytes |Minimum Value| Maximum Value|
|--|--|--|--|
|byte| 1 | -128 | 127|
|short| 2 | -32,768|  32,767|
|int |4 | -2,147,483,648 | 2,147,483,647|
|long| 8 | -9,223,372,036,854,775,808|  9,223,372,036,854,775,807|

### Example declarations: 
  ```c
  int testGrade;
  int numPlayers, highScore, diceRoll;
  short xCoordinate, yCoordinate;
  byte ageInYears;
  long cityPopulation;
```
## Floating-Point Data Types

| Type | Size in Bytes |Minimum Value| Maximum Value|
|--|--|--|--|
|float| 4 | 1.4E-45 | 3.4028235E38|
|double| 8 |4.9E-324 |1.7976931348623157E308|

### Example declarations: 
    ```c
    float salesTax;
    double interestRate;
    double paycheck, sumSalaries;
    ```
## char Data Type

| Type | Size in Bytes |Minimum Value| Maximum Value|
|--|--|--|--|
|char| 2  |character encoded as 0 | character encoded as FFFF|


### Example declarations: 
```c
 char finalGrade;
 char newline, tab, doubleQuotes;  
```
## boolean Data Type

Two values only: 
 true
 false

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
```c
   x = 20;
   y = x;
```

### Syntax for assigning initial values to variables:

```c
 dataType variableName = initialValue;
 ```
or
```
 dataType variable1 = initialValue1, variable2 = initialValue2, …;
 ```
### Examples:
```c
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
```c
float salesTax = .05f;
double taxRate = salesTax;
```
- This is invalid because the float data type is lower in precision than the `
```c
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
```c
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
```c
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
```c
double twoCents;
double twoCents = .02;
```
**generate this compiler error:**
`twoCents is already defined`
 - After a variable is declared, its data type cannot be changed.
 - These statements:
```c
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
```c
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

## Arithmetic Operators
|Operator|Operation  |
|--|--|
| `+`| addition|
|`-` | subtraction|
|`*`| multiplication|
|`/`|division|
|`%`|modulus (remainder after division)|
## Operator Precedence
- If more than one operator is used in an expression the order of evaluation is determined using operator precedence.
-- Expressions in parentheses are evaluated first
-- Multiplication, division, and modulus are performed before addition and subtraction
- When multiple arithmetic operators of the same precedence occur in one expression, they are evaluated left to right.
- Assignment is performed last, and is performed right to left.

| Operator | Order of evaluation | Operation| 
|--|--| --|
| `( )`| left to right|parentheses for explicit grouping|
|`*  /  %` | left to right| multiplication, division, modulus|
| `+  -`| left to right| addition, subtraction|
|`=`| right to left| assignment|

**Example**
*You have 2 quarters, 3 dimes, and 2 nickels. How many pennies are these coins worth?*
```c
int pennies = 2 * 25 + 3 * 10 + 2 * 5;
```
**Ans**
```
=  50  +  30  +  10
=  90
```
` *` has higher precedence than `+`,  so the multiplications are executed first, then the additions, left to right.

**Example**
Translate ![image](https://github.com/mazawi/Teaching-Java/assets/45329653/44a5adf3-4d38-4ac6-9c68-6550f9119747) into Java:
```c
// This is incorrect!
double result = x / 2 * y;
```
```
=> x  * y  
2
```
```
// This is correct

double result = x / ( 2 * y );
```
### Integer Division and Modulus
- When two integers are divided:
-- the quotient is an integer
-- any fractional part is truncated (discarded)
- To get the remainder, use the modulus operator with the same operands
### Division by Zero
- Integer division by 0:
Example: ` int result = 4 / 0;`
- At run time, the JVM generates an ArithmeticException  and the program stops executing.
- Floating-point division by 0:
-- If the dividend is not 0, the result is Infinity
-- If the dividend and divisor are both 0, the result is NaN  (not a number)
### Mixed-Type Arithmetic
- When performing calculations with operands of different data types:
--Lower-precision operands are promoted to higher-precision data types, then the operation is performed
- - Promotion is effective only for expression evaluation; not a permanent change
-- This is called implicit type casting
- Bottom line: any expression involving a floating-point operand will have a floating-point result.
#### Rules of Promotion
The compiler applies the first of these rules that fits:
1. If either operand is a double, the other operand is converted to a double.
2. If either operand is a float, the other operand is converted to a float.
3. If either operand is a  long, the other operand is converted to a long.
4. If either operand is an int, the other operand is promoted to an  int
5. If neither operand is a double, float, long, or an int, both operands are promoted to int.
#### Explicit Type Casting
*Syntax:*
***(dataType)( expression )***
- Note: parentheses around the expression are optional if the expression consists of only one variable
**Example: calculating a floating-point average of integers**
```c
double average = (double)(total) / count;
```
## Shortcut Operators
`++` increment by 1 
`--` decrement by 1

**Example:**

`count++;  // count = count + 1;`

`count--;  // count = count - 1;`

- Postfix version (`var++`, `var--`):  use value of var  in expression, then increment or decrement.
- Prefix version (`++var`, `--var`): increment or decrement var, then use value in expression

## Shortcut Arithmetic Operators
| Operator | Example |Equivalent|
|--|--|--|
|  `+=`|`a += 3;`| `a = a + 3;`|
|`-=`|`a -= 10;`|`a = a - 10;`|
|`*=`|`a *= 4;`|`a = a * 4;`|
|`/=`|`a /= 7;`|`a = a / 7;`|
|`%=`|`a %= 10;`|`a = a % 10;`|

- **No spaces are allowed between the arithmetic operator and the equals sign**
- Note that the correct sequence is +=, not =+

*Example: add 2 to a*
```c
// this is incorrect
a =+ 2;  // a = +2; assigns 2 to a
```
```cpp
// this is correct
a += 2;  // a = a + 2;
```
### Operator Precedence
|Operator  |  Order of evaluation|parenthesis for explicit grouping|
|--|--| --|
|  `( )`| left - right| parenthesis for explicit grouping|
|`++ --`| right - left| preincrement, predecrement|
|`++ --`| right - left|postincrement, postdecrement|
|`*  /  %`| left - right| multiplication, division, modulus|
|`+  -`| left - right| addition or String concatenation, subtraction|
|`= += -= *= /= %=`| right - left| assignment|



















