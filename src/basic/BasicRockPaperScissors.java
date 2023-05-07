package basic;

import java.util.Scanner;

/**
 * @author Cecilia Ines Llauro
 */
public class BasicRockPaperScissors {
    /**
     * Basic example of a Rock, Paper, Scissors game developed using String validations, using command console as user interface.
     * @param args default arguments of the main method (not used in this example)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Rock, Paper, Scissors game!");

        while (true) {
            System.out.print("Choose an option (1 - Rock, 2 - Paper, 3 - Scissors, 0 - Quit): ");
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (option < 1 || option > 3) {
                System.out.println("Invalid option. Please choose again.");
                continue;
            }

            String player = getPlayerOption(option);
            String computer = getComputerOption();

            System.out.println("Player: " + player);
            System.out.println("Computer: " + computer);

            String result = getResult(player, computer);
            System.out.println(result);
        }

        scanner.close();
    }

    /**
     * Get the player's option (Rock, Paper or Scissors) using the given int primitive parameter
     * @param option the option chosen by the player
     * @return an {@link String} representation of the option chosen by the player
     */
    public static String getPlayerOption(int option) {
        return switch (option) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "";
        };
    }

    /**
     * Generate a random option for the computer to play against the player.
     * @return a {@link String} representation of the random option generated for the computer.
     */
    public static String getComputerOption() {
        int option = (int) (Math.random() * 3) + 1;
        return getPlayerOption(option);
    }

    /**
     * Resolves the match comparing the Player's play vs the Computer's play using the Rock-Paper-Scissors rules.
     * @param playerPlay Option chosen by the Player
     * @param computerPlay Option randomly generated for the Computer
     * @return Message that indicates the result of the match.
     */
    public static String getResult(String playerPlay, String computerPlay) {
        if (playerPlay.equals(computerPlay)) {
            return "It's a tie!";
        } else if ((playerPlay.equals("Rock") && computerPlay.equals("Scissors")) ||
                (playerPlay.equals("Paper") && computerPlay.equals("Rock")) ||
                (playerPlay.equals("Scissors") && computerPlay.equals("Paper"))) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }
}
