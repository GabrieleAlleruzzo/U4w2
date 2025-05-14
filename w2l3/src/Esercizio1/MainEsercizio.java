package Esercizio1;

public class MainEsercizio {
    public static void main(String[] args) {


        List<Product> result = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
    }
}
