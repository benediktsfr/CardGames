public enum DeckTypes {
    GERMAN(32),
    STANDARD(52),
    POKER(54),
    ROMMEE(56);

    private final int amount;

    DeckTypes(int amount) {
        this.amount = amount;
    }

    public int getDeckLengths() {
        return amount;
    }
}
