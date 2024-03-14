package org.example.filehandling.dataobjects;

public class Product {

    private String name;
    private String id;

    public Product(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "," + name;
    }
}
