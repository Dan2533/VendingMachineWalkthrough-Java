package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Chips extends Product {

    public Chips(String nameIn, Double priceIn) {
        super(nameIn, priceIn);
        this.message();
    }
    public Chips() { this("Herr's", 1.00);}

    @Override
    public String toString() { return "Crunch Crunch Yum!"; }

    @Override
    public String message() {
        String msg = "Crunch Crunch, Yum!";
        super.msg = msg;
        return msg;
    }
}


