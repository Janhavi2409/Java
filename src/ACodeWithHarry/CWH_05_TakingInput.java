package ACodeWithHarry;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of the given numbers is: "+sum);

        //to check whether the given input by the user is an integer
        //System.out.println("Check whether the input is an integer");
        //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);

        //to print whatever user writes
        System.out.println("write here something");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
