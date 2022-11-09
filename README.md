# JAVA-POO

Esse repositório tem o objetivo de guardar exercícios que realizei, mostrar minha evolução e estimular meu aprendizado com git.

A ideia é evoluir do básico de POO até o ponto de fazer com que o usuário interaja com o sistema, que tenha uma integração com banco de dados e adicionarei o que mais eu achar necessário.


<h2>Descrição do problema</h2>

1) Implemente em Java uma classe que represente um Fornecedor:
a)Cada fornecedor possui como atributos, seu CNPJ (uma String), seu telefone (uma String) e o seu nome (uma String).

2) Implemente em Java uma classe que represente um Produto:
a)Um produto tem como atributos um código (um inteiro), um nome (uma String), um valor (um float) e um fornecedor (do tipo Fornecedor implementado na questão anterior)
b)Implemente um método atualizarPreco na classe produto que receba como parâmetro um valor (um float) que representa um percentual. O valor passado deve aumentar o   valor do produto. Por exemplo, se for passado o valor 10.0, o valor do produto e aumentado em 10.0%.

3) Crie uma classe TesteProduto com um método main. No método main desta classe, instancie três produtos e dois fornecedores, de acordo com o esquema em anexo (Figura 01).

4) Implemente em Java uma classe chamada ConjuntoProdutos que contenha um ArrayList que possa guardar produtos (classe implementada na questão anterior) e forneça      métodos que permitam inserir, remover, atualizar, mostrar produtos e atualizar o preço dos produtos por porcentagem. 
Obs.: O conjunto não deve permitir que produtos com o mesmo código sejam cadastrados no conjunto.

<h2 align="center">Modelo Relacional do Problema</h2>

<p align="center">
  <img src="https://github.com/matheusfsantana/JAVA-POO/blob/main/modeloRelacional.png?raw=true" alt="Figura01"/>
</p>
