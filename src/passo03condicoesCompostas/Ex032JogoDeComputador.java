package passo03condicoesCompostas;

import java.util.Random;
import java.util.Scanner;


public class Ex032JogoDeComputador {
    public static void main(String[] args) {

        /*
        exercicio 032
        [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
        jogador vai tentar descobrir qual foi o valor sorteado.
         */

        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int numAleatorio = gerador.nextInt(5) + 1;

        System.out.printf("Digite um numero entre 1 e 5: ");
        int num = input.nextInt();

        if (num <= 0 || num > 5) {

            System.out.println("Valor inválido");
        }
        else if (num == numAleatorio) {
            System.out.printf("Numero sorteado: %d \n", numAleatorio);
            System.out.printf("Numero escolhido: %d \n", num);
            System.out.println("Parabéns você acertou o número.");
        }
        else {
            System.out.printf("Numero sorteado: %d \n", numAleatorio);
            System.out.printf("Numero escolhido: %d \n", num);
            System.out.println("Você errou o número!");
        }








    }
}
