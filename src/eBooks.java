import java.time.LocalDate;

public class eBooks extends Medium{

    private String isbn;

    private int seitenanzahl;

    private String auflage;

    public eBooks(String titel, Urheber urheber, Genre genre, String kommentar, LocalDate erscheinungsdatum, String isbn, int seitenanzahl, String auflage)
    {
        super(titel, urheber, genre, kommentar, erscheinungsdatum);
        setIsbn(isbn);
        setSeitenanzahl(seitenanzahl);
        setAuflage(auflage);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public String getAuflage() {
        return auflage;
    }

    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }

    public void anzeigen(){
        super.anzeigen();
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Seitenanzahl: " + this.seitenanzahl);
        System.out.println("Auflage: " + this.auflage);
        System.out.println("Autor: " + this.getUrheber());
    }
}
