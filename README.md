# Delivery Tech API

![Badge de Status](https://img.shields.io/badge/status-em%20desenvolvimento-orange)
![Versão do Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.x-green)
![Versão do Java](https://img.shields.io/badge/Java-21%20LTS-blue)

Uma **API de delivery moderna e eficiente** construída com **Spring Boot** e **Java 21**, demonstrando a utilização de recursos avançados da linguagem para otimizar o desenvolvimento e a performance.

---

## 🚀 Tecnologias e Ferramentas

Este projeto utiliza um conjunto de tecnologias de ponta para garantir um sistema robusto e escalável:

* **Java 21 LTS**: Versão de suporte de longo prazo da linguagem Java.
* **Spring Boot 3.2.x**: Framework que simplifica a criação de aplicações Java.
* **Spring Web**: Módulo para construção de APIs RESTful.
* **Spring Data JPA**: Abstração para persistência de dados.
* **H2 Database**: Banco de dados em memória, ideal para desenvolvimento e testes.
* **Maven**: Ferramenta de gerenciamento e automação de projetos.

### 🌟 Recursos Modernos do Java

Exploramos os recursos mais recentes da plataforma para um código mais limpo e legível:

* **Records** (Java 14+)
* **Text Blocks** (Java 15+)
* **Pattern Matching** (Java 17+)
* **Virtual Threads** (Java 21)

---

## 💻 Como Executar

Para executar a API em sua máquina local, siga estes passos simples:

1.  **Pré-requisitos**: Certifique-se de ter o **JDK 21** instalado.
2.  Clone o repositório para o seu ambiente local.
3.  Navegue até a raiz do projeto e execute o comando:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  Após a inicialização, a API estará acessível em `http://localhost:8080`.

---

## 📋 Endpoints da API

A aplicação oferece os seguintes endpoints para interação:

| Método | Endpoint          | Descrição                                 |
| :----- | :---------------- | :---------------------------------------- |
| `GET`  | `/health`         | Retorna o status da aplicação.            |
| `GET`  | `/info`           | Detalhes da versão e do desenvolvedor.    |
| `GET`  | `/h2-console`     | Acessa o console do banco de dados H2.    |

### Configurações Padrão
* **Porta**: `8080`
* **Banco de Dados**: H2 em memória.

---

## 👨‍💻 Desenvolvedor

**Giovanni dos Santos Silva**
* **Grupo:** TI56 02726
* **Disciplina:** Arquitetura de Sistemas

---
