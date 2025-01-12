import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
    NumberGuessingGame game = new NumberGuessingGame();
    game.start();
    }

    private void start() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Welcome to the Number Guessing Game!");
    }
}
