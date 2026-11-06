public enum Kartenwerte {
    KOENIG(14, "König"),
    DAME(13, "Dame"),
    BUBE(12, "Bube"),
    ASS(11, "Ass"),
    ZEHN(10, "10"),
    NEUN(9, "9"),
    ACHT(8, "8"),
    SIEBEN(7, "7"),
    SECHS(6, "6"),
    FUENF(5, "5"),
    VIER(4, "4"),
    DREI(3, "3"),
    ZWEI(2, "2"),
    JOKER(0, "Joker");

    private final int wert;
    private final String displayName;

    Kartenwerte(int wert, String displayName) {
        this.wert = wert;
        this.displayName = displayName;
    }

    public int getWert() {
        return wert;
    }

    public String getDisplayName() {
        return displayName;
    }
}
