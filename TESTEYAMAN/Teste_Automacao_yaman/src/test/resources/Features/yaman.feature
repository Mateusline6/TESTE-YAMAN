#Author: mateusefigenio55@gmail.com

@executa
Feature: Buscar produto no site Shoestock
  Eu como usuario quero buscar e validar os produtos no carinho 

  Scenario: Realizar busca no site
    Given Eu esteja no site "https://www.shoestock.com.br"
    And Pesquiso o produto "Bolsa"
    When Incluir produto no carrinho
    Then Valido as informacoes
 