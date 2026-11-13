
import java.util.ArrayList;
import java.util.Comparator;

public class Hands {

    private final ArrayList<Cards> hand = new ArrayList<>();

    public Hands() {
    }

    public void addCards(Cards card) {
        hand.add(card);
    }

    public void sortHand() {
        hand.sort(Comparator.comparing(Cards::getSuits).thenComparing(Cards::getValues));
    }

    public int getHandSize() {
        return hand.size();
    }

    public ArrayList<Cards> getHand() {
        return hand;
    }
}
