# API de Gestão de Clientes

API REST em **Spring Boot (Java 17)** para cadastro e gestão de clientes, com autenticação de usuários.
Trabalho acadêmico (CEUNI FAMETRO) — pacote `com.fametro.gestao_de_clientes`.

## O que a API faz

- **Clientes** (`/clientes`) — criar, listar, buscar por id, atualizar e remover.
- **Login** (`/login`) — autenticação de usuários.
- **Modelo de dados** (JPA/Hibernate): `Clientes`, `Endereco`, `HistoricoInteracoes` e `Usuarios`.

Persistência em **MySQL 8** via Spring Data JPA. No perfil de desenvolvimento o schema é recriado a cada execução
(`ddl-auto=create-drop`) e o banco é criado automaticamente (`createDatabaseIfNotExist=true`).

## Tecnologias

Java 17 · Spring Boot (Web, Data JPA) · MySQL 8 · Maven (wrapper `mvnw`) · Docker Compose (banco).

## Como usar

Requisitos: **JDK 17** e **Docker** (para o MySQL).

```bash
# 1) subir o banco MySQL
docker compose up -d

# 2) rodar a API (porta padrão 8080)
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

A aplicação conecta em `jdbc:mysql://localhost:3306/gestaodeclientesdb` (usuário/senha padrão `root`/`root`,
definidos no `docker-compose.yaml` e no `application.properties`). Ajuste essas credenciais antes de usar fora do
ambiente de desenvolvimento.

Exemplos de chamada:

```bash
# listar clientes
curl http://localhost:8080/clientes

# buscar um cliente
curl http://localhost:8080/clientes/1
```

## Como clonar

```bash
git clone https://github.com/geandreac/api-gestao-de-clientes.git
cd api-gestao-de-clientes
docker compose up -d
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```
