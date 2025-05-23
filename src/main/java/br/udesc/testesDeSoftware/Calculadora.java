package br.udesc.testesDeSoftware;

public class Calculadora {
    public int Somar (int a, int b){
        try {
            return a + b;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("valor deve ser numérico");
        }
    }
    public int Subtrair (int a, int b){
        return a-b;
    }
    public int Multiplicar (int a, int b){
        return a*b;
    }
    public String Dividir(double a, double b) {
        double resultado = (double) a / b;
        if (b == 0) {
            return "Erro: Divisão por zero não é permitida";
        }


        return String.format("%.2f", resultado);
    }
}
