package passo04RepeticoesWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex055SorteioWhile {
    public static void main(String[] args) {

        /*
         exercicio 055
         Vamos melhorar o jogo que fizemos no exercício 32. A partir de
         agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
         tentativas para tentar acertar.

         */

        Scanner input = new Scanner(System.in);

        Random gerador = new Random();

        int numGerado = gerador.nextInt(10) + 1;


        int cont = 1;


        while (cont <= 4) {

            System.out.printf("%dª tentativa: ", cont);
            int tentativa = input.nextInt();


            if(tentativa <= 0 || tentativa > 10) {
                System.out.println("Tentativa inválida. ");

            }
           else {

                if (tentativa == numGerado) {
                    System.out.printf("Parabéns você acertou o número sorteado: %d", tentativa);
                    break;
                }
                System.out.println("Você errou!");

                //O contador n precisar necesseriamente contabilizar a cada repetição
                //Eu decido quando aquela repeticao realmente deve ser contabilidazada
                cont++;

           }

        }

    }
}
//Enquanto o contador for igual a 4
//Temos a tentativa.

//Mesmo que ele colocar um numero menor que 0 e maior que 10 ainda sim vai rodar o loop.

// O que eu quero?
//