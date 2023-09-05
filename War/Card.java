public class Card implements Comparable<Card>{
    private CardValue cardValue;
    private Suit suit;

    public Card(CardValue cardValue, Suit suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public String toString() {
        return getCardValue() + " of " + getSuit();
    }

    public int compareTo(Card o) {
        if (getCardValue().getCardValue() != o.getCardValue().getCardValue()) {
            return getCardValue().getCardValue() - o.getCardValue().getCardValue();
        } else {
            return getSuit().getSuitValue() - o.getSuit().getSuitValue();
        }
    }
}
