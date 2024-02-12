# Multidimensional Arrays
## Two-Dimensional Arrays
- Allows organization of data in rows and columns in a table-like representation
Example:
Daily temperatures can be arranged as 52 weeks with 7 days each.

![image](https://github.com/mazawi/Teaching-Java/assets/45329653/e43d6a2d-ac2a-49a3-9aad-97eb34d092ef)

## Declaring Multidimensional Arrays
### Declaring a two-dimensional array:
```c 
datatype [][] arrayName;
```
or
```c
datatype [][] arrayName1, arrayName2, …;
```
### Declaring a three-dimensional array:

```
datatype [][][] arrayName;
```
or
```
datatype [][][] arrayName1, arrayName2, …;
```
**Examples:**
```c
double [][] dailyTemps, weeklyTemps;
Auto [][][] cars;
```
## Instantiating Multidimensional Arrays
### Instantiating a two-dimensional array:
```c
arrayName = new datatype [exp1][exp2];
```
- where exp1 and exp2 are expressions that  evaluate to integers and specify,  
respectively, the number of rows  and the number of columns in the  array.

**Example:**
```c
dailyTemps = new double [52][7];
```
- dailyTemps has 52 rows and 7 columns, for a total of 364 elements.
## Default Initial Values
- When an array is instantiated, the array elements are given standard default values, identical to the  default values of single-dimensional arrays:

| Array data type | Default value |
|--|--|
| byte, short, int, long|0|
|float, double|0.0|
|char|space|
|boolean|false|
|Any object reference (for example, a String)|null|

## Assigning Initial Values
```c
datatype [][] arrayName ={  
							{ value00, value01, … }, 
							{ value10, value11, …},  … 
							};
```
- where valueMN is an expression that  evaluates to the data type of the array   and is the value to assign to the element  at row M and column N.
- The number of sublists is the number of rows in the array.
- The number of values in each sublist determines the number of columns in that row.
- Thus, a two-dimensional array can have a different number of columns in each row.
**Assigning Initial Values Example**
```c
int [][] numbersList1 = {
							{ 0, 5, 10 },
							{ 0, 3, 6, 9 } 
										};
```

![image](https://github.com/mazawi/Teaching-Java/assets/45329653/8a046443-fa6d-4b1a-839a-10e7dc1f6d6c)

- As the preceding figure illustrates, a two-dimensional array is an array of arrays.
- The first dimension of a two-dimensional array is an array of array references, with each reference pointing to a single-dimensional array.
- Thus, a two-dimensional array is comprised of an array of rows, where each row is a single-dimensional array.
## Instantiating Arrays with  Different Length Rows
- To instantiate a two-dimensional array whose rows have a different number of columns:
1. instantiate the two-dimensional array
2. instantiate each row as a single-dimensional array
```c
//instantiate the array with 3 rows
char [][] grades = new char [3][];
// instantiate each row
grades[0] = new char [23];  // instantiate row 0
grades[1] = new char [16];  // instantiate row 1
grades[2] = new char [12];  // instantiate row 2
```
## Accessing Array Elements
- Elements of a two-dimensional array are accessed using this syntax:
```c
arrayName[exp1][exp2]
```
- exp1 is the element's row index
	- row index of  first row: 0
	- row index of last row: number of rows - 1
- exp2 is the element's column index
	- column index of first column: 0
	- column index of last column: number of columns in that row - 1

## The Length of the Array
- The number of rows in a two-dimensional array is:
```c
arrayName.length
```
- The number of columns in row n in a two-dimensional array is:
```c
arrayName[n].length
```
## Accessing Two-Dimensional  Array Elements

  |Array element| Syntax |
|--|--|
|Row 0, column j|`arrayName[0][j]`|
|Row i, column j|`arrayName[i][j]`|
|Last row, column j|`arrayName[arrayName.length – 1][j]`|
|Last row, last column|`arrayName[arrayName.length – 1][arrayName[arrayName.length -1].length – 1]`|
|Number of rows|`arrayName.length`|
|Number of columns in row i |`arrayName[i].length`|

 **Example: Family Cell Bills**

*We want to analyse three months of cell phone bills for a family of four:*

<img width="469" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/442c7cf2-cacc-48e0-ab24-e558ca0fe2dd">


## Aggregate Array Operations

*To process all array elements in row order, we use a nested for loop:*

```java
for ( int i = 0; i < arrayName.length; i++ )
	{
	for ( int j = 0; j < arrayName[i].length; j++ )
		{
			// process element arrayName[i][j]
		}
	}
```

- The outer loop processes the rows.
- The inner loop processes the columns within each row.


## Processing a Given Row

- If we want to find the maximum bill for a particular month or the total bills for a month, we need to process just one row.
- To process just row i, we use this standard form:
```java
for ( int j = 0; j < arrayName[i].length; j++ )
	{
	// process element arrayName[i][j]
	}
```
## Processing a Given Column

If we want to determine the highest cell bill for one person, we need to process just one column.
To process just column j, we use this standard form:
```c
for ( int i = 0; i < arrayName.length; i++ )
	{
	if ( j < arrayName[i].length )
	// process element arrayName[i][j]
	}
```

Note: Because rows have variable lengths, we must verify that the current row has a column j before attempting to process the element.

## Processing One Row at a Time

If we want to determine the total of the cell bills for each month, we need to process all rows, calculating a total at the end of each row.

We use this standard form:
```c
for ( int i = 0; i < arrayName.length; i++ )
	{
		// initialize processing variables for row i
		for ( int j = 0; j < arrayName[i].length; j++ )
		{
			// process element arrayName[i][j]
		} // end inner for loop
	// finish the processing of row i
	} // end outer for loop
```
## Processing a Column at a Time

Suppose we want to store test grades for three courses. Each course has a different number of tests, so each row has a different number of columns:
```c
	int [][] grades = { { 89, 75 },
						{ 84, 76, 92, 96 },
						{ 80, 88, 95 } };
```

- First, we need to find the number of columns in the largest row. We use that in our loop condition.
- Then, before attempting to process the array element, we check whether the given column exists in the current row.
- We have stored the maximum number of columns in maxNumberOfColumns; the general pattern for processing elements one column at a time is:
```c
for ( int j = 0; j < maxNumberOfColumns; j++ )
	{
		for ( int i = 0; i < arrayName.length; i++ )
			{
				// does column j exist in this row?
				if ( j < arrayName[i].length )
				{
					// process element arrayName[i][j]
				}
			}
		}
```
## Other Multidimensional Arrays

If we want to keep track of sales on a per-year, per-week, and per-day basis, we could use a three-dimensional array:
- 1st dimension:  year
- 2nd dimension:  week
- 3rd dimension:  day of the week

**Example**

```c
// declare a three-dimensional array

double [][][] sales;

// instantiate the array for 10 years, 52 weeks,

//  and 7 days

sales = new double [10][52][7];

// set the value of the first element

sales[0][0][0] = 638.50;

// set the value for year 4, week 22, day 3

sales [4][22][3] = 928.20;

// set the last value in the array

sales [9][51][6] = 1234.90;
```
### Structure of an n-Dimensional Array

| Dimension | Array Element |
|--|--|
| first|`arrayName[i1]` is an (n-1)-dimensional array|
|second|`arrayName[i1][i2]` is an (n-2)-dimensional array|
|k<sup>th</sup>| `arrayName[i1][i2][i3][..][ik]` is an (n-k)-dimensional array|
|(n-1)<sup>th</sup>|`arrayName[i1][i2][i3][..][in-1]` is a single-dimensional array|
|n<sup>th</sup>|`arrayName[i1][i2][i3][..][in-1][in]` is an array element|

### General Pattern for Processing a Three-Dimensional Array
```c
for ( int i = 0; i < arrayName.length; i++ )
	{
	for ( int j = 0; j < arrayName[i].length; j++ )
		{
			for ( int k = 0; k < arrayName[i][j].length; k++ )
			{
				// process the element arrayName[i][j][k]
			}
		}
	}
```

### Code to Print the sales Array
```c
for ( int i = 0; i < sales.length; i++ )
	{
		for ( int j = 0; j < sales[i].length; j++ )
			{
				for ( int k = 0; k < sales[i][j].length; k++ )
					{
						// print the element at sales[i][j][k]
						System.out.print( sales[i][j][k] + "\t" );
					}
					// skip a line after each week
					System.out.println( );
				}
				// skip a line after each month
				System.out.println( );
			}
```
## A Four-Dimensional Array
If we want to keep track of sales on a per-state, per-year, per-week, and per-day basis, we could use a four-dimensional array:

- 1st dimension:  state
- 2nd dimension:  year
- 3rd dimension:  week
- 4th dimension:  day of the week
```c
double[][][][] sales = new double [50][10][52][7];
```

### General Pattern for Processing a Four-Dimensional Array

```c
for ( int i = 0; i < arrayName.length; i++ )
	{

	for ( int j = 0; j < arrayName[i].length; j++ )

	{

		for ( int k = 0; k < arrayName[i][j].length; k++ )

		{

			for ( int l = 0; l < arrayName[i][j][k].length; l++ )

			{

				// process element arrayName[i][j][k][l]

			}

		}

	}

}
```

## The *ArrayList* Class

- Arrays have a fixed size once they have been instantiated.
- What if we don't know how many elements we will need? For example, 
-- if we are reading values from a file 
-- returning search results
- We could create a very large array, but then we waste space for all unused elements.
- A better idea is to use an ***ArrayList***, which stores elements of object references and automatically expands its size, as needed.
- The ArrayList class is in the package: ***java.util***
- All ArrayList  elements are object references, so  we could have an ArrayList  of Auto objects, Book objects, Strings, etc.
- To store primitive types in an ArrayList, use the wrapper classes (Integer, Double, Character, Boolean, etc.)
- The ArrayList  is a generic class. The ArrayList  class has been written so that it can store object references of any type specified by the client.

**Declaring an ArrayList**

*Use this syntax:*
`ArrayList<E> arrayListName;`

- E is a class name that specifies the type of object references that will be stored in the ArrayList.

**Example:**

`ArrayList<String> listOfStrings;`

`ArrayList<Auto> listOfCars;`

`ArrayList<Integer> listOfInts;`

**ArrayList Constructors**

|Constructor name and argument list||
|--|--|
|ArrayList<E> |constructs an ArrayList  object of type E with an initial capacity of 10|
|ArrayList<E>( int initialCapacity )|constructs an ArrayList  object of type E with the specified initial capacity|

- The capacity of an ArrayList is the total number of elements allocated to the list.
- The size of an an ArrayList is the number of elements that are used.

**Instantiating an ArrayList**

- This list has a capacity of 10 Astronaut references, but a size of 0.
```c
ArrayList<Astronaut> listOfAstronauts =

new ArrayList<Astronaut>( );
```
- This list has a capacity of 5 Strings, but a size of 0.
```
ArrayList<String> listOfStrings =

new ArrayList<String>( 5 );
```
## ArrayList Methods

|Return value  | Method name and argument list |Functionality|
|--|--|--|
|boolean| `add( E element)`| appends element to the end of the list|
|void| `clear( )`  |removes all the elements in the list|
|int| `size( )`  | returns the number of elements in the list|
|E| `remove( int index )`|removes the element at the specified index position|
|E|`get( int index )`|returns the element at the specified index position; the element is not removed from the list.|
|E|`set( int index, E element )`|replaces the element at the specified index position with the specified element|
|void| `trimToSize( )`|sets the capacity of the list to its current size|

## Processing Array Lists

**Using a standard for loop:**
```c
ClassName  currentObject;
{
	for ( int i = 0; i < arrayListName.size( ); i++ )
	{
		currentObject = arrayListName.get( i );
		// process currentObject
	}
}
```

**Example:**

*Auto currentAuto;*

```c
for ( int i = 0; i < listOfAutos.size( ); i++ )
	{
		currentAuto = listOfAutos.get( i );
		// process currentAuto
	}
```
### The Enhanced for Loop

**Simplifies processing of lists**

The standard form is:
```c
for ( ClassName  currentObject : arrayListName )
{
// process currentObject
}
```

- This enhanced for loop prints all elements of an ArrayList  of Strings named list:

```
for ( String s : list )

{

System.out.println( s );

}
```


# Case Studies
### Basic Operations on 2D array (Declaration of an array and printing its elements)
1- Declaring array

***Example**

Please refer to [Ex01.java](https://github.com/mazawi/Teaching-Java/blob/main/06%20Multidimensional%20Arrays/Code/Ex01.java)

- The following code defines an array with 5 rows and 5 columns and of type of integer
```c
// Define and initialize a 2D array with numbers
        int[][] array2D = 
        {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
```

2- Printing the elements of the array

```c
for (int i = 0; i < 5; i++)  // Rows
        {
            for (int j = 0; j < 5; j++) // Columns
            {
                System.out.print(array2D[i][j] + "\t"); // process each element
            }
            System.out.println(); // Leave a blank line between rows
        }
```

- The full programme is given belwo and you can find it in the folder Code by the name of Ex01.java

```c
/* Programme to defind a 5X5 array and prints the array */

public class Ex01 
{

    public static void main(String[] args) {
        // Define and initialize a 2D array with numbers
        int[][] array2D = 
        {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        // Print the 2D array
        
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
```

### Elements above diagonal, below diagonla, and on the diagonal

Refer to [Ex02.java](https://github.com/mazawi/Teaching-Java/blob/main/06%20Multidimensional%20Arrays/Code/Ex02.java) in the Code folder 

**1- Elements above diagonal are identified when the row indices is smaller than the column indices**

```c
for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (i<j)
                {
                    System.out.print(array2D[i][j] + "is above the diagonal");

                }
                
            }
            System.out.println();
        }
```
**2- Elements on the diagonal are identified when the row indices are equal to column indices**

```c
for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (i==j)
                {
                    System.out.print(array2D[i][j] + "is on the diagonal");

                }
                
            }
            System.out.println();
        }
```

**3- Elements below diagonal are identified when the row indices is larger than the column indices**

```c
for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (i>j)
                {
                    System.out.print(array2D[i][j] + "is below the diagonal");

                }
                
            }
            System.out.println();
        }
```






