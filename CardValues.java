public enum CardValues {
    KING  ("KING"),
    QUEEN    ("QUEEN"),
    JACK    ("JACK"),
    ACE     ("ACE"),
    TEN    ("10"),
    NINE    ("9"),
    EIGHT    ("8"),
    SEVEN  ("7"),
    SIX   ("6"),
    FIVE   ("5"),
    FOUR    ("4"),
    THREE    ("3"),
    TWO    ("2"),
    JOKER   ("JOKER");

    private final String displayName;

    CardValues(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
