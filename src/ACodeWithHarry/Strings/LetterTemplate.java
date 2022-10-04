package ACodeWithHarry.Strings;

import java.util.Scanner;

public class LetterTemplate {
    public static void main(String[] args) {
        String letter = new String("Dear <name> ,\n Thanks a lot");
        System.out.println(letter);
        System.out.println("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(letter.replace("<name>", name));
    }
}
