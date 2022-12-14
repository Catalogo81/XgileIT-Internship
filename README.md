# XgileIT-Internship
**Java Fundamentals**

/* ------------------------------------------------------------------------------------------------------------- */

In the javaBasics Package we have the following programs:
DataTypes, Condition Statements and Operators

DataTypes In Java
There are two types of data types in Java: 
1. Primitive data types: The primitive data types include boolean, char,
byte, short, int, long, float and double. 
2. Non-primitive data types: The non-primitive data types include Classes,
Interfaces, and Arrays.

Conditional Statements:
1. if-statements
2. switch-statements

Operators in Java:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Modulus (%)

/* ------------------------------------------------------------------------------------------------------------- */

**OOP's Concepts**

In this Package we have the following programs that contain the OOP's concepts:
Abstraction, Encapsulation, Inheritance and Polymorphism

- Object-oriented programming helps solve a problem by mapping the real-world object into a program.
- An Object is a physical entity, and it has a state, e.g. height and size of a person. It's an instance of a class.
- A Class is a logical entity, and has/is a type. It is a temple used for creation of objects.
- The reason why it is called Object-Oriented Programming is that we deal with real-world objects that have a state
- An Abstract class allows one to create functionality that subclasses can implement or override
- An Interface only allows one to define functionality, not implement it
- A Class can extend only one abstract class, while it can take multiple interfaces

1. Abstraction (defines a class): Hiding complexity and showing the important things
    - removing any unnecessary information from an object and keeping relevant information only
    - making the class uniquely identified in the system between others
    - helps with garbage removal
    - abstraction can be done using abstract classes or interface

2. Encapsulation: A process of binding data (variables) and its behaviour (methods) in a single unit.
    - combination of Abstraction and Encapsulation we get a class.
    - e.g. School bag, phone, ATM, TV, Car

3. Inheritance (is-a): When a child class inherits properties and behaviours from its parent class
    - parent class is also known as a superclass
    - child class is also known as a derived class
    - Bank Account that has a Business Bank Account and a Personal Bank Account is an example of Inheritance
    - common behaviours can be found in a parent class
    - different behaviours can be found in a child class with unique properties

4. Polymorphism: another silent feature in OOPs where a method can take more than one form based on the type of
   parameters, order of parameters and number of parameters
    - it's performed on the methods (behaviours)
    - e.g. a woman can be a daughter, wife, mother and sister at the same time
    - there are two types of polymorphism; method overload and method override
    - method overload is when multiple methods have the same name in the same class, and all methods work differently
    - method override is when the child class has the same method as declared in the parent class

/* ------------------------------------------------------------------------------------------------------------- */

**Interface, Abstract Classes and Loops**

In this Package we will be focusing on the differences between Interfaces and Abstract classes and how we use them.
Including some Loop examples

What is an Interface?
Interface specifies the behaviour of a class by providing an abstract type.
Interfaces are used to achieve abstraction. A java class can implement an interface

We need Interfaces for
Total Abstraction(hiding method implementation) - by storing only the method signatures and not method definition.
Multiple Inheritance - inheriting multiple parent classes
Loose Coupling - the dependency of one class to another
A class can implement multiple interfaces.

What is an Abstract Class?
Abstract class allows one to create functionality that subclasses can implement or override
A class can only extend one abstract class. A abstract class is like a template for other classes
It holds common functionality for all classes that extend it.

Why we use it
Abstract class is a special class in Java, it can not be instantiated and that's why can not be used directly


What is a Loop and Why we use it:

**Java Naming Convention**

Java follows CamelCase naming convention

Examples: firstName, myColorAndTheme, getResults(), ArrayList, HashMap, setLength()

            Starts With                Examples
Class       Upper Case & Noun          String, Employee, Student, Rectangle, ArrayList
Interface   Upper Case & Adjective     Runnable, OnClickListener, ActionListener
Method      Lower Case & Verb          main(), print(), goAhead(), getResult()
Variable    Lower Case                 name, id, firstName, employeeId, isAlive, length
Package     All in Lower Case          java, util, sql
Constants   All in Upper Case          MAX_VALUE, PI, COMPANY_NAME

Video link: https://drive.google.com/file/d/1EyKbH4xwk_pUNeihUMroE2t6lG1EEaJo/view?usp=sharing
/* ------------------------------------------------------------------------------------------------------------- */