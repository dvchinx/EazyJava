package org.florez;
import static org.florez.EazyJava.*;
/**
 * Example class demonstrating how to use the EazyJava library.
 * This class shows the most recent added methods.
 */
public class Main {

    public static void main(String[] args) {
        // Demonstrate basic usage
        println("=== EazyJava Library Demo ===");
        println();

        String ex0 = "tRuE ";
        println(toBoolean(ex0));
        
        boolean ex1 = toBoolean(1);
        boolean ex2 = toBoolean(0L);
        boolean ex3 = toBoolean(0.4f);
        println(" - ", ex1, ex2, ex3);
        println(ex1, ex2, ex3);
    }
}