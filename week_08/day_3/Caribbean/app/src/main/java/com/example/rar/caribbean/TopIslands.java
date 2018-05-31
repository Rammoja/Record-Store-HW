package com.example.rar.caribbean;

import java.util.ArrayList;


public class TopIslands {

    private ArrayList<Islands> list;


    public TopIslands(){
        list = new ArrayList<Islands>();
        list.add(new Islands(1, "Puerto Rico", 3500000));
        list.add(new Islands(2, "Bahamas", 379000));
        list.add(new Islands(3, "Saint Barthélemy", 10000));
        list.add(new Islands(4, "St. Martin", 39000));
        list.add(new Islands(5, "Curaçao", 157000));
        list.add(new Islands(6, "Dominican Republic", 10000000));
        list.add(new Islands(7, "Cayman Islands", 59000));
        list.add(new Islands(8, "St. Kitts and Nevis", 46000));
        list.add(new Islands(9, "Jamaica", 2800000));
        list.add(new Islands(10, "US Virgin Islands", 105000));
    }

    public ArrayList<Islands> getList(){
        return new ArrayList<Islands>(list);
    }

}
