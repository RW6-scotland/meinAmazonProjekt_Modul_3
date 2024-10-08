import java.time.LocalDate;

public class Medium {

    private String titel;

    private Urheber urheber;

    private Genre genre;

    private String kommentar;

    private LocalDate erscheinungsdatum;

    public Medium(String titel, Urheber urheber, Genre genre, String kommentar, LocalDate erscheinungsdatum) {
        this.titel = titel;
        this.urheber = urheber;
        this.genre = genre;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Urheber getUrheber() {
        return urheber;
    }

    public void setUrheber(Urheber urheber) {
        this.urheber = urheber;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public LocalDate getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(LocalDate erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void anzeigen(){
        System.out.println("Erscheinungsdatum: " + this.erscheinungsdatum);
        System.out.println("Kommentar: " + this.kommentar);
        System.out.println("Titel: " + this.titel);
    }
}
