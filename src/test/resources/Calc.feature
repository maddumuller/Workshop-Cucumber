Feature: Calculadora
  Como usuario entrar com 2 valores
  Com objetivo de obter um resultado

  Scenario: Somar
    Given somar dois valores positivos
    When eu preencho o primeiro valor 5
    When eu preencho o segundo valor 3
    Then o resultado deve ser 8

    Scenario: Somar
      Given somar dois valores negativos
      When eu preencho o primeiro valor -2
      When eu preencho o segundo valor -3
      Then o resultado deve ser -5

  Scenario: Somar valores quebrados deve resultar em erro
    Given somar dois valores quebrados
    When eu preencho o primeiro valor decimal 2.5
    When eu preencho o segundo valor decimal 1.3
    Then o sistema deve retornar um erro informando que apenas inteiros são aceitos

  Scenario: Substrair dois valores inteiros
    Given Subtrair dois valores
    When eu preencho o primeiro valor 5
    When eu preencho o segundo valor 10
    Then o resultado da subtração deve ser 5

  Scenario: Divisão simples
    Given dividir dois valores
    When eu preencho o primeiro valor 10
    And eu preencho o segundo valor 3
    Then o resultado da divisão deve ser "3,33"

  Scenario: Divisão por zero
    Given dividir dois valores
    When eu preencho o primeiro valor 10
    And eu preencho o segundo valor 0
    Then o sistema deve retornar um erro de divisão por zero

  Scenario: Multiplicar
    Given multiplicar dois valores
    When eu preencho o multiplicando 5
    And eu preencho o multiplicador 4
    Then o resultado da multiplicação deve ser 20

  Scenario: Inserir letras ao inves numeros
    Given somar dois valores
    When eu preencho o primeiro valor "a"
    And eu preencho o segundo valor 3
    Then o sistema deve retornar um erro informando que o valor deve ser numérico