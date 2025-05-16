package W2L5Test;

import java.time.LocalDate;

public class Libri extends Catalogo{
    private String Autore;
    private String Genere;

    public Libri(String ISBN, String titolo, LocalDate annoPubl, int pagine, String autore, String genere) {
        super(ISBN, titolo, annoPubl, pagine);
        Autore = autore;
        Genere = genere;
    }

    public String getAutore() {
        return Autore;
    }

    public void setAutore(String autore) {
        Autore = autore;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }

    @Override
    public String toString() {
        return super.toString() + "Libri{" +
                "Autore='" + Autore + '\'' +
                ", Genere='" + Genere + '\'' +
                '}';
    }
}
