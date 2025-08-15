package com.deliverytech.delivery_api.controller;

import com.deliverytech.delivery_api.dto.RestaurantDTO;
import com.deliverytech.delivery_api.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<RestaurantDTO> getAllRestaurants() {
        return restaurantService.findAll();
    }
}