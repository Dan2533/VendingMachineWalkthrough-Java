package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.Chips;
import org.junit.Assert;
import org.junit.Test;

public class ChipsTest {

    @Test public void constructorTest() {
        //Given
        String name = "Classic";
        Double price = 1.0;
        Chips chips = new Chips(name, price);

        //When
        String expectedName = "Classic";
        Double expectedPrice = 1.0;

        String actualName = chips.getName();
        Double actualPrice = chips.getPrice();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice, actualPrice, 1.0);

    }
    @Test
    public void messageTest() {
        //Given
        Chips chips = new Chips();

        //When
        String expected = "Crunch Crunch Yum!";
        String actual = chips.message();

        //Then

        Assert.assertEquals(expected, actual);
    }
}
