package com.deliverytech.delivery_api.service;

import com.deliverytech.delivery_api.dto.RestaurantDTO;
import com.deliverytech.delivery_api.Model.Restaurant;
import com.deliverytech.delivery_api.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository RestaurantRepository;

    @PostConstruct
    public void init() {
        if (RestaurantRepository.count() == 0) {
            RestaurantRepository.save(new Restaurant("Pizzaria do Bairro", "Rua das Flores, 123"));
            RestaurantRepository.save(new Restaurant("Churrascaria Gaúcha", "Avenida Principal, 456"));
        }
    }

    public List<RestaurantDTO> findAll() {
        return RestaurantRepository.findAll().stream()
                .map(RestaurantDTO::from)
                .collect(Collectors.toList());
    }
}
