package br.com.julianacamara.calculadoraimc;
// Programa que faz o calculo do IMC com inteiros
public class Calculadora { 
    int peso;
    int altura;
    int resultado;

    public int calcularIMC(){ 
        resultado = peso/(altura * altura);

        return resultado;

    }

}