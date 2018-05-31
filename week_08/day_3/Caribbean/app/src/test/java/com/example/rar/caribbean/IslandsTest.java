package com.example.rar.caribbean;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class IslandsTest {

    Islands islands;

    @Before
    public void before(){
        islands = new Islands(9, "Jamaica", 2800000);
    }

    @Test
    public void canGetRanking(){
        assertEquals((Integer) 9, islands.getRanking());
    }

    @Test
    public void canGetName(){
        assertEquals("Jamaica", islands.getName());
    }

    @Test
    public void canGetPopulation(){
        assertEquals((Integer)2800000, islands.getPopulation());
    }


}
