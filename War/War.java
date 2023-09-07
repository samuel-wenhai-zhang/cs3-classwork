/*
 * Fewest number of rounds to reach a winner: 21
 * Greatest number of rounds to reach a winner: 493
 */


import java.util.ArrayList;

public class War {

    private int round;
    private ArrayList<Card> player1, player2;

    public War() {
        round = 1;
        player1 = new ArrayList<Card>();
        player2 = new ArrayList<Card>();
        Deck d = new Deck();
        for (int i = 0; i < 26; i++) {
            player1.add(d.drawCard());
            player2.add(d.drawCard());
        }
    }

    public static void main(String[] args) {
        War w = new War();

        while (!w.isGameOver()) {
            w.playRound();
        }
        
        w.gameOver();

    }

    public void playRound() {
        System.out.println("Round " + round + ": ");
        round++;

        Card c1 = player1.remove(0), c2 = player1.remove(0), c3 = player2.remove(0), c4 = player2.remove(0);
        if (c2.compareTo(c4) < 0) {
            System.out.println("Player 1's " + c2 + " loses to Player 2's " + c4);
            player2.add(c4); player2.add(c3); player2.add(c2); player2.add(c1);
        }
        else {
            System.out.println("Player 1's " + c2 + " beats Player 2's " + c4);
            player1.add(c2); player1.add(c1); player1.add(c4); player1.add(c3); 
        }
        System.out.println("Player 1 has " + player1.size() + " cards left.");
        System.out.println("Player 2 has " + player2.size() + " cards left.\n");
    }

    public boolean isGameOver() {
        return player1.size() == 0 || player2.size() == 0;
    }

    public void gameOver() {
        if (player1.size() == 0) {
            System.out.println("Player 2 wins!");
        }
        else {
            System.out.println("Player 1 wins!");
        }
    }
}
