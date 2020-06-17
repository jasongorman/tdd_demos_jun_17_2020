package com.codemanship.shoppingcart;

import java.util.List;

public class ShoppingCart {
    private final List<Item> items;

    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    public double total() {
        return items.stream()
                .mapToDouble((item) -> item.getUnitPrice())
                .reduce(0, (total, subtotal) -> total + subtotal);
    }
}
