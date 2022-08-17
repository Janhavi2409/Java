package ACodeWithHarry.Exercise1;

import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        System.out.println("------------------------CBSE BOARDS PERCENTAGE CALCULATOR--------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks Obtained In Science: ");
        double s = sc.nextDouble();
        System.out.print("Enter Marks Obtained In Mathematics: ");
        double m = sc.nextDouble();
        System.out.print("Enter Marks Obtained In English: ");
        double e = sc.nextDouble();
        System.out.print("Enter Marks Obtained In Hindi: ");
        double h = sc.nextDouble();
        System.out.print("Enter Marks Obtained In SST: ");
        double st = sc.nextDouble();
        double sum = s + m + e + h + st;
        System.out.print("Enter Total Number Of Marks: ");
        double total = sc.nextDouble();

        System.out.print("Your Overall Percentage Is: "+ sum*100/total);
    }
}
