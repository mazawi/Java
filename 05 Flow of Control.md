## 5.1 Flow of Control types
1. Sequential
2. Method (Function) calls
3. Selection 
4. Looping
## 5.2 Equality and Comparison Operations
<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml"
xmlns="http://www.w3.org/TR/REC-html40">

<head>


</head>

<body>
<!--StartFragment-->



Relationa   Operators | Meaning
-- | --
== | is   equal to
!= | is   not equal to
< | is   less than
<= | is   less than or equal to
\> | is   greater than
\>= | is   greater than or equal to


<!--EndFragment-->
</body>

</html>


## 5.3 Logical Operators

<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml"
xmlns="http://www.w3.org/TR/REC-html40">

<head>


</head>

<body>
<!--StartFragment-->



Logical   Operator | Type   (number of operands) | Meaning
-- | -- | --
! | Unary | NOT
&& | Binary | AND
\|\| | Binary | OR



<!--EndFragment-->
</body>

</html>

## 5.4 Truth Table

<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml"
xmlns="http://www.w3.org/TR/REC-html40">

<head>


</head>

<body>
<!--StartFragment-->



a | b | !a | a && b | a \|\| b
-- | -- | -- | -- | --
true | true | false | true | true
true | false | false | false | true
false | true | true | false | true
false | false | true | false | false



<!--EndFragment-->
</body>

</html>

## 5.5 _if_ Statement

* Used when the program should perform an operation for one set of data, but do nothing for all other data.
* if is used to check a specific condition whether it is True or False
* it allow the programme to execute the following code if the code is true and ignore it if the condition is false
* used when the execution of some code depends on some conditions

![image](https://github.com/mazawi/Teaching-Java/assets/45329653/7850aa28-ac08-4bf1-82ad-7989f1786294)

Example: check if a number is positive
```cpp
public class Main 
{
  public static void main(String[] args) 
  {
    int x = 5;
    if (x >  0)
    {
       System.out.println("Positive");
    }
  }
}
```
[Open the example here](https://github.com/mazawi/Teaching-Java/blob/main/CH_05_Flow_Control/CH_05_Flow_Control/IF_Ex1.java)
## 5.6 _if / _else Statements

![image](https://github.com/mazawi/Teaching-Java/assets/45329653/ba4b2ded-8db9-47c1-8225-ef40dc1f8d11)

## 5.7 _if / else if /_ else Statements


![image](https://github.com/mazawi/Teaching-Java/assets/45329653/aca74219-aba3-4f6f-ad18-18001c2736c1)


```cpp
public class Main 
{
  public static void main(String[] args) 
  {
    int x = 5;
    if (x >  0)
    {
       System.out.println("Positive");
    }
    else if (x < 0)
    {
       System.out.println("Negative");
    }
    else
    {
       System.out.println("Zero");
    }       
  }
}
```

Example
```cpp
//write a programme that prints the value of the numbers (1, 2, 3) in words

public class Main
{
	public static void main(String[] args) 
	{
	    int x = 4;
	    if (x ==1)
	    {
	        System.out.println("ONE");
	    }
	    else if (x == 2)
	    {
	        System.out.println("Two");
	    }
	    else if (x==3)
	    {
	        System.out.println("Three");
	    }
	    else
	    {
	        System.out.println("The number is out of range");
	    }
		
	}
}
```

## 5.8 _Switch - Case_ structure
* The "switch-case" statement in Java is used for decision-making and control flow.
* It's designed to select one of several code blocks to be executed based on the value of an expression.
* The expression inside the switch statement is usually an integral data type (e.g., int or char) or an enumerated type.
* The value of the expression is compared to various "case" values within the switch block.
* When a match is found between the expression's value and a "case" value, the corresponding block of code is executed.
* You can also include a "default" block to specify code that will run if no "case" matches the expression.
* Once a "case" is matched and executed, the program will continue to execute subsequent code unless a "break" statement is used to exit the switch block.

![image](https://github.com/mazawi/Teaching-Java/assets/45329653/10c13c9f-e99b-4b5e-ba22-705298b586ba)

**Example 1**
[Access the example here](https://github.com/mazawi/Teaching-Java/blob/main/CH_05_Flow_Control/CH_05_Flow_Control/Switch_Ex1.java)
```cpp
package CH_05_Flow_Control;

public class Switch_Ex1 
{
    public static void main(String[] args)
    {
        int day = 30;
        String dayName;

        switch (day) 
        {
        case 1:
        dayName = "Sunday";
        break;
        case 2:
        dayName = "Monday";
        break;
        case 3:
        dayName = "Tuesday";
        break;
        case 4:
        dayName = "Wednesday";
        break;
        case 5:
        dayName = "Thursday";
        break;
        case 6:
        dayName = "Friday";
        break;
        case 7:
        dayName = "Saturday";
        break;
    
        default:
        dayName = "Invalid Entry !!!";
        }

        System.out.println("Today is " + dayName);

    }
}

```

