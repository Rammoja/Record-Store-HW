package com.example.rar.caribbean;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TopIslandsTest {

    @Test
    public void canGetList(){
        TopIslands topIslands = new TopIslands();
        assertEquals(10, topIslands.getList().size());
    }
}
