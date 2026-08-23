import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        int playerScore = 0;
        int compScore = 0;

        while (true) {
            System.out.print("\nEnter choice (rock, paper, scissors or quit): ");
            String playerChoice = scanner.nextLine().toLowerCase().trim();

            if (playerChoice.equals("quit")) {
                break;
            }

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            String compChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + compChoice);

            if (playerChoice.equals(compChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && compChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && compChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && compChoice.equals("paper"))) {
                System.out.println("You won this round!");
                playerScore++;
            } else {
                System.out.println("Computer won this round!");
                compScore++;
            }

            System.out.println("Score -> You: " + playerScore + " | Computer: " + compScore);
        }

        System.out.println("Final Score -> You: " + playerScore + " | Computer: " + compScore);
        scanner.close();
    }
}