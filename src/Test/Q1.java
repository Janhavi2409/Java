package Test;

import java.util.Scanner;

public class Q1 {

    public static void main(String args[]) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println("Your Number: " + num);
        int count = 0;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}
