package W2L5Test;

public class ElementoNonTrovatoException extends RuntimeException {
    public ElementoNonTrovatoException(String isbn) {
        super("Nessun elemento trovato con ISBN: " + isbn);
    }
}
