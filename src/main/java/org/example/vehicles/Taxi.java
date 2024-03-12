package org.example.vehicles;

import org.example.interfaces.financial.DealerSellable;

public class Taxi extends Car implements DealerSellable {

    public Taxi(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void moveRight() {
        System.out.println("TAXI MOVE RIGHT");
    }
}
