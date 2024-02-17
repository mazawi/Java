# Java Programme Structure
## Packages
- if you develop an application that needs more than one classes, it is good practice to create a folder that contains all the classes 
- The folder which contains all the classes is known as package and all the files which consists the classes should have the following keyword at the top
```c
package NAME_OF_THE_FOLDER;
```

- To ease the work, write each class in a separate file which have the same class name with .java extention
- Remember that the file name should have the same class name, e.g. 

```c
// The folloaing class should be saved in file with name Ex01.java


public class Ex01 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to COMP112");
        
    }
    
}
```

**Example:**
- The following Example consists of a folder that contains 3 classes 

    - Package name Package
    - 3 Classes as follows:
    
        - Class1
        - Class2
        - Class3
     
<img width="401" alt="Screenshot 2024-02-18 at 00 48 58" src="https://github.com/mazawi/Teaching-Java/assets/45329653/547c0413-9e57-4940-9581-f7b31f88a891">


**Example**
Construct an application that has a package by the name **MyPackage** which contains 3 classes: **MyClass1**,  **MyClass2**, and **MainClass**

**IMPORTANT:**
- **At least one Class should contain the main function (Method)**
- **Java Programmes start executing from the main function (Method)**

**MyClass1.java code**

```c
package MyPackage;

public class MyClass1 
{
    // Code and methods
    
}
```
**MyClass2.java code**

```c
package MyPackage;

public class MyClass2 
{
    // Code and methods
    
}
```

**MainClass.java code**
```c
package MyPackage;

public class MainClass 
{
    public static void main(String[] args) 
    {
        // Main Method
    }
    
}

```




