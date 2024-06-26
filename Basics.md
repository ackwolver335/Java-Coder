# Basic Concept - Theoritical Updates

In this particular Markdown, we have further updates regarding the left one concepts of Basics of Java which are important for Beginners, together by having the [Codes](https://github.com/ackwolver335/Java-Coder) and the main Markdown file of Basic [Java](https://github.com/ackwolver335/Java-Coder/blob/main/README.md) regarding the code integrated Concepts.

## Contents to be Studied

1. Java as OOPs
2. History of Java
3. Difference of Java and C++
4. Java Architecture

## Java as OOPs

When we talk about OOPs, not just in Java in other programming language also we starts using *Objects* in Programming in order to implement them as **Primary** source to create something with the code. As the objects are seen by the user in order to perform different tasks. 

OOPs usually aims for the implementation of real world Objects in Programming like **Inheritance**, **Data Hiding**, **Polymorphism**,..etc Also the main aim is to bind the Data and the functions (Operates on Object/Data) so that not any other part can access the Data.

**Access Modifiers** : The Access regarding usage outside and inside the class over to its member is been defined or modified using these access modifiers.

**Class** : We can consider it as a *Blueprint* or *Prototype* with the help of which the Objects are created. It is used in order to represent a particular set of members and methods to one or more objects. It reduces the redudancy of code with the help of using a particular class multiple times in order to create multiple objects of it.

**Objects** : It is to be considered as a Basic Unit of OOPs which is used to represent the Real-Life *Entities*. A General Java program is been implemented with different kinds of Objects. And these are the part of the code visible to the users or viewers.

### Important Keypoints

![Important of JAVA](https://github.com/ackwolver335/Java-Coder/assets/103741432/89789028-e435-4846-a1a0-2cc6f4b6c65b)

### Basic Terminologies and Concepts

![Terminology of JAVA](https://github.com/ackwolver335/Java-Coder/assets/103741432/5849d432-7f9b-4235-a84e-138ecea88675)

## History of Java

- Developed by - **James Gosling** in *1990*
- Project was called as **GreenTalk** regarding development of JAVA
- Further it was named as **OA**

![History of Java](https://github.com/ackwolver335/Java-Coder/assets/103741432/2e5a86c1-e117-4371-82b0-4e08c74b0854)

## How Java and C++ are Different ?

| **Java** | **C++** |
| -------- | ------- |
| Regarding Memory Management it supports *Threads*,*References* and *Interface*, also don't supports *Pointers* | Regarding Memory Management it uses *Pointers*,*Structures* and *Unions* |
| Have Wide-Range of *Libraries* or *Classes* regarding different High-Level of Services | As per comparison have Low-Level of *Functionality* |
| Supports Inheritance but in case of Multiple uses *Interfaces* | Supports both Single and Multiple *Inheritance* |
| Don't supports *Operator Overloading* | Supports *Operator Overloading* |
| For Handling *Programs*, functions and variables resides inside the *classes* and *packages* only | Regarding this feature functions and variables reside outside the *classes* |
| It is *Platform-Independent* as the generated *Byte-Code* runs on every OS | It is *Platform-Dependent* and the code needs to *recompiled* for running on different OS |
| It supports *Threads* and Concept of *Multi-Threading* | Don't have Built-in feature for *Threads* and is dependent on *Libraries* |

## JVM Architecture

JVM acts or works like a run-time engine for running JVM Applications. It is reponsible for the calling of the *main* method present in the Java Code for its execution, and further its is a Part of **JRE** (Java-Runtime Environment). We can used the *WORA (Write Once Run Anywhere)* property of Java only because of JVM. 

When a Java File with *.java* extension is been compiled, then a *.class* is been generated by the **JIT** *(Just In Time)* Compiler. For running the code, this *.class* file is been passed through various purpose. 

![JVM Architecture](https://github.com/ackwolver335/Java-Coder/assets/103741432/b2b4fbb9-4027-4555-a9aa-8b242c4907c6)

### Class Loader Sub-System

It includes 3 properties or functions further process as mentioned below :-

- **Loading** -> Firstly, the loader reads the *.class* file and generates its *Binary Code* together by saving it into the *Method Area*. For each *.class* file JVM stores (i) Fully Qualified Name of Loaded Class, (ii) Class, Enum or Inteface if available together by its properties like *methods*, *members*,..etc

It also creates an Object of type *class* to represent the file in *Heap Memory*.

- **Linking** -> Performs *Verification*, *Preparation* and sometimes *Resolutions*. Verification is the process in which we get the ensurity of the Correctness of the *.class* file, whether its is properly formatted or not and this verification is done by *ByteCodeVerifier*. In case of Preparation, the JVM allocates memory for class static variable and initialize it the default values. In Resolution, the replacement of *Symbolic Reference* to *Direct Reference* is done by searching in the Methods Area to locate referenced entity.

- **Initialization** -> In this process, the static variables with *static* keywords are assigned their required values as per defined in the code, also it is done from top to bottom in case of *Classes* and from Parent to Child in case of *Hierarchy*.

We also have following Loaders in **Initialization Phase** :- 

![Working of JVM](https://github.com/ackwolver335/Java-Coder/assets/103741432/398fa016-97ad-4961-ab89-2680dad5c8b7)

### Java Native Interface

It is mainly used for interaction with the Native Method's Libraries and also provides native libraries(C/C++) required for the execution. It helps/enables **JVM** to call C/C++ *Libraries* and to be called by C/C++ *Libraries* which may be Hardware Dependent.

### Different B/W JDK,JRE and JVM

![Difference BW Components](https://github.com/ackwolver335/Java-Coder/assets/103741432/0b12e7e1-5e36-4966-a77b-45caa26134ad)

### Execution Engines

Execution engine executes the “.class” (bytecode). It reads the byte-code line by line, uses data and information present in various memory area and executes instructions. It can be classified into three parts:

- **Interpreter** : It interprets the bytecode line by line and then executes. The disadvantage here is that when one method is called multiple times, every time interpretation is required.
- **Just-In-Time Compiler(JIT)** : It is used to increase the efficiency of an interpreter. It compiles the entire bytecode and changes it to native code so whenever the interpreter sees repeated method calls, JIT provides direct native code for that part so re-interpretation is not required, thus efficiency is improved.
- **Garbage Collector**: It destroys un-referenced objects. For more on Garbage Collector, refer Garbage Collector.

### Different Memories of JVM 

- **Method Area** ->> In this all the properties of a *Class* together by the *static* variables are stored, also each JVM have only one Method Area together by being a shared resource.
- **Heap Area** ->> All information regarding *Object* is included in it, and is only one for each JVM being a shared resources.
- **Stack Area** ->> Run-time Stack is created for each thread by JVM. Its area is called as *Activation Record* or *Stack Frame*, when a thread is terminated its stack area is destroyed and it is not sharable resource.
- **PC Registers** ->> Used to store address of current execution of thread and is provided seperately to each thread.
- **Native Method Stack** ->> It is provided each to each thread and is created for storing *Native Information* regarding that thread.