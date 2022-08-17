package ACodeWithHarry.Exercise1;

import java.util.Scanner;

public class Km_To_M_Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in Kilometers: ");
        float km = sc.nextFloat();
        System.out.println("Distance in Kilometers = "+km+ "km");
        System.out.print("Distance in Meters = " + km*1000+ "m");
    }
}
