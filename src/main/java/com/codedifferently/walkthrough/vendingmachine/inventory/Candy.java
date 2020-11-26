package com.codedifferently.walkthrough.vendingmachine.inventory;

import com.codedifferently.walkthrough.vendingmachine.inventory.Product;

public class Candy extends Product {

    public Candy(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        this.message();
    }
    public Candy() {this( "Kids Munch", 1.5);}

    @Override
    public String toString() {return "Munch Munch, Yum";}

    @Override
    public String message() {
        String msg = "Munch Munch, Yum";
        super.msg = msg;
        return msg;
    }
}