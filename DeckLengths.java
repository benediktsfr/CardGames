public enum DeckLengths {
    STANDARD(52),
    DEUTSCH(32);

    private final int amount;

    DeckLengths(int amount) {
        this.amount = amount;
    }

    public int getDeckLengths() {
        return amount;
    }
}
