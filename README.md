# Desafio de Controle de Gastos no Cartão de Crédito
Este é um projeto simples em Java criado como parte de um desafio da formação ONE (Oracle Next Education). O objetivo deste programa é simular compras realizadas com um cartão de crédito, verificando o saldo restante no cartão e informando o usuário se o limite foi ultrapassado.

## Funcionalidades
- O usuário pode inserir o limite do cartão.
- Permite adicionar várias compras até que o saldo se esgote ou o limite seja ultrapassado.
- Para cada compra, o programa solicita a descrição e o valor.
- O programa verifica se o valor da compra não ultrapassa o limite disponível.
- Exibe um resumo das compras realizadas e o saldo restante no cartão.

## Como usar
### Executar o programa:

- O programa solicitará o limite do cartão.
- Para cada compra, você deve inserir uma descrição e o valor.
- O saldo do cartão será atualizado após cada compra.
- O programa permite continuar fazendo compras até que o limite seja atingido ou até o usuário decidir parar.
  
### Encerrar o programa:

- Digite `0` para encerrar as compras.
  
### Exibir compras e saldo:

- Após encerrar as compras, o programa exibirá todas as compras realizadas e o saldo restante no cartão.
  
Exemplo de Execução
```
Digite o limite do cartão: 
1000
Digite a descrição da compra: 
Laptop
Digite o valor da compra: 
500
Compra realizada!
Digite 0 para sair ou 1 para continuar: 
1
Digite a descrição da compra: 
Teclado
Digite o valor da compra: 
200
Compra realizada!
Digite 0 para sair ou 1 para continuar: 
0
--------------------------------------------
COMPRAS REALIZADAS: 
Laptop - 500
Teclado - 200
--------------------------------------------
Saldo restante: 300
```
## Tecnologias Utilizadas
- Java: Linguagem de programação utilizada para desenvolver o projeto.
- Scanner: Utilizado para receber a entrada do usuário.
## Como Executar
Clone o repositório para sua máquina local.
```
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```
- Compile e execute o código utilizando sua IDE preferida ou diretamente pelo terminal com os comandos:

```
javac Main.java
java Main
```

## Contribuições
Se você quiser contribuir com melhorias ou novas funcionalidades para o projeto, sinta-se à vontade para abrir um Pull Request.

## Licença
Este projeto não possui uma licença específica.
