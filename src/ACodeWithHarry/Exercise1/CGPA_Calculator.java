package ACodeWithHarry.Exercise1;

import java.util.Scanner;

public class CGPA_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks Obtained Out Of 100 In Physics: ");
        double p = sc.nextDouble();
        System.out.print("Enter Marks Obtained Out Of 100 In Mathematics: ");
        double m = sc.nextDouble();
        System.out.print("Enter Marks Obtained Out Of 100 In Chemistry: ");
        double c = sc.nextDouble();
        double sum = p + m + c;
        System.out.println("Your CGPA is: "+ sum/30);
    }
}
