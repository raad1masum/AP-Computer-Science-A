/*
Author: Raadwan Masum
*/

/* 
Imports allow you to use code already written by others.  
Java has many standard libraries. The names around the dots in import often give you a hint to the originator of the code.
 */
import java.util.HashMap;
import java.util.Scanner; //java library for user input

import src.*;

/**
 * Main - entry point class for this project
 * 1.'C' and Java have a main function/method that is the ENTRY into code
 * execution. Both languages need a file to contain that ENTRY method/function.
 * Common convention for 'C': main.c. Convention for Java: Main.java.
 * 2. Replit requires a "Main.java" file and a main class ("public Class Main").
 * Inside the class it expects a method named "public static void main(String[]
 * args)"."
 * 3. Conventions and structures are part of a programming language and the
 * tools you use. Python people like to pick on these Java conventions, saying
 * they are difficult. What do you think?
 */

// Everything in Java is inside a class, Squigs, Squigalies, or Curly brackets
// denote a code block in Java. This is the beginning of class code block.

public class Main {                     
    /**
     * main - entry point method for this project
     * main is the entry or pri·mor·di·al code block for Java
     */
    static public void main(String[] args) {
        HashMap<Integer, Blueprint> options = new HashMap<Integer, Blueprint>();
        options.put(0, new Exit("Exit"));
        options.put(1, new Test("Test Option"));
        options.put(2, new TestNew("Test New Option"));
        options.put(3, new IntByReference("Int By Reference", 0));
        options.put(4, new Matrix("Matrix", new int[][] {{0},{0}}));
        options.put(5, new T1C1("TT1 - Challenge 1"));
        options.put(6, new T1C2("TT2 - Challenge 2"));
        options.put(7, new T1C3("TT3 - Challenge 3"));
        options.put(8, new Calculator("Calculator", "100 + 200  * 3"));

        while (true)
            menu("Menu", options);
    }

    /**
     * print and run menu options
     * @param banner dispay banner
     * @param options HashMap of menu options
     */
    public static void menu(String banner, HashMap<Integer, Blueprint> options) {
        System.out.println(banner);
        
        for (int i = 0; i < options.size(); i++) {
            System.out.println(i + ": " + options.get(i).getOptionsText());
        }
        
        System.out.print("Option> ");
        try {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            options.get(selection).run();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}