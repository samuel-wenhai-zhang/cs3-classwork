/*
 * Fewest number of rounds to reach a winner: 
 * Greatest number of rounds to reach a winner: 
 */


import java.util.ArrayList;

public class War {

    private int round;
    private ArrayList<Card> d1, d2;

    public War() {
        round = 1;
        Deck d = new Deck();
        for (int i = 0; i < 26; i++) {
            d1.add(d.drawCard());
            d2.add(d.drawCard());
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

        Card c1 = d1.remove(0), c2 = d1.remove(0), c3 = d2.remove(0), c4 = d2.remove(0);
        if (c2.compareTo(c4) < 0) {
            System.out.println("Player 1's " + c2 + " loses to Player 2's " + c4);
            d2.add(c4); d2.add(c3); d2.add(c2); d2.add(c1);
        }
        else {
            System.out.println("Player 1's " + c2 + " beats Player 2's " + c4);
            d1.add(c2); d1.add(c1); d1.add(c4); d1.add(c3); 
        }
        System.out.println("Player 1 has " + d1.size() + " cards left.");
        System.out.println("Player 2 has " + d2.size() + " cards left.\n");
    }

    public boolean isGameOver() {
        return d1.size() == 0 || d2.size() == 0;
    }

    public void gameOver() {
        if (d1.size() == 0) {
            System.out.println("Player 2 wins!");
        }
        else {
            System.out.println("Player 1 wins!");
        }
    }
}
