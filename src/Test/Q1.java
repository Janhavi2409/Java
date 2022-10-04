package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    public static void main(String args[]) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        System.out.println("Your Number: " + number);
        String string = Long.toString(number);
        System.out.println("Digits in your number: " + string.length());
    }
}