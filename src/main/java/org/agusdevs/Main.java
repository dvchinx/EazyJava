package org.agusdevs;

public class Main {

    public static void main(String[] args) {
        print("Hola mundo");
    }

    public static void print(String txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(Integer txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(Long txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(Double txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(Boolean txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(char txt) {
        try {
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
