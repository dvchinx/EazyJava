package org.florez;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.florez.EazyJava.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EazyJava library.
 * Tests all print and println methods with various data types.
 */
class EazyJavaTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testPrintString() {
        print("Hello");
        assertEquals("Hello", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnString() {
        println("Hello");
        assertEquals("Hello" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintInt() {
        print(42);
        assertEquals("42", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnInt() {
        println(42);
        assertEquals("42" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintLong() {
        print(1000000000L);
        assertEquals("1000000000", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnLong() {
        println(1000000000L);
        assertEquals("1000000000" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintDouble() {
        print(3.14159);
        assertEquals("3.14159", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnDouble() {
        println(3.14159);
        assertEquals("3.14159" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintBoolean() {
        print(true);
        assertEquals("true", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnBoolean() {
        println(false);
        assertEquals("false" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintChar() {
        print('A');
        assertEquals("A", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnChar() {
        println('B');
        assertEquals("B" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintObject() {
        Object obj = new String("Test Object");
        print(obj);
        assertEquals("Test Object", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnObject() {
        Object obj = Integer.valueOf(123);
        println(obj);
        assertEquals("123" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnEmpty() {
        println();
        assertEquals(System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValues() {
        print(" | ", "Name", "Age", "City");
        assertEquals("Name | Age | City", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnMultipleValues() {
        println(" - ", "Apple", "Orange", "Banana");
        assertEquals("Apple - Orange - Banana" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValuesWithNumbers() {
        print(", ", 1, 2, 3, 4, 5);
        assertEquals("1, 2, 3, 4, 5", outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValuesSingleItem() {
        print(" | ", "Single");
        assertEquals("Single", outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValuesEmpty() {
        print(" | ", new Object[0]);
        assertEquals("", outputStreamCaptor.toString());
    }

    @Test
    void testMixedDataTypes() {
        print("Number: ");
        print(42);
        print(", Boolean: ");
        print(true);
        print(", Character: ");
        println('X');
        
        String expected = "Number: 42, Boolean: true, Character: X" + System.lineSeparator();
        assertEquals(expected, outputStreamCaptor.toString());
    }

    @Test
    void testSequentialCalls() {
        println("Line 1");
        println("Line 2");
        println("Line 3");
        
        String expected = "Line 1" + System.lineSeparator() + 
                         "Line 2" + System.lineSeparator() + 
                         "Line 3" + System.lineSeparator();
        assertEquals(expected, outputStreamCaptor.toString());
    }

    // ---- Tests for toText(int, boolean) ----
    @Test
    void testToText_LiteralFormatTrue() {
        assertEquals("Two hundred forty", toText(240, true));
        assertEquals("Eighteen", toText(18, true));
        assertEquals("Zero", toText(0, true));
        assertEquals("Nine hundred ninety nine", toText(999, true));
    }

    @Test
    void testToText_LiteralFormatFalse() {
        assertEquals("240", toText(240, false));
        assertEquals("18", toText(18, false));
    }

    // ---- Tests for toText(boolean) ----
    @Test
    void testToTextBoolean() {
        assertEquals("true", toText(true));
        assertEquals("false", toText(false));
    }

    // ---- Tests for toText(double) ----
    @Test
    void testToTextDouble() {
        assertEquals("2.5467", toText(2.5467));
        assertEquals("0.0", toText(0.0));
    }

    // ---- Tests for toInt(String, boolean) ----
    @Test
    void testToInt_LiteralFormatTrue() {
        assertEquals(253, toInt("Two hundred fifty three", true));
        assertEquals(280, toInt("Two hundred eighty", true));
        assertEquals(15, toInt("Fifteen", true));
        assertEquals(999, toInt("Nine hundred ninety nine", true));
    }

    @Test
    void testToInt_LiteralFormatFalse() {
        assertEquals(253, toInt("253", false));
        assertEquals(0, toInt("0", false));
    }

    // ---- Tests for Base Conversion Methods ----
    @Test
    void testToIntFromBin() {
        assertEquals(124, toIntFromBin("1111100"));
        assertEquals(0, toIntFromBin("0"));
        assertThrows(NumberFormatException.class, () -> toIntFromBin("2"));
    }

    @Test
    void testToIntFromHex() {
        assertEquals(122, toIntFromHex("0x7A"));
        assertEquals(255, toIntFromHex("0xFF"));
        assertEquals(4095, toIntFromHex("0xFFF"));
    }

    @Test
    void testToIntFromOct() {
        assertEquals(342, toIntFromOct("526"));
        assertEquals(8, toIntFromOct("10"));
        assertThrows(NumberFormatException.class, () -> toIntFromOct("8"));
    }

    // ===== Tests for toBoolean methods =====

    @Test
    void testToBooleanString() {
        // Test valid true values
        assertTrue(toBoolean("true"));
        assertTrue(toBoolean("TRUE"));
        assertTrue(toBoolean("True"));
        assertTrue(toBoolean("  true  "));
        assertTrue(toBoolean("  TRUE  "));
        
        // Test false values (everything that's not "true")
        assertFalse(toBoolean("false"));
        assertFalse(toBoolean("FALSE"));
        assertFalse(toBoolean("False"));
        assertFalse(toBoolean(""));
        assertFalse(toBoolean("  "));
        assertFalse(toBoolean("random"));
        assertFalse(toBoolean("1"));
        assertFalse(toBoolean("0"));
        assertFalse(toBoolean("yes"));
        assertFalse(toBoolean("no"));
    }

    @Test
    void testToBooleanStringWithNull() {
        // Test null input - should throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> toBoolean((String) null));
    }

    @Test
    void testToBooleanInt() {
        // Test integer conversion: 1 = true, everything else = false
        assertTrue(toBoolean(1));
        
        // All other integers should be false
        assertFalse(toBoolean(0));
        assertFalse(toBoolean(-1));
        assertFalse(toBoolean(2));
        assertFalse(toBoolean(100));
        assertFalse(toBoolean(-100));
        assertFalse(toBoolean(Integer.MAX_VALUE));
        assertFalse(toBoolean(Integer.MIN_VALUE));
    }

    @Test
    void testToBooleanLong() {
        // Test long conversion: 1L = true, everything else = false
        assertTrue(toBoolean(1L));
        
        // All other longs should be false
        assertFalse(toBoolean(0L));
        assertFalse(toBoolean(-1L));
        assertFalse(toBoolean(2L));
        assertFalse(toBoolean(100L));
        assertFalse(toBoolean(-100L));
        assertFalse(toBoolean(Long.MAX_VALUE));
        assertFalse(toBoolean(Long.MIN_VALUE));
    }

    @Test
    void testToBooleanDouble() {
        // Test double conversion with rounding logic
        // Values that round to 1 should be true
        assertTrue(toBoolean(1.0));
        assertTrue(toBoolean(0.5));    // 0.5 + 0.5 = 1.0 -> rounds to 1
        assertTrue(toBoolean(0.6));    // 0.6 + 0.5 = 1.1 -> rounds to 1
        assertTrue(toBoolean(1.4));    // 1.4 + 0.5 = 1.9 -> rounds to 1
        assertTrue(toBoolean(1.49));   // 1.49 + 0.5 = 1.99 -> rounds to 1
        
        // Values that don't round to 1 should be false
        assertFalse(toBoolean(0.0));
        assertFalse(toBoolean(0.4));   // 0.4 + 0.5 = 0.9 -> rounds to 0
        assertFalse(toBoolean(0.49));  // 0.49 + 0.5 = 0.99 -> rounds to 0
        assertFalse(toBoolean(-0.5));  // -0.5 + 0.5 = 0.0 -> rounds to 0
        assertFalse(toBoolean(-1.0));  // -1.0 + 0.5 = -0.5 -> rounds to 0
        assertFalse(toBoolean(2.0));   // 2.0 + 0.5 = 2.5 -> rounds to 2
        assertFalse(toBoolean(1.5));   // 1.5 + 0.5 = 2.0 -> rounds to 2
        assertFalse(toBoolean(1.6));   // 1.6 + 0.5 = 2.1 -> rounds to 2
        assertFalse(toBoolean(100.0));
        assertFalse(toBoolean(-100.0));
    }

    @Test
    void testToBooleanDoubleEdgeCases() {
        // Test special double values
        assertFalse(toBoolean(Double.POSITIVE_INFINITY));
        assertFalse(toBoolean(Double.NEGATIVE_INFINITY));
        assertFalse(toBoolean(Double.NaN));
        assertFalse(toBoolean(Double.MAX_VALUE));
        assertFalse(toBoolean(Double.MIN_VALUE));
        assertFalse(toBoolean(-Double.MAX_VALUE));
    }

    @Test
    void testToBooleanMethodsIntegration() {
        // Test integration with Main.java examples
        String ex0 = "tRuE ";
        assertTrue(toBoolean(ex0));
        
        boolean ex1 = toBoolean(1);
        boolean ex2 = toBoolean(0L);
        boolean ex3 = toBoolean(0.4f);  // This should be false based on the rounding logic
        
        assertTrue(ex1);
        assertFalse(ex2);
        assertFalse(ex3);
    }

    @Test
    void testToBooleanStringVariations() {
        // Test various string formats - corrected version
        assertTrue(toBoolean("true"));
        assertTrue(toBoolean("TRUE"));
        assertTrue(toBoolean("True"));
        assertTrue(toBoolean("tRuE"));
        assertTrue(toBoolean("\ttrue\n"));
        assertTrue(toBoolean("   true   "));
        assertTrue(toBoolean("true "));   // true due to trim()
        assertTrue(toBoolean(" true"));   // true due to trim()
        assertTrue(toBoolean("  true  ")); // true due to trim()
        
        // Everything else should be false
        assertFalse(toBoolean("false"));
        assertFalse(toBoolean("truee"));
        assertFalse(toBoolean("ttrue"));
        assertFalse(toBoolean("tr ue"));  // Space in middle won't be trimmed
        assertFalse(toBoolean("t rue"));  // Space in middle won't be trimmed
        assertFalse(toBoolean(""));
        assertFalse(toBoolean("  "));
        assertFalse(toBoolean("random"));
        assertFalse(toBoolean("1"));
        assertFalse(toBoolean("0"));
        assertFalse(toBoolean("yes"));
        assertFalse(toBoolean("no"));
    }
}