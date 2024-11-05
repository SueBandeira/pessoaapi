# Instruções do Processo Seletivo XYZ

## Resumo
O desafio consiste em criar uma API CRUD básica conectada a um banco de dados relacional (Postgres, MySQL, SQLite ou MS SQL Server). A API deve ser publicada em um repositório público no GitHub, contendo um arquivo `.sql` para criação do banco de dados e suas tabelas, além de um arquivo `.env` com as informações de configuração do ambiente. A API será avaliada quanto à funcionalidade, qualidade de código e performance, seguindo a documentação no arquivo `README.md`, que deve incluir:

- Descrição da API
- Rotas disponíveis
- Instruções de uso
- Passos para inicializar o serviço

## Endpoints
A API deve ter os seguintes 5 endpoints:

- **POST** `/pessoas` - Criação de uma nova pessoa
- **GET** `/pessoas/:id` - Consulta de informações de uma pessoa
- **GET** `/pessoas?t=:termo` - Busca de pessoas por termo
- **PUT** `/pessoas/:id` - Atualização de dados de uma pessoa
- **DELETE** `/pessoas/:id` - Remoção de uma pessoa do banco

## Detalhes dos Endpoints

### Criação de Pessoas
**POST** `/pessoas`

Aceita um objeto JSON com os seguintes atributos:

Atributo: Descrição

`apelido`: Obrigatório, único, string de até 32 caracteres

`nome`: Obrigatório, string de até 100 caracteres

`nascimento`: Obrigatório, data no formato `AAAA-MM-DD`

`stack`: Opcional, vetor de strings de até 32 caracteres cada

**Resposta bem-sucedida**: Status code `201 - Created`.

**Exemplo de requisição válida**:
```json
{
    "apelido": "josé",
    "nome": "José Roberto",
    "nascimento": "2000-10-01",
    "stack": ["C#", "Node", "Oracle"]
}
```

**Exemplo de requisição inválida**:
```json
{
    "apelido": "ana",
    "nome": null,
    "nascimento": "1985-09-23",
    "stack": null
}

```

### Detalhe de uma Pessoa
**GET** /pessoas/:id

Retorna os detalhes de uma pessoa cadastrada pelo id.

**Exemplo de requisição válida**:
```json
{
    "apelido": "josé",
    "nome": "José Roberto",
    "nascimento": "2000-10-01",
    "stack": ["C#", "Node", "Oracle"]
}
```
Status de resposta:

`200 - OK` para sucesso
`404 - Not Found` se o id não for encontrado

### Busca por Termos
**GET** /pessoas?t=:termo

Busca detalhes de pessoas que contenham o termo no apelido, nome ou elementos da stack.

**Exemplo de resposta**:
```json
[{
    "id": 321,
    "apelido": "josé",
    "nome": "José Roberto",
    "nascimento": "2000-10-01",
    "stack": ["C#", "Node", "Oracle"]
}]
```
Status de resposta:

`200 - OK` para requisições válidas (lista vazia se não houver resultados)
`400 - Bad Request` se o termo não for informado

### Alteração de Pessoas
**PUT** /pessoas/:id

Atualiza informações de uma pessoa existente. Aceita um JSON com os mesmos parâmetros da rota de criação.

Status de resposta:

`200 - OK` para sucesso
`422 - Unprocessable Entity` para JSON inválido

Exclusão de Pessoas
DELETE /pessoas/:id

### Exclui uma pessoa do banco de dados pelo id.

Status de resposta:

`204 - No Content` se a exclusão for bem-sucedida (sem conteúdo no retorno)
`400 - Bad Request` em caso de erro

### Observações
O arquivo .env deve conter informações sobre:
Credenciais de login no banco de dados
Porta utilizada pela API
Linguagem e versão usadas no projeto
Inclua um arquivo com as dependências utilizadas no desenvolvimento da API (e.g., requirements.txt para Python, package.json para JavaScript/TypeScript).

`Boa sorte com o desenvolvimento!`