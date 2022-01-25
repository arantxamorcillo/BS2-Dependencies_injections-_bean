package com.BS2.bean.DependenciesInjectionsWithBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DependenciesInjectionsWithBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependenciesInjectionsWithBeanApplication.class, args);
	}

	@Bean
	List<City> getCityService(){

		City city = new City();

		List <City> cityList = new ArrayList<City>();
		cityList.add(city);
		return cityList;

	}

}

