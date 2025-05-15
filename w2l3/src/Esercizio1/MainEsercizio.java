package Esercizio1;

import java.time.LocalDate;
import java.util.List;

public class MainEsercizio {
    public static void main(String[] args) {

        Product p1= new Product(1L, "Halo fall of Reach", "Books", 100.00);
        Product p2= new Product(2L, "Il costruttore di stelle", "Books", 120.00);
        Product p3= new Product(3L, "Tesi di laurea triennio", "Books", 12.00);
        Product p4= new Product(4L, "Come gira il kebab?", "Books", 10.00);
        Product p5= new Product(5L, "Ciuccio", "Baby", 4.00);
        Product p6= new Product(6L, "Culla", "Baby", 50.0);
        Product p7= new Product(7L, "Pigiamino", "Baby", 8.00);
        Product p8= new Product(8L, "Scarpe", "Boys", 60.00);
        Product p9= new Product(9L, "Cappello sport", "Boys", 15.00);
        Product p10= new Product(10L, "Tuta Nike", "Boys", 40.00);

        //adesso che ho i miei prodotti li inserisco in una lista
        List<Product> prodotti = List.of(p1,p2,p3,p4,p5,p6, p7, p8, p9,p10);

        Customer c1 = new Customer(1L, "Alfredo", 1);
        Customer c2 = new Customer(2L, "Gabriele", 2);
        Customer c3 = new Customer(3L, "Jhonatan", 2);

        Order o1 = new Order(1L, "spedito", LocalDate.of(2025, 1, 29), LocalDate.of(2025,1,31));
        Order o2 = new Order(2L, "spedito", LocalDate.of(2025, 2, 15), LocalDate.of(2025,2,18));
        Order o3 = new Order(3L, "spedito", LocalDate.of(2025, 3, 20), LocalDate.of(2025,3,25));
        Order o4 = new Order(4L, "spedito", LocalDate.of(2025, 4, 16), LocalDate.of(2025,4,18));
        Order o5 = new Order(5L, "spedito", LocalDate.of(2025, 5, 2), LocalDate.of(2025,5,6));
        Order o6 = new Order(6L, "spedito", LocalDate.of(2025, 6, 10), LocalDate.of(2025,6,15));

        //creo una lista di ordini
        List<Order> ordini = List.of(o1, o2, o3, o4, o5, o6);


        //usando setCustomer associ un Customer a un Order
        o1.setCustomer(c1);

        //nella classe Order c'è una variabile di istanza per poter inserire una lista di prodotti
        //questa fariante diventa setProdotti e mi permette di inserire qualcosa tramite il metodo List.of()
        o1.setProdotti(List.of(p1,p2,p3,p4));

        o2.setCustomer(c2);
        o2.setProdotti(List.of(p5,p6,p7));

        o3.setCustomer(c3);
        o3.setProdotti(List.of(p8,p9,p10));


        o4.setCustomer(c1);
        o4.setProdotti(List.of());

        o5.setCustomer(c2);
        o5.setProdotti(List.of());

        o6.setCustomer(c3);
        o6.setProdotti(List.of());

        //adesso associamo gli oridni ai clienti e ai prodotti

        //prodotti = lista da elaborare
        //stream = converte in lusso di dati
        //filter = filtra i dati
        List<Product> exerc1 = prodotti.stream().filter(product -> product.getCategory().equals("Books")&&product.getPrice()>=100).toList();

        System.out.println(exerc1);

        System.out.println("---- separatore ---");

        List<Order> exerc2 = ordini.stream().filter(order -> order.getProdotti().stream().
                anyMatch(product -> product.getCategory().equals("Baby"))).toList();

        System.out.println(exerc2);

        System.out.println("---- separatore ---");

        /* ---- ---- */

        //esercizio3
        //filtro i prodotti per categoria Boys e poi mappo ogni prodotto con un prodotto il cui prezzo
        //è diminuito del 10%
        List<Product> esercizio3 =prodotti.stream().filter(product -> product.getCategory().equals("Boys")).
                map(product -> {product.setPrice(product.getPrice()*0.9);
                    return product;}).toList();

        System.out.println(esercizio3);


        System.out.println("--------------");
        //esercizio4

        List<Product> esercizio4 =ordini.stream().filter(order -> order.getCustomer().getTier()==2).
                filter(order -> order.getOrderDate().isAfter(LocalDate.of(2021,2,1))&&
                        order.getOrderDate().isBefore(LocalDate.of(2021,4,1))).
                flatMap(order -> order.getProdotti().stream()).toList();

        System.out.println(esercizio4);


    }
}
