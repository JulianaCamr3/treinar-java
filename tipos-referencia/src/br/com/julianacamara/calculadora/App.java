package br.com.julianacamara.calculadora;

public class App {
    public static void main(String[] args) throws Exception {
      Calculadora calculadora = new Calculadora(1.5,3.5);

      System.out.println(calculadora.somar());
    }
}
