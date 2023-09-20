A data type encompasses both a collection of values and a predefined set of operations applicable to those values. To illustrate, consider our familiarity with numbers, along with the fundamental operations like addition and multiplication that apply to them. In Java, there exist eight distinct built-in data types, primarily catering to various numeric categories. The system type, which represents character strings, is so frequently employed that we shall also explore it further in this context.

<img width="630" alt="Screenshot 2023-09-20 at 11 49 00" src="https://github.com/mazawi/Teaching-Java/assets/45329653/fc4bbd41-efa5-4153-8935-8737b829c8e5">

### Ex 01 declaration terminology
```
int a, b, c;
a = 7;
b = 5;
c = a + b;
```
# Data Types
## 01 Characters and strings
A character, also known as a "char," is a symbol or alphanumeric character, similar to what you input through your keyboard. Typically, we don't carry out any operations on individual characters aside from assigning them to variables. On the other hand, a "String" is a sequence of characters. The primary operation performed on strings is concatenation, which involves combining two strings to create a new one. To illustrate, let's take a look at the following snippet from a Java programme:

### Ex 02 char
```c
package Data_Types;

public class dataType {
        public static void main(String[] args) {
            char x;
            x = 'a';
            System.out.println("The variable x consists the value  "+ x);
        }
        
}
```
### Ex 03 String
```c
package Data_Types;

public class dataType_string {
    public static void main(String[] args) {
        String x, y;
        x = "Mohammad";
        y = "Hi ";
        System.out.println(y + x);
    }
}
```
## 02 Integers
An "int" represents an integer, which is a whole number falling within the range of -2,147,483,648 to 2,147,483,647 (from -2^31 to 2^31 - 1). We commonly employ integers not only because they reflect real-world quantities but also because they naturally emerge when describing algorithms. Java includes built-in arithmetic operators for integers, including addition, multiplication, mod, and division.

### Ex 04
```c
package Data_Types;

public class dataType_int {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int sum  = a + b;
        int mul = a * b;
        int div = a / b;
        int rem  = a % b;
        int sub = a-b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " - " + b + " = " + sub);
    }
    
}
```
## 03 Floating-point variables
The "double" data type is designed to represent floating-point numbers, primarily used in scientific applications. Its internal representation resembles scientific notation, enabling us to perform calculations with real numbers over an extensive range. We can express a floating-point number either as a string of digits with a decimal point, such as 3.14159, which approximates the mathematical constant pi with six digits, or in a scientific notation-like format, such as 6.022E23, which represents Avogadro's constant as 6.022 × 10^23. Java comes equipped with standard arithmetic operators for addition, multiplication, and division for double values
### Ex 04
```c
package Data_Types;

public class dataType_double {
    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.4;
        double sum  = a + b;
        double mul = a * b;
        double div = a / b;
        double rem  = a % b;
        double sub = a-b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + rem);

        System.out.println();
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI/4));
        System.out.println("log(e)    = " + Math.log(123));
    }  
}
```
## 04 Booleans

The "boolean" data type comprises only two values: true or false. Despite its apparent simplicity, booleans serve as a fundamental building block in computer science. The key operators associated with booleans are "and," "or," and "not."

"and": Represented as "a && b," this is true when both "a" and "b" are true, and false in all other cases.
"or": Denoted as "a || b," this evaluates to true if either "a" or "b" is true (or both are true), and it's false otherwise.
"not": Expressed as "!a," it is true when "a" is false, and false when "a" is true.
While these definitions are intuitive and easy to grasp, it's valuable to provide a comprehensive specification for each possible outcome of these operations in a truth table.

<img width="360" alt="Screenshot 2023-09-20 at 12 48 17" src="https://github.com/mazawi/Teaching-Java/assets/45329653/f88495d2-5c21-4f4b-b8ec-96037afc1dd7">

<img width="154" alt="Screenshot 2023-09-20 at 12 48 43" src="https://github.com/mazawi/Teaching-Java/assets/45329653/15b632a4-7799-4b36-ab9e-45071ad28e90">

## Comparisons
The comparison operators are operations that work with operands of different types, such as "int" or "double," and yield a result of the "boolean" type. These operations have a vital role in the development of more complex programs.

<img width="426" alt="Screenshot 2023-09-20 at 12 51 31" src="https://github.com/mazawi/Teaching-Java/assets/45329653/58d80993-dbfe-4a7b-ba7f-f1fbaccd5458">


