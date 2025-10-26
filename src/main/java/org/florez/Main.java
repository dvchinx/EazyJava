package org.florez;
import static org.florez.EazyJava.*;
/**
 * Example class demonstrating how to use the EazyJava library.
 * This class shows various use cases of the Python-style print functions.
 */
public class Main {

    public static void main(String[] args) {
        // Demonstrate basic usage
        println("=== EazyJava Library Demo ===");
        println();

        // Integer to Text (Literal Writing and Casting to String)
        int num = 240;
        println(toText(num, true)); // Return "18"
        println(toText(num, true)); // Return "eighteen"

        println(toText(false)); // Return "false"
        println(toText(2.5467)); 

        println(".....");

        // Text to Integer (Literal Writing and Casting to int)
        String numStr = "Two hundred fifty three";
        println(toInt(numStr, true)); // Return 253

        // Casting de Base Variable a int
        println(toIntFromBin("1111100")); // Return  124
        println(toIntFromHex("0x7A")); // Return 122
        println(toIntFromOct("526")); // Return 342

        println(":......:");

        println(toIntFromBin("2"));
    }
}