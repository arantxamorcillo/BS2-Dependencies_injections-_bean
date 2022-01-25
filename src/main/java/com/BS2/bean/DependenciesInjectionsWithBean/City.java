package com.BS2.bean.DependenciesInjectionsWithBean;


import lombok.Data;

@Data
public class City {
    String name;
    int population;

    @Override
    public String toString(){
        return  name + " with Population: " + population;
    }
}


