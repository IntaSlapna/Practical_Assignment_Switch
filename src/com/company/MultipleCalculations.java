package com.company;

import java.util.Scanner;

public class MultipleCalculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the meaning of X:");
        int X = scan.nextInt();
        System.out.println("Choose the meaning of Y:");
        int Y = scan.nextInt();
        System.out.println("Choose the calculation type using one of these symbols: +, -, /, *, %, p, b, s.");
        char operation = scan.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("The sum is: " + X + Y);
                break;
            case '-':
                System.out.println("The subtraction sum is: " + (X-Y));
                break;
            case '/':
                System.out.println("The result of dividing is: " + X/Y);
                break;
            case '*':
                System.out.println("The result of multiplication is: " + X*Y);
                break;
            case '%':
                System.out.println("The result of calculation is: " + X%Y);
                break;
            case 'p':
                System.out.println("The value of of X is " +X + "and the value of Y is " +Y);
                break;
            case 'b':
                System.out.println(X>Y ? "X is bigger":"Y is bigger");
                break;
            case 's':
                System.out.println(X>Y ? "Y is smaller":"X is smaller");
                break;
            default:
                System.out.println("Wrong calculation symbol");
                break;

        }

    }
}
