package W2L5Test;

import java.time.LocalDate;

public class Riviste extends Catalogo{
   private Pubblicazioni Periodicità;


    public Riviste(String ISBN, String titolo, LocalDate annoPubl, int pagine, Pubblicazioni periodicità) {
        super(ISBN, titolo, annoPubl, pagine);
        Periodicità = periodicità;
    }

    public Pubblicazioni getPeriodicità() {
        return Periodicità;
    }

    public void setPeriodicità(Pubblicazioni periodicità) {
        Periodicità = periodicità;
    }

    @Override
    public String toString() {
        return super.toString() + "Riviste{" +
                "Periodicità=" + Periodicità +
                '}';
    }
}
