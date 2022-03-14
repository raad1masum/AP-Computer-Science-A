## AP-Computer-Science-A

## Notes

AP Computer Science A Journal
Raadwan Masum

Exam Format
Section I: Multiple Choice
40 Questions | 1 Hour 30 Minutes | 50% of Exam Score
The multiple-choice section includes mostly individual questions, occasionally with 1–2 sets of questions (2 questions per set).
Computational Thinking Practices 1, 2, 4, and 5 are all assessed in the multiple-choice section.
Section II: Free Response
All free-response questions assess Computational Thinking Practice 3: Code Implementation, with the following focus:
Question 1: Methods and Control Structures—Students will be asked to write program code to create objects of a class and call methods, and satisfy method specifications using expressions, conditional statements, and iterative statements.
Question 2: Classes—Students will be asked to write program code to define a new type by creating a class and satisfy method specifications using expressions, conditional statements, and iterative statements.
Question 3: Array/ArrayList—Students will be asked to write program code to satisfy method specifications using expressions, conditional statements, and iterative statements and create, traverse, and manipulate elements in 1D array or ArrayList objects.

Unit 10 Journal
Raadwan Masum


10.1 Recursion
A recursive method is a method that calls itself
Recursive methods contain at least one base case, which halts the recursion, and at least one recursive call. 
Each recursive call has its own set of local variables, including the formal parameters.
Parameter values capture the progress of a recursive process, much like loop control variable values capture the progress of a loop
Any recursive solution can be replicated through the use of an iterative approach
Recursion can be used to traverse String, array, and ArrayList objects.

10.2 Recursive Searching and Sorting
Data must be in sorted order to use the binary search algorithm.
The binary search algorithm starts at the middle of a sorted array or ArrayList and eliminates half of the array or ArrayList in each iteration until the desired value is found or all elements have been eliminated.
The binary search algorithm can be written either iteratively or recursively.
Merge sort is a recursive sorting algorithm that can be used to sort elements in an array or ArrayList.

Week 10 TPT Notes
Raadwan Masum


Debugging
Breakpoints.  Break, Examine, Resume,  This is the process of interrupting execution with a breakpoint, looking at code path or data, and resuming execution.  Common practice would be to look at Iteration progress or examine code path of a Conditional, or examine when and how data is modified.
Observing Memory.  Looking at variables and complex data structures while code is stopped.
Conditional Breakpoints.  Examine something at certain conditions (Advanced Debugging).

Browser Debugging
Debugging and Breakpoints in Chrome F12
JavaScript Alerts, these can be used as markers and can show
Console.log in Chrome F12 (see visual)

Backend Debugging in IntelliJ
Java System.out.println() messages will output run window
Java Debugging, setting breakpoints



Unit 9 Journal
Raadwan Masum


9.1 Creating Superclasses and Subclasses
A class hierarchy can be developed by putting common attributes and behaviors of related classes into a single class called a superclass. 
Classes that extend a superclass, called subclasses, can draw upon the existing attributes and behaviors of the superclass without repeating these in the code.
Extending a subclass from a superclass creates an “is-a” relationship from the subclass to the superclass. 
The keyword extends is used to establish an inheritance relationship between a subclass and a superclass. A class can extend only one superclass

9.2 Writing Constructors for Subclasses
Constructors are not inherited.  
The superclass constructor can be called from the first line of a subclass constructor by using the keyword super and passing appropriate parameters.
The actual parameters passed in the call to the superclass constructor provide values that the constructor can use to initialize the object’s instance variables.
When a subclass’s constructor does not explicitly call a superclass’s constructor using super, Java inserts a call to the superclass’s no-argument constructor.
Regardless of whether the superclass constructor is called implicitly or explicitly, the process of calling superclass constructors continues until the Object constructor is called. At this point, all of the constructors within the hierarchy execute beginning with the Object constructor.

9.3 Overriding Methods
Method overriding occurs when a public method in a subclass has the same method signature as a public method in the superclass.
Any method that is called must be defined within its own class or its superclass.
A subclass is usually designed to have modified (overridden) or additional methods or instance variables.
A subclass will inherit all public methods from the superclass; these methods remain public in the subclass.

9.4 super Keyword
The keyword super can be used to call a superclass’s constructors and methods.
The superclass method can be called in a subclass by using the keyword super with the method name and passing appropriate parameters.

9.5 Creating References Using Inheritance Hierarchies
When a class S “is-a” class T, T is referred to as a superclass, and S is referred to as a subclass.
If S is a subclass of T, then assigning an object of type S to a reference of type T facilitates polymorphism. 
If S is a subclass of T, then a reference of type T can be used to refer to an object of type T or S. 

9.6 Polymorphism
Utilize the Object class through inheritance.
At compile time, methods in or inherited by the declared type determine the correctness of a non-static method call.
At run-time, the method in the actual object type is executed for a non-static method call.

9.7 Object Superclass
At run-time, the method in the actual object type is executed for a non-static method call.
The Object class is part of the java.lang package
Subclasses of Object often override the equals and toString methods with class specific implementations

Week 9 TPT Notes
Raadwan Masum


RESTful APIs (Using RapidAPI)
Runtime Review.   Web APIs, RESTful APIs, APIs are a source for obtaining large amounts of data. 
RapidAPI Review.  See visual.  RapidAPI is a provider of many types of data.  Social Media, Stock Market, Weather, etc.  You can get APIs directly, but this is nice source!
Brief Code Review.   Consider that a Web APIs is centered on a "request" and a "response".  The "response" is in JSON format.  JSON is a universal text format for WEB transport.
HashMap or JSON Object.  Working with JSON in Java has a couple of key alternatives.  Both of these are not CB requirements, but are means of using modern Data Structures.
Debugging.  JSON data or large quantities of data can be confusing at times.  Debugging is a great way to look inside of your code as it is processing. 


Unit 8 Journal
Raadwan Masum


8.1 2D Arrays
2D arrays are arrays of arrays
Collegeboard uses the first index for rows and the second one for columns
The square brackets [row][col] are used to access and modify an element in a 2D array.
“Row-major order” refers to an ordering of 2D array elements where traversal occurs across each row, while “column-major order” traversal occurs down each column.

8.2 Traversing 2D Arrays
Nested iteration statements are used to traverse and access all elements in a 2D array. Since 2D arrays are stored as arrays of arrays, the way 2D arrays are traversed using for loops and enhanced for loops is similar to 1D array objects.
Nested iteration statements can be written to traverse the 2D array in “row-major order” or “column-major order.”  
The outer loop of a nested enhanced for loop used to traverse a 2D array traverses the rows. Therefore, the enhanced for loop variable must be the type of each row, which is a 1D array. The inner loop traverses a single row. Therefore, the inner enhanced for loop variable must be the same type as the elements stored in the 1D array
When applying sequential/linear search algorithms to 2D arrays, each row must be accessed then sequential/linear search applied to each row of a 2D array
Week 8 TPT Notes
Raadwan Masum


Databases
Databases are used to store data, as the name suggests
Plain Old Java Objects = POJOs
A database like SQLite can be connected to SpringBoot to read and write large amounts of data
Examples of data you might want to store
User profile information
User application statistics
User preferences and settings
Posts and content

Spring Boot and SQL
The Model encapsulates the application data and optimally consists of POJO(s).
The View (ThymeLeaf) is responsible for rendering and visualizing the model data.  ThymeLeaf generates HTML output that the client's browser can interpret.
The Controller is responsible for processing user requests.  See @GetMapping and @PostMapping methods for interactions through HTML.   
Additionally, the Controller supports @RequestMapping mapping methods to interact with  the model through RESTful APIs.  Here is a sample Get API.

Unit 7 Journal
Raadwan Masum


7.1 Introduction to ArrayList
An ArrayList object is mutable and contains object references.
The ArrayList constructor ArrayList() constructs an empty list. 
Java allows the generic type ArrayList, where the generic type E specifies the type of the elements.
When ArrayList is specified, the types of the reference parameters and return type when using the methods are type E.
ArrayList is preferred over ArrayList because it allows the compiler to find errors that would otherwise be found at run-time. 

7.2 ArrayList Methods
The ArrayList class is part of the java. util package. An import statement can be used to make this class available for use in the program.

7.3 Traversing ArrayLists
Iteration statements can be used to access all the elements in an ArrayList. This is called traversing the ArrayList.
Deleting elements during a traversal of an ArrayList requires using special techniques to avoid skipping elements.
Since the indices for an ArrayList start at 0 and end at the number of elements − 1, accessing an index value outside of this range will result in an IndexOutOfBoundsException being thrown.
Changing the size of an ArrayList while traversing it using an enhanced for loop can result in a ConcurrentModificationException being thrown. Therefore, when using an enhanced for loop to traverse an ArrayList, you should not add or remove elements.

7.4 Developing Algorithms Using ArrayLists
Some algorithms require multiple String, array, or ArrayList objects to be traversed simultaneously.

7.5 Searching
There are standard algorithms for searching.
Sequential/linear search algorithms check each element in order until the desired value is found or all elements in the array or ArrayList have been checked. 

7.6 Sorting
Selection sort and insertion sort are iterative sorting algorithms that can be used to sort elements in an array or ArrayList.
Informal run-time comparisons of program code segments can be made using statement execution counts.

7.7 Ethical Issues Around Data Collection
When using the computer, personal privacy is at risk. Programmers should attempt to safeguard personal privacy.
Computer use and the creation of programs have an impact on personal security. These impacts can be beneficial and/or harmful.
Week 7 TPT Notes
Raadwan Masum


Computer Options
Self Hosted - DeskTop, Laptops
Self Hosted - Raspberry Pi 4, Raspberry Pi 400
Cloud - Amazon Web Service (EC2), Microsoft Azure, Google Cloud

Operating Systems
RPi OS, connect from anywhere with RealVNC
Ubuntu, connect to AWS EC2 using SSH

Internet Hosting
Domain, Domain Name Servers (DNS), Domain Name Providers (freenom.com)
Home Router, Routing (Port Forwarding)
Reverse Proxy Server (Nginx)
Setup Java Web Application

Deployment Guide: https://csa.nighthawkcodingsociety.com/course/deploy

Unit 6 Journal
Raadwan Masum



6.1 Array Creation and Access
The use of array objects allows multiple related items to be represented using a single variable. 
The size of an array is established at the time of creation and cannot be changed.
Arrays can store either primitive data or object reference data. 
Initializer lists can be used to create and initialize arrays.
The valid index values for an array are 0 through one less than the number of elements in the array, inclusive. Using an index value outside of this range will result in an ArrayIndexOutOfBoundsException being thrown.

6.2 Traversing Arrays
Iteration statements can be used to access all the elements in an array. This is called traversing the array.
Traversing an array with an indexed for loop or while loop requires elements to be accessed using their indices.
Since the indices for an array start at 0 and end at the number of elements −1, “off by one” errors are easy to make when traversing an array, resulting in an ArrayIndexOutOfBoundsException being thrown.

6.3 Enhanced for Loop for Arrays
An enhanced for loop header includes a variable, referred to as the enhanced for loop variable.
For each iteration of the enhanced for loop, the enhanced for loop variable is assigned a copy of an element without using its index.
Assigning a new value to the enhanced for loop variable does not change the value stored in the array.

6.4 Developing Algorithms Using Arrays
Determine a minimum or maximum value
Compute a sum, average, or mode
Determine if at least one element has a particular property
Determine if all elements have a particular property
Access all consecutive pairs of elements
Determine the presence or absence of duplicate elements
Determine the number of elements meeting specific criteria

Unit 5 Journal
Raadwan Masum



5.1 Anatomy of a Class
 Acts as a blueprint to create objects 
Defines the properties and methods for that object type
Helps minimize code duplication   
Can create multiple objects of a single class
Create an object using new keyword

5.2 Constructors
This is a special method that is used to initialize objects and is run everytime the new keyword is called for the class
Basically a blueprint for the class, default things you need to add

5.3 Documentation with Comments
Use comments to describe what’s going on in code
Easier to read than source code
Use // for normal comments and /* */ for multiline comments
Most text editors and IDEs have the ctrl+/ shortcut for comments

5.4 Accessor Methods
Shows instance variables and static variables
“Access” stuff
Translation: Getters
Get information on stuff

5.5 Mutator Methods
Basically, setters
Set values and data in a class
Used to change variables and stuff like that

5.6 Writing Methods
Serves as a call for a block of code to run, can help perform certain actions or functions 
Ex: System.out.println() is a method defined by Java that serves to print an output

5.7 Static Variables and Methods
Can be applied to variables and methods
Attaches the variables and methods to the class itself instead of an instance of the class  

5.8 Scope and Access
Access modifiers determine what other classes can see or use specific properties of a certain class 
Note: A package is a group of classes organized/grouped together

5.9 This Keyword
Within a non-static method or a constructor, the keyword this is a reference to the current object—the object whose method or constructor is being called.
The keyword this can be used to pass the current object as an actual parameter in a method call.

5.10 Ethical and Social Implications of Computing Systems
System reliability is limited. Programmers should make an effort to maximize system reliability.
Legal issues and intellectual property concerns arise when creating programs.
The creation of programs has impacts on society, economies, and culture. These impacts can be beneficial and/or harmful.
Week 5 TPT Notes
Raadwan Masum


Padlet
Learn Model, View, Control (MVC) through the Fibonacci examples.  MVC is the code organization style behind Java and Spring.
Through the "model" code learn Inheritance.  The power of Java is its Classes and reuse through Inheritance.  What benefits does FibRecurse get from this extend?
public class FibRecurse extends _Fibonacci
The Fibonacci example not only extends it includes Polymorphism.  This allows you to reuse large portions of code from Base Class and make some modifications to your customized Child Class.  Why was init method chosen for Override?
 @Override
 protected void init()
Fibonacci series uses Testers/Drivers in Model and Control.  Does this method become an instance of the object?  How would you access it from another Class?
public static void main(String[] args) {
Controller code you will notice @GetMapping and URI (aka route).  This establishes communication and control between front end and back end.  This code loads page shown in the return statement.  The model.addAttribute passes data from backend to Thymeleaf.  The @RequestParam receives data from via get mapping.
Thymeleaf assists in layout and preparing page prior to browser receiving HTML.  There is extensive code supplements in preparing a page.   Several are used in the page: iteration, conditional, referencing objects.
Tech Talk Tuesday
Tips for Wednesday check
Make sure issues are easily accessible from the readme
Class Presentation
Reviewed commonly missed problems on last week's progress checks and had some practice problems involving constructors of classes.

For loops
Learned that they are iteration based loops
Went through many code examples explaining what they do to get a better grasp on it.

Tech Talk Thursday
Recursion
The idea of running a function over and over and exponentially increasing the size of the call-stack. This is effective in exploring all possibilities of a problem but it can also have very poor time complexity
Stream
Stream allows the writing of classes in java to be more efficient and “streamlined.

Unit 4 Journal
Raadwan Masum


4.1 While Loops
Iteration statements change the flow of control by repeating a set of statements zero or more times until a condition is met.
In loops, the Boolean expression is evaluated before each iteration of the loop body, including the first. When the expression evaluates to true, the loop body is executed. This continues until the expression evaluates to false, whereupon the iteration ceases.
A loop is an infinite loop when the Boolean expression always evaluates to true
If the Boolean expression evaluates to false initially, the loop body is not executed at all.
Executing a return statement inside an iteration statement will halt the loop and exit the method or constructor.

4.2 For Loops
There are three parts in a for loop header: the initialization, the Boolean expression, and the increment. The increment statement can also be a decrement statement.
In a for loop, the initialization statement is only executed once before the first Boolean expression evaluation. The variable being initialized is referred to as a loop control variable. 
In each iteration of a for loop, the increment statement is executed after the entire loop body is executed and before the Boolean expression is evaluated again. 
A for loop can be rewritten into an equivalent while loop and vice versa.
“Off by one” errors occur when the iteration statement loops one time too many or one time too few

4.3 Developing Algorithms Using Strings
For algorithms in the context
of a particular specification
that involves String objects: Identify standard, algorithms, Modify standard algorithms, Develop an algorithm.

4.4 Nested Iteration
Nested iteration statements are iteration statements that appear in the body of another iteration statement.
When a loop is nested inside another loop, the inner loop must complete all its iterations before the outer loop can continue.

4.5 Informal Code Analysis
A statement execution count indicates the number of times a statement is executed by the program.

Unit 3 Journal
Raadwan Masum

AP Exam Weight: 15–17.5%

3.1 Boolean Expressions
Primitive values and reference values can be compared using relational operators (i.e., == and !=).
Arithmetic expression values can be compared using relational operators (i.e., <, >, <=, >=).
An expression involving relational operators evaluates to a Boolean value.

3.2 if Statements and Control Flow
Conditional statements interrupt the sequential execution of statements
if statements affect the flow of control by executing different statements based on the value of a Boolean expression.
A one-way selection (if statement) is written when there is a set of statements to execute under a certain condition. In this case, the body is executed only when the Boolean condition is true.

3.3 if-else Statements
A two-way selection is written when there are two sets of statements— one to be executed when the Boolean condition is true, and another set for when the Boolean condition is false. In this case, the body of the “if” is executed when the Boolean condition is true, and the body of the “else” is executed when the Boolean condition is false.

3.4 else if Statements
A multi-way selection is written when there are a series of conditions with different statements for each condition. Multi-way selection is performed using if-else-if statements such that exactly one section of code is executed based on the first condition that evaluates to true

3.5 Compound Boolean Expressions
Nested if statements consist of if statements within if statements.
Logical operators !(not), &&(and), and ||(or) are used with Boolean values. This represents the order these operators will be evaluated.
An expression involving logical operators evaluates to a Boolean value.
When the result of a logical expression using && or || can be determined by evaluating only the first Boolean operand, the second is not evaluated. This is known as short-circuited evaluation.

3.6 Equivalent Boolean Expressions
De Morgan’s Laws can be applied to Boolean expressions.
Truth tables can be used to prove Boolean identities.
Equivalent Boolean expressions will evaluate to the same value in all cases.

3.7 Comparing Objects
Two object references are considered aliases when they both reference the same object.
Object reference values can be compared, using == and !=, to identify aliases.
A reference value can be compared with null, using == or !=, to determine if the reference actually references an object.
Often classes have their own equals method, which can be used to determine whether two objects of the class are equivalent.
Week 3 TPT Notes
Raadwan Masum


Interesting Concepts Learned
Use Bootstrap more than CSS
Lots of CSS = not good
Thymeleaf lets us make templates for content
Thymeleaf is essentially Jinja
Ideas should not only be in HTML and CSS, use Java too
Repetitive HTML is not good, try and use Java to decrease line count

Tech Talk 3 - Binary Math
Prototyping and Inspiration: gain inspiration from other websites and projects for your own endeavors
Learning outcome: get familiar with binary, octal, and hexadecimal conversions between Base 10, Base 2, Base 8, Base 16
Look at HTML DOM, onclick events, and start using javascript

Resources
CS50 Video 
Number Systems and "Binary" 
 "Hexadecimal" on Khan Academy
HTML DOM event onclick
Javascript parseInt
Javascript changing the DOM
Thymeleaf iteration


Unit 2 Journal
Raadwan Masum

AP Exam Weight: 5–7.5%


2.1 Objects: Instances of Classes
An object is a specific instance of a class with defined attributes.
A class is a formal implementation, or blueprint, of the attributes and behaviors of an object.

2.2 Creating and Storing Objects
A signature consists of the constructor name and the parameter list.
The parameter list, in the header of a constructor, lists the types of the values that are passed and their variable names. These are often referred to as formal parameters.
A parameter is a value that is passed into a constructor. These are often referred to as actual parameters.
Constructors are said to be overloaded when there are multiple constructors with the same name but a different signature.
The actual parameters passed to a constructor must be compatible with the types identified in the formal parameter list.
Parameters are passed using call by value. Call by value initializes the formal parameters with copies of the actual parameters. 
Every object is created using the keyword new followed by a call to one of the class’s constructors.
A class contains constructors that are invoked to create objects. They have the same name as the class.
Existing classes and class libraries can be utilized as appropriate to create objects.
Parameters allow values to be passed to the constructor to establish the initial state of the object.
The keyword null is a special value used to indicate that a reference is not associated with any object.
The memory associated with a variable of a reference type holds an object reference value or if there is no object, null. This value is the memory address of the referenced object.

2.3 Calling a Void Method
An object’s behavior refers to what the object can do (or what can be done to it) and is defined by methods.
Procedural abstraction allows a programmer to use a method by knowing what the method does even if they do not know how the method was written. 
A method signature for a method without parameters consists of the method name and an empty parameter list. 
A method or constructor call interrupts the sequential execution of statements, causing the program to first execute the statements in the method or constructor before continuing. Once the last statement in the method or constructor has executed or a return statement is executed, flow of control is returned to the point immediately following where the method or constructor was called.
Non-static methods are called through objects of the class.
The dot operator is used along with the object name to call non-static methods.
Void methods do not have return values and are therefore not called as part of an expression. 
Using a null reference to call a method or access an instance variable causes a NullPointerException to be thrown.

2.4 Calling a Void Method with Parameters
A method signature for a method with parameters consists of the method name and the ordered list of parameter types.
Values provided in the parameter list need to correspond to the order and type in the method signature. 
Methods are said to be overloaded when there are multiple methods with the same name but a different signature.

2.5 Calling a Non-void Method
Non-void methods return a value that is the same type as the return type in the signature. To use the return value when calling a non-void method, it must be stored in a variable or used as part of an expression.

2.6 String Objects: Concatenation, Literals, and More
String objects can be created by using string literals or by calling the String class constructor.
String objects are immutable, meaning that String methods do not change the String object.
String objects can be concatenated using the + or += operator, resulting in a new String object.
Primitive values can be concatenated with a String object. This causes implicit conversion of the values to String objects.
Escape sequences start with a \ and have a special meaning in Java. Escape sequences used in this course include \”, \\, and \n.

2.7 String Methods
Application program interfaces (APIs) and libraries simplify complex programming tasks.
Documentation for APIs and libraries are essential to understanding the attributes and behaviors of an object of a class.
Classes in the APIs and libraries are grouped into packages
The String class is part of the java.lang package. Classes in the java.lang package are available by default.
A String object has index values from 0 to length –1. Attempting to access indices outside this range will result in an StringIndexOutOfBoundsException.
A String object can be concatenated with an object reference, which implicitly calls the referenced object’s toString method.

2.8 Wrapper Classes: Integer and Double
The Integer class and Double class are part of the java.lang package.
Autoboxing is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper classes. This includes converting an int to an Integer and a double to a Double.
Unboxing is the automatic conversion that the Java compiler makes from the wrapper class to the primitive type. This includes converting an Integer to an int and a Double to a double.

2.9 Using the Math Class
Static methods are called using the dot operator along with the class name unless they are defined in the enclosing class.
The Math class is part of the java.lang package.
The Math class contains only static methods.
The values returned from Math.random can be manipulated to produce a random int or double in a defined range.

Week 2 PBL Tangible Artifacts
Raadwan Masum

Project Repository: https://github.com/raad1masum/AP-CSA-Tri-1-Project

Git Commits



Ideation



Design



About Page




Scrum Board




Week 2 Individual Check 2
Raadwan Masum


Test Corrections

None, all answers were correct
Most difficult question:


Personal Work Plan for Computer Usage
I plan to bring my laptop to school every day with all required software and tools installed


Unit 1 Journal
Raadwan Masum

AP Exam Weight: 2.5–5%


1.1 Why Programming? Why Java?
System.out.print and System.out.println display information on the computer monitor.
Know the difference between print and println
print will print inline
println will print and then move the cursor to the next line
String literals
String literals are strings that are not being used as a variable
Example: System.out.print(“Hello, World!”); “Hello, world!” is a string literal

1.2 Variables and Data Types
Identify the most appropriate data type category for a particular specification.
The primitive data types used in this course define the set of operations for numbers and Boolean values.
Declare variables of the correct types to represent primitive data.
The three primitive data types used in this course are int, double, and boolean.
When a variable is declared final, its value cannot be changed once it is initialized.

1.3 Expressions and Assignment Statements
The arithmetic operators consist of +, −, *, /, and %.
The result is the same as the two inputs.
An attempt to divide an integer by zero will result in an ArithmeticException to occur

1.4 Compound Assignment Operators
Evaluate what is stored in a variable as a result of an expression with an assignment statement.
Compound assignment operators (+=, −=, *=, /=, %=) can be used in place of the assignment operator.
The increment operator (++) and decrement operator (−−) are used to add 1 or subtract 1 from the stored value of a variable or an array element. The new value is assigned to the variable or array element.

1.5 Casting and Ranges of Variables
The casting operators (int) and (double) can be used to create a temporary value converted to a different data type.
Casting a double value to an int causes the digits to the right of the decimal point to be truncated.
Some programming code causes int values to be automatically cast (widened) to double values.
Values of type double can be rounded to the nearest integer by (int)(x + 0.5) or (int)(x – 0.5) for negative numbers.
Integer values in Java are represented by values of type int, which are stored using a finite amount (4 bytes) of memory. Therefore, an int value must be in the range from Integer.MIN_VALUE to Integer.MAX_VALUE inclusive.
If an expression would evaluate to an int value outside of the allowed range, an integer overflow occurs. This could result in an incorrect value within the allowed range.
Tech Talk 0 Notes
Raadwan Masum


0.0 Tools and Equipment
Java is the programming language we use. HTML, CSS, and JavaScript will help us create web interfaces to visualize information.
IntelliJ is the IDE (Integrated Development Environment) we use.
Git is what we use for version control. Git tracks our changes and allows us to revert back to previous versions easily.
GitHub is where we store our code. GitHub is cloud-based, meaning it is not stored locally on our computer.
Slack is what we use for communication. Slack is an IRC (Internet Relay Chat).

0. 1 Vision and Student Leadership
Vision: we need to first map out what we want, then how we are going to accomplish it.
A goal without a plan is only a dream.
Write down what we want to accomplish.
What do we want changed/improved in society?
What problems can we solve through code?
Who are we targeting this towards?
Write down why we want to accomplish this thing.
What motivates us?
Do we want money or glory?
Are we trying to change lives or pull investors?
Write down how we are going to accomplish it.
Are we going to use agile development?
What tools are we going to implement?
What new strategies will we test out?

0.2 Project Deliverables starting with Collaboration & Design
Incremental Delivery: individuals provide incremental improvements to benefit the entire team.
Web Programming Tools: Spring, HTML, ThymeLeaf and SQLite databases are Web Programming Tools and Frameworks.
PBL Collaboration and Ideation: Project-Based Learning allows us to learn Java better by using the syntax we are learning.

0.3 Sprint Schedule & Scrum Board
Issues: Sprint cadences have ideas/issues that are broken into short-term work units on a Scrum Board (issues).
Scrum Board: The Scrum Board contains issues that are assigned to individuals,  each of these issues will have a "tangible" deliverable (code/video/...).
Assessments/Reviews: During Teacher reviews ( 1 v 1, 1 v 4) meetings you will provide the Teacher with issues that are "review ready" that represent your Deliverables.
Homework: To maintain pace in this class, you should consider a 2-hour coding or design session (weekly) outside of class time, or 4 hours outside of class per 2 weeks Sprint.  You will have time to code in class as well.


0.4 Tangible Artifacts
What are tangible artifacts?
Real, non-conceptual, things
Code, Designs, Videos, Algorithms
Push all tangibles to GitHub.

0.5 Digital Journal
Keep a journal for notes (like this journal itself).
Add to your journal regularly.
You will have to submit parts of your journal for points.
Take notes of Tech Talks as well as College Board lessons.
