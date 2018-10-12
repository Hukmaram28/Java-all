package com.company;

import java.util.Scanner;

public class PatternOutput {

    public static void main(String[] args) {
        int number; //variable for nth iteration
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scan.nextInt(); // user input
        for (int i = 1; i <= number; i++) {       // Loop to print the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
    }
}