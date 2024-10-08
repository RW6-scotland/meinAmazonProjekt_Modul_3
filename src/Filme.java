import java.time.LocalDate;

public class Filme extends Medium{

    private double spielzeit;

    private String auflösung;


    public Filme(String titel, Urheber urheber, Genre genre, String kommentar, LocalDate erscheinungsdatum, double spielzeit, String auflösung) {
        super(titel, urheber, genre, kommentar, erscheinungsdatum);
        setSpielzeit(spielzeit);
        setAuflösung(auflösung);
    }

    public double getSpielzeit() {
        return spielzeit;
    }

    public void setSpielzeit(double spielzeit) {
        this.spielzeit = spielzeit;
    }

    public String getAuflösung() {
        return auflösung;
    }

    public void setAuflösung(String auflösung) {
        this.auflösung = auflösung;
    }

    public void anzeigen(){
        super.anzeigen();
        System.out.println("Regisseur: " + this.getUrheber());
        System.out.println("Spielzeit: " + this.spielzeit);
        System.out.println("Auflösung: " + this.auflösung);
    }
}
