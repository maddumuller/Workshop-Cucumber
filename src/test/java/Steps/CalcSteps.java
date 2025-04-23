package Steps;

import br.udesc.testesDeSoftware.Calculadora;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class CalcSteps {
    Calculadora calc;
    int a;
    int b;
    double da;
    double db;
    double resultado;
    String resultadoDivisaoexata;
    String erro;


    @Given("^somar dois valores positivos$")
    public void que_eu_escolha_somar() {
        calc = new Calculadora();
    }


    @When("eu preencho o primeiro valor {int}")
    public void euPreenchoOPrimeiroValor(int valor1) {
        a= valor1;

    }
    @When("eu preencho o segundo valor {int}")
    public void euPreenchoOSegundoValor(int valor2) {
        b= valor2;

    }

    @Then("o resultado deve ser {int}")
    public void oResultadoDeveSer(int esperado) {
        assertEquals(esperado, calc.Somar(a, b));
    }
    //teste2
    @Given("somar dois valores negativos")
    public void somarValores() {
        calc = new Calculadora();
    }
    //teste3
    @Given("somar dois valores quebrados")
    public  void somarQuebrados() {
        calc = new Calculadora();
    }
    @When("eu preencho o primeiro valor decimal {double}")
    public void euPreenchoOPrimeiroValorDecimal(double valor1) {
        da= valor1;

    }
    @When("eu preencho o segundo valor decimal {double}")
    public void euPreenchoOSegundoValorDoubleDecimal(double valor2) {
        db = valor2;
    }

    @Then("o sistema deve retornar um erro informando que apenas inteiros são aceitos")
    public void oSistemaDeveRetornarUmErro() {
        if (da % 1 != 0 || db % 1 != 0) {
            erro = "Erro: Apenas inteiros são aceitos";
        } else {
            int resultado = calc.Somar((int) da, (int) db);
            erro = "Operação realizada com resultado: " + resultado;
        }

        assertEquals("Erro: Apenas inteiros são aceitos", erro);
    }
    // teste4
    @Given("Subtrair dois valores")
    public void subtrairDoisValores() {
        calc = new Calculadora();
    }
    @Then("o resultado da subtração deve ser {int}")
    public void RetornarSubtracao(int esperado){
        resultado= calc.Subtrair(a,b);
    }
    //teste5(Edu)
    @Given("que desejo dividir dois valores inteiros")
    public void prepararDivisao() {
        calc = new Calculadora(); // já deve estar como variável de classe
    }

    @When("o dividendo é {int}")
    public void preencherDividendo(int valor1) {
        a = valor1;
    }

    @When("o divisor é {int}")
    public void preencherDivisor(int valor2) {
        b = valor2;
    }

    @Then("o resultado da divisão deve ser {string}")
    public void verificarResultadoDivisao(String esperado) {
        resultadoDivisaoexata = calc.Dividir(a, b);
        assertEquals(esperado, resultadoDivisaoexata);
    }

    //teste6(Edu)

    @Given("dividir dois valores")
        public void dividir() { calc = new Calculadora(); }
        @Then("o sistema deve retornar um erro de divisão por zero")
        public void RetornarUmErro() {
            String resultado = calc.Dividir(a, b);
            assertEquals("Erro: Divisão por zero não é permitida", resultado);
        }




}
