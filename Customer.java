package com.company;

public class Customer implements Runnable{

    private Store item;

    public Customer(Store item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            item.buy();
        }
    }
}
