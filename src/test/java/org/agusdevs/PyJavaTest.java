package org.agusdevs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the PyJava library.
 * Tests all print and println methods with various data types.
 */
class PyJavaTest {

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
        PyJava.print("Hello");
        assertEquals("Hello", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnString() {
        PyJava.println("Hello");
        assertEquals("Hello" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintInt() {
        PyJava.print(42);
        assertEquals("42", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnInt() {
        PyJava.println(42);
        assertEquals("42" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintLong() {
        PyJava.print(1000000000L);
        assertEquals("1000000000", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnLong() {
        PyJava.println(1000000000L);
        assertEquals("1000000000" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintDouble() {
        PyJava.print(3.14159);
        assertEquals("3.14159", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnDouble() {
        PyJava.println(3.14159);
        assertEquals("3.14159" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintBoolean() {
        PyJava.print(true);
        assertEquals("true", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnBoolean() {
        PyJava.println(false);
        assertEquals("false" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintChar() {
        PyJava.print('A');
        assertEquals("A", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnChar() {
        PyJava.println('B');
        assertEquals("B" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintObject() {
        Object obj = new String("Test Object");
        PyJava.print(obj);
        assertEquals("Test Object", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnObject() {
        Object obj = Integer.valueOf(123);
        PyJava.println(obj);
        assertEquals("123" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnEmpty() {
        PyJava.println();
        assertEquals(System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValues() {
        PyJava.print(" | ", "Name", "Age", "City");
        assertEquals("Name | Age | City", outputStreamCaptor.toString());
    }

    @Test
    void testPrintlnMultipleValues() {
        PyJava.println(" - ", "Apple", "Orange", "Banana");
        assertEquals("Apple - Orange - Banana" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValuesWithNumbers() {
        PyJava.print(", ", 1, 2, 3, 4, 5);
        assertEquals("1, 2, 3, 4, 5", outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValuesSingleItem() {
        PyJava.print(" | ", "Single");
        assertEquals("Single", outputStreamCaptor.toString());
    }

    @Test
    void testPrintMultipleValuesEmpty() {
        PyJava.print(" | ", new Object[0]);
        assertEquals("", outputStreamCaptor.toString());
    }

    @Test
    void testMixedDataTypes() {
        PyJava.print("Number: ");
        PyJava.print(42);
        PyJava.print(", Boolean: ");
        PyJava.print(true);
        PyJava.print(", Character: ");
        PyJava.println('X');
        
        String expected = "Number: 42, Boolean: true, Character: X" + System.lineSeparator();
        assertEquals(expected, outputStreamCaptor.toString());
    }

    @Test
    void testSequentialCalls() {
        PyJava.println("Line 1");
        PyJava.println("Line 2");
        PyJava.println("Line 3");
        
        String expected = "Line 1" + System.lineSeparator() + 
                         "Line 2" + System.lineSeparator() + 
                         "Line 3" + System.lineSeparator();
        assertEquals(expected, outputStreamCaptor.toString());
    }
}