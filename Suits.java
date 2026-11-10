public enum Suits {
    CLUBS("CLUBS"),
    SPADES("SPADES"),
    HEARTS("HEARTS"),
    DIAMONDS("DIAMONDS");

    private final String displayName;

    Suits(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}