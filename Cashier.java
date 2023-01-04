package com.company;

public class Cashier implements Runnable{

    private Store item;

    public Cashier(Store item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            item.add();
        }
    }
}
