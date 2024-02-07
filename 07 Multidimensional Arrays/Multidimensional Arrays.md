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
