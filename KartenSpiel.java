
public class KartenSpiel {
    public static void main(String[] args) {
        Deck deck = new Deck(DeckLengths.DEUTSCH);
        deck.shuffleDeck();
        deck.printDeckAsMatrix(4);
        System.out.println("");
        deck.sortDeck();
        deck.printDeckAsMatrix(4);
    }
}