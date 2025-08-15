package com.deliverytech.delivery_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// A anotação @SpringBootApplication combina @Configuration, @EnableAutoConfiguration e @ComponentScan.
// Ela indica que esta é a classe principal da sua aplicação.
// A anotação @ComponentScan é necessária aqui para que o Spring encontre os componentes
// nas subpastas, já que o package base da aplicação está em 'delivery_api'.
@SpringBootApplication
@ComponentScan(basePackages = "com.deliverytech.delivery_api")
public class DeliveryApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeliveryApiApplication.class, args);
    }
}
