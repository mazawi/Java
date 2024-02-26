# Arrays
 - An  array is a sequence of variables of the same data type.
 - Arrays are useful for many applications, including calculating statistics or representing the state of a game.
 - The data type can be any of Java's primitive types (int, short, byte, long, float, double, boolean, char), an array, or a class.
 - Each variable in the array is an element.
 - We use an index to specify the position of each element in the array.
## Declaring and Instantiating Arrays
 - Arrays are objects, so creating an array requires two steps:
1. declaring a reference to the array
2. instantiating the array 
- To declare a reference to the array, use this syntax:
```java
datatype [] arrayName;
```
- To instantiate an array, use this syntax:
```java
arrayName = new datatype[ size ];
```
- where size is an expression that evaluates  to an integer and specifies the number of  elements.
**Examples**

- Declaring arrays:

```java
double [] dailyTemps; // elements are doubles

String [] cdTracks;  // elements are Strings

boolean [] answers;  // elements are booleans

Auto [] cars;  // elements are Auto references

int [] cs101, bio201; // two integer arrays
```

- Instantiating these arrays:

```java
dailyTemps = new double[365];  // 365 elements

cdTracks = new String[15];  // 15 elements

int  numberOfQuestions = 30;

answers = new boolean[numberOfQuestions];

cars = new Auto[3];  // 3 elements

cs101 =  new int[5];  // 5 elements

bio201 = new int[4];  // 4 elements
```
- Combining the Declaration and  Instantiation of Arrays

*Syntax:*
```java
datatype [] arrayName = new datatype[size];
```

*Examples:*
```java
double [] dailyTemps = new double[365];

String [] cdTracks = new String[15];

int  numberOfQuestions = 30;

boolean [] answers = new boolean[numberOfQuestions];

Auto [] cars = new Auto[3];

int [] cs101 = new int[5], bio201 = new int[4];
```

## Assigning Initial Values to Arrays

- Arrays can be instantiated by specifying a list of initial values.

*Syntax:*
```java
datatype [] arrayName =  { value0, value1, … };
```
- where value `N` is an expression evaluating to  the data type of the array and is the value to assign to the element at index `N`.

**Examples:**
```java
int nine = 9;

int [] oddNumbers = { 1, 3, 5, 7, nine, nine + 2, 13, 15, 17, 19 };

Auto sportsCar = new Auto( "Ferrari", 0, 0.0 );

Auto [] cars = { sportsCar, new Auto( ), new Auto("BMW", 100, 15.0 ) };
```
- An initialization list can be given only when the array is declared.
- Attempting to assign values to an array using an initialization list after the array is instantiated will generate a compiler error.
- The new keyword is not used when an array is instantiated using an initialization list. Also, no size is specified for the array; the number of values in the initialization list determines the size of the array.

## Accessing Array Elements
•To access an element of an array, use this syntax:
```c
arrayName[exp]
```
- where exp is an expression that  evaluates to an integer.
- exp is the element's index -- its position within the array.
- The index of the first element in an array is 0.
- length is a public, read-only integer instance variable that holds the number of elements in the array and is accessed using this syntax:
```c
arrayName.length
```

- Attempting to access an element of an array using an index less than 0 or greater than arrayName.length – 1 will generate an `ArrayIndexOutOfBoundsException`  at run time.
- Note that for an array, length – without parentheses – is an instance variable, whereas for Strings, length( ) – with parentheses – is a method.
- Note also that the array's instance variable is named length, rather than size.

## Accessing Array Elements
  
|Element|Syntax|
|--|--|
|Element 0|`arrayName[0]`|
|Element i|`arrayName[i]`|
|Last element|`arrayName[arrayName.length - 1]`|

## Instantiating an Array of Objects

- To instantiate an array with a class data type:
1. instantiate the array
-- (elements are object references, initialized to null)
2. instantiate the objects

**Example:**
```java
// instantiate array; all elements are null

Auto [] cars = new Auto[3];

// instantiate objects and assign to elements

Auto sportsCar = new Auto( "Miata", 100, 5.0 );

cars[0] = sportsCar;

cars[1] = new Auto( );

// cars[2] is still null
```

## Aggregate Array Operations

- We can perform the same operations on arrays as we do on a series of input values:
	- calculate the total of all values
	- count values meeting specified criteria
	- find the average value
	- find a minimum or maximum value, etc.

To perform an operation on all elements in an array, we use a `for` loop to perform the operation on each element in turn.
### Standard `for` Loop Header  for Array Operations
```c
for ( int  i = 0; i < arrayName.length; i++ )
```
- initialization statement `( int  i = 0 )` creates index i and sets it to the first element `( 0 )`
- loop condition `( i < arrayName.length  )` continues execution until the end of the array is reached
- loop update `( i++)` increments the index to the next element, so that we process each element in order
- Inside the for loop, we reference the current element as: `arrayName[i]`
## Printing All Elements of an Array

**Example**

- This code prints each element in an array named cellBills, one element per line  (assuming that cellBills  has been instantiated):
```c
for ( int  i = 0; i < cellBills.length; i++ )
	{
		System.out.println( cellBills[i] );
	}
```

## Reading Data Into an Array

**Example**

- This code reads values from the user into an array named cellBills, which has previously been instantiated:
```c
Scanner scan = new Scanner( System.in );

for ( int  i = 0; i < cellBills.length; i++ )
	{
		System.out.print( "Enter bill > "  );
		cellBills[i] = scan.nextDouble( );
	}
```

## Calculating a Total
- This code calculates the total value of all elements in an array named cellBills, which has previously been instantiated:
```java
double total = 0.0; // initialize total
for ( int  i = 0; i < cellBills.length; i++ )
	{
		total += cellBills[i];
	}
System.out.println( "The total is " + total );
```
## Finding Maximum/Minimum Values
- This code finds the maximum value in an array named cellBills:
```c
// make first element the current maximum

double maxValue = cellBills[0];

// start for loop at element 1

for ( int  i = 1; i < cellBills.length; i++ )
{ 
	if ( cellBills[i] > maxValue )
	maxValue = cellBills[i];
}
System.out.println( "The maximum is " +  maxValue );
```
## Copying Arrays

- Suppose we want to copy the elements of an array to another array, we could try the following code:
```c
double [] billsBackup = new double [6];

billsBackup = cellBills; // incorrect!
```
- Although this code compiles, it is logically incorrect! We are copying the cellBills object reference to the billsBackup object reference. We are not copying the array data.

### Copying Array References
- The result of the code from the previous slide:
```c
billsBackup = cellBills;
```
has this effect. Both references point to the same array.

![image](https://github.com/mazawi/Teaching-Java/assets/45329653/23c1ef0f-6c4c-4e5d-a176-3a38e08c96bd)

### Copying Array Values
- This code copies the values of all elements in an array named `cellBills`  to an array named `billsBackup`,  both of  which have previously been instantiated with the same length:
```c
for ( int  i = 0; i < cellBills.length; i++ )
{
	billsBackup[i] = cellBills[i];
}
```
- The effect of this for loop is shown on the next slide.


![image](https://github.com/mazawi/Teaching-Java/assets/45329653/6ad05d7b-2471-4e5e-9c50-8e96f7122a7c)


## Changing an Array's Size

An array's length instance variable is constant
- that is, arrays are assigned a constant size when they are instantiated
- To expand an array while maintaining its original values:
1. Instantiate an array with the new size and a  temporary name
2. Copy the original elements to the new array
3. Point the original array reference to the new array
4. Assign a null value to the temporary array reference

**This code expands the size of the cellBills array from 6 elements to 12 elements:**
```c
//instantiate new array with a temporary name

double [] temp = new double [12];

// copy all elements from cellBills to temp

for ( int  i = 0; i < cellBills.length; i++ )
{
	temp[i] = cellBills[i]; // copy each element
}

// point cellBills to new array

cellBills = temp;

temp = null;  // assign null to temp reference
```

## Comparing Arrays for Equality

- To compare whether the elements of two arrays are equal:
	1. Determine if both arrays have the same length
	2. Compare each element in the first array with the corresponding element in the second array
- To do this, we'll use a `flag` variable and a `for` loop.
```c
boolean  isEqual = true; // flag variable

if ( cellBills1.length != cellBills2.length )
	isEqual = false; // sizes are different
else
{
	for ( int  i = 0; i < cellBills1.length && isEqual; i++ )
	{ 
		if ( Math.abs( cellBills1[i] - cellBills2[i] )  > 0.001 )
			isEqual = false; // elements are not equal
	}
}
```


