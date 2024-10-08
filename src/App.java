import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Medium film1 = new Filme("Joker", new Urheber("Phillip", "Todd", "DC"), new Genre("Thriller"), "War ein guter Film!", LocalDate.of(2019,1,1), 130, "UHD");
        Medium buch1 = new eBooks("Harry Potter und der Stein der Weisen", new Urheber("Joanne", "Rowling", "Blumsburry"), new Genre("Trhiller"), "Sehr spannedes Buch", LocalDate.of(1997, 6, 26), "9780807286005", 336, "430");

        Medienbibliothek medienbibliothek1 = new Medienbibliothek();

        medienbibliothek1.mediumHinzufugen(film1);
        medienbibliothek1.mediumHinzufugen(buch1);

        medienbibliothek1.anzeigen();

        medienbibliothek1.titelAnzeigen();
    }
}