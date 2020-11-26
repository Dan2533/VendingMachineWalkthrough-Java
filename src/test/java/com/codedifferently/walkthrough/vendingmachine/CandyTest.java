package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.Candy;
import org.junit.Assert;
import org.junit.Test;

public class CandyTest {
    @Test
    public void constructorTest(){
     //Given
        String name = "Snickers";
        Double price = 1.5;
        Candy candy = new Candy(name, price);

     //When
        String expectedName = "Snicker";
        Double expectedPrice = 1.5;

        String actualName = candy.getName();
        Double actualPrice = candy.getPrice();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPrice,actualPrice, 1.5);

    }
    @Test
    public void messageTest() {
    //Given
        Candy candy = new Candy();

    // When
        String expected = "Munch Munch, Yum";
        String actual = candy.message();

     //Then
     Assert.assertEquals(expected,actual);
    }
}
