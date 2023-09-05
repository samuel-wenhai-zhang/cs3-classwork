import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < 13; i++) {
            CardValue cardValue = CardValue.values()[i];
            for (int j = 0; j < 4; j++) {
                Card card = new Card(cardValue, Suit.values()[j]);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);

        Iterator cardIterator = deck.iterator();
        while (cardIterator.hasNext()) {
            Card aCard = (Card) cardIterator.next();
            System.out.println(aCard);            
        }
    }
}
