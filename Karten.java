
public class Karten {

    private final Kartenwerte wert;
    private final Farben farbe;

    public Karten(Farben farbe, Kartenwerte wert) {
        this.wert = wert;
        this.farbe = farbe;
    }

    public Kartenwerte getWert() {
        return wert;
    }

    public Farben getFarbe() {
        return farbe;
    }

    public String printKarte(String trenner) {
        return farbe.getDisplayName() + trenner + wert.getDisplayName();
    }
}
