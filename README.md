# NeoLider

NeoLider é um sistema de gerenciamento de usuários e estoque desenvolvido em **Java**, com arquitetura em camadas e persistência de dados em **MySQL** via **JDBC**.

## Tecnologias utilizadas

- Java
- JDBC
- MySQL
- Programação Orientada a Objetos (POO)
- Arquitetura em camadas

## Estrutura do projeto

- `model`
- `repository`
- `service`
- `controller`
- `database`

## Funcionalidades

### Usuários
- Login com dados persistidos no banco
- Cadastro de usuários
- Listagem de usuários
- Filtro por setor/cargo

### Estoque
- Cadastro de itens
- Listagem de estoque
- Filtro de itens por nome
- Filtro de itens por ID
- Exclusão de itens

## Banco de dados

O projeto utiliza **MySQL** para persistência de dados.

### Tabelas principais
- `users`
- `estoq`

O script de criação do banco está no arquivo:

```text
database.sql
