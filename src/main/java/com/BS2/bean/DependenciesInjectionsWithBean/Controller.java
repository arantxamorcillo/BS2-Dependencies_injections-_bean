package com.BS2.bean.DependenciesInjectionsWithBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    List<City> cityList;

    @PostMapping("/controller/addPerson")
    public String addCity(@RequestBody City city){
        cityList.add(city);
        return "city " + city.toString() + " added";
    }

    @GetMapping("/controller/getCity")
    public List getCityList(){
        return  cityList;
    }

}
