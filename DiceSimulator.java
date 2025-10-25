import java.util.Random;
import java.util.Scanner;

public class DiceSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("🎲 Welcome to the Dice Simulator! 🎲");

        while (playAgain) {
            System.out.print("Enter the number of dice to roll: ");
            int numDice = scanner.nextInt();

            int total = 0;
            System.out.print("You rolled: ");
            for (int i = 0; i < numDice; i++) {
                int diceRoll = random.nextInt(6) + 1;
                total += diceRoll;
                System.out.print("[" + diceRoll + "] ");
            }
            System.out.println("\nTotal: " + total);

            System.out.print("Do you want to roll again? (yes/no): ");
            String answer = scanner.next();
            playAgain = answer.equalsIgnoreCase("yes");
            System.out.println();
        }

        System.out.println("Thanks for playing");
        scanner.close();
    }
}
