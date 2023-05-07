package polymorphism;

import java.util.Scanner;

public class RockPaperScissorsPolymorphism {
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

            Play player = getPlay(option);
            Play computer = getComputerPlay();

            System.out.println("Player: " + player);
            System.out.println("Computer: " + computer);

            int result = player.versus(computer);
            if (result > 0) {
                System.out.println("You lose!");
            } else if (result < 0) {
                System.out.println("You win!");
            } else {
                System.out.println("It's a tie!");
            }
        }
        scanner.close();
    }

    public static Play getPlay(int option) {
        return switch (option) {
            case 1 -> new Rock();
            case 2 -> new Paper();
            case 3 -> new Scissors();
            default -> null;
        };
    }

    public static Play getComputerPlay() {
        int option = (int) (Math.random() * 3) + 1;
        return getPlay(option);
    }
}
