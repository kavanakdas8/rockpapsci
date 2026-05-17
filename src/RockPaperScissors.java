import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String compChoice;

        System.out.println("Enter your choice: ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
        }

        compChoice = choices[random.nextInt(3)];
        System.out.println("Computer's choice: " + compChoice);

        if(playerChoice.equals("rock") && compChoice.equals("paper") || playerChoice.equals("paper") && compChoice.equals("scissors") || playerChoice.equals("scissors") && compChoice.equals("rock")){
            System.out.println("You lost!");
        }
        else if (playerChoice.equals("paper") && compChoice.equals("rock") || playerChoice.equals("scissors") && compChoice.equals("paper") || playerChoice.equals("rock") && compChoice.equals("scissors") ) {
            System.out.println("You won!");
        }
        else{
            System.out.println("Its a tie!");
        }

        scanner.close();
    }
}
