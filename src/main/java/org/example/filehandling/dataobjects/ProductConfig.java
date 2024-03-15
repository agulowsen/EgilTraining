package org.example.filehandling.dataobjects;

public class ProductConfig {
    private String id;
    private String location;
    private String name;

    private String token;

    public ProductConfig( String id ,String location, String name, String token) {
        this.location = location;
        this.name = name;
        this.id = id;
        this.token= token;

    }

    public String toString(){
        return token + ","  + id + "," + location +  ","  + name;
    }
}
