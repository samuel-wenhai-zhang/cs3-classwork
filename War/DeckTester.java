/*
ACE of SPADES beats THREE of CLUBS
TWO of HEARTS loses to QUEEN of SPADES
FIVE of SPADES loses to TEN of SPADES
FOUR of DIAMONDS loses to NINE of HEARTS
SEVEN of DIAMONDS loses to EIGHT of DIAMONDS
TWO of CLUBS
TWO of DIAMONDS
TWO of HEARTS
TWO of SPADES
THREE of CLUBS
THREE of DIAMONDS
THREE of HEARTS
THREE of SPADES
FOUR of CLUBS
FOUR of DIAMONDS
FOUR of HEARTS
FOUR of SPADES
FIVE of CLUBS
FIVE of DIAMONDS
FIVE of HEARTS
FIVE of SPADES
SIX of CLUBS
SIX of DIAMONDS
SIX of HEARTS
SIX of SPADES
SEVEN of CLUBS
SEVEN of DIAMONDS
SEVEN of HEARTS
SEVEN of SPADES
EIGHT of CLUBS
EIGHT of DIAMONDS
EIGHT of HEARTS
EIGHT of SPADES
NINE of CLUBS
NINE of DIAMONDS
NINE of HEARTS
NINE of SPADES
TEN of CLUBS
TEN of DIAMONDS
TEN of HEARTS
TEN of SPADES
JACK of CLUBS
JACK of DIAMONDS
JACK of HEARTS
JACK of SPADES
QUEEN of CLUBS
QUEEN of DIAMONDS
QUEEN of HEARTS
QUEEN of SPADES
KING of CLUBS
KING of DIAMONDS
KING of HEARTS
KING of SPADES
ACE of CLUBS
ACE of DIAMONDS
ACE of HEARTS
ACE of SPADES
 */



public class DeckTester {
    public static void main(String[] args) {
        Deck d1 = new Deck(), d2 = new Deck();


        for (int i = 0; i < 5; i++) {
            Card c1 = d1.drawCard(), c2 = d1.drawCard();
            if (c1.compareTo(c2) < -0) {
                System.out.println(c1 + " loses to " + c2);
            }
            else {
                System.out.println(c1 + " beats " + c2);
            }
        }

        d2.sortDeck();
        Card c = d2.drawCard();
        while (c != null) {
            System.out.println(c);
            c = d2.drawCard();
        }
    }
}
