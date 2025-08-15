package com.deliverytech.delivery_api.dto;

import com.deliverytech.delivery_api.Model.Client;

// Record para representar o DTO (Data Transfer Object) do cliente.
public record ClientDTO(Long id, String name, String email) {
    public static ClientDTO from(Client client) {
        return new ClientDTO(client.getId(), client.getName(), client.getEmail());
    }
}
