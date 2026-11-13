
public class Cards {

    private final CardValues value;
    private final Suits suit;

    public Cards(Suits suit, CardValues value) {
        this.value = value;
        this.suit = suit;
    }

    public CardValues getValues() {
        return value;
    }

    public Suits getSuits() {
        return suit;
    }

    public String printCards(String seperator) {
        return value.getDisplayName() + seperator + suit.getDisplayName();
    }
}
