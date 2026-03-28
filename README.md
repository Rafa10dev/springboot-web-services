# 🚀 Spring Boot Web Services

Projeto desenvolvido com o objetivo de praticar e consolidar conhecimentos em desenvolvimento backend utilizando Java e Spring Boot, com foco na criação de APIs RESTful.

## 📖 Sobre o projeto

Este projeto consiste em uma API que realiza operações básicas de um sistema web, aplicando conceitos importantes como:

- Arquitetura em camadas (Controller, Service, Repository)
- Criação de endpoints REST
- Manipulação de dados com JPA/Hibernate
- Integração com banco de dados
- Tratamento de exceções
- Boas práticas de desenvolvimento backend

## 🛠️ Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- Banco de dados (H2 ou PostgreSQL, dependendo da configuração)
- API REST

## 📂 Estrutura do projeto

O projeto segue uma arquitetura organizada em camadas:

src/
├── main/
│ ├── java/
│ │ ├── entities # Classes de entidade (modelo do banco)
│ │ ├── repositories # Interfaces de acesso a dados
│ │ ├── services # Regras de negócio
│ │ ├── resources # Controllers (endpoints da API)
│ │ └── config # Configurações do sistema
│ └── resources/
│ ├── application.properties

## ⚙️ Como executar o projeto

### Pré-requisitos

- Java JDK 17+ instalado
- Maven instalado
- IDE (IntelliJ, Eclipse, VS Code)

### Passos

1. Clone o repositório:

bash
git clone https://github.com/Rafa10dev/springboot-web-services.git
Acesse a pasta do projeto:
cd springboot-web-services
Execute o projeto:
./mvnw spring-boot:run

ou pela sua IDE, rodando a classe principal.

🔗 Endpoints

Exemplo de endpoints disponíveis:

GET /users → Lista todos os usuários
GET /users/{id} → Busca usuário por ID
POST /users → Cria um novo usuário
PUT /users/{id} → Atualiza um usuário
DELETE /users/{id} → Remove um usuário

(Os endpoints podem variar conforme sua implementação)

🧪 Testes

Você pode testar a API utilizando:

Postman
Insomnia
Navegador (para requisições GET)

📚 Aprendizados

Durante o desenvolvimento deste projeto, foram praticados:

Criação de APIs REST com Spring Boot
Integração com banco de dados relacional
Uso de JPA e Hibernate
Organização de código em camadas
Boas práticas de backend
