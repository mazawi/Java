# OOP
## Object-Oriented Principles
- An "object" can be any entity existing in the real world, such as a mobile phone, a book, a table, a computer, a watch, a student, a course, etc.
- Object-Oriented Programming (OOP) is a  paradigm employed in program design, centred around the utilisation of classes and objects.
- It simplifies software development and maintenance by introducing various concepts.
- Classes combine data and the methods (code) to manipulate the data
- Classes are a template used to create specific objects
- All Java programs consist of at least one class.
  
![java-oops-concepts](https://github.com/mazawi/Teaching-Java/assets/45329653/9806f861-39e2-4372-b4cf-97d867e609e8)

## Classes
- A class serves as a blueprint for generating individual objects (alternatively expressed as the data type of an object).
- In Java, the entire system revolves around classes and objects.
- Each class possesses its own set of methods and attributes, which are accessible and modifiable via objects.

**Example: Student class**

- Data: name, year, and grade point average
- Methods: store/get the value of the data, promote to next year, etc.
- Student object
- Object name: student1
- Data: Aisha, 1, 3.5
<img width="270" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/7432fa1e-4859-4223-b399-8f91dd470467">

## Objects
- In OOP, an object embodies two attributes: 
	- states and 
	- behaviour.
- An object serves as a variable belonging to a class type, constituting a fundamental element within an object-oriented programming framework.
- Classes comprise **methods** and **data members,** also known as **attributes**, which are accessible through objects.
- **An object** represents an **instance** of a **class**.
 - Object reference
   -- an identifier of the object
- Instantiating an object
   -- Creating an object of a class; assigns initial values to the object
   data
-- Objects need to be instantiated before being used
- Instance of the class
 -- an object after instantiation

## Class Members
**Members of a class**
The class's fields and methods
- **Fields** : instance variables and static variables
- **Instance variables**
-- variables defined in the class and given a value in each object
-- **fields can be:**
    -- any primitive data type (int, double, etc.)
    -- objects of the same or another class
- **Methods** : the code to manipulate the object data

<img width="591" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/edfd54c7-7a16-4830-8f38-ec0fd9d1413f">

**Naming a class**
- Class names: start with a capital letter
- Object references: start with a lowercase letter
- In both cases, internal words start with a capital letter

**Example:**

|class  | objects |
|--|--|
| Student | itStudent |
|PetAnimal| whiteDog|
  
## Encapsulation
- Encapsulation involves the fusion of data members (attributes) and methods.
- It limits direct access to critical data, ensuring its protection.
- A prime illustration of encapsulation is demonstrated by creating a class with private data members and public methods for access via objects.
- In such instances, only methods possess the capability to access these private data members.

## Code Reusability 
- Object-Oriented Programming (OOP) promotes code reusability.
- Reusable code can be encapsulated within classes and objects.
- Inheritance facilitates code reuse by allowing subclasses to inherit attributes and methods from superclasses.
- Polymorphism enables the use of a single interface to represent multiple types, enhancing code reuse.
- Design patterns offer standardised solutions to common design problems, fostering code reuse across projects.
- Libraries and frameworks provide pre-written code modules that can be reused in various projects, enhancing productivity and code reuse in OOP.
- Class code is already written and tested
- you build a new application faster
- the application will be more reliable

**Example: A Date class could be used in a calendar program, appointment-scheduling program, online shopping program, etc.**

 - Understanding the internal implementation details of a class is not mandatory.
- Familiarity with the class's Application Programming Interface (API) is crucial.
- The API documentation specifies:
  - Object creation procedures.
  - Available methods and their functionalities.
  - Guidelines for method invocation.

[Example: Date Class](https://github.com/mazawi/Teaching-Java/tree/main/08%20Object-Oriented%20Programming%20-%20Using%20Classes/Code/Date)


```c
public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters and setters or Accessors and Mutators
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method to display date
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    // Example of usage
    public static void main(String[] args) {
        // Creating a Date object
        Date today = new Date(31, 1, 2024);

        // Displaying the date
        System.out.println("Today's date is: " + today);
    }
}
```
## Declaration of an Object Reference

- An object reference holds the address of the object
- Syntax to declare an object reference:
```c 
ClassName  objectReference;
```
or
```c
ClassName objectRef1, objectRef2…;
```
**Example:**
```c
SimpleDate d1;
```
**Code Example**
`Date today;'
## Instantiate an Object
- Objects must be instantiated before they can be used
- Call a constructor using the `new` keyword
- **Constructor**: special method that creates an object and assigns initial values to data
- Constructor **has the same name** as the class
- **Syntax**:

`objectReference = new ClassName( arg list );`

- Arg list (argument list) is comma-separated list of initial values to assign to the object data

**Example**

`Date today = new Date(31, 1, 2024);`

`Date nationalDay = new Date(18,11,1970)`

## SimpleDate Class API
**SimpleDate Class Constructors**
|Constructor| Explanation|
|--|--|
|SimpleDate( )| creates a SimpleDate object with initial month, day, and year values of 1, 1, 2000|
|SimpleDate( int mm, int dd, int yy)| creates a SimpleDate object with initial month, day, and year values of mm, dd, and yy|

**Instantiation Examples**
```c
SimpleDate  independenceDay;

independenceDay = new SimpleDate( 7, 4, 1776 );

SimpleDate  graduationDate = new SimpleDate( 5, 15, 2012 );

SimpleDate  defaultDate = new SimpleDate( );
```

**Objects After Instantiation**

<img width="287" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/370b1547-69d4-4732-8fcd-fdc3d51e5229">


**Calling a Method**

<img width="250" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/4533feb7-6aaa-46a3-ba86-c6f041202f07">

**Method Classifications**

- Accessor  methods:  
	- “get” methods
	- return values of object data

- Mutator  methods
	- “set” methods
	- change values of object data


<img width="71" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/bb442272-dac5-45a6-a900-66480a1ad9b1">


**SimpleDate Accessor Methods**
| Return value | Method name and argument list |
|--|--|
| `int` | `getMonth( )`   returns the value of month |
|`int`|`getDay( )`  returns the value of day|
|`int`| `getYear( )`  returns the value of year|

**SimpleDate Mutator Methods**

| Return value | Method name and argument list |
|--|--|
|`void`| `setMonth( int mm )` sets the value of month to mm. If mm is not a valid month, sets month to 1.|
|`void`| `setDay( int dd )`  sets the value of day to dd. If dd is not a valid day, sets day to 1.|
|`void`| `setYear( int  yy )` sets the value of year to yy|

**Dot Notation**

- Use when calling a method to specify which object's data the method should use

***Syntax:***

`objectReference.methodName( arg1, arg2, … )`

**Method Return Values**

- Can be a primitive data type, class type, or void
- A value-returning method
	- The method returns a value.
	- Thus the method call is used in an expression.
	- When the expression is evaluated, the return value of the method replaces the method call.
- Methods with a void return type 
	- Have no value 
	- Method call is complete statement (ends with ;)

**The Argument List in an API**

- Comma-separated pairs of
`
dataType  variableName
`

- The argument list specifies:
	- The order of the arguments
	- The data type of each argument

- Arguments can be: 
	- Any expression that evaluates to the specified data type

**Reading an API: Value-returning Method**

<img width="489" alt="Screenshot 2024-02-16 at 17 36 02" src="https://github.com/mazawi/Teaching-Java/assets/45329653/fda7bbc6-e846-4686-ae4d-e17397dee2a4">

*Example method calls (assuming d1 is a SimpleDate object):*

 `int m = d1.getMonth( );`
 
or

` System.out.println( d1.getMonth( ) );`

**Reading an API: void Method**


<img width="576" alt="Screenshot 2024-02-16 at 17 39 24" src="https://github.com/mazawi/Teaching-Java/assets/45329653/901f07e6-52f5-4242-8c5c-bee58a6e2f6b">

*Example method call (assuming d1 is a SimpleDate object):*

` d1.setMonth( 12 );`

**Object Reference vs. Object Data**

- Object references point to the memory location of object data.
- An object can have multiple object references pointing to it.
- Or an object can have no object references pointing to it. If so, the garbage collector  will free the object's memory.
- two object references point to the same object

<img width="414" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/2ebddca7-bd94-4352-a2be-2776e4ce3e5d">


**null Object References**

- An object reference can point to no object. In that case, the object reference has the value null.
- Object references have the value null when they have been declared, but have not been used to instantiate an object.
- Attempting to use a null object reference causes a NullPointerException  at run time.

**Using Java Predefined Classes**

- The Java SDK provides more than 2,000 classes that can be used to add functionality to our programs
- APIs for Java classes are published on Sun Microsystems’ website: www.java.sun.com

	- Java Packages
	- The String Class
	- Formatting Output using DecimalFormat
	- The Random class
	- Console Input Using the Scanner Class
	- Using static methods and data
	- Using System and  the  PrintStream  class
	- The Math Class
	- Formatting Output using NumberFormat
	- The Wrapper Classes
	- Dialog Boxes

**Java Packages**

- Classes are grouped in packages according to functionality
- 
|Package  | Categories of Classes |
|--|--|
| `java.lang`|Basic functionality common to many programs, such as the String class and Math class|
|`java.awt`|Graphics classes for drawing and using colors|
|`javax.swing`|User-interface components|
|`java.text`|Classes for formatting numeric output|
|`java.util`|The Scanner class, the Random class and other miscellaneous classes|
|`java.io`|Classes for reading from and writing to files|

**Using a Class From a Package**

- Classes in java.lang are automatically available to use.
- Classes in other packages need to be "imported" using this syntax:
```c
import package.ClassName;
```
or
```c
import package.*;
```
- (imports all required classed from package)

**Example**
```c
import java.text.DecimalFormat;
```
or
```c
import java.text.*;
```

**The *String* Class**

Represents a sequence of characters

|String Constructors|
|--|
|`String( String str )` : allocates a String object with the value of str, which is a String object or a String literal|
|`String( )`  : allocates an empty String object|

**Examples:**
```c
String greeting = new String( "Hello" );

String empty = new String( );
```
**String Concatenation Operators**

`+` :  appends a String to another String. At  least one operand must be a String.

`+= ` : shortcut String concatenation operator

**Example:**
```c
String s1 = new String( "Hello " );
String s2 = "there. ";
String s3 = s1 + s2; // s3 is:  Hello there
String s3 += "!";  // s3 is now:  Hello there!
```
**The length Method**

  |Return type| Method name and argument list|
  |--|--|
  |`int` | `length( )` :returns the number of characters in the String|

**Example**

```c
String hello = "Hello";
int  len = hello.length( );
```
*The value of len is 5*

***toUpperCase*  and  *toLowercase* Methods**

|Return type| Method name and argument list|
  |--|--|
  |`String`| `toUpperCase( )` : returns a copy of the String will all letters uppercase|
  |`String` |`toLowerCase( )` : returns a copy of the String will all letters lowercase|

**Example:**
```c
String hello = "Hello";
hello = hello.toUpperCase( );
```
**The value of hello is "HELLO"**

**The indexOf Methods**

|Return type| Method name and argument list|
  |--|--|
  | 'int`| `indexOf( String searchString )` : returns the index of the first occurrence of searchString, or -1 if not found|
  |`int` | `indexOf( char searchChar )` : returns the index of the first occurrence of searchChar, or  -1 if not found|

**The index of the first character of a String is 0.**

**Example:**
```c
String hello = "Hello";

int index = hello.indexOf( 'e' );
```

*The value of index is 1.*

**The substring Method**

|Return type| Method name and argument list|
  |--|--|
  | `String` | `substring( int startIndex, int endIndex )` : returns a substring of the String object beginning at the character at index startIndex  and ending at the character at index end Index – 1|

**Example:**
```c
String hello = "Hello";
String endOfHello = hello.substring( 3, hello.length( ) );
```

*The value of endOfHello is  “lo”*

**The DecimalFormat  Class**
| DecimalFormat Constructor|
|--|
|`DecimalFormat( String pattern )` instantiates a  DecimalFormat object with the format specified by pattern|


















