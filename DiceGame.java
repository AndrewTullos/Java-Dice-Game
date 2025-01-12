import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
        Boolean gameOver = false;

        do {
            System.out.println("Roll the dice? (y/n):");

            try {
                String rollDice = console.nextLine().toLowerCase();
                if (rollDice.equals("y")) {
                    // Execute dice roll
                    System.out.println("Test");
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
