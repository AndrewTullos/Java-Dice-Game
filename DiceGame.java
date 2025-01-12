import java.util.Scanner;
import java.lang.Math;


public class DiceGame {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
        Boolean gameOver = false;

        do {
            System.out.println("Roll the dice? (y/n):");

            try {
                String rollDice = console.nextLine().toLowerCase();
                if (rollDice.equals("y")) {
                    int firstDice = (int) (Math.random() * 6) + 1;
                    int secondDice = (int) (Math.random() * 6) + 1;
                    System.out.println("Dice roll: (" + firstDice + ", " + secondDice + ")");

                } else {
                    System.out.println("Game Over");
                    gameOver = true;
                }
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
        } while (!gameOver);

    }
}
