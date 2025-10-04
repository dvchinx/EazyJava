package org.agusdevs;

public class Main {

    public static void main(String[] args) {
        print("Hola");
    }
    public static void print(String txt) {
        try {
            System.out.print(txt);
        } catch (Exception e) {
            System.out.println("Error (String): " + e.getMessage());
        }
    }
    public static void print(int num) {
        try {
            System.out.print(num);
        } catch (Exception e) {
            System.out.println("Error (int): " + e.getMessage());
        }
    }
    public static void print(long num) {
        try {
            System.out.print(num);
        } catch (Exception e) {
            System.out.println("Error (long): " + e.getMessage());
        }
    }
    public static void print(double num) {
        try {
            System.out.print(num);
        } catch (Exception e) {
            System.out.println("Error (double): " + e.getMessage());
        }
    }
    public static void print(boolean bool) {
        try {
            System.out.print(bool);
        } catch (Exception e) {
            System.out.println("Error (boolean): " + e.getMessage());
        }
    }
    public static void print(char ch) {
        try {
            System.out.print(ch);
        } catch (Exception e) {
            System.out.println("Error (char): " + e.getMessage());
        }
    }
    public static void println(String txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Error (String): " + e.getMessage());
        }
    }
    public static void println(int num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error (int): " + e.getMessage());
        }
    }
    public static void println(long num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error (long): " + e.getMessage());
        }
    }
    public static void println(double num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error (double): " + e.getMessage());
        }
    }
    public static void println(boolean bool) {
        try {
            System.out.println(bool);
        } catch (Exception e) {
            System.out.println("Error (boolean): " + e.getMessage());
        }
    }
    public static void println(char ch) {
        try {
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Error (char): " + e.getMessage());
        }
    }
}