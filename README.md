# NeoLider

NeoLider é um sistema de gerenciamento de usuários e estoque desenvolvido em Java, com arquitetura em camadas e persistência de dados em MySQL via JDBC.

## Tecnologias utilizadas

- Java
- JDBC
- MySQL
- Programação Orientada a Objetos
- Arquitetura em camadas

## Estrutura do projeto

- model
- repository
- service
- controller
- database

## Funcionalidades

- Login de usuários com dados persistidos no banco
- Cadastro de usuários
- Listagem de usuários
- Cadastro de itens no estoque
- Listagem do estoque
- Filtro de itens por nome
- Filtro de itens por ID
- Exclusão de itens

## Banco de dados

O projeto utiliza MySQL para persistência de dados.

### Tabelas principais
- users
- estoq

## Como executar

1. Clone o repositório
2. Crie o banco de dados no MySQL
3. Configure a conexão na classe `ConnectionFactory`
4. Execute a classe principal do projeto

## Sobre

Projeto desenvolvido por Igor Ribeiro Cardoso de Oliveira.
