package br.udesc.testesDeSoftware;

public class Calculadora {
    public int Somar (int a, int b){
        return a+b;
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
/////////
////se for tem q apaga isso
}
