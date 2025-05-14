package Esercizio1;

public class Customer {
    private long id;
    private String name;
    private int integer;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getInteger() {
        return integer;
    }

    public Customer (long id, String name, int integer) {
        this.id = id;
        this.name=name;
        this.integer=integer;
    }
}

