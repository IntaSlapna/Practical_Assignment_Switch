package com.company;

import java.net.Socket;
import java.util.Scanner;

public class MultipleCalculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the meaning of X:");
        int X = scan.nextInt();
        System.out.println("Choose the meaning of Y:");
        int Y = scan.nextInt();
        System.out.println("Choose the calculation type using one of theese symbols: +, -, /, *, %, p, b, s.");
        char operation = scan.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("The sum is: " + X + Y);
                break;
            case '-':
                System.out.println("The subtraction sum is: " + X - Y);
                break;

        }

    }
}
