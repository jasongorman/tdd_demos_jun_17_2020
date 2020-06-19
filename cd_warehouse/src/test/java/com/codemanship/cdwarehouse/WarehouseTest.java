package com.codemanship.cdwarehouse;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WarehouseTest {

    @Test
    public void findsCdInCatalogue(){
        CD cd = new CD("Gary Numan", "The Pleasure Principle");
        Warehouse warehouse = new Warehouse(Arrays.asList(cd));
        assertEquals(cd, warehouse.search("Gary Numan", "The Pleasure Principle"));
    }
}
