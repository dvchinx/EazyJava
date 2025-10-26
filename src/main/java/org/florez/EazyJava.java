package org.florez;

/**
 * EazyJava - A Python-style print library for Java
 * 
 * This library provides simplified printing methods that mimic Python's print() function,
 * with built-in error handling and support for multiple data types.
 * 
 * @author dvchinx
 * @version 1.0.0
 * @since 1.0.0
 */
public class EazyJava {

    /**
     * Prints a string to the console without a newline.
     * 
     * @param txt the string to print
     */
    public static void print(String txt) {
        try {
            System.out.print(txt);
        } catch (Exception e) {
            System.err.println("EazyJava Error (String): " + e.getMessage());
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
            System.err.println("EazyJava Error (int): " + e.getMessage());
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
            System.err.println("EazyJava Error (long): " + e.getMessage());
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
            System.err.println("EazyJava Error (double): " + e.getMessage());
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
            System.err.println("EazyJava Error (boolean): " + e.getMessage());
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
            System.err.println("EazyJava Error (char): " + e.getMessage());
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
            System.err.println("EazyJava Error (Object): " + e.getMessage());
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
            System.err.println("EazyJava Error (String): " + e.getMessage());
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
            System.err.println("EazyJava Error (int): " + e.getMessage());
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
            System.err.println("EazyJava Error (long): " + e.getMessage());
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
            System.err.println("EazyJava Error (double): " + e.getMessage());
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
            System.err.println("EazyJava Error (boolean): " + e.getMessage());
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
            System.err.println("EazyJava Error (char): " + e.getMessage());
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
            System.err.println("EazyJava Error (Object): " + e.getMessage());
        }
    }

    /**
     * Prints a blank line to the console.
     */
    public static void println() {
        try {
            System.out.println();
        } catch (Exception e) {
            System.err.println("EazyJava Error: " + e.getMessage());
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
            System.err.println("EazyJava Error (multiple values): " + e.getMessage());
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

    // <---------- START of "toText()" literal writting method ---------->

    private static final String[] ONES = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };



    /**
     * Ej: 280 -> "two hundred eighty"
     */
    private static String convert(int num) {
        if (num == 0) return "zero";
        
        // 1. Manage Hundreds
        if (num >= 100) {
            return ONES[num / 100] + " hundred" + (num % 100 > 0 ? " " + convert99(num % 100) : "");
        } 
        
        // 2. Manage from 0 to 99
        return convert99(num);
    }

    private static String convert99(int num) {
        if (num < 20) {
            return ONES[num];
        } else {
            // Hundreds + Units
            // Use TENS for the Hundreds and ONES for the units.
            return TENS[num / 10] + (num % 10 > 0 ? " " + ONES[num % 10] : "");
        }
    }

    private static String capitalizeFirst(String text) {
    if (text == null || text.isEmpty()) {
        return text;
    }
    return text.substring(0, 1).toUpperCase() + text.substring(1);
}

    /** 
    * Converts an integer to its literal text representation.
    * 
    * @param num the integer to convert (must be between 0 and 999)
    * @param useLiteralFormat true to convert to literal text, false to return numeric string
    * @return the text representation of the number
    * @throws IllegalArgumentException if num is outside the supported range (0-999)
    */
    public static String toText(int num, boolean useLiteralFormat) {
        try {
            if (num < 0 || num > 999) {
                throw new IllegalArgumentException("Number must be between 0 and 999, got: " + num);
            }

            if (useLiteralFormat) {
                return capitalizeFirst(convert(num));
            } else {
                return String.valueOf(num);
            }

        } catch (Exception e) {
            System.err.println("EazyJava Error in toText() | " + e.getMessage());
            return "";
        }
    }

    // <---------- END of "toText()" literal writting method ---------->

    /**
     * 
     * @param num the integer to return as a String
     * @return the num converted to String
     */
    public static String toText(int num){
        try {
            return String.valueOf(num);
        }catch (Exception e) {
            System.err.println("EazyJava Error in toText() | " + e.getMessage());
            return "";
        }
    }

    /**
     * 
     * @param num the long to return as a String
     * @return the long converted to String
     */
    public static String toText(long num){
        try {
            return num+"";
        }catch (Exception e) {
            System.err.println("EazyJava Error in toText() | " + e.getMessage());
            return "";
        }
    }

    /**
     * 
     * @param num the double to return as a String
     * @return the double converted to String
     */
    public static String toText(double num){
        try {
            return num+"";
        }catch (Exception e) {
            System.err.println("EazyJava Error in toText() | " + e.getMessage());
            return "";
        }
    }

    /**
     * 
     * @param bool the boolean to return as a String
     * @return the boolean converted to String
     */
    public static String toText(boolean bool) {
        try {
            if (bool) {
                return "true";
            } else {
                return "false";
            }
        }catch (Exception e) {
            System.err.println("EazyJava Error in toText() | " + e.getMessage());
            return "";
        }
    }

    // <---------- START of "toInt()" literal writting method ---------->

    /**
     * Converts a string to an integer.
     * 
     * @param str the string to convert (can be numeric or literal format)
     * @param useLiteralFormat true if the input string is in literal format (e.g., "two hundred fifty"),
     *                        false if it's in numeric format (e.g., "250")
     * @return the integer value of the string
     * @throws IllegalArgumentException if the string cannot be converted or is outside supported range
     */
    public static int toInt(String str, boolean useLiteralFormat) {
        try {
            if (str == null || str.trim().isEmpty()) {
                throw new IllegalArgumentException("Input string cannot be null or empty");
            }
            
            str = str.trim().toLowerCase();
            
            if (useLiteralFormat) {
                return convertLiteralToInt(str);
            } else {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format in toInt(): " + e.getMessage());
        } catch (Exception e) {
            throw new IllegalArgumentException("Error in toInt(): " + e.getMessage());
        }
    }

    /**
     * Converts a literal text number to integer.
     * Supports numbers from 0 to 999.
     * 
     * @param literalText the literal text to convert (e.g., "two hundred fifty")
     * @return the integer value
     * @throws IllegalArgumentException if the literal text is not recognized
     */
    private static int convertLiteralToInt(String literalText) {
        if (literalText.equals("zero")) {
            return 0;
        }
        
        int result = 0;
        String[] parts = literalText.split("\\s+");
        
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            
            // Handle hundreds
            if (i + 1 < parts.length && parts[i + 1].equals("hundred")) {
                int hundredValue = getOnesValue(part);
                if (hundredValue == -1) {
                    throw new IllegalArgumentException("Invalid literal number: " + literalText);
                }
                result += hundredValue * 100;
                i++; // Skip "hundred"
            }
            // Handle tens and ones
            else {
                int value = getNumberValue(part);
                if (value == -1) {
                    throw new IllegalArgumentException("Invalid literal number: " + literalText);
                }
                result += value;
            }
        }
        
        if (result > 999) {
            throw new IllegalArgumentException("Number exceeds supported range (0-999): " + result);
        }
        
        return result;
    }
    
    /**
     * Gets the numeric value for ones (1-19).
     */
    private static int getOnesValue(String word) {
        for (int i = 0; i < ONES.length; i++) {
            if (ONES[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Gets the numeric value for any word (ones, tens).
     */
    private static int getNumberValue(String word) {
        // Check ones first (includes teens)
        for (int i = 0; i < ONES.length; i++) {
            if (ONES[i].equals(word)) {
                return i;
            }
        }
        
        // Check tens
        for (int i = 2; i < TENS.length; i++) {
            if (TENS[i].equals(word)) {
                return i * 10;
            }
        }
        
        return -1;
    }

    // <---------- END of "toInt()" literal writting method ---------->

    /**
     * 
     * @param str the String to return as a int
     * @return the String converted to int
     */
    public static int toInt(String str) {
        try {
            return Integer.parseInt(str);
        }catch (Exception e) {
            throw new IllegalArgumentException("Invalid argument in toInt()" + e.getMessage());
        }
    }

    /**
     * Converts a binary string to an integer.
     * 
     * @param str the binary string to convert (e.g., "1010", "0b1010")
     * @return the integer value of the binary string
     */
    public static int toIntFromBin(String str) {
        try {
            return Integer.parseInt(str.startsWith("0b") ? str.substring(2) : str, 2);
        } catch (Exception e) {
            throw new NumberFormatException("Invalid entry in toIntFromBin(): " + e.getMessage());
        }
    }

    /**
     * Converts a hexadecimal string to an integer.
     * 
     * @param str the hexadecimal string to convert (e.g., "FF", "0xFF", "0xAB")
     * @return the integer value of the hexadecimal string
     */
    public static int toIntFromHex(String str) {
        try {
            return Integer.parseInt(str.toLowerCase().startsWith("0x") ? str.substring(2) : str, 16);
        } catch (Exception e) {
            throw new NumberFormatException("Invalid entry in toIntFromHex(): " + e.getMessage());
        }
    }

    /**
     * Converts an octal string to an integer.
     * 
     * @param str the octal string to convert (e.g., "755", "0755", "0o755")
     * @return the integer value of the octal string
     */
    public static int toIntFromOct(String str) {
        try {
            str = str.toLowerCase();
            if (str.startsWith("0o")) {
                str = str.substring(2);
            } else if (str.startsWith("0") && str.length() > 1) {
                str = str.substring(1);
            }
            return Integer.parseInt(str, 8);
        } catch (Exception e) {
            throw new NumberFormatException("Invalid entry in toIntFromOct(): " + e.getMessage());
        }
    }
}