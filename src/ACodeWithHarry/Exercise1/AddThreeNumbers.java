package ACodeWithHarry.Exercise1;

import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int no1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int no2 = sc.nextInt();
        System.out.print("Enter Number 3: ");
        int no3 = sc.nextInt();
        int add = no1 + no2 + no3;
        System.out.println("Addition of the given numbers is: "+add);
    }
}
