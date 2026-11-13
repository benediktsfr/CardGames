
public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck(DeckTypes.POKER);
       System.out.println(deck.printDeckAsMatrix());
    }
}