package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.Candy;
import com.codedifferently.walkthrough.vendingmachine.inventory.Product;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class VendingMachineTest {
    private final static Logger logger = Logger.getLogger(VendingMachineTest.class);


    @Test
    public void stockVendingMachine(){
        String[] sample = {"A1|Hershey|1.50|Candy"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        Product expectedCandy = new Candy("Hershey", 1.50);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualCandy = inventory.get("A1");

        Assert.assertEquals(expectedCandy.getName(), actualCandy.getName());
    }
}
