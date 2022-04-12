---
title: Tech Talk Notes
layout: template
filename: notes.html
--- 
# Table of Contents
1. [Tech Talk 0 - Data Structures](#tech-talk-0---data-structures)
2. [Tech Talk 1 - Linked Lists](#tech-talk-1---linked-lists)
3. [Tech Talk 2 - Calculator](#tech-talk-2---calculator)
4. [Tech Talk 3 - Sorts](#tech-talk-3---sorts)

## Tech Talk 0 - Data Structures
Data Structures and Algorithms can be written using different paradigms. A paradigm is an approach or a methodology or a strategy to be followed for writing software applications.

Imperative Paradigm
In computer science, imperative programming is a programming paradigm that uses statements that change a program's state. An imperative program consists of commands for the computer to perform to achieve a result. Imperative programming focuses on describing "how" a program code works.

Procedural programming is a type of imperative programming in which the program is built from one or more procedures (also termed subroutines or functions). Structured programming or modular programming in general have been promoted as techniques to improve the maintainability and overall quality of imperative programs.

Python, which many used last year, is mostly know for its Procedural paradigm. Python is a versatile programming language with many user-defined data structures and algorithms.

Object Oriented Paradigm
Object Oriented programming (OOP) is a programming paradigm that relies on the concept of classes and objects. It is used to structure a software program into simple, reusable pieces of code blueprints (usually called classes), which are used to create individual instances of objects.

OOP models complex things as reproducible, simple structures. Reusable, OOP classes can be used across programs by simply making an object. We have learned about many key aspects of OOP.

Defining Classes with a Constructor and Instance variables
Protecting information through Encapsulation (setters, getters)
Extending Classes to maximize code reuse
Creating subclass-specific behavior through polymorphism

In both Imperative and OOP there are some Common Data Structures. Defining structure to hold and manipulate data is the key to all programming.

## Tech Talk 1 - Linked Lists
Formerly, in class we have held hands and discussed Linked Lists (LL). We went over concepts in a Tri 2 Linked Lists TT. Please use this as a review.

As stated, most "Data Structures" conversations usually begin with Arrays, which are built into most Computer Programming Languages. College Board has Units 6-8 which discuss Arrays, ArrayLists, and 2-Dimensional Arrays. Most Data Structures conversations continue with the discussions of Linked Lists which are the foundation for Stacks and Queues. This TT is about building your own data structures.


Python, which many used last year, is mostly know for its Procedural paradigm. Python is a versatile programming language with many user-defined data structures and algorithms.

Object Oriented Paradigm
Object Oriented programming (OOP) is a programming paradigm that relies on the concept of classes and objects. It is used to structure a software program into simple, reusable pieces of code blueprints (usually called classes), which are used to create individual instances of objects.

OOP models complex things as reproducible, simple structures. Reusable, OOP classes can be used across programs by simply making an object. We have learned about many key aspects of OOP.

Defining Classes with a Constructor and Instance variables
Protecting information through Encapsulation (setters, getters)
Extending Classes to maximize code reuse
Creating subclass-specific behavior through polymorphism

## Tech Talk 2 - Calculator
In mathematics, an expression or mathematical expression is a finite combination of symbols that is well-formed according to rules that depend on the context.
In computers, expression can be hard to calculate with precedence rules. In computer math we often convert strings into Reverse Polish Notation (RPN, 3 + 4 becomes 3 4 +) using the Shunting-yard algorithm. Review Wikipedia diagram and the code and you will see the need for a Stack.

Reverse Polish notation (RPN) is a method for representing expressions in which the operator symbol is placed after the arguments being operated on. Polish notation, in which the operator comes before the operands, was invented in the 1920s by the Polish mathematician Jan Lucasiewicz. In the late 1950s, Australian philosopher and computer scientist Charles L. Hamblin suggested placing the operator after the operands and hence created reverse polish notation.

For example, the following RPN expression will produce the sum of 2 and 3, namely 5: 2 3 +.

Reverse Polish notation, also known as postfix notation, contrasts with the "infix notation" of standard arithmetic expressions in which the operator symbol appears between the operands.

## Tech Talk 3 - Sorts
> **Big O notation** is a mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity.

<img width="60%" src="https://miro.medium.com/max/1400/1*yiyfZodqXNwMouC0-B0Wlg.png">

**Bubble Sort**
- O( *n²* )
- Repeatedly swap adjacent elements if they are in wrong order
- Comparison-based algorithm where adjacent elements are compared
- Not suitable for large data sets

**Selection Sort**
- O( *n²* )
- Repeatedly finding the minimum element and putting it at the beginning
- Comparison-based algorithm in which the list is divided into two parts
- Not suitable for large data sets

**Insertion Sort**
- O( *n²* )
- Builds the final sorted array one item at a time
- Array is searched sequentially and unsorted items are inserted into the sorted list
- Not suitable for large data sets

**Merge Sort**
- O( *n log n* )
- Based on divide and conquer technique
- Divides the array into equal halves and then combines them in a sorted manner
- Works well with large data sets