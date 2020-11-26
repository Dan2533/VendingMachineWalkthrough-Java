package com.codedifferently.walkthrough.vendingmachine.inventory;

public abstract class Product {

    private String name;
    private Double price;
    protected String msg;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){

        return name;
    }

    public Double getPrice(){

        return price;
    }

    @Override
    public String toString(){
        return name + " " + price;
    }

    public abstract String message();
}
