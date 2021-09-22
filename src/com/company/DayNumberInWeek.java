package com.company;
import java.util.Scanner;
public class DayNumberInWeek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the day number: ");
        int daynumber = scan.nextInt();
	    switch (daynumber) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("It is a working day!");
                break;
            case 6: case 7:
                System.out.println("It is holiday!");
            default:
                System.out.println("Week have only 7 positive days))");
                break;

        }


    }
}
