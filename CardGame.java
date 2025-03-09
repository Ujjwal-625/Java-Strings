import java.util.*;

class CardGame {
    //declaring the final elements which will be used in the code
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int numOfCards = suits.length * ranks.length;
    //main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialize the deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Take user input for number of players and cards per player
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Validate input
        if (players * cardsPerPlayer > numOfCards) {
            System.out.println("Not enough cards to distribute!");
            return;
        }

        // Distribute the cards and print
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
        printPlayersCards(distributedCards);
    }

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle the deck using Math.random()
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i)); // Generate random index
            String temp = deck[i]; // Swap cards
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        String[][] distributedCards = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributedCards[i][j] = deck[index];
                index++;
            }
        }
        return distributedCards;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.println("  " + playersCards[i][j]);
            }
        }
    }
}
/*Enter number of players: 2
Enter number of cards per player: 2

Player 1's cards:
  10 of Spades
  Ace of Diamonds

Player 2's cards:
  3 of Hearts
  9 of Spades
   */