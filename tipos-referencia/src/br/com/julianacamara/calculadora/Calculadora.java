package br.com.julianacamara.calculadora;

public class Calculadora {
    Double numero1;
    Double numero2;

    public Calculadora(Double numero1, Double numero2){
        this.numero1 = numero1;

        this.numero2 = numero2;
    }

    public Double somar(){
        
        return numero1 + numero2;
    }
}