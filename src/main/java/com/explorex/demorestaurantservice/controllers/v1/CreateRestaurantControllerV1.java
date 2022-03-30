package com.explorex.demorestaurantservice.controllers.v1;

import com.explorex.demorestaurantservice.logics.CreateRestaurantLogic;
import com.explorex.demorestaurantservice.models.Restaurant;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/restaurant")
public class CreateRestaurantControllerV1 {
    @RequestMapping(method = RequestMethod.POST)
    public Restaurant create(@RequestBody Restaurant newRestaurant) {
        boolean requestValidated = CreateRestaurantLogic.validateInput(newRestaurant);
        if (!requestValidated) {

        }
        Restaurant restaurant = new Restaurant();
        restaurant.setId();
        restaurant.setName(newRestaurant.getName());

        boolean responseValidated = CreateRestaurantLogic.validateOutput(restaurant);
        if (!requestValidated) {

        }
        return restaurant;
    }
}
