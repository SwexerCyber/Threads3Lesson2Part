package com.company;

public class Store {
    private int product = 0;

    synchronized void buy(){
        while (product < 1){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Поток прерван");
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Кол-во товаров на складе: " + product);
        notify();
    }

    synchronized void add(){
        while (product > 2){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Поток прерван");
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Кол-во товаров на складе: " + product);
        notify();
    }
    // коммит
}
