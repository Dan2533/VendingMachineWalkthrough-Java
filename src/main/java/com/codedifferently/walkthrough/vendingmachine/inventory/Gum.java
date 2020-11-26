package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Gum extends Product{

    public Gum(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        this.message();
    }

    public Gum(){
        this("Rhino Chew", 0.0);
    }

    @Override
    public String toString() {
        return "Chew Chew Yum!";
    }
    @Override
    public String message() {
        String msg = "Chew Chew, Yum!";
        super.msg = msg;
        return msg;
    }
}
