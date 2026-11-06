
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Deck {

    private final Karten[] deck;

    public Deck(DeckTypes deckLength) {
        deck = new Karten[deckLength.getDeckLengths()];
        int index = 0;
        int infarbe = 0;
        int jokers = deckLength.getDeckLengths() % 4;

        while (infarbe < 4) {
            for (int i = 0; i < Math.floor(deckLength.getDeckLengths() / 4); i++) {
                deck[index] = new Karten(Farben.values()[infarbe], Kartenwerte.values()[i]);
                index++;
            }
            if (jokers > 0) {
                deck[index] = new Karten(Farben.values()[infarbe], Kartenwerte.JOKER);
                index++;
                jokers--;
            }
            infarbe++;
        }


    };

    public void printDeckAsList() {
        for (Karten i : deck) {
            System.out.println(i.printKarte(" "));
        }
    };

    public void printDeckAsMatrix() {
        int index = 0;
        int jokers = deck.length % 4;
            for (int i = 1; i < 4 + 1; i++) {
                String ebene = "";
                for (int j = 1; j < deck.length / 4 + 1; j++) {
                    ebene = ebene + "[" + deck[index].printKarte("|") + "] ";
                    index++;
                }
                if (jokers > 0) {
                    ebene = ebene + "[" + deck[index].printKarte("|") + "] ";
                    index++;
                    jokers--;
                }
                System.out.println(ebene);
            }
    };

    public int findIndexOfCard(Farben farbe, Kartenwerte wert) {

        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getWert() == wert && deck[i].getFarbe() == farbe) {
                return i;
            }
        }
        return -1;
    }

    public void shuffleDeck() {

        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Karten temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public void sortDeck() {
        Arrays.sort(deck, Comparator.comparing(Karten::getFarbe)
                .thenComparingInt((Karten karte) -> karte.getWert().getWert()).reversed());
    }
}

