
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Deck {

    private final ArrayList<Cards> deck;

    public Deck(DeckTypes deckLength) {

        deck = new ArrayList<>();
        int infarbe = 0;
        int jokers = deckLength.getDeckLengths() % 4;

        while (infarbe < 4) {
            for (int i = 0; i < Math.floor(deckLength.getDeckLengths() / 4); i++) {
                deck.add(new Cards(Suits.values()[infarbe], CardValues.values()[i]));
            }
            if (jokers > 0) {
                deck.add(new Cards(Suits.values()[infarbe], CardValues.JOKER));
                jokers--;
            }
            infarbe++;
        }

    }

    public boolean containsCards() {
        return !deck.isEmpty();

    }

    public void removeTopCard() {
        if (!deck.isEmpty()) {
            deck.remove(deck.size() - 1);
        }
    }

    public Cards drawTopCard() {
        if (containsCards()) {
            Cards topCard = deck.get(deck.size() - 1);
            removeTopCard();
            return topCard;
        }
        return null;
    }

    public void deal(Hands hand) {
        hand.add(deck.drawTopCard());
    }

    public String printDeckAsList() {
        String list = deck.get(0).printCards(" ");
        for (int i = 1; i < deck.size(); i++) {
            list += ("\n" + deck.get(i).printCards(" "));
        }
        return list;
    }

    ;

    public String printDeckAsMatrix() {
        String mat = "";
        int index = 0;
        int jokers = deck.size() % 4;
        for (int i = 1; i < 4 + 1; i++) {
            String dimension = "";
            for (int j = 1; j < deck.size() / 4 + 1; j++) {
                dimension = dimension + "[" + deck.get(index).printCards("|") + "] ";
                index++;
            }
            if (jokers > 0) {
                dimension = dimension + "[" + deck.get(index).printCards("|") + "] ";
                index++;
                jokers--;
            }
            mat += dimension;
            if (i < 4) {
                mat += "\n";
            }
        }
        return mat;
    }

    ;

    public int findIndexOfCard(Suits suit, CardValues value) {

        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getValues() == value && deck.get(i).getSuits() == suit) {
                return i;
            }
        }
        return -1;
    }

    public boolean isCardInDeck(Suits suit, CardValues value) {
        return findIndexOfCard(suit, value) != -1;
    }

    public void shuffleDeck() {

        Random random = new Random();

        for (int i = deck.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            swapCardsByIndex(i, j);
        }
    }

    public void sortDeck() {
        deck.sort(Comparator.comparing(Cards::getSuits).thenComparing(Cards::getValues));
    }

    public void swapCardsByCard(Cards card1, Cards card2) {
        int index1 = findIndexOfCard(card1.getSuits(), card1.getValues());
        int index2 = findIndexOfCard(card2.getSuits(), card2.getValues());

        if (index1 != -1 && index2 != -1) {
            Cards temp;
            temp = deck.get(index1);
            deck.set(index1, deck.get(index2));
            deck.set(index2, temp);
        }
    }

    public void swapCardsByIndex(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            Cards temp = deck.get(index1);
            deck.set(index1, deck.get(index2));
            deck.set(index2, temp);
        }
    }

    public void removeBottomCard() {
        if (!deck.isEmpty()) {
            deck.remove(0);
        }
    }

    public void removeIndex(int index) {
        if (index >= 0 && index < deck.size()) {
            deck.remove(index);
        }
    }

    public int getDeckSize() {
        return deck.size();
    }
}
