package org.example.vehicles;

import org.example.interfaces.financial.DealerSellable;

public class Bike extends Vehicle implements DealerSellable {
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return make + " " + model;
    }
}
