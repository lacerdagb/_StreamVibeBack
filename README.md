# StreamVibe API

Este repositório contém a API backend para StreamVibe, uma aplicação de streaming de filmes. A API é construída com Java e Spring Boot, utilizando JPA para persistência de dados.

## Sumário

- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Primeiros Passos](#primeiros-passos)
  - [Pré-requisitos](#pré-requisitos)
  - [Instalação](#instalação)
  - [Executando a Aplicação](#executando-a-aplicação)
- [Endpoints da API](#endpoints-da-api)
- [Banco de Dados](#banco-de-dados)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Funcionalidades

- **Gerenciamento de Filmes**:
    - Adicionar novos filmes com detalhes como nome, estúdio, duração, imagem, gênero, diretor, elenco e sinopse.
    - Recuperar uma lista de todos os filmes ativos.
    - Atualizar informações do filme (nome, diretor, estúdio).
    - Realizar exclusão lógica de filmes (marcá-los como inativos em vez de remover fisicamente).
- **Enumeração de Gêneros**: Gêneros predefinidos para filmes.

## Tecnologias Utilizadas

- **Java 17+**: Linguagem de programação.
- **Spring Boot**: Framework para construção da API.
- **Spring Data JPA**: Para acesso e persistência de dados.
- **Lombok**: Para reduzir código boilerplate (ex: getters, setters, construtores).
- **Maven**: Gerenciamento de dependências e automação de build.
- **PostgreSQL (Recomendado)**: Banco de dados relacional.

## Estrutura do Projeto

A lógica principal do gerenciamento de filmes pode ser encontrada no pacote `com.streamvibe.api.models.filme`:

- `DadosCadastroFilme.java`: Record para dados de cadastro de filme.
- `DadosAtualizacaoFilme.java`: Record para dados de atualização de filme.
- `Filme.java`: Classe de entidade que representa um filme no banco de dados.
- `Genero.java`: Enum que define os gêneros de filmes disponíveis.
- `FilmeRepository.java`: Repositório Spring Data JPA para a entidade `Filme`.

## Primeiros Passos

### Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado:

- Java Development Kit (JDK) 17 ou superior
- Maven
- Uma instância de banco de dados PostgreSQL (ou outro banco de dados SQL compatível)
