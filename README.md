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

```java
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

```
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

```java
String str1 = "This is a simple string in JAVA";
```

- **Class** : It is a kind of user-defined data type in JAVA also in different programming languages which is created in order to create an entity or object in the main class [Source Code]

Syntax Code :

```java
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

```java
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

```java
interface interface_name{
    // inteface members
    // inteface methods but not defined
}
```

- **Arrays** : An Array is a group of like-typed variables that are referred to by a common name.

Syntax Code : 

```java
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

```java
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

```java
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

```java
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

```java
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

```java
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

```java
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

```java
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

```java
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

```java
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

```java
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

```java
while(condition){
    // code block
    // stopping condition here
}
```

- for Loop : for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.

```java
for(initiator;condition;increment){
    // code here
}
```

- do-while loop : do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop. 

Syntax Code :

```java
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

```java
class Sample{
    public static void main(String[] a){
        String str1 = "Constant value String";
    }
}
```

- Using new keyword : In these type of cases the JVM used to create seperate objects in normal heap memo while the literals are placed in the string constant pool. And the variable created together with the object in the heap (Non-pool).

Syntax Code : 

```java
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

```java
String s1 = "String without Object";                        // Method 1
String s2 = new String("String with Object !");             // Method 2
```

- **StringBuffer** : *StringBuffer* is a peer class of String, it is mutable in nature and it is thread safe class , we can use it when we have multi threaded environment and shared object of string buffer i.e, used by mutiple thread.

Syntax Code : 

```java
StringBuffer str_bfr = new StringBuffer("Buffered Mutable String");
```

- **StringBuilder** : *StringBuilder* in Java represents an alternative to String and StringBuffer Class, as it creates a mutable sequence of characters and it is not thread safe. It is used only within the thread , so there is no extra overhead , so it is mainly used for single threaded program.

Syntax Code : 

```java
StringBuilder str_build = new StringBuilder();
str_build.append("Ack Wolver");                                 // Adding some extras to the string
```

- **StringTokenizer** : *StringTokenizer* class in Java is used to break a string into tokens. A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed.

Syntax Code : 

```java
StringTokenizer str1 = new StringTokenizer("Hello World! Having Space !"," ");
while(str1.hasMoreTokens())
    System.out.println(str1.nextToken());
```

- **StringJoiner** : *StringJoiner* is a class in java.util package is used to construct a sequence of characters(strings) separated by a delimiter and optionally starting with a supplied prefix and ending with a given suffix. 

Syntax Code : 

```java
StringJoiner str1 = new StringJoiner(",");
sj1.setEmptyValue("It is empty");
System.out.println(sj1);
```

## String Class

The string is a sequence of characters. In Java, objects of String are immutable which means a constant and cannot be changed once created.

### String Constructors

- **String(byte[] byte_arr)** : Used to create a new string by decoding the byte array into a proper string by the available byte code characters.

Syntax Code : 

```java
byte arr[] = {65,67,75};
String my_name = new String(arr);
```

- **String(byte[] byte_arr,charset)** : Construct a string with the help of bytecode available in the array and also uses the charset in it.

Syntax Code : 

```java
byte[] arr = {65,67,75};
Charset cs = Charset.defaultCharset();
String byte_char = new String(arr,cs);
```

- **String(byte[] byte_arr,int start_index,int length)** : Construct a new string by combining all the byte array's element depending on the start index and also according to the length given.

Syntax Code : 

```java
byte[] byte_arr = {71,101,101,107};
String byte_string = new String(byte_arr,1,3);
```

- **String(byte[] byte_arr,int start_index,int length,Charset char_set)** : Construct a new string by combining all the byte array's element depending on the start index and length together by decoding the with the help of charset.

Syntax Code : 

```java
byte[] byte_arr = {65,67,75};
Charset cs = Charset.defaultCharset();
String byte_string = new String(byte_arr,1,3,cs);
```

- **String(char[] char_arr)** : Construct a string using the characters available in it, in this all the characters are combined together in order to create or generate a proper string using them.

Syntax Code : 

```java
char[] char_arr = {'A','c','k'};
String char_string = new String(char_arr);          // will generate a character string
```

- **String(char[] char_arr,int start_index,int count)** : Construct a string with the use of a character array, but here we have some additional features like the count will be available for number of characters from the starting index.

Syntax Code : 

```java
char[] char_arr = {'A','c','k'};
String char_string = new String(char_arr,0,2);
```

- **String(int[] uni_code,int offset,int count)** : Allocates or construct a string by using the unicode character's convertion, also by the count of characters and by providing the starting index also.

Syntax Code : 

```java
int[] uni_code = {65,67,75};
String unicode_string = new String(uni_code,0,2);
```

- **String(StringBuffer str_bffr)** : Construct a new string with the use of StringBuffer string class (StringBuffer).

Syntax Code : 

```java
StringBuffer str_bffr = new StringBuffer("Ack");
String bffr_string = new String(str_bffr);
```

- **String(StringBuilder str_build)** : Allocates a string with the help of StringBuilder class into a normal one.

Syntax Code : 

```java
StringBuilder str_build = new StringBuilder("Ack");
String build_str = new String(str_build);
```

### String Methods

- **length()** : Returns the length of the string in the form of an integer.
- **charAt(int i)** : Returns the character by providing its specific index to this method.
- **substring(int i)** : Returns the substring of the original string after dividing from the given index position, also don't have any effect on the initial string. Its another varient is also used in which an optional argument is passed for getting the ending index of the substring.
- **concat(String str)** : Used for concatenating two strings together.
- **indexOf(String str)** : Returns the index of either a particular character if single character is passed, and if a particular word is passed then it returns the index of the first character of the word used. Its another varient is used in order to find the position as per the occerence and specifying its particular position.
- **lastIndexOf(String str)** : Returns the last index of the passed index or in other words its last occurence.
- **equals(Object othr_obj)** : Compares the string and returns the result in Boolean Format (True or False).
- **equalIgnoreCase(String another_string)** : Works similar to equals() method just the difference is of ignoring the case.
- **compareTo(String another_string)** : Used to compare the string lexicographically.
- **compareToIgnoreCase(String another_string)** : Works similar to compareTo() method just by ignoring the case of characters.
- **toLowerCase()** : Used to convert all the characters of the string into lowercase.
- **toUpperCase()** : Used to convert all the characters of the string into uppercase.
- **trim()** : Used to remove white spaces from both the sides of the string. And for specific removal a common element can be passed from it, then it will return an array of divided elements.
- **replace(char old_char,char new_char)** : Used to replace a particular part (word) or a character in the string it is used with.
- **contains(String word)** : Returns a boolean value accordingly if the word or character is contained or available in the String or not.
- **toCharArray()** : Used to convert a proper string into an array or characters as it returns it back to the user.
- **starsWith(String)** : Returns a boolean value accordingly if the string startswith the one asked for or available in its prefix.

Note: The File link regarding String Constructors and Methods is here :- [Click](https://github.com/ackwolver335/Java-Coder/blob/main/strClass.java) to get the code.

## StringBuffer Class

**StringBuffer** is a class in Java that represents a mutable sequence of characters. It provides an alternative to the immutable String class, allowing you to modify the contents of a string without creating a new object every time.

### Features of StringBuffer Class : 

- Its Objects are mutable, it means that we can change the content of the object without creating a new one.
- The Initial Capacity of StringBuffer can be modified, and also be set further with the help of ensureCapacity() method.
- With the functions or methods that are explained below its capabilities are increased and enhanced.

### Methods of StringBuffer Class : 

- **append()** : It is used for concatenating the given argument with the string together with it is used.
- **insert()** : It is used for inserting the string at a particular index in the selected Buffered String.
- **replace()** : It is used for replacing the given String part or a whole string with argument from begin index and last index -1 as per the String.
- **delete()** : It is used for deleting a particular partition of the selected String as per passing the argument for begin and last index.
- **reverse()** : It is used for reversing the string from the String Buffer created.
- **capacity()** : It is used for checking the capacity of the Buffered String created using StringBuffer Class.
- **length()** : Returns the length of the selected Buffered String Object.
- **charAt()** : Returns that character at the position of the index passed, as per the required argument.
- **deleteCharAt()** : It is used to delete a particular character present at a particular position in the Buffered String.
- **ensureCapacity()** : It is used to ensure or in other words redefine the Capacity of the Buffered String.
- **indexOf()** : It is used to get the index of a particular character from the Buffered String.
- **substring()** : It is used to make a partition from the initial Buffered String, the partition is done by passing begin index.
- **setCharAt()** : It is used to set a specific character at a specific position by passing it as an argument.

### Constructors in StringBuffer Class :

- **StringBuffer()** : It is a default way of creating StringBuffer Object which reservers 16 characters without reallocating any memory space, just the space is reserved for the 16 character as default.

Syntax Code : 

```java
StringBuffer sb1 = new StringBuffer();
```

- **StringBuffer(int capacity)** : It is another way of using StringBuffer Class for creating any Object as per defining the amount of character space needed for providing pre-defined memory space and further more space is been reserved for 16 more character without reallocation.

Syntax Code :

```java
StringBuffer sb2 = new StringBuffer(60);
```

- **StringBuffer(string)** : It is the last way of creating a StringBuffer Object by directing passing the amount of string that we want to assign to the Object. 

Syntax Code :

```java
StringBuffer sb3 = new StringBuffer("Hello World !");
```

Note : The Code regarding StringBuffer Class Methods and further example is available here -> [Click](https://github.com/ackwolver335/Java-Coder/blob/main/str_bffr_clss.java) to go on to it.

## StringBuilder Class

StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters. 
The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative to String Class by making a mutable sequence of characters.

### Constructors in StringBuilder Class

- **StringBuilder()** : It is used for Building a non-character string with initial Capacity of 16 Characters.

Syntax Code :

```java
StringBuilder str1 = new StringBuilder();
```

- **StringBuilder(int Capacity)** : It is used to create a string by initialising the string by providing a particular string Capacity to it.

Syntax Code :

```java
StringBuilder str2 = new StringBuilder(20);
```

- **StringBuilder(CharSequence seq)** : It is used in order to creaate an object as per the required String CharSequence by passing it as the arguments.

Syntax Code :

```java
StringBuilder str3 = new StringBuilder("Hello World!");
```

- **StringBuilder(String obj)** : It is used in order to create a StringBuilder Object by passing an already created String as an argument.

Syntax Code : 

```java
String my_str = "Hello Java";
StringBuilder str4 = new StringBuilder(my_str);
```

### StringBuilder Methods

| **Methods** | **Uses** |
| :---------- | :------- |
| **append()** | It is used in order to extend teh String stored in object created using String Builder Class |
| **appendCodePoint(ASCII CODE)** | This Method is used in order to add a character to the *Object's String* as per its **ASCII Code** |
| **capacity()** | This Method is used to check the capacity of the StringBuilder Object |
| **charAt()** | It is used in order to point out and return any character available at a particular index |
| **codePointAt()** | Return the ASCII Code of character available at particular index in the StringBuilder's Object |
| **codePointBefore()** | Returns the ASCII Code of the character before the one whose index is passed |
| **codePointCount()** | Returns the Total number of character available between two particular indexes |
| **delete()** | Used to delete a particular range of characters from the StringBuilder's String |
| **ensureCapacity()** | It is used for verification and modification of the Capacity of the StringBuilder's Object |
| **getChars()** | It is used in order take a range of characters from the StringBuilder's Object and put it at a particular position at the index of an already created array |
| **indexOf()** | Used to find the index of a particular word or character from the StringBuilder's Object |
| **insert()** | This method is used for inserting the string representation of the boolean alternate argument into this sequence. |
| **lastIndexOf()** | Returns the last occurence or index of the String word or character passed in it as arguments |
| **length()** | This Method is simply used in order to get the link of String available in the StringBuilder's Object |
| **replace()** | It is used for replacing the range of String in StringBuilder's Object from a particular passed String |
| **reverse()** | It is used in order to reverse the overall String available in StringBuilder's Object |
| **setCharAt()** | It is used to set a particular character at a particular position in the StringBuilder's String by passing the particular position index |
| **setLength()** | It is used for reassigning the length of the String |
| **subSequence()** | It is used in order to create a subSequence of a particular StringBuilder's String |
| **substring()** | It returns a particular partition of String created after passing a range of indexes |
| **toString()** | It is simply used to convert an object String to String Data Type in JAVA |
| **trimToSize()** | It is used for Triming the size of the String in order to remove the useless characters |

Note : All the code explanation is available on this [link](https://github.com/ackwolver335/Java-Coder/blob/main/str_build_clss.java).

## StringTokenizer Class

StringTokenizer class in Java is used to break a string into tokens. A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed.

A token is returned by taking a substring of the string that was used to create the StringTokenizer object. It provides the first step in the parsing process often called lexer or scanner.

### Constructors in StringTokenizer Class

- **StringTokenizer(String str)** : It is used for creating a StringTokenizer Object without passing the delimeter as the default delimeter value which is taken is space here.

Syntax Code : 

```java
StringTokenizer str1 = new StringTokenizer("This is a general String");
```

- **StringTokenizer(String str,String delimeter)** : It is used to create a StringTokenizer Object together by passing delimeter as per our choice and also that must be present inside the String we have taken.

Syntax Code : 

```java
StringTokenizer str2 = new StringTokenizer("A : String : Value",":");
```

- **StringTokenizer(String str,String delimeter,boolean flag)** : In this method of creating a StringTokenizer Constructor a last optional argument is passed in order to allow using the String Delimeter and the default value of this delimeter is true.

Syntax Code :

```java
StringTokenizer str3 = new StringTokenizer("String : Here !",":",true);
```

### Methods in StringTokenizer Class

| **Method Name** | **Uses** |
| :-------------- | :------- |
| **countTokens()** | It is used in order to count the number of Tokens in which the String of StringToknizer Class is been divided |
| **hasMoreTokens()** | This method is used in order to check the presence of Tokens inside the StringTokenizer Object. |
| **nextToken()** | It is used in order to move onto the next available token in the StringTokenizer's Object. |
| **hasMoreElements()** | This method works similar to the *hasMoreToken()* just by treating the Tokens as the Elements of the Object. |
| **nextElement()** | It works similar to the *nextToken()* method just by treating the Tokens as Elements |

Note : The Code File and Explanation is available on this [link](https://github.com/ackwolver335/Java-Coder/blob/main/str1_tkn.java)

## StringJoiner Class

StringJoiner is a class in java.util package is used to construct a sequence of characters(strings) separated by a delimiter and optionally starting with a supplied prefix and ending with a given suffix. 

Though this can also be done with the help of the StringBuilder class to append delimiter after each string, StringJoiner provides an easy way to do that without much code to write.

Note : We also uses a package **java.util.StringJoiner** while working with StringJoiner Class and its Objects.

### Constructors in StringJoiner Class

- **StringJoiner(CharSequence delimeter)** : This method is used in order to construct the StringJoiner Object without the presence of  characters, prefix, suffix and a copy of the supplied delimeter.

Syntax Code : 

```java
StringJoiner str1 = new StringJoiner(",");
```

- **StringJoiner(CharSequence delimeter,CharSequence prefix,CharSequence suffix)** : This method in order to construct a StringJoiner with no characters using copies of the supplied prefix, delimiter, and suffix. If no characters are added to the StringJoiner and methods accessing the string value are invoked, it will return the prefix + suffix (or properties thereof) in the result unless setEmptyValue has first been called.

Syntax Code :

```java
StringJoiner str2 = new StringJoiner(",","Strin Before Delimeter","String after Delimeter");
```

### Methods of StringJoiner Class 

| **Method's Name** | **Uses** |
| :---------------- | :------- |
| **add()** | Used to add CharSequence or String Data to the StringJoiner Class Object's String |
| **length()** | Used to find the length of the String inside StringJoiner Class's Object or No. of Characters inside the String |
| **merge()** | This method is used in order to merge two Strings of different StringJoiner Class's Object |
| **toString()** | It is a simple method used to convert the StringJoiner Object to String Data Type |
| **setEmptyValue()** | It is used in order to set the value of an Empty StringJoiner Object to put some data to it. |

Note : The Code File and Explanation regarding StringJoiner Class is available in this [link](https://github.com/ackwolver335/Java-Coder/blob/main/str1_join.java).

## Arrays in JAVA

In Java, Array is a group of like-typed variables referred to by a common name. Arrays in Java work differently than they do in C/C++. Following are some important points about Java arrays. 

### Some Features of Arrays in JAVA

| **Features of JAVA** |
| -------------------- |
| Arrays are dynamically allocated |
| These are stored in Contiguous Memory |
| We can find the length of the Arrays using length as these are objects in JAVA and are different from the Arrays of C/C++ |
| We can also declare an array variable in JAVA using [ ] after the data type keyword |
| The Variables of array data type are ordered and has the index beginning with 0 |
| It also have a static field, local variable and method parameter |

### Operations of Arrays in JAVA

- **Creation or Initialization** : These operation contains mainly 3 steps or process in it, *declaration*, *definition* and *initialization* of Arrays.

Syntax Code :

```java
int[] arr1;                         // declaration
int[] arr2 = new int[2];            // definition [Memory Allocation]
arr2 = {12,34};                     // Initialization
```

- **Accessing** : Each element in the array is accessed via its index. The index begins with 0 and ends at (total array size)-1. All the elements of array can be accessed using Java for Loop.

Syntax Code : 

```java
for(int i = 0;i < length_of_array;i++)
    System.out.println(array[i]);
```

- **Cloning** : In this particular operation a particular copy of an array is created deeply, copies of the elements as opposed to references.

Syntax Code : 

```java
int[] new_array = old_array.clone();
```

Note : The Code Content will be available on this [link](https://github.com/ackwolver335/Java-Coder/blob/main/arr_cls.java)

## Array Methods in JAVA

| **Method's Name** | **Method's Use** |
| :---------------- | :--------------- |
| **asList()** | Returns the list after converting it from initial array |
| **binarySearch()** | Returns the key element by applying *Binary Search* to the array |
| **compare()** | Returns a Boolean result after comparing the array's element |
| **compareUnsigned()** | Returns a Boolean result after comparing the array's element of unsigned data types |
| **copyOf()** | Returns the copy of a particular element also by defining a specific length of the elements |
| **copyOfRange()** | Returns a copy of a particular array after specifying a particular range of  elements |
| **deepEquals()** | Returns a Boolean value after checking each and every value deeply from both the arrays |
| **deepHashCode()** | Returns a Boolean value as a result after comparing the Hash Code of the elements of the arrays |
| **deepToString()** | Used to convert the array into a particular string deeply |
| **equals()** | Returns a Boolean value after checking if the two arrays are equal or not |
| **fill()** | Used to fill the whole array from a particular value |
| **hashCode()** | Used to find the hash Code as per the value of the array |
| **mismatch()** | Returns the index of the element which is mismatched between two arrays |
| **parallelSort()** | Used to sort the array using a particular parallel sort method |
| **sort()** | Used to perform sorting simply by default in ascending order |
| **spliterator()** | Returns the spliterator value of the array as per their elements |
| **stream()** | Returns the head position of the array after prediction when gets converted into a String Stream |
| **toString()** | Used to convert the overall array into the String |

Note : The Code is available on this [link](https://github.com/ackwolver335/Java-Coder/blob/main/arr_mds.java)

## Multidimensional Arrays

Multidimensional Arrays can be defined in simple words as array of arrays. Data in multidimensional arrays are stored in tabular form (in row major order).

Syntax Code : 

```java
import java.util.Arrays;
int[][] twoD_arr = new int[2][3];           // 2 Rows and 3 Columns
int[][][] threeD_arr = new int[2][2][2]     // 2 Rows and 2 Columns and 2 z-directional flow

// Accessing Elements
System.out.println("Array's First Row " + Arrays.toString(arr[0]));
```

Note : At the Basic level of concept the code [link](https://github.com/ackwolver335/Java-Coder/blob/main/arr_multi.java) is here.

## Categories of Arrays

- **Jagged Arrays** : A jagged array is an array of arrays such that member arrays can be of different sizes, i.e., we can create a 2-D array but with a variable number of columns in each row. These types of arrays are also known as Jagged arrays.

Syntax Code : 

```java
int arr[][] = new int[3][];                 // initializing array first
arr[0] = new int[2];                        // Number of elements in first row
arr[1] = new int[3];                        // Number of elements in second row
arr[2] = new int[2];                        // Number of elements in third row
```

Code Link : [Click_me](https://github.com/ackwolver335/Java-Coder/blob/main/arr_jagg.java)

- **Final Arrays** : The array arr is declared as final, but the elements of an array are changed without any problem. Arrays are objects and object variables are always references in Java. So, when we declare an object variable as final, it means that the variable cannot be changed to refer to anything else.

Syntax Code : 

```java
final int arr[] = new int[3];
```

Code Link : [Click_me](https://github.com/ackwolver335/Java-Coder/blob/main/arr_final.java)

- **Reflect Arrays** : The Array class in java.lang.reflect package is a part of the Java Reflection. This class provides static methods to create and access Java arrays dynamically. It is a final class, which means it can’t be instantiated or changed. Only the methods of this class can be used by the class name itself.

Syntax Code : 

```java
import java.lang.reflect.Array;
import java.util.Arrays;
int size1 = 3;
int[] array_name = (int[])Array.newInstance(int.class,size1);

Array.setInt(array_name,0,12);          // For Setting Element value
System.out.println("Element of the array : " + Arrays.toString(Array.getInt(array_name,0)));
```

Code Link : [Click_me](https://github.com/ackwolver335/Java-Coder/blob/main/arr_reflect.java)

### Methods of Reflect Arrays

| **Method Name** | **Uses** |
| :-------------- | :------- |
| **get()** | ***Used to get a particular array's element with the help of its index*** |
| **getBoolean()** | ***Used to get a particular array's element with specified index, if the array is of Boolean Data Type*** |
| **getByte()** | ***Used to get a particular element of array as per specified index, if the array is of Byte Data Type*** |
| **getChar()** | ***Used to get a particular element with its index, if the array is of Char Data Type*** |
| **getDouble()** | ***Used to get a particular element with its index, if the array is of Double Data Type*** |
| **getFloat()** | ***Used to get a particular element with its index, if the array is of Float Data Type*** |
| **getInt()** | ***Used to get a particular element with its index, if the array is of Int Data Type*** |
| **getShort()** | ***Used to get a particular element with its index, if the array is of Short Data Type*** |
| **newInstance()** | ***Used to create a new array with a specified component type and length*** |
| **set()** | ***Used to change the value of a particular element with its index*** |
| **setBoolean()** | ***Used to set the value of a particular element with its index as per, if the data type is Boolean*** |
| **setByte()** | ***Used to set the value of a particular element with its index as per, if the data type is Byte*** |
| **setChar()** | ***Used to set the value of a particular element with its index as per, if the data type is Char*** |
| **setInt()** | ***Used to set the value of a particular element with its index as per, if the data type is Int*** |
| **setDouble()** | ***Used to set the value of a particular element with its index as per, if the data type is Double*** |

Code Link : [Click_me](https://github.com/ackwolver335/Java-Coder/blob/main/arr_reflect.java)

## Social Media Links :

- [Instagram Page](https://www.instagram.com/coding.needs/)
- [Whatsapp Channel](https://whatsapp.com/channel/0029VaA2aK7DeON5LRUhRr28)
- [Discord Channel](https://discord.com/invite/CGcEFwdY)

## 📫 How to Reach Me

- **Email** - abhaych335@gmail.com
- **Instagram** - [@coding.needs](https://www.instagram.com/coding.needs/)
- **Twitter** - [@AbhayCh84760](https://x.com/AbhayCh84760)

## Support Me

If you likes what I do and want to support me :

- Give me a ⚡️ Star on my Repo
- Share my [work](https://github.com/ackwolver335/Java-Coder) and [profile](https://github.com/ackwolver335) with your network

Thanks for visiting my Github Repo ! Hope you find my projects useful, helpful and inspiring. Let's connect and collaborate to build something amazing !

Abhay Chaudhary [Ack Wolver](https://github.com/ackwolver335/ackwolver335) !
