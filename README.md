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



Como executar

1- Clone o repositório

2- Abra o MySQL Workbench

3- Execute o arquivo database.sql

4- Configure usuário e senha do banco na classe ConnectionFactory

5- Execute a classe principal do projeto

Objetivo do projeto

Este projeto foi desenvolvido com foco em prática de:

.lógica de programação

.orientação a objetos

.organização em camadas

.integração de Java com banco de dados

.evolução de um sistema que antes utilizava ArrayList para uma versão com persistência real
