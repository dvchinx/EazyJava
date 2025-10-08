package org.agusdevs;

/**
 * PyJava - A Python-style print library for Java
 * 
 * This library provides simplified printing methods that mimic Python's print() function,
 * with built-in error handling and support for multiple data types.
 * 
 * @author agusdevs
 * @version 1.0.0
 * @since 1.0.0
 */
public class PyJava {

    /**
     * Prints a string to the console without a newline.
     * 
     * @param txt the string to print
     */
    public static void print(String txt) {
        try {
            System.out.print(txt);
        } catch (Exception e) {
            System.err.println("PyJava Error (String): " + e.getMessage());
        }
    }

    /**
     * Prints an integer to the console without a newline.
     * 
     * @param num the integer to print
     */
    public static void print(int num) {
        try {
            System.out.print(num);
        } catch (Exception e) {
            System.err.println("PyJava Error (int): " + e.getMessage());
        }
    }

    /**
     * Prints a long to the console without a newline.
     * 
     * @param num the long to print
     */
    public static void print(long num) {
        try {
            System.out.print(num);
        } catch (Exception e) {
            System.err.println("PyJava Error (long): " + e.getMessage());
        }
    }

    /**
     * Prints a double to the console without a newline.
     * 
     * @param num the double to print
     */
    public static void print(double num) {
        try {
            System.out.print(num);
        } catch (Exception e) {
            System.err.println("PyJava Error (double): " + e.getMessage());
        }
    }

    /**
     * Prints a boolean to the console without a newline.
     * 
     * @param bool the boolean to print
     */
    public static void print(boolean bool) {
        try {
            System.out.print(bool);
        } catch (Exception e) {
            System.err.println("PyJava Error (boolean): " + e.getMessage());
        }
    }

    /**
     * Prints a character to the console without a newline.
     * 
     * @param ch the character to print
     */
    public static void print(char ch) {
        try {
            System.out.print(ch);
        } catch (Exception e) {
            System.err.println("PyJava Error (char): " + e.getMessage());
        }
    }

    /**
     * Prints an object to the console without a newline.
     * 
     * @param obj the object to print (will use toString())
     */
    public static void print(Object obj) {
        try {
            System.out.print(obj);
        } catch (Exception e) {
            System.err.println("PyJava Error (Object): " + e.getMessage());
        }
    }

    /**
     * Prints a string to the console with a newline.
     * 
     * @param txt the string to print
     */
    public static void println(String txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.err.println("PyJava Error (String): " + e.getMessage());
        }
    }

    /**
     * Prints an integer to the console with a newline.
     * 
     * @param num the integer to print
     */
    public static void println(int num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.err.println("PyJava Error (int): " + e.getMessage());
        }
    }

    /**
     * Prints a long to the console with a newline.
     * 
     * @param num the long to print
     */
    public static void println(long num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.err.println("PyJava Error (long): " + e.getMessage());
        }
    }

    /**
     * Prints a double to the console with a newline.
     * 
     * @param num the double to print
     */
    public static void println(double num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.err.println("PyJava Error (double): " + e.getMessage());
        }
    }

    /**
     * Prints a boolean to the console with a newline.
     * 
     * @param bool the boolean to print
     */
    public static void println(boolean bool) {
        try {
            System.out.println(bool);
        } catch (Exception e) {
            System.err.println("PyJava Error (boolean): " + e.getMessage());
        }
    }

    /**
     * Prints a character to the console with a newline.
     * 
     * @param ch the character to print
     */
    public static void println(char ch) {
        try {
            System.out.println(ch);
        } catch (Exception e) {
            System.err.println("PyJava Error (char): " + e.getMessage());
        }
    }

    /**
     * Prints an object to the console with a newline.
     * 
     * @param obj the object to print (will use toString())
     */
    public static void println(Object obj) {
        try {
            System.out.println(obj);
        } catch (Exception e) {
            System.err.println("PyJava Error (Object): " + e.getMessage());
        }
    }

    /**
     * Prints a blank line to the console.
     */
    public static void println() {
        try {
            System.out.println();
        } catch (Exception e) {
            System.err.println("PyJava Error: " + e.getMessage());
        }
    }

    /**
     * Prints multiple values separated by a delimiter.
     * 
     * @param delimiter the string to place between values
     * @param values the values to print
     */
    public static void print(String delimiter, Object... values) {
        try {
            for (int i = 0; i < values.length; i++) {
                if (i > 0) {
                    System.out.print(delimiter);
                }
                System.out.print(values[i]);
            }
        } catch (Exception e) {
            System.err.println("PyJava Error (multiple values): " + e.getMessage());
        }
    }

    /**
     * Prints multiple values separated by a delimiter with a newline at the end.
     * 
     * @param delimiter the string to place between values
     * @param values the values to print
     */
    public static void println(String delimiter, Object... values) {
        print(delimiter, values);
        println();
    }
}