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

    public static void print(Integer num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(Long num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(Double num) {
        try {
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(Boolean bool) {
        try {
            System.out.println(bool);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print(char caracter) {
        try {
            System.out.println(caracter);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
