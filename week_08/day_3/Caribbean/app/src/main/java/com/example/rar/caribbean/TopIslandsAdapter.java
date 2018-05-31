package com.example.rar.caribbean;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class TopIslandsAdapter extends ArrayAdapter<Islands> {

    public TopIslandsAdapter(Context context, ArrayList<Islands> islands){
        super(context, 0,islands);
    }

    @Override
    public View getView(int positon, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.islands_item, parent,false);
        }
        Islands currentislands = getItem(positon);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentislands.getRanking().toString());


        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentislands.getName().toString());

        TextView population = listItemView.findViewById(R.id.population);
        population.setText(currentislands.getPopulation().toString());

        return listItemView;

    }



}
