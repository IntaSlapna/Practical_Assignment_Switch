package com.company;
import java.util.Scanner;
public class StudentsExamMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your grade level here:");
        char gradeLevel = scan.next().charAt(0);
        switch (gradeLevel) {
            case 'A': case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D': case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Wrong grade! Try one more time");
                break;

        }
    }
}
