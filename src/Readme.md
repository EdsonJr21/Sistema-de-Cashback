# Sistema de Cashback

Este projeto implementa um sistema de gerenciamento de cashback para clientes em uma aplicação de compras simples. O sistema permite adicionar clientes, registrar compras e adicionar cashback para os clientes.

## Estrutura do Projeto

- `Main.java`: Ponto de entrada do programa, gerencia o fluxo de compras e interação com o usuário.
- `Clientes.java`: Define a classe Cliente com atributos `nome` e `saldoCashBack`.
- `CashbackSystem.java`: Sistema de gerenciamento de cashback usando um `HashMap` para armazenar os clientes e seus saldos de cashback.
- `Titulo.java`: Define a classe Titulo com atributos `nome`, `valor` e `quantidade`.

## Funcionalidades

### Adicionar Clientes

Clientes podem ser adicionados ao sistema com um saldo inicial de cashback. Isso é feito no início do método `main` da classe `Main`.

### Registrar Compras

Usuários podem registrar compras fornecendo o nome do produto e o valor. Se a compra for bem-sucedida, um cashback de 10% do valor da compra é adicionado ao saldo do cliente.

### Consultar Saldo de Cashback

O saldo de cashback do cliente é exibido após uma compra bem-sucedida.

## Exemplo de Uso

```plaintext
Produtos disponíveis:
Produto: Sapato, Preço: 35.0, Quantidade: 10
Produto: Camisa, Preço: 70.0, Quantidade: 5
Produto: Calça, Preço: 49.0, Quantidade: 7
Digite seu nome:
Marcos
Digite o nome do produto que deseja comprar:
Sapato
Digite o valor do produto:
35
Compra do produto: Sapato efetuada com sucesso
Cashback adicionado: 3.5
Saldo de cashback de Marcos: 15.7
