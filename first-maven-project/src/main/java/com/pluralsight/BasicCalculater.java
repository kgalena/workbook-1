package com.pluralsight;

import java.util.Scanner;

public class BasicCalculater {


public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

    System.out.print("Enter first number:");
    double firstNumber = myScanner.nextDouble();

    System.out.print("Enter second number: ");
    double secondNumber = myScanner.nextDouble();

    myScanner.nextLine();

    System.out.println("What would you like to see ");
    System.out.println("Enter 'A' 'S' 'M' 'D' : ");
    String input = myScanner.nextLine();

    System.out.println("Preparing to calculate... ");

    if (input.equals("A")) {
        double results = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + results);
    // test
    }
    }
}
