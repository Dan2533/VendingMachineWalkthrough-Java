package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.Beverage;
import org.junit.Assert;
import org.junit.Test;

public class BeverageTest {

    @Test
    public void constructorTest() {

        // Given
        String name = "Coke";
        Double price = 2.0;
        Beverage beverage = new Beverage(name, price);

        //When
        String expected = "coke 3.0";
        String actual = beverage.toString();


        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void messageTest() {
        //Given
        Beverage beverage = new Beverage();

        //When
        String expected = "Glug Glug Yum!";
        String actual = beverage.message();

        //Then
        Assert.assertEquals(expected, actual);


    }
}



