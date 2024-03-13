package org.example.foods;

import org.example.interfaces.financial.DealerSellable;

public class Fruit extends Food implements DealerSellable {


    public Fruit(String name) {
        super(name);
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
        return name;
    }
}
