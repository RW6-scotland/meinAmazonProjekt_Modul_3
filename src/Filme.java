import java.time.LocalDate;
import java.util.Objects;

public class Filme extends Medium{

    private double spielzeit;

    private String aufloesung;


    public Filme(String titel, Urheber urheber, Genre genre, String kommentar, LocalDate erscheinungsdatum, double spielzeit, String aufloesung) {
        super(titel, urheber, genre, kommentar, erscheinungsdatum);
        setSpielzeit(spielzeit);
        setAufloesung(aufloesung);
    }

    public double getSpielzeit() {
        return spielzeit;
    }

    public void setSpielzeit(double spielzeit) {
        if (spielzeit == 0) {
            throw new RuntimeException("Der Wert darf nicht 0 sein!");
        }else {
            this.spielzeit = spielzeit;
        }
    }

    public String getAufloesung() {
        return aufloesung;
    }

    public void setAufloesung(String aufloesung) {
        Objects.requireNonNull(aufloesung);
        this.aufloesung = aufloesung;
    }

    public void anzeigen(){
        super.anzeigen();
        System.out.println("Regisseur: " + this.getUrheber());
        System.out.println("Länge in Minuten: " + this.spielzeit);
        System.out.println("Aufloesung: " + this.aufloesung);
    }
}
