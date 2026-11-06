
public class KartenSpiel {
    public static void main(String[] args) {
        Deck deck = new Deck(DeckTypes.POKER);
        deck.printDeckAsMatrix();
    }
}