![Coder1](https://github.com/ackwolver335/Java-Coder/assets/103741432/db00bf62-0a91-4b16-8f2d-4d2bd047de3b)

# Basics of JAVA

In this Repo, I have provided an Overview over to the Basics of the JAVA Programming Language. And each topic is been covered together with its code explanation in the Java Files that are mentioned above. For Covering up each part the syntax will also be available.

## Author

- [@ackwolver335](https://github.com/ackwolver335)

## 🚀 My Clone
I m Programmer and Developer regarding different Computer Languages, also have worked as Digital Marketer and Content Creator.

## Features of Repo

- Basic Explanation of Theory
- Element's Syntax
- Code Examples in Java Files
- Social Handles for more..

## About JAVA

Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is intended to let application developers write once, and run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.
JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1995 and later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy. It helps to create reusable code and modular programs.

### Features of JAVA

- Platform Independent
- Object-Oriented Programming
- Secure
- Portable Code
- Multithreading
- Compilation and Interpretation

### Java Setup : 

- [JDK](https://www.oracle.com/in/java/technologies/downloads/)
- [Youtube Video](https://youtu.be/SQykK40fFds?si=lB66ZemBoFafi16G)
- [Text Explanation](https://www.geeksforgeeks.org/how-to-download-and-install-java-for-64-bit-machine/?ref=lbp)

## Basic Syntax

Source Code :

```
class Class_name{
    public static void main(String[] a){
        System.out.println("Hello World !");
    }
}
```

- Note : Preferred to name the file as same name of the Class name containing main function.

For running the Code [Window] :

```bash
javac file_name.java
java file_name
```

Code Output : 

```bash
Hello World !
```

### Code Elements :

Below we have the explanation regarding the key elements in the above syntax :- 

- class : This keyword is used for declaring the class.
- public : It is type of access specifier, specifies that the class is available to all.
- static : static keyword is used to make the function static, and due to this we don't have to create any object for calling it.
- void : It is a return type which don't return anything to the main function.
- main() : This is the method from where the execution of the program starts from, without this we used to face compile error !
- String[] args : It specific that the user may opt to enter parameters to the JAVA Program. Both forms String[] args or String args[] are acceptable by the compiler.
- System.out.println : This is used to print anything on the console or the output screen.

## Data Types : 

### Primitive

- **Boolean** : Used to store the true (1) or false (0).
- **Byte** : This data type is useful in saving the memory space in case for working with large arrays.
- **Short** : This data type comes under the category of integer of 16 bit storage.
- **Int** : This data type is used for storing the numerical values within a particular limit.
- **Long** : This data type is used for storing the unsigned 64-bit numbers at a large storage limit.
- **Float** : This data type is used for storing the 32-bit decimal pointing integers in Source Code.
- **Double** : This data type is used for storing the double precision values in the Source code.
- **Char** : This data type is used for storing the character in any particular variable.

Note : Code is in the Basic.java file above in the Repo.

### Non-Primitive

- **String** : It is a kind of data type which is known from its other standard line, sequence of characters

Syntax Code : 

```
String str1 = "This is a simple string in JAVA";
```

- **Class** : It is a kind of user-defined data type in JAVA also in different programming languages which is created in order to create an entity or object in the main class [Source Code]

Syntax Code :

```
class Class_name{
    // class members
    public int number = 12;

    // class methods
    public void display(){
        System.out.println("Display Function here !");
    }
}
```

- **Object** : It is a kind of entity created in order to use the class here !

Syntax Code :

```
class First{

}

class Class_main{
    public static void main(String[] a){
        First obj1 = new First();
    }
}
```

- **Interface** : Interfaces specify what a class must do and not how. It is the blueprint of the class.

Syntax Code : 

```
interface interface_name{
    // inteface members
    // inteface methods but not defined
}
```

- **Arrays** : An Array is a group of like-typed variables that are referred to by a common name.

Syntax Code : 

```
datatype array_name = new datatype[length];
```

## Input/Output Methods :

Below we have some packages to be used while working with Inputs and Outputs :

- Buffered Reader
- Input Stream Reader
- java.io
- Scanner

### Input Methods :

- **Buffered Reader** : It is a simple class that is used to read a sequence of characters. It has a simple function that reads a character another read which reads, an array of characters, and a readLine() function which reads a line.
- **Input Stream Reader** : InputStreamReader() is a function that converts the input stream of bytes into a stream of characters so that it can be read as BufferedReader expects a stream of characters. BufferedReader can throw checked Exceptions.

Syntax Code :

```
import java.io.*;
// BufferedReader and Input Stream Reader both are included above

class Sample{
    public static void main(String[] a){
        // Using Buffered Reader Class
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter some string text : ");
        String data = reader.readLine();

        System.out.print("Enter a numerical value : ");
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Entered String is : " + data + "\nEntered Number is : " + number);
    }
}
```

Note : Further Explanation is given in the Inout.java file above.

- **Scanner** : It is an advanced version of BufferedReader which was added in later versions of Java. The scanner can read formatted input. It has different functions for different types of data types. 

Syntax Code :

```
// Required Package Below
import java.util.*;

class Sample{
    public static void main(String[] a){
        // Creating Scanner Object
        Scanner scn = new Scanner(System.in);

        String name;
        System.out.print("Enter your name : ");
        name = scn.nextLine();
    }
}
```

Other Methods for taking Different Data type input is been given below :

- **next()** : Used to get single word of input.
- **nextLine()** : Used to get a sentence of textual string input.
- **nextBoolean()** : Used to take a Boolean Input.
- **nextByte()** : Used to get single Byte of Input.
- **nextDouble** : Used to take Double Data Type of Input.
- **nextFloat()** : Used to get a Float Input.
- **nextInt()** : Used to take any Integer value as Input.
- **nextLong()** : Used to get a Long Value of Input.
- **nextShort()** : Used for reading any short value.

Note : Further Code Explanation is been given in the Code File name "Inout.java".

### Output Methods :

Following are different methods for learning Output Methods in JAVA :

- print() : Used for printing a single line without its EOL[End of Line].
- println() : Used for printing a whole line of text Output with its proper ending.
- printf() : Used for printing the formatted text output without EOL.

Syntax Code : 

```
class Sample{
    public static void main(String[] a){

        // Simple Textual Content
        System.out.println("Println() method code output !");               // println()
        System.out.print("Simple print() method : ");                       // print()

        // printf() method for formatted String
        char c = 'a';
        printf("Formatted Character to Upper Case : %C",c);

    }
}
```

Note : More explanation is available in the "Inout.java" Code File.

## Operators :

Categories of Operators : 

- **Arithmetic Operator** : These operators involve the mathematical operators that can be used to perform various simple or advanced arithmetic operations on the primitive data types referred to as the operands.

- **Unary Operator** : Java unary operators are the types that need only one operand to perform any operation like increment, decrement, negation, etc. It consists of various arithmetic, logical and other operators that operate on a single operand.

- **Assignment Operator** : These operators are used to assign values to a variable. The left side operand of the assignment operator is a variable, and the right side operand of the assignment operator is a value.

- **Relational Operator** : Java Relational Operators are a bunch of binary operators used to check for relations between two operands, including equality, greater than, less than, etc. They return a boolean result after the comparison and are extensively used in looping statements as well as conditional if-else statements and so on.

- **Logical Operator** : Logical operators are used to perform logical “AND”, “OR” and “NOT” operations, i.e. the function similar to AND gate and OR gate in digital electronics.

- **Ternary Operator** : Java ternary operator is the only conditional operator that takes three operands. It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming.

- **Bitwise Operator** : Operators constitute the basic building block of any programming language. Java too provides many types of operators which can be used according to the need to perform various calculations and functions, be it logical, arithmetic, relational, etc.

Note : The Code examples are given in the code file named as "operatr.java" above.

## Variables in JAVA 

In Java, Variables are the data containers that save the data values during Java program execution. Every Variable in Java is assigned a data type that designates the type and quantity of value it can hold. A variable is a memory location name for the data.

### Categories of Variables :

Below we have different categories of variables with example explanation :-

- **Local** : A variable defined within a block or method or constructor is called a local variable.These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.

Syntax Code : 

```
class Sample{
    public statc void main(String[] a){
        
        // defining a local variable here
        int number = 12;

        // Local to main method only
        System.out.println("Local variable : " + number);
    }
}
```

- **Instance** : Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block.As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.

Syntax Code :

```
class Sample{

    // Creating an instance variable here
    public int num1 = 12;
    public int num2 = 22;

    public static void main(String[] a){

        // Accessing instance variable
        Sample one = new Sample();

        System.out.println("First Instance variable : " + one.num1);
        System.out.println("Second Instance variable : " + one.num1);

    }
}
```

- **Static** : These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.Static variables are created at the start of program execution and destroyed automatically when execution ends.

Syntax Code :

```
class Sample{

    // Defining a static variable
    public static int number = 34;

    public static void main(String[] a)[

        // Accessing the static variable here
        System.out.println("Static variable declared inside the class : " + number);

    ]
}
```

Note : Further Explanation is been given in the code file above with name "var1.java".

### Social Media Links :

- [Instagram Page](https://www.instagram.com/coding.needs/)
- [Whatsapp Channel](https://whatsapp.com/channel/0029VaA2aK7DeON5LRUhRr28)
- [Discord Channel](https://discord.com/invite/CGcEFwdY)

### Feedback

If you wants to give any kind of feedback or query, I m surely active on my social media handles !