package org.example.statics;

public class Cake {

    private String name;
    private static int cakeCount;

    public Cake(String name) {
        this.name = name;
        cakeCount++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return cakeCount;
    }

}
