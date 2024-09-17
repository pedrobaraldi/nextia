# nextia

## Integrantes

Bianca Barreto RM:551848

Julia Akemi RM:98032

Pedro Baraldi Sá RM:98060

Mateus Fattori RM:97904 Responsavel pelo Challenge de Java

## Swagger

https://loclahost:8080/docs

## Documenação

Dentro da Pasta documentacao está a documentação Word junto com os arquivos JSON para testar o código tanto no Postman quanto no Insominia

## Como rodar 

Deve abrir o projeto no visual studio code e com a extenção Extension Pack for Java instalada apertar F5 no tecaldo para rodar o código e importar o arquivo JSON para o Postman ou o Insominia e executar os endpoints nesses softwares

## imagem dos diagramas;

![image](https://github.com/MateusFattori/nextai/assets/83764798/036f95fa-eec2-4e42-bafa-1624da304861)

![image](https://github.com/MateusFattori/nextai/assets/83764798/d8888af4-334e-4fc1-8d2c-7d1758559943)

## Video da solução

https://youtu.be/Gbiqv_7_bpo

## Endpoints

### Cliente

`GET` /cliente

Lista todas os clientes cadastradas no sistema.

`200` sucesso

---

`GET` /cliente/{id}

Retorna os detalhes de uma cliente com o `id` informado.

**códigos de status**

`200` sucesso
`404` id não encontrado

---
`POST` /cliente

Cadastrar uma novo cliente.

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|-----------
|nome|string|✅|Um nome curto para identificar o cliente
|cpf|string|✅|Cpf do cliente para acessar sua conta
|email|string|✅|Email do cliente para criação da conta
|senha|string|✅| Senha do cliente para acessar sua conta
|genero|string|❌| Genero do cliente
|dt_nascimento|LocalDate|✅| Data de nascimento do cliente 
|pontos|int|❌|Pontos do cliente adigirido pela fidelidade com o sistema
|fidelidade|string|✅|Se o cliente é filiado ou não filiado

**códigos de status**

`201` criado com sucesso
`400` validação falhou

---

`DELETE` /cliente/{id} 

Apaga o cliente com o `id` informado.

**códigos de status**

`204` apagado com sucesso
`404` id não encontrado

---

`PUT` /cliente/{id} 

Altera o cliente com o `id` informado.

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|-----------
|nome|string|✅|Um nome curto para identificar o cliente
|cpf|string|✅|Cpf do cliente para acessar sua conta
|email|string|✅|Email do cliente para criação da conta
|senha|string|✅| Senha do cliente para acessar sua conta
|genero|string|✅| Genero do cliente
|dt_nascimento|LocalDate|✅| Data de nascimento do cliente 
|pontos|int|✅|Pontos do cliente adigirido pela fidelidade com o sistema
|fidelidade|string|✅|Se o cliente é filiado ou não filiado

**códigos de status**

`200` sucesso
`404` id não encontrado
`400` validação falhou

---

**Schema**

```js
{
	"id": 1,
	"nome": "Julia",
	"cpf": "56842367104",
	"email": "julia@gmail.com",
	"senha": "12345",
	"genero": "feminino",
	"dt_nascimento": "2003-06-24",
	"telefone": "551199789664319",
	"pontos": 0,
	"fidelidade": "NÃOFILIADO"
}

```
**Schema**

```js
{
    "id": 2,
    "nome": "Bia",
    "cpf": "56842367104",
    "email": "bia@gmail.com",
    "senha": "1234",
    "genero": "feminino",
    "dt_nascimento": "2003-06-24",
    "telefone": "55119975864319",
    "pontos": 200,
    "fidelidade": "FILIADO"
}

```

### Cliente

`GET` /produto

Lista todas os produtos cadastradas no sistema.

`200` sucesso

---

`GET` /produto/{id}

Retorna os detalhes de uma produto com o `id` informado.

**códigos de status**

`200` sucesso
`404` id não encontrado

---
`POST` /produto

Cadastrar uma novo produto.

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|-----------
|nome|string|✅|Um nome curto para identificar o produto
|categoria|string|✅|Categoria que o produto pertence
|valor|string|✅|Valor do produto

**códigos de status**

`201` criado com sucesso
`400` validação falhou

---

`DELETE` /produto/{id} 

Apaga o produto com o `id` informado.

**códigos de status**

`204` apagado com sucesso
`404` id não encontrado

---

`PUT` /produto/{id} 

Altera o produto com o `id` informado.

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|-----------
|nome|string|✅|Um nome curto para identificar o produto
|categoria|string|✅|Categoria que o produto pertence
|valor|string|✅|Valor do produto

**códigos de status**

`200` sucesso
`404` id não encontrado
`400` validação falhou

---

**Schema**
```js
{
	"id": 1,
	"nome": "Arroz",
	"categoria": "gãos",
	"valor": 45.99
}

```
