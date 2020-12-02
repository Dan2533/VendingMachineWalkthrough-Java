package com.codedifferently.walkthrough.vendingmachine;
import com.codedifferently.walkthrough.vendingmachine.menu.Menu;
import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine<Product> {
    private Scanner scan;
    private Map <String, Product> inventory;
    public VendingMachine() {
        this.scan = new Scanner(System.in);
        this.inventory = new HashMap<>();
    }
    private void init(){
        try {
            String output = readRawDataToString();
             String[] products = output.split("\n");
            System.out.println("I should have four products, " + products.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void stockVendingMachine(String[] products){

    }
    private String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("inventory2.txt"));
        return result;
    }

    public void start(){
        init();
        System.out.println("Welcome to Tasty Snack Vending Machine ");
        boolean flag = true;
        ArrayList<String> options = new ArrayList<>();
        options.add("(1)Display Vending Machine Items");
        options.add("(2)Purchase");
        options.add("(3)Exit");
        Menu menu = new Menu(options);
        while (flag) {
            for(String option : menu.getOptions()){
                System.out.println(option);
            }
            String input = scan.next();

            if (input.equals("3")) {
                flag = false;
                System.out.println("Goodbye");

            } else {
                System.out.println("Try again");
            }
        }scan.close();
    }
    public Map<String,Product> getInventory(){
        return this.inventory;
    }
    public static void main(String[] args){

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.start();
    }

    }
