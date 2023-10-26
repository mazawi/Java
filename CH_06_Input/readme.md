* In Java, you can read input from various sources, such as the keyboard, files, or other input devices.

* The standard way to read input from the keyboard is to use the Scanner class, which is part of the java.util package.

* To use Scanner, you need to import it at the beginning of your Java program like this:

```cpp
import java.util.Scanner;
```
* To read input from the keyboard, you create an instance of the Scanner class, typically like this:
```cpp
Scanner scanner = new Scanner(System.in);
```
* You can then use the Scanner object to read various types of input, such as integers, floating-point numbers, strings, and more.

Here's an example of reading an integer from the user:

```cpp
System.out.print("Enter an integer: ");
int number = scanner.nextInt();
```
* To read a string from the user, you can use:

```cpp
System.out.print("Enter a string: ");
String inputString = scanner.next();
```
* After reading input, it's good practice to close the Scanner to release system resources:
```cpp
scanner.close();
```
* You can handle exceptions, such as InputMismatchException or NoSuchElementException, when dealing with input to ensure your program doesn't crash due to unexpected input.

* When reading from files or other sources, you'll use different classes, such as FileInputStream and BufferedReader, to handle input.

## Exercises
### Ex1:
Write a programme that reads two numbers and finds the sume of these numbers
