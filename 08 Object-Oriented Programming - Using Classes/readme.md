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


<img width="398" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/5bd6c8e1-cd55-440b-a0d5-355af2805bbe">


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


|Pattern |characters |
|--|--|
|  0 |  required digit|
|  #  |  optional digit, suppress if 0|
|  .  |  decimal point|
|  ,  |  comma separator|
|  %  | multiply by 100 and display a percent sign|



**The DecimalFormat  format Method**
To format a numeric value for output, call the format method.


|Return type|Method name and argument list|
|--|--|
|String|`format( double number )` : returns a formatted _String_ representation of _number |


### The Random Class

- Generates a pseudorandom number (appearing to be random, but mathematically calculated)
- The Random class is in the **java.util  package.**

|Random Class Constructor|
|--|
|`Random( )` : Creates a random number generator.|

**Example:**

`Random random = new Random( );`

**The nextInt Method**

|Return type| Method name and argument list|
|--|--|
|`int`|`nextInt( int number )` :returns a random integer ranging from 0 up to, but not including, number|

**Example:**

To generate a random integer between 1 and 6:

`int die = random.nextInt( 6 ) + 1;`

### Input Using the Scanner Class

- Provides methods for reading byte, short, int, long, float, double, and String data types from the Java console and other sources
- **Scanner is in the java.util package**
- Scanner parses (separates) input into sequences of characters called tokens. 
- By default, tokens are separated by standard white space characters (tab, space, newline, etc.)

**A Scanner Constructor**

`Scanner( InputStream source )`

- Creates a Scanner object for reading from source.  
- If source is **`System.in`**, this instantiates a Scanner object for reading from the Java console

**Example:**

`Scanner scan = new Scanner( System.in );`

**Scanner next… Methods**

  |Return type|Method name and argument list|
  |--|--|
  |dataType| `nextDataType( )` :returns the next token in the input stream as a dataType. dataType can be byte, int, short, long, float, double, or boolean|
  |String| `next( )` : returns the next token in the input stream as a String|
  |String| `nextLine( )` : returns the remainder of the line as a String|

**Prompting the User**

- The next… methods do not prompt the user for an input value
- Use System.out.print to print the prompt, then call the next… method

**Example:**
```c
Scanner scan = new Scanner( System.in );

System.out.print( "Enter your age > " );

int age = scan.nextInt( );
```

- End your prompts with an indication that input is expected.
- Include a trailing space for readability.

**Example:**
```c
System.out.print( "Enter your age > " );
```

- Provide the user with clear prompts for input.
- Prompts should use words the user understands and should describe the data requested and any restrictions on valid input values.

**Example:**
```c
Enter your first and last name
```
or
```c
Enter an integer between 0 and 10
```
**Character Input**

- Scanner does not have a nextChar  method.
- To read a single character, read the input as a String, then extract the first character of the String into a char variable.

**Example:**
```c
System.out.print( “Enter your middle initial > “ );
String initialS = scan.next( );
char initial = initialS.charAt( 0 );
```

**Reading a Whole Line**

- The next method will read only one word of String input because the space is a whitespace character.
- To read a whole line, including spaces, use the `nextLine`  method.

**Example**
```c
System.out.print( “Enter a sentence > “ );

String sentence = scan.nextLine( );
```

### static Methods

- Also called class methods 
- Can be called without instantiating an object
- Might provide some quick, one-time functionality; for example, popping up a dialog box, or executing a math function
- In method API, the keyword static precedes the return type

**Calling static Methods**

- Use the dot syntax with the class name instead of the object reference

*Syntax:*
```c
ClassName.methodName( argument list )
```

**Example:**
```c
int absValue =  Math.abs( -9 );
```

*abs is a static method of the Math class that returns the absolute value of the argument. (Here, the argument is -9, and the value 9 would be returned from the method and assigned to the variable absValue.)*

**static Class Variables**

*Syntax:*

`ClassName.staticVariable`

**Example:**
```c
Color.BLUE
```

BLUE is a static constant of the Color class.

### The System Class

- The System class is in the  **java.lang**  package, so it does not need to be imported.
- static constants of the System class
- **in** represents the standard input device (the keyboard by default). 
- **in** is an object of the **InputStream**  class
- **out** represents the standard output device (the Java console by default). 
- **out** is an object of the **PrintStream**  class

**Examples**
```c
Scanner scan = new Scanner( System.in );

System.out.println( “Hello” );
```

  

|Return type| Method name and argument list|
|--|--|
|`void`| `print( anyDataType argument )` : prints argument to the standard output device|
|`void`|`println( anyDataType argument )` : prints argument to the standard output device followed by a newline character|

**Example:**
```c
System.out.print( "The answer is " );

System.out.println( 3 );
```
*The output is: The answer is 3*

**The *toString* Method**

|Return type| Method name and argument list|
|--|--|
|`String`|`toString( )` : converts the object data to a String|

- All classes have a **toString** method. Its purpose is to return a String representing the data of the object.
- The **toString**  method is called automatically (implicitly) when an object reference is used with the print or println  methods.

**The exit Method**

|Return type| Method name and argument list|
|--|--|
|`void`|`exit( int exitStatus )` : static method that terminates the Java Virtual Machine. A value of 0 for exitStatus  indicates a normal termination. Any other values indicate abnormal termination and are used to signal that the program ended because an error occurred.|

- The static exit method can be useful to stop execution at a place other than the normal end of the program.

**Example:**
```c
System.exit( 0 );
```

### The Math Class

- The **Math** class provides static constants and static methods for performing common calculations.
- The **Math** class is in the **java.lang package**, so it does not need to be imported.

**The Math Class Constants**

- Two static constants
	- PI  - the value of pi
	- E  - the base of the natural logarithm


**Example:**
```c
System.out.println( Math.PI );

System.out.println( Math.E );
```

*The output is:*

*3.141592653589793*

*2.718281828459045*

  
**Methods of the Math Class**

|Return type|Method name and argument list| Explanation|
|--|--|--|
|dataTypeOfArg |`abs( dataType  arg)`|returns the absolute value of the argument arg, which can be a double, float, int or long.|
|`double`|`log( double a)`|returns the natural logarithm (in base e) of its argument.|
|`double`|`sqrt( double a)`|returns the positive square root of a|
|`double`|`pow( double base, double exp)`|returns the value of base raised to the power exp|
  |`long`|`round( double a)`|returns the closest integer to its argument a|
  |`dataTypeOfArgs`|`min( dataType a, dataType b)`|returns the smaller of the two arguments. The arguments can be doubles, floats, ints, or longs.|
  |`dataTypeOfArgs`|`max( dataType a, dataType b)`|returns the larger of the two arguments. The arguments can be doubles, floats, ints, or longs.|
  

- Rounding rules:
	- Any factional part  < .5  is rounded down
	- Any fractional part .5 and above is rounded up

- Find smallest of three numbers:
```c
int smaller = Math.min( num1, num2 );

int smallest = Math.min( smaller, num3 );
```
### The NumberFormat Class

- Like the DecimalFormat  class, the NumberFormat class can be used to format numeric values for output.
- The NumberFormat class provides factory methods for creating currency and percentage objects that use predefined formatting patterns.
- These static factory methods are called  instead of using instantiating an object using the new keyword.

 
Return| type Method name and argument list|
|--|--|
|NumberFormat| getCurrencyInstance( ): static method that creates a format object for printing numbers as money|
|NumberFormat| getPercentInstance( ) : static method that creates a format object for printing percentages|
|String|format( double number ): returns a formatted String representation of number|

### The Wrapper Classes

- “Wrap” the value of a primitive data type into an object
- Useful when methods require an object argument
- Also useful for converting Strings to an int or double

**Wrapper Classes**

  |Primitive Data Type| Wrapper Class|
  |--|--|
  |double|Double|
  |float|Float|
  |long|Long|
  |int|Integer|
  |short|Short|
  |byte|Byte|
  |char|Character|
  |boolean|Boolean|

**Autoboxing and Unboxing**

- **Autoboxing**

Automatic conversion between a primitive type and a wrapper object when a primitive type is used where an object is expected

`Integer intObject = 42;`

**Unboxing**

Automatic conversion between a wrapper object and a primitive data type when a wrapper object is used where a primitive data type is expected

`int fortyTwo = intObject;`

**Integer and Double Methods**

- static Integer Methods

|Return value|Method Name and argument list|Explanation|
|--|--|--|
|int|parseInt( String s )|  returns the _String s_ as an _int_ |
|Integer|valueOf( String s )|  returns the _String s_ as an _Integer_ object|

- static Double Methods

|Return value|Method Name and argument list| Explanation|
|--|--|--|
|double|parseDouble( String s )|  returns the _String s_ as a _double|_
|Double|valueOf( String s )| returns the _String s_ as a _Double_ object|

### Using Dialog Boxes

- **JOptionPane** class is in the **javax.swing** package
- static methods are provided for input and output dialog boxes
- For input dialog boxes, return value is a **String**, so numeric input needs to be converted (using **parseInt** or **parseDouble**)

**JOptionPane static Methods**

|Return value|Method name and argument list| Explanation |
|--|--|--|
|String|showInputDialog( Component  parent, Object prompt )|pops up an input dialog box, where prompt asks the user for input. |
|void|showMessageDialog( Component parent, Object message )|pops up an output dialog box with _message_ displayed |

**Reading Numeric Input**

- The showInputDialog method returns a String.
- To convert the String to a numeric type, use the wrapper class methods.

**Example:**
```c
String input = JOptionPane.showInputDialog( null, “Please enter your age in years” );
int age = Integer.parseInt( input );
```

## Object initialization: constructors

**Initializing objects**

- Currently it takes 3 lines to create a Point and initialize it:
```c
Point p = new Point();

p.x = 3;

p.y = 8; // tedious
```

- We'd rather specify the fields' initial values at the start:
```c
Point p = new Point(3, 8); // desired; doesn't work (yet)
```

- We are able to this with most types of objects in Java.

### Constructors

- constructor: Initializes the state of new objects.
```c
public classname(parameters)
{
statements;
}
```

- runs when the client uses the new keyword
- no return type is specified;  
- it implicitly "returns" the new object being created
- If a class has no constructor, Java gives it a default constructor with no parameters that sets all fields to 0.

**Example**

```c
public class Point 
{
	int x;
	int y;
// Constructs a Point at the given x/y location.
	public Point(int initialX, int initialY) 
	{
		x = initialX;
		y = initialY;
	}
}

public class Main 
{
	public static void main(String[] args) 
	{ 
		// create two Point objects
		Point p1 = new Point(5, 2);
		Point p2 = new Point(4, 3);
		// print each point
		System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
		System.out.println("p2: (" + p2.x + ", " + p2.y + ")");
		}
}
```
**Multiple constructors**

- A class can have multiple constructors.
- Each one must accept a unique set of parameters.

*Exercise: Write a Point constructor with no parameters that initializes the point to (0, 0).*

```c
// Constructs a new point at (0, 0).
public Point() 
{
	x = 0;
	y = 0;
}
```
**The toString method**

- Tells Java how to convert an object into a String
```c
Point p1 = new Point(7, 2);
System.out.println("p1: " + p1);
// the above code is really calling the following:
System.out.println("p1: " + p1.toString());
```
- Every class has a toString, even if it isn't in your code.
- Default: class's name @ object's memory address  (base 16) : Point@9e8c34

**toString syntax**
```c
public String toString() 
{
	code that returns a String representing this object;
}
```

- Method name, return, and parameters must match exactly.

**Example:**
```c
// Returns a String representing this Point.
public String toString() 
{
	return "(" + x + ", " + y + ")";
}
```

## Visibility

- Use visibility markers to signify who can access the information contained within a class.
	- **Private** visibility, denoted with a `- sign,` hides information from anything outside the class partition.
	- **Public** visibility, denoted with a `+ sign`, allows all other classes to view the marked information.
	- **Protected** visibility, denoted with a `# sign`, allows child classes to access the information they inherited from a parent class.

<img width="450" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/78b1ff34-04d3-4fd0-9cf4-935e3b5f06d9">













