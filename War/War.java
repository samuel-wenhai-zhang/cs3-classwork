import java.util.ArrayList;

public class War {

    public static void main(String[] args) {
        Deck d = new Deck();
        ArrayList<Card> d1 = new ArrayList<Card>(), d2 = new ArrayList<Card>();
        divideDeck(d, d1, d2);   

        int round = 1;
        System.out.println("Round: " + round);
        playRound(d1, d2);
        round++;
        // while (!isGameOver()) {

        // }
    }

    public static void divideDeck(Deck d, ArrayList<Card> d1, ArrayList<Card> d2) {
        for (int i = 0; i < 26; i++) {
            d1.add(d.drawCard());
            d2.add(d.drawCard());
        }
    }

    public static void playRound(ArrayList<Card> d1, ArrayList<Card> d2) {
        Card c1 = d1.remove(1), c2 = d2.remove(1);
        if (c1.compareTo(c2) < 0) {
            System.out.println(c1 + " loses to " + c2);
            
        }
        else {
            System.out.println(c1 + " beats " + c2);
        }
    }

    public static boolean isGameOver(ArrayList<Card> d1, ArrayList<Card> d2) {
        return d1.size() == 0 || d2.size() == 0;
    }    
}
