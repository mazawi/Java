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

