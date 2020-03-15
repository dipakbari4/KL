package com.lxmindustries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shapes shapes = new Shapes();

        System.out.print("Input a limit to make a triangle => ");
        String inputString = sc.next();        // Getting data as string from console

        /*
         * The input might be other than number should have safe
         * casting handler. Otherwise, it'll throw exceptions.
         */
        try {
            int inputNumber = Integer.parseInt(inputString);    // Parsing to integer
            shapes.triangle(inputNumber);                        // Calling the object's method and passing converted value
        } catch (Exception ex) {        // Catching exception for other characters
            ex.printStackTrace();    // remove this line
            System.out.println("Please enter a number");
        } finally {
            sc.close();                                            // finally close the scanner
        }

    }
}
