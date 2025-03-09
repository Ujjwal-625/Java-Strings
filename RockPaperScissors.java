import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get number of games
        System.out.print("Enter the number of rounds: ");
        int rounds = sc.nextInt();
        sc.nextLine();
        // Arrays to store results
        String[][] results = new String[rounds][4];
        int playerWins = 0, computerWins = 0, draws = 0;
        // Play multiple rounds
        for (int i = 0; i < rounds; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String playerChoice = sc.nextLine().trim().toLowerCase();
            // Get computer's choice
            String computerChoice = getComputerChoice();

            // Determine winner
            String winner = getWinner(playerChoice, computerChoice);
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            // Store results
            results[i][0] = String.valueOf(i + 1); // Round Number
            results[i][1] = playerChoice;
            results[i][2] = computerChoice;
            results[i][3] = winner;
        }

        // Display results in table format
        displayResults(results, playerWins, computerWins, draws, rounds);
    }

    // Method to get random computer choice
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    // Method to determine the winner
    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("scissors") && computer.equals("paper")) ||
            (player.equals("paper") && computer.equals("rock"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to display results
    public static void displayResults(String[][] results, int playerWins, int computerWins, int draws, int rounds) {
        System.out.println("\nGame Results:");
        System.out.println("| Round    Player     Computer    Winner  |");

        for (String[] row : results) {
            System.out.printf(" %-6s  %-10s  %-10s  %-8s |\n", row[0], row[1], row[2], row[3]);
        }



        // Calculate win percentage
        double playerWinPercent = ((double) playerWins / rounds) * 100;
        double computerWinPercent = ((double) computerWins / rounds) * 100;
        double drawPercent = ((double) draws / rounds) * 100;

        System.out.println("\nOverall Stats:");

        System.out.printf("| Player Wins    | %-10d |\n", playerWins);
        System.out.printf("| Computer Wins  | %-10d |\n", computerWins);
        System.out.printf("| Draws          | %-10d |\n", draws);


        System.out.println("\nWinning Percentages:");

        System.out.printf("| Player Win %%  | %-10.2f |\n", playerWinPercent);
        System.out.printf("| Computer Win %%| %-10.2f |\n", computerWinPercent);
        System.out.printf("| Draw %%        | %-10.2f |\n", drawPercent);

    }
}
/*Enter the number of rounds: 2

Enter your choice (Rock, Paper, Scissors): rock

Enter your choice (Rock, Paper, Scissors): rock

Game Results:
| Round    Player     Computer    Winner  |
 1       rock        scissors    Player   |
 2       rock        rock        Draw     |

Overall Stats:
| Player Wins    | 1          |
| Computer Wins  | 0          |
| Draws          | 1          |

Winning Percentages:
| Player Win %  | 50.00      |
| Computer Win %| 0.00       |
| Draw %        | 50.00      | */