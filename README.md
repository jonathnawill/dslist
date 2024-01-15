# DSList
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/jonathnawill/dslist/blob/main/LICENSE) 

# Sobre o projeto

DSList é uma API Rest construída durante o Intensivão Java Spring, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A API é uma pesquisa de jogos que permite aos usuários encontrar informações sobre diferentes jogos.
Os usuários podem realizar buscas com base no gênero e na classificação dos jogos.
A API também possui um endpoint que permite ao usuário organizar a lista da maneira que preferir.

## Modelo de Domínio 

![App Screenshot](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## End Points
- `GET Games`: Busca a lista de jogos
- `GET Games by ID`: Busca um jogo por meio do ID
- `GET Lists`: Busca a categoria das listas de jogos
- `GET Lists by ID from Games`: Busca a lista categorizado pelo gênero (ID) do jogos
- `POST Lists Replacement`: Permite o usuário organizar a lista da maneira que preferir

## :bookmark_tabs: Documentação da API

#### URL base

```https
  http://localhost:8080/dslist/
```


#### Obter Listagem dos Games Cadastrados

```https
  GET /games
```


#### Buscar Listagem dos Games Cadastrados Pelo Id

```https
  GET /games/{id}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id do Game |


#### Obter Listagem das Listas de Games Cadastrados

```https
  GET /lists
```


#### Buscar Listagem das Listas de Games Cadastrados Pelo Id da Lista

```https
  GET /lists/{id}/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |


#### Mudar a posição do Game dentro de uma Lista de Game

```https
  POST /lists/{id}/replacement
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |
| `body` | `ReplacementDTO` | **Obrigatório**. Informações da posição de origem e posição destino |



## Retorno da API em produção Railway
- GET /games
![Screenshot](https://github.com/jonathnawill/dslist/assets/104990020/7a806bf6-03e4-4b77-a35c-9389210ea581)
- GET /lists/{id}/games
![Screenshot](https://github.com/jonathnawill/dslist/assets/104990020/cead8b54-e840-4104-aad3-4246ed587ec2)
- GET /lists
![Screenshot](https://github.com/jonathnawill/dslist/assets/104990020/60746ef5-1666-4622-b998-db91c1b3bbdb)



# Tecnologias utilizadas

## Back end
- Java
- Spring Boot
- PostgreSQL
  
# Como executar o projeto
### Pré-requisitos: Java 17

```bash
# Clonar repositório
git clone https://github.com/jonathnawill/dslist

# Entrar na pasta do projeto back end
cd dslist-backend

# Executar o projeto
./mvnw spring-boot:run
```

# Autor
[Jonathan William](https://www.linkedin.com/in/jonathan-william-601467177/)
