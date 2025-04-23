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
    public String Dividir(int a, int b) {
        if (b == 0) {
            return "Erro: Divisão por zero não é permitida";
        }
        return String.valueOf(a / b);
    }
//////////
}
