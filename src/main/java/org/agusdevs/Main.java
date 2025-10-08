package org.agusdevs;

/**
 * Example class demonstrating how to use the PyJava library.
 * This class shows various use cases of the Python-style print functions.
 */
public class Main {

    public static void main(String[] args) {
        // Demonstrate basic usage
        PyJava.println("=== PyJava Library Demo ===");
        PyJava.println();
        
        // String printing
        PyJava.print("Hello, ");
        PyJava.println("World!");
        
        // Number printing
        PyJava.println("Integer: " + 42);
        PyJava.println("Double: " + 3.14159);
        PyJava.println("Long: " + 1000000000L);
        
        // Boolean and character
        PyJava.println("Boolean: " + true);
        PyJava.println("Character: " + 'A');
        
        // Multiple values with delimiter
        PyJava.println(" | ", "Name", "Age", "City");
        PyJava.println(" | ", "John", 25, "New York");
        
        // Blank line
        PyJava.println();
        PyJava.println("Demo completed successfully!");
    }
}