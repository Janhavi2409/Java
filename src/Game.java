import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the game Rock Paper & Scissors!!!");
        int j = 10;
      do {
            System.out.println("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS");
            Scanner sc = new Scanner(System.in);
            int Player = sc.nextInt();

            if (Player == 0) {
                System.out.println("Your Choice: ROCK");
            } else if (Player == 1) {
                System.out.println("Your Choice: PAPER");
            } else {
                System.out.println("Your Choice: SCISSORS");
            }

            Random random = new Random();
            int Computer = random.nextInt(3);

            if (Computer == 0) {
                System.out.println("Computer's Choice: ROCK");
            } else if (Computer == 1) {
                System.out.println("Computer's Choice: PAPER");
            } else {
                System.out.println("Computer's Choice: SCISSORS");
            }

            if (Player == Computer) {
                System.out.println("Draw");
            } else if (Player == 0 && Computer == 2 || Player == 1 && Computer == 0 ||
                    Player == 2 && Computer == 1) {
                System.out.println("You Win!!!");
            } else {
                System.out.println("Computer Wins!!!");
            }
            j--;
        }  while(j>0);
    }
}
