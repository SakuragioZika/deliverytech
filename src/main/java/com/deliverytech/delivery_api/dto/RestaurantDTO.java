package com.deliverytech.delivery_api.dto;

import com.deliverytech.delivery_api.Model.Restaurant;

// Record para representar o DTO do restaurante.
public record RestaurantDTO(Long id, String name, String address) {
    public static RestaurantDTO from(Restaurant restaurant) {
        return new RestaurantDTO(restaurant.getId(), restaurant.getName(), restaurant.getAddress());
    }
}