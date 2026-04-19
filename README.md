# biblioteca-com-redis-java

Descrição
---------
Projeto de biblioteca pessoal usando Java 21, Spring Boot, Redis e MySQL.

Dependências
------------
O projeto usa o Java 21 e as seguintes dependências:

* Spring Boot 4.0.5
* Spring Data JPA
* Spring dotenv
* Devtools
* Lombok
* Swagger
* OpenAPI
* jUnit
* Mockito
* MySQL
* Redis
* H2 Database

Documentação da API
-------------------
A documentação da API pode ser vista através do Swagger e do Redoc.<br>

<b>Documentação da API via Swagger:</b>
```shell script
http://localhost:8082/swagger
```

<b>Documentação da API via Redoc:</b>
```shell script
http://localhost:8082/redoc
```

Banco de dados
--------------
O projeto usa o MySQL como banco da dados para o ambiente local e de produção, o Redis para cache e o H2 para os testes.
<br>

Configurações projeto:
---------------------
Crie o arquivo <b>`.env`</b> na raiz do projeto e adicione as seguinte variáveis nele:<br>
DB_URL=URL do bando de dados <br>
DB_USERNAME=usuário do bando da dados <br>
DB_PASSWORD=senha do bando da dados <br>

Gerando o arquivo .jar
----------------------
Para gerar o arquivo <b>.jar</b>, execute o comando na raiz do projeto:
```shell script
mvn clean install -P{profile} -DskipTests
```
Autor
-----
<b>Rodrigo Amora</b>

LinkedIn: https://linkedin.com/in/rodrigoamora <br>
E-mail: rodrigo.amora.freitas@gmail.com
