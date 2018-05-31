package com.example.rar.caribbean;


public class Islands {

    private Integer ranking;
    private String name;
    private Integer population;

    public Islands(Integer ranking, String name, Integer population){
        this.ranking = ranking;
        this.name = name;
        this.population = population;
    }

    public Integer getRanking(){
        return ranking;
    }
    public String getName(){
        return name;
    }
    public Integer getPopulation(){
        return population;
    }
}
