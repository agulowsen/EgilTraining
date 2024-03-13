package org.example.vehicles;

import org.example.interfaces.financial.DealerSellable;
import org.example.interfaces.financial.PrivatelySellable;

public class PersonalCar extends Car implements DealerSellable, PrivatelySellable {

    public PersonalCar(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public int getSellPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
