package Steps;

import br.udesc.testesDeSoftware.Calculadora;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class CalcSteps {
    Calculadora calc;
    int a;
    int b;


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

}
