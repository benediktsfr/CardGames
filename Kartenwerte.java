public enum Kartenwerte {
    KOENIG  ("König"),
    DAME    ("Dame"),
    BUBE    ("Bube"),
    ASS     ("Ass"),
    ZEHN    ("10"),
    NEUN    ("9"),
    ACHT    ("8"),
    SIEBEN  ("7"),
    SECHS   ("6"),
    FUENF   ("5"),
    VIER    ("4"),
    DREI    ("3"),
    ZWEI    ("2"),
    JOKER   ("Joker");

    private final String displayName;

    Kartenwerte(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
