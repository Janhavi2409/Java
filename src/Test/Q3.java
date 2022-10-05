package Test;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum=0;
        System.out.print("Factors of the number are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("Sum of Factors = "+sum);
    }
}
