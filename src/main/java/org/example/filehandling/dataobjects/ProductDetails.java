package org.example.filehandling.dataobjects;

public class ProductDetails {

    private String id;
    private String expireDate;
    private int stock;

    public ProductDetails(String id, String expireDate, int stock) {
        this.id = id;
        this.expireDate = expireDate;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return id + "," + expireDate + "," + stock;
    }
}
