import java.time.LocalDate;
import java.util.Objects;

public class Medium {

    private String titel;

    private Urheber urheber;

    private Genre genre;

    private String kommentar;

    private LocalDate erscheinungsdatum;

    public Medium(String titel, Urheber urheber, Genre genre, String kommentar, LocalDate erscheinungsdatum) {
        setTitel(titel);
        setGenre(genre);
        setErscheinungsdatum(erscheinungsdatum);
        setUrheber(urheber);
        setKommentar(kommentar);
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        Objects.requireNonNull(titel);
        this.titel = titel;
    }

    public Urheber getUrheber() {
        return urheber;
    }

    public void setUrheber(Urheber urheber) {
        Objects.requireNonNull(urheber);
        this.urheber = urheber;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        Objects.requireNonNull(genre);
        this.genre = genre;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        Objects.requireNonNull(kommentar);
        this.kommentar = kommentar;
    }

    public LocalDate getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(LocalDate erscheinungsdatum) {
        Objects.requireNonNull(erscheinungsdatum);
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void anzeigen(){
        System.out.println("Titel: " + this.titel);
        System.out.println("Erscheinungsdatum: " + this.erscheinungsdatum);
        System.out.println("Kommentar: " + this.kommentar);
        System.out.println("Genre: " + this.genre);
    }
}
