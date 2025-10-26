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
}