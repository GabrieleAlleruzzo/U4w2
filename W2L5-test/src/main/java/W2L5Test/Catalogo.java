package W2L5Test;

import java.time.LocalDate;

public class Catalogo {
    private String ISBN;
    private String Titolo;
    private LocalDate annoPubl;
    private int pagine;

    public Catalogo(String ISBN, String titolo, LocalDate annoPubl, int pagine) {
        this.ISBN = ISBN;
        Titolo = titolo;
        this.annoPubl = annoPubl;
        this.pagine = pagine;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public LocalDate getAnnoPubl() {
        return annoPubl;
    }

    public void setAnnoPubl(LocalDate annoPubl) {
        this.annoPubl = annoPubl;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "ISBN='" + ISBN + '\'' +
                ", Titolo='" + Titolo + '\'' +
                ", annoPubl=" + annoPubl +
                ", pagine=" + pagine +
                '}';
    }
}
