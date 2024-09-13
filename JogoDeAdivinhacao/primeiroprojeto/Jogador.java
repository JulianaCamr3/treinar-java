package primeiroprojeto;
import  java.util.Scanner;
public class Jogador {
    String seuNome;
    int [] numeroPlayer;

    Scanner input = new Scanner(System.in);

    public String qualSeuNome() {

        return "Digite seu nome " + seuNome;
    }

    public void fazerPalpite() {

        System.out.println("Digite o seu palpite: ");
       
    }

}