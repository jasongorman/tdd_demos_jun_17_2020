package com.codemanship.shoppingcart;

public class Item {
    private final double unitPrice;

    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
