    package com.codedifferently.walkthrough.vendingmachine.inventory;

    public class Beverage extends Product{

        public Beverage(String nameIn, Double priceIn){
            super(nameIn, priceIn);
            this.message();
        }

        public Beverage() { this("Coca Cola products", 1.0);}

        @Override
        public String toString() { return "Glug Glug Yum!"; }

        @Override
        public String message() {
            String msg = "Glug Glug Yum!";
            super.msg = msg;
            return msg;
        }
    }



