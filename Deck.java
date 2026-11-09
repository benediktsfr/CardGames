
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Deck {

    private Karten[] deck;

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

    public String printDeckAsList() {
        String list = deck[0].printKarte(" ");
        for (int i = 1; i < deck.length; i++) {
            list += ("\n" + deck[i].printKarte(" "));
        }
        return list;
    };

    public String printDeckAsMatrix() {
        String mat = "";
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
                mat += ebene;
                if (i < 3) {
                    mat += "\n";
                }
            }
        return mat;
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
                .thenComparing(Karten::getWert));
    }

    public void swapCardsByCard(Karten karte1, Karten karte2) {
        int index1 = findIndexOfCard(karte1.getFarbe(), karte1.getWert());
        int index2 = findIndexOfCard(karte2.getFarbe(), karte2.getWert());

        if (index1 != -1 && index2 != -1) {
            Karten temp = deck[index1];
            deck[index1] = deck[index2];
            deck[index2] = temp;
        }
    }

    public void swapCardsByIndex(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.length && index2 >= 0 && index2 < deck.length) {
            Karten temp = deck[index1];
            deck[index1] = deck[index2];
            deck[index2] = temp;
        }
    }

    // public void removeCard(int index){
    //     if (index >= 0 && index < deck.length) {
    //         Karten[] newDeck = new Karten[deck.length - 1];
    //         for (int i = 0; i < index; i++) {
    //             newDeck[i] = deck[i];
    //         }
    //         for (int i = index; i < deck.length - 1; i++) {
    //             newDeck[i] = deck[i + 1];
    //         }
    //         deck = newDeck;
    //     }
    // }
}