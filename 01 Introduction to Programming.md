# 1 Introduction to Programming
## 1.1 What is programming
* Programming involves creating applications such as ticketing kiosks, games, restaurant ordering systems, and various other business applications.
* It is considered a scientific discipline, where logic and algorithms are used to solve real-world problems.
* Many techniques and programming languages have been developed for accomplishing fundamental programming tasks, catering to a wide range of application domains.
* Software engineering practices play a crucial role in ensuring that programs are correct, reliable, and maintainable over time.
* Programming is not just about science; it is also a creative endeavor, as programmers design innovative solutions to unique challenges.
* Programmers have the opportunity to tackle complex problems and devise efficient and elegant solutions, making programming a problem-solving activity.
## 1.2 Programming languages 
### Machine language
* Machine language is the lowest-level programming language understood directly by a computer's central processing unit (CPU).
* It consists of binary code or hexadecimal instructions that represent specific operations, such as arithmetic calculations and memory manipulations.
* Each computer architecture has its own unique machine language, tailored to its CPU design.
* Machine language instructions are executed very quickly by the CPU, making it the most efficient form of programming.
* Programmers rarely write code directly in machine language due to its complexity and lack of human-friendliness.
* Instead, higher-level programming languages like C, C++, and Java are used, and compilers or assemblers convert their code into machine language.
* Machine language instructions typically include operations like load, store, add, subtract, jump, and compare.
* Understanding and programming in machine language requires deep knowledge of a specific CPU's instruction set and memory architecture.
### Assembly language
* Assembly language is a low-level programming language that is a step above machine language.
* It uses mnemonic codes and symbols to represent machine instructions, making it more human-readable than pure machine language.
* Each assembly language is specific to a particular computer architecture or CPU, as it directly corresponds to the CPU's instruction set.
* Programmers write code in assembly language to interact with a computer's hardware and control its operations at a detailed level.
* Assembly language provides a bridge between high-level programming languages and machine language, allowing for more human-friendly programming while still offering fine-grained control.
* Assembly programs are translated into machine language through an assembler, which generates binary machine code.
* Programmers use assembly language for tasks that require precise control over hardware, such as writing device drivers, firmware, or optimizing critical sections of code.
* Assembly language programming requires a deep understanding of the specific CPU's architecture, instruction set, and memory layout.
* Debugging and maintaining assembly code can be challenging due to its low-level nature, but it can result in highly efficient and optimized programs.
### High-level languages
* High-level programming languages are designed to be more human-readable and user-friendly than low-level languages like assembly or machine code.
* They use English-like keywords and syntax that abstract away the underlying hardware details, making programming more accessible.
* High-level languages include popular languages like Python, Java, C++, and JavaScript, among others.
* Programmers write code in high-level languages to solve complex problems and build a wide range of applications, from web applications to scientific simulations.
* High-level languages are platform-independent, allowing code to run on different computer architectures with minimal modification, thanks to compilers or interpreters.
* These languages offer a wide variety of built-in functions and libraries that simplify common tasks, reducing development time.
* Debugging and maintenance of code written in high-level languages are typically easier compared to low-level languages, thanks to their abstraction.
* High-level languages support features like object-oriented programming, which helps organize code and promote code reusability.
* They often come with strong community support, extensive documentation, and a wealth of third-party libraries, making development more efficient.
## 1.3 Problem solving
### Problem-Solving Approach:
* The key to effective problem-solving is guiding your thought process.
Continuously asking "What if we did it this way?" is a valuable approach to explore different solutions.
* Exploring various ways to solve a problem is essential for finding the most optimal solution.
### Understanding the Problem:
* Understanding the problem thoroughly is a crucial first step in problem-solving.
* To achieve a complete understanding, consider:
* Identifying the inputs required for the problem.
* Determining the expected outputs.
* Establishing the correct sequence of instructions.
* Identifying decision points within the problem.
* Recognizing any repeating patterns or areas in the problem.
### Designing an Algorithm:
* An algorithm is a step-by-step sequence of instructions used to accomplish a specific task.
* Algorithms can be presented in different formats, including:
   * Structured code, often represented using pseudocode.
   * Flowcharts, which provide a visual representation of the algorithm's logic.
### 1.3.1 Pseudocode
#### Pseudocode Overview:
* Pseudocode is a high-level description of an algorithm that uses a mix of human-readable language and basic programming constructs.
* It is used to outline the logic of a program or algorithm before actual coding begins.
* Pseudocode is not tied to any specific programming language and is a useful tool for planning and communication in software development.
* Pseudocode is meant to be readable and understandable by both programmers and non-programmers.
* It provides a high-level view of the algorithm's logic without getting into specific syntax or implementation details.
* Pseudocode allows for easy collaboration and planning during the initial stages of software development.
* It is a valuable tool for breaking down complex problems into smaller, manageable steps before coding.
#### Pseudocode Examples:
```c
Input two numbers, num1 and num2
Initialize a variable sum to 0
Add num1 to sum
Add num2 to sum
Output sum
```
### 1.3.2 FLow chart
#### Overview:
* A flowchart is a graphical representation of a process or algorithm using symbols and connecting arrows.
* It provides a visual way to depict the flow of control and data within a program.
* Flowcharts are used for planning, designing, and documenting algorithms and processes.
### Flowchart Symbols:
<img width="565" alt="image" src="https://github.com/mazawi/Teaching-Java/assets/45329653/6b2371ad-f361-4f68-b413-16634d9d36aa">

* Start/End Symbol: Represents the beginning and end of a process or algorithm.
* Process Symbol: Depicts an operation or action to be performed.
* Input/Output Symbol: Signifies data input or output.
* Decision Symbol (Diamond): Represents a decision or branching point in the flow.
* Connector Symbol (Circle): Indicates a point where the flowchart connects to another part of the chart.
* Flow Arrows: Arrows connecting symbols show the flow of control or data.
## 1.4 What is Java
* Combination of compiler and interpreter
* The compiler converts source code into byte codes (an instruction set for a virtual, machine-independent processor) 
* At run time, the Java Virtual Machine (JVM) interprets the byte codes and converts them into the machine language for the platform on which the program is running.
* Created by Sun Microsystems in 1995
* Syntax is based on C++
* Object-oriented
* Supports Internet applications
* Provides an extensive library of prewritten classes
* Is portable among platforms
* Has built-in networking
### Applet:
* An Applet is a Java program that runs in a web browser.
* It is a small Java application that is embedded within an HTML page.
* Applets are primarily used for creating dynamic and interactive web content.
* They follow the applet lifecycle, including methods like init(), start(), stop(), and destroy().
* Applets have limited access to the system and are mainly used for client-side processing.
### Servlet:
* A Servlet is a Java program that runs on the server side.
* Servlets are used for processing requests and generating responses in a web application.
* They extend the javax.servlet.Servlet interface and handle HTTP requests and responses.
* Servlets are highly scalable and can handle multiple requests concurrently.
* They are typically part of a Java web application, often packaged in a WAR (Web Application Archive) file.
### Application in Java:
* A Java Application is a standalone program written in Java.
It is not embedded in a web browser or part of a web application.
* Java applications are typically started with a main method.
* They can perform various tasks, from simple command-line utilities to complex desktop applications.
* Java applications have access to the full range of Java libraries and can interact with the system and user interface.
## 1.5 Object-Oriented Programming (OOP)
### OOP Overview:
* Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, which are instances of classes.
* It emphasizes the modeling of real-world entities and their interactions in code.
* OOP is based on four core principles: encapsulation, inheritance, polymorphism, and abstraction.
### Key OOP Concepts:
* Classes: Blueprint or template for creating objects. Define attributes (data) and methods (functions) for objects.
* Objects: Instances of classes that encapsulate both data (attributes) and behaviours (methods).
* Encapsulation: The practice of hiding the internal details of an object and exposing only what's necessary through well-defined interfaces.
* Inheritance: A mechanism that allows a new class (subclass or derived class) to inherit properties and behaviors from an existing class (superclass or base class).
* Polymorphism: The ability for different classes to be treated as instances of a common base class, enabling flexibility and extensibility in code.
* Abstraction: Simplifying complex systems by modeling them with a focus on the essential properties and behaviors, while hiding unnecessary details.
### Benefits of OOP:
* Modularity: OOP promotes modular code, making it easier to understand, maintain, and reuse.
* Code Reusability: Inheritance and polymorphism enable the reuse of code and the creation of hierarchical class structures.
* Flexibility: OOP supports dynamic and flexible coding through polymorphism and encapsulation.
* Scalability: OOP facilitates the creation of large and complex systems by breaking them down into manageable objects and classes.
### Examples of OOP Languages:
* Java, C++, Python, C#, and Ruby are popular programming languages that support OOP.
* Each of these languages provides syntax and features for creating and working with objects and classes.
### Applications of OOP:
* OOP is widely used in software development for building applications, games, web services, and more.
* It is particularly well-suited for modeling complex systems with a clear and organized structure.
## 1.6 Programming Basics
* Programming is translating a problem into ordered steps consisting of operations a computer can perform:
    * Input
    * Perform calculations
    * Compare values
    * Move data
    * Output
 * The order of execution of instructions is called the flow of control 
## 1.7 Types of Flow of Control
### 1 Sequential Processing
Execute instructions in order
#### Example
The pseudocode for calculating the sum of two numbers would look like this:
```c
	read first number
	read second number
	set total to (first number +second number)
  output total
```
### 2 Method Call
Jump to code in method, then return
Calling the method executes the method
Methods can take arguments (data to use) and return values
#### Example
Here is pseudocode for calculating the square root of an integer:
```c 
read an integer
 call the square root method,  passing the integer and receiving the square root
output the square root
```
### 3 Selection
Choose code to execute based on data value
#### Example
The pseudocode for determining if a number is positive or negative is:
```c 
 read a number
	if the number is greater thanor equal to 0
	  write "Number is positive."
  else
	  write "Number is negative." 
```
### 4 Looping or Iteration
Repeat operations for multiple data values
#### Example
The pseudocode for finding the sum of a set of numbers is:
```c
 set total to 0
 read a number
 while there was a number to  read,
	 add number to total
	 read the next number
 write total
```
# Important points to consider
* Java is case-sensitive. 
* The source file must be saved with the same name as the class name with a .java extension.
* The class name and the source filename must match exactly, including capitalization. 
# Error Types
## Compiler errors
* Found by the compiler
* Usually caused by incorrect syntax or spelling
## Run-time errors
* Reported by the JVM
* Usually caused by incorrect use of prewritten classes or invalid data
## Logic errors
* Found by testing the program
* Incorrect program design or incorrect execution of the design
# Exercises
## Exercise 1: Programming Concepts

Explain the difference between machine language and high-level programming languages. Provide examples of each.

## Exercise 2: Problem Solving and Algorithms

Describe the key steps involved in the problem-solving approach. How does designing an algorithm contribute to solving a problem?

## Exercise 3: Pseudocode and Flowcharts

Create pseudocode for a program that calculates the average of three numbers and outputs the result. Then, represent the same logic using a flowchart.

## Exercise 4: Introduction to Java

Explain the combination of compiler and interpreter in Java. What is the role of the Java Virtual Machine (JVM) in the execution of Java programs?

## Exercise 5: Object-Oriented Programming (OOP)

Define the four core principles of Object-Oriented Programming (OOP). Provide an example of how these principles are applied in Java.

## Multiple-Choice Questions
Question 1: What is the primary purpose of machine language in programming?
* a) Human readability 
* b) High-level abstraction
* c) Directly understood by the CPU
* d) Platform independence

Question 2: Which programming language is considered a low-level language that uses mnemonic codes and symbols, making it more human-readable than machine language?
* a) Python
* b) Assembly language
* c) Java
* d) C++

Question 3:
What is the primary role of the Java Virtual Machine (JVM) in Java programming?

* a) Converts source code into machine language
* b) Executes machine code directly
* c) Interprets byte codes and converts them into machine language
* d) Provides platform independence through abstraction

Question 4:
What is the key benefit of high-level programming languages over low-level languages like machine or assembly language?

* a) More efficient execution
* b) Better hardware control
* c) Human readability and abstraction
* d) Platform-specific code

Question 5:
What is the purpose of pseudocode in software development?

* a) Executable code for a specific programming language
* b) A visual representation of a process
* c) A high-level description of an algorithm
* d) Platform-specific code

Question 6:
Which flow of control involves repeating operations for multiple data values?

* a) Sequential processing
* b) Method call
* c) Selection
* d) Looping or iteration




