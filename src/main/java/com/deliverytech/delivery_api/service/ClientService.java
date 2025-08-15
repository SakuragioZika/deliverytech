package com.deliverytech.delivery_api.service;

import com.deliverytech.delivery_api.dto.ClientDTO;
import com.deliverytech.delivery_api.Model.Client;
import com.deliverytech.delivery_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

// A anotação @Service indica que esta classe contém a lógica de negócio.
@Service
public class ClientService {

    // Injeção de dependência do repositório de clientes.
    @Autowired
    private ClientRepository clientRepository;

    /**
     * O método init() é executado automaticamente após a construção do bean.
     * Ele é usado para popular o banco de dados com dados iniciais se a tabela estiver vazia.
     */
    @PostConstruct
    public void init() {
        // Verifica se a tabela de clientes está vazia antes de adicionar dados.
        if (clientRepository.count() == 0) {
            clientRepository.save(new Client("João Silva", "joao.silva@email.com"));
            clientRepository.save(new Client("Maria Souza", "maria.souza@email.com"));
        }
    }

    /**
     * Retorna uma lista de todos os clientes no formato DTO.
     */
    public List<ClientDTO> findAll() {
        return clientRepository.findAll().stream()
                .map(ClientDTO::from)
                .collect(Collectors.toList());
    }
}
