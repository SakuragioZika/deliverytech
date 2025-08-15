package com.deliverytech.delivery_api.controller;

import com.deliverytech.delivery_api.dto.ClientDTO;
import com.deliverytech.delivery_api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// A anotação @RestController combina @Controller e @ResponseBody.
// @RequestMapping define o path base para todas as rotas neste controller.
@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    // A anotação @Autowired é usada para injeção de dependência do ClientService.
    @Autowired
    private ClientService clientService;

    // A anotação @GetMapping mapeia requisições HTTP GET para este método.
    // O endpoint completo será http://localhost:8080/api/v1/clients.
    @GetMapping
    public List<ClientDTO> getAllClients() {
        return clientService.findAll();
    }
}
