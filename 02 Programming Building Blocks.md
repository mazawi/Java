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

