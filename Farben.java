public enum Farben {
    KREUZ("Kreuz"),
    PIK("Pik"),
    HERZ("Herz"),
    KARO("Karo");

    private final String displayName;

    Farben(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}