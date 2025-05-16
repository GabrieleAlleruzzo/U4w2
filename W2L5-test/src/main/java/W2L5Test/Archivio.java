package W2L5Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio {

    public static void main(String[] args) {

        Riviste r1 = new Riviste("0123456789", "Vogue - fashon design", LocalDate.of(2025, 1, 12), 24, Pubblicazioni.SETTIMANALE);
        Riviste r2 = new Riviste("0987654321", "Rouge - anarchia totale", LocalDate.of(2025, 2, 6), 48, Pubblicazioni.SEMESTRALE);
        Riviste r3 = new Riviste("0123498765", "Games&stuff - Doom is back", LocalDate.of(2025, 3, 15), 64, Pubblicazioni.MENSILE);

        Libri l1 = new Libri("0987654321", "Il costruttore di Stelle", LocalDate.of(1914, 1, 6), 256, "Olaf Stapledon", "SCI");
        Libri l2 = new Libri("1213141516", "Halo the fall of Reach", LocalDate.of(1999, 12, 1), 346, "Eric Nyulund", "SCI");
        Libri l3 = new Libri("0102030405", "Ventimila leghe sotto i mari", LocalDate.of(1934, 1, 6), 196, "Non lo so", "SCI");

        // task 1: aggiungi elementi a una lista che esclude oggetti con ISBN uguali
        System.out.println("--- Task 1 ---");
        aggElemnto(l1);
        aggElemnto(l2);
        aggElemnto(l3);
        aggElemnto(r1);
        aggElemnto(r3);
        aggElemnto(r2);

        System.out.println(archivio);

        // task 2:
        System.out.println("--- Task 2 ---");
        try {
            Catalogo trovato = cercaPerISBN("0987654321");
            System.out.println("Trovato: " + trovato.getTitolo());
        } catch (ElementoNonTrovatoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Catalogo nonEsiste = cercaPerISBN("0000000000");
            System.out.println("Trovato: " + nonEsiste.getTitolo());
        } catch (ElementoNonTrovatoException e) {
            System.out.println(e.getMessage());
        }

        //Task 3:
        System.out.println("--- Task 3 ---");
        removeElement("0102030405");
        removeElement("xxxxxxxxxx");

        System.out.println(archivio); //lo ha rimosso anche da qui

        //Task 4:
        System.out.println("--- Task 4 ---");

        System.out.println("Risultato ricerca anno:");
        List<Catalogo> ricercaAnno = trovaAnno(2025);
        System.out.println(ricercaAnno);


        /**/
        //Task 5:
        System.out.println("--- Task 5 ---");

        System.out.println("Risultato ricerca autore:");
        System.out.println("Libri di 'Eric Nyulund': " + trovaAtore("Eric Nyulund"));
    }

    //Task 1:
    private static List<Catalogo> archivio = new ArrayList<>();

     public static void aggElemnto (Catalogo elemento) {
         boolean isbnCheck = archivio.stream().anyMatch(e -> e.getISBN().equals(elemento.getISBN()));

         if (isbnCheck) {
             System.out.println("Questo ISBN: " + elemento.getISBN() + " esiste già e non lo aggiungerò lol");
         } else {
             System.out.println("Elemento aggiunto: " + elemento.getTitolo() + " ISBN: " + elemento.getISBN());
             archivio.add(elemento);
         }

     }
     //Task 2:
    public static Catalogo cercaPerISBN(String isbn) {
        return archivio.stream()
                .filter(e -> e.getISBN().equals(isbn))
                .findFirst()
                .orElseThrow(() -> new ElementoNonTrovatoException(isbn));
    }

    // Task:3
    public static void removeElement (String isbn) {
         boolean rimuove = archivio.removeIf(e-> e.getISBN().equals(isbn));
         if (rimuove) {
             System.out.println("Oggetto con ISBN " + isbn + " è stato rimosso");
         } else {
             System.out.println("Nessun Oggetto con ISBN " + isbn + "trovato");
         }
    }

    // Task:4
    public static List<Catalogo> trovaAnno (int anno) {
        return archivio.stream().filter(e -> e.getAnnoPubl().getYear() == anno).collect((Collectors.toList()));
    }
/**/
    // Task:4
    public static List<Libri> trovaAtore (String autore) {
        return archivio.stream().filter(e -> e instanceof Libri && ((Libri) e).getAutore().equalsIgnoreCase(autore)).map(e -> (Libri) e).collect(Collectors.toList());
    }
}
