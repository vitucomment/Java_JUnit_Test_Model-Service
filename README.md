# Testes com JUnit
Modelo de testes unitários automatizados utilizando a API de testes JUnit.

O modelo foi criado utilizando práticas de TDD.

## TDD (Test driven development)

É uma técnica de desenvolvimento de software, que consiste na criação dos testes das futuras implementações.

Os testes são criados pensando em métodos que integram a regra de negócio e que podem sofrer várias modificações durante seu desenvolvimento.

Depois da criação dos testes, são desenvolvidos os métodos que serão testados, com o principal intuito de passarem nos testes.

Após a confirmação de que os métodos estão passando em todos os testes, a refatoração, última fase do TDD, é aplicada. Nessa fase, refatoramos os códigos dos métodos
criados, seguindo as boas práticas, encapsulamento etc.

## JUnit
O framework JUnit é um dos tantos frameworks criados para fins de testes na linguagem Java.

É de longe o mais utilizado para testes unitários, possuindo diversas ferramentas que auxiliam no seu desenvolvimento. Nesse modelo, são utilizadas algumas anotações
para evitar repetição de código, como @BeforeEach e @AfterAll, métodos como assertEquals() da classe Assertions entre outros.
