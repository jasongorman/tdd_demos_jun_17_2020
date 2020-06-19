package com.codemanship.cdwarehouse;

import java.util.List;

public class Warehouse {
    private final List<CD> catalogue;

    public Warehouse(List<CD> catalogue) {
        this.catalogue = catalogue;
    }

    public CD search(String artist, String title) {
        return catalogue.get(0);
    }
}
