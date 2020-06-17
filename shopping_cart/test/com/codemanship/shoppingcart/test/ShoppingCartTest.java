package com.codemanship.shoppingcart.test;

import com.codemanship.shoppingcart.Item;
import com.codemanship.shoppingcart.ShoppingCart;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ShoppingCartTest {

    @Test
    public void totalOfEmptyCartIsZero(){
        ShoppingCart cart = new ShoppingCart(new ArrayList<>());
        double total = cart.total();
        assertEquals(0, total, 0);
    }

    @Test
    @Parameters({
            "100.0,1,1,100.0",
            "50.0,1,1,50.0",
            "100.0,1,2,200.0"
    })
    public void totalOfCartIsSumOfItemUnitPrices(double unitPrice, int quantity, int itemCount, double expectedTotal){
        List<Item> items = createItems(unitPrice, quantity, itemCount);
        ShoppingCart cart = new ShoppingCart(items);
        double total = cart.total();
        assertEquals(expectedTotal, total, 0);
    }

    private List<Item> createItems(double unitPrice, int quantity, int itemCount) {
        List<Item> items = new ArrayList<>();
        for(int i = 0;i < itemCount;i++){
            items.add(new Item(unitPrice, quantity));
        }
        return items;
    }
}
