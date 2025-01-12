import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.start();
    }
    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private void start() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Dice Roll Game!");
        while (true) {
            System.out.print("Roll the dice? (y/n): ");
            String input = console.nextLine().trim().toLowerCase();

            if (input.equals("y")) {
                int firstDice = rollDice();
                int secondDice = rollDice();
                System.out.println("Dice roll: (" + firstDice + ", " + secondDice + ")");
            } else if (input.equals("n")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
    }

}
