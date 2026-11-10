
public class Karten {

    private final CardValues value;
    private final Suits suit;

    public Karten(Suits suit, CardValues value) {
        this.value = value;
        this.suit = suit;
    }

    public CardValues getValues() {
        return value;
    }

    public Suits getSuits() {
        return suit;
    }

    public String printKarte(String seperator) {
        return suit.getDisplayName() + seperator + value.getDisplayName();
    }
}
