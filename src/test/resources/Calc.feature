Feature: Soma de dois números

  Scenario: Somar dois valores positivos
    Given somar dois valores positivos
    When eu preencho o primeiro valor 5
    When eu preencho o segundo valor 3
    Then o resultado deve ser 8