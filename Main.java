package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer(store);
        Cashier cashier = new Cashier(store);
        new Thread(customer).start();
        new Thread(cashier).start();
    }
}
