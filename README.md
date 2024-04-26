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

Note : Proper code is given at [Basic.java](https://github.com/ackwolver335/Java-Coder/blob/main/Basic.java) Click to go on.

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

Note : Proper Code is given at [npdata.java](https://github.com/ackwolver335/Java-Coder/blob/main/npdata.java) Click to go on it.

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

Note : Proper Code is given on [Inout.java](https://github.com/ackwolver335/Java-Coder/blob/main/Inout.java) Click to go on it.

## Identifiers

In Java, identifiers are used for identification purposes. Java Identifiers can be a class name, method name, variable name, or label.

### Rules for defining JAVA Identifiers

Below we have some rules that we need to follow in order to define the Identifiers otherwise, we may have to face the Compile-Time Errors. These rules are also followed in other programming languages like, C/C++,etc.

- The Charactere that are used while defining the identifiers must be alphanumeric for better practice, a-z,0-9,'$' (dollar) or '_' (underscore), for example names like name@ will cause error while defining these.
- These are **Case-Sensitive**.
- Java Identifiers must not start with numeric value or symbol like $ or _ otherwise it would cause an error.
- As there is no limit regarding characters while defining the Identifiers, but it is recommended that for better practice we must be in **14-15** characters.
- We don't have to use the reserved words for defining any local or user-based Identifier, otherwise the compiler may get confused in finding the real Identifier which you are using.

Note : The Code related to Identfiers Concept is here [Click](https://github.com/ackwolver335/Java-Coder/blob/main/Identify.java).

## Operators :

Categories of Operators : 

- **Arithmetic Operator** : These operators involve the mathematical operators that can be used to perform various simple or advanced arithmetic operations on the primitive data types referred to as the operands.

- **Unary Operator** : Java unary operators are the types that need only one operand to perform any operation like increment, decrement, negation, etc. It consists of various arithmetic, logical and other operators that operate on a single operand.

- **Assignment Operator** : These operators are used to assign values to a variable. The left side operand of the assignment operator is a variable, and the right side operand of the assignment operator is a value.

- **Relational Operator** : Java Relational Operators are a bunch of binary operators used to check for relations between two operands, including equality, greater than, less than, etc. They return a boolean result after the comparison and are extensively used in looping statements as well as conditional if-else statements and so on.

- **Logical Operator** : Logical operators are used to perform logical “AND”, “OR” and “NOT” operations, i.e. the function similar to AND gate and OR gate in digital electronics.

- **Ternary Operator** : Java ternary operator is the only conditional operator that takes three operands. It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming.

- **Bitwise Operator** : Operators constitute the basic building block of any programming language. Java too provides many types of operators which can be used according to the need to perform various calculations and functions, be it logical, arithmetic, relational, etc.

Note : Proper Code is given on [operatr.java](https://github.com/ackwolver335/Java-Coder/blob/main/operatr.java) Click to go on it. 

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

    public static void main(String[] a){

        // Accessing the static variable here
        System.out.println("Static variable declared inside the class : " + number);

    }
}
```

Note : Proper code is given on [var1.java](https://github.com/ackwolver335/Java-Coder/blob/main/var1.java) Click to go on it.

## Wrapper Class

A Wrapper class in Java is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.

### Needs of Wrapper Class : 

- They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
- The classes in java.util package handles only objects and hence wrapper classes help in this case also.
- Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
- An object is needed to support synchronization in multithreading.

### Major Concepts :

- Autoboxing 
- Unboxing

### Autoboxing 

The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double, etc.

Syntax Code : 

```
import java.util.*;

class Sample{

    public static void main(String[] a){

        char ch1 = 'a';                             // variable declaration
        Character c1 = ch1;                         // autoboxing

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrayList.add(22);                                              // autoboxing

        System.out.println(arrayList.get(0));
    }
}
```

### Unboxing

It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int, Long to long, Double to double, etc.

Syntax Code :

```
import java.util.*;

class Sample{

    public static void main(String[] a){

        Character c1 = 'a';                         // variable declaration
        char ch1 = c1;                              // unboxing

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(22);

        int num = arrList.get(22);
        System.out.println(num);
    }
}
```

Note : Proper Code will be given in the file name as [wrap.java](https://github.com/ackwolver335/Java-Coder/blob/main/wrap.java) Click to go on it.

## Intro to Decision Making :

Decision Making in programming is similar to decision-making in real life. In programming also face some situations where we want a certain block of code to be executed when some condition is fulfilled. 

### Some Selection statement of JAVA :

- if : if statement is the most simple decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statements is executed otherwise not.
- if-else : The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false? Here comes the else statement. We can use the else statement with the if statement to execute a block of code when the condition is false.
- nested if : A nested if is an if statement that is the target of another if or else. Nested if statements mean an if statement inside an if statement. Yes, java allows us to nest if statements within if statements. i.e, we can place an if statement inside another if statement.
- if else if ladder : Here, a user can decide among multiple options.The if statements are executed from the top down. As soon as one of the conditions controlling the if is true, the statement associated with that ‘if’ is executed, and the rest of the ladder is bypassed.
- Switch Case : These are other kinds of block of statements that are used in order to run a particular block of code in regarding a particular case or value.

### Here are some code examples of Decision Making Statements : 

**If Statements**

- If statement is the most simple decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statements is executed otherwise not. 

- The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false? Here comes the else statement. We can use the else statement with the if statement to execute a block of code when the condition is false. 

- A nested if is an if statement that is the target of another if or else. Nested if statements mean an if statement inside an if statement. Yes, java allows us to nest if statements within if statements. i.e, we can place an if statement inside another if statement.

Syntax Code :

```
class Class_name{
    public static void main(String[] args){
        
        // Type 1
        if(condition){
            // code here
        }

        // Type 2
        if(condition1){
            // code here
        }
        else{                                   // another condition here
            // opposite code block here
        }

        // Type 3
        if(first_condition){
            // code here
        }
        else if(second_condition){
            // code here
        }
        else{
            // opposite condition code here
        }

    }
}
```

**Switch Statement**

- The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression.

Syntax Code :

```
class Class_name{
    public static void main(String[] arg){
        int num1 = 5;

        switch(num1){
            case 1:
                System.out.println("Value is : 1");
                break;                                  // for stopping the case here only

            case 2:
                System.out.println("Value is : 2");
                break;

            case 5:
                System.out.println("Value is : 5");
                break;

            default:
                System.out.println("Hope you got required result!");
        }
    }
}
```

Note : Proper Code is given in the file [decision.java](https://github.com/ackwolver335/Java-Coder/blob/main/decision1.java) Click to go on it.

## Looping Structures : 

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true. Java provides three ways for executing the loops.

**Categories of Looping Structures :**

- while Loop : A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement. 

Syntax Code :

```
while(condition){
    // code block
    // stopping condition here
}
```

- for Loop : for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.

```
for(initiator;condition;increment){
    // code here
}
```

- do-while loop : do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop. 

Syntax Code :

```
do{
    // code here
    // stopping condition here
} while(testing_condition);
```

- for-each loop : For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.

### Jump Statements : 

Jump Statements are those statements which are used to come out of a particular block of code or looping structures that are explained above and there are different keywords that are used in the Jump Statements !

- **break** : Used to break the loop or code block there only and then the cursor comes out of the block.
- **continue** : Used to stops a particular iteration in loops or skip any particular iteration in the code block.

Note : Proper code is beeng given in [loops.java](https://github.com/ackwolver335/Java-Coder/blob/main/loops.java) file above !

## Strings in JAVA

Strings are the type of objects that can store the character of values and in Java, every character is stored in 16 bits i,e using UTF 16-bit encoding. A string acts the same as an array of characters in Java.

### Ways to create a String : 

- String Literals : This methods of creating string is used in a situation in order to make java more memory efficient, cause in this method objects of the strings are not created.

Syntax Code : 

```
class Sample{
    public static void main(String[] a){
        String str1 = "Constant value String";
    }
}
```

- Using new keyword : In these type of cases the JVM used to create seperate objects in normal heap memo while the literals are placed in the string constant pool. And the variable created together with the object in the heap (Non-pool).

Syntax Code : 

```
class Sample{
    public static void main(String[] a){
        String s1 = new String("String inside Heap Non-Pool");
    }
}
```

Note : The Code regrading the Basics one is here in [Basic_of_string](https://github.com/ackwolver335/Java-Coder/blob/main/b_of_str.java).

### Categories of String 

- **String** : String is an immutable class which means a constant and cannot be changed once created and if wish to change , we need to create an new object and even the functionality it provides like toupper, tolower, etc all these return a new object , its not modify the original object. It is automatically thread safe.

Syntax Code :

```
String s1 = "String without Object";                        // Method 1
String s2 = new String("String with Object !");             // Method 2
```

- **StringBuffer** : StringBuffer is a peer class of String, it is mutable in nature and it is thread safe class , we can use it when we have multi threaded environment and shared object of string buffer i.e, used by mutiple thread.

Syntax Code : 

```
StringBuffer str_bfr = new StringBuffer("Buffered Mutable String");
```

- **StringBuilder** : StringBuilder in Java represents an alternative to String and StringBuffer Class, as it creates a mutable sequence of characters and it is not thread safe. It is used only within the thread , so there is no extra overhead , so it is mainly used for single threaded program.

Syntax Code : 

```
StringBuilder str_build = new StringBuilder();
str_build.append("Ack Wolver");                                 // Adding some extras to the string
```

- **StringTokenizer** : StringTokenizer class in Java is used to break a string into tokens. A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed.

Syntax Code : 

```
StringTokenizer str1 = new StringTokenizer("Hello World! Having Space !"," ");
while(str1.hasMoreTokens())
    System.out.println(str1.nextToken());
```

- **StringJoiner** : StringJoiner is a class in java.util package is used to construct a sequence of characters(strings) separated by a delimiter and optionally starting with a supplied prefix and ending with a given suffix. 

Syntax Code : 

```
StringJoiner str1 = new StringJoiner(",");
sj1.setEmptyValue("It is empty");
System.out.println(sj1);
```

### Social Media Links :

- [Instagram Page](https://www.instagram.com/coding.needs/)
- [Whatsapp Channel](https://whatsapp.com/channel/0029VaA2aK7DeON5LRUhRr28)
- [Discord Channel](https://discord.com/invite/CGcEFwdY)

### Feedback

If you wants to give any kind of feedback or query, I m surely active on my social media handles !