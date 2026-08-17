package passo04RepeticoesWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex050SorteioDeNumeros {
    public static void main(String[] args) {


        /*
        exercicio 050
        Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
        mostre na tela:

        a) Quais foram os números sorteados
        b) Quantos números estão acima de 5
        c) Quantos números são divisíveis por 3

         */

        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();


        int i = 0;

        int divisivelPorTres = 0;
        int acimaDeCinco = 0;

        while (i < 20) {

            int numSorteado = aleatorio.nextInt(11);
            System.out.printf(" " + numSorteado);

            if(numSorteado > 5) {
                acimaDeCinco++;

            }
            if(numSorteado % 3 == 0) {
                divisivelPorTres++;
            }
            i++;

        }

        System.out.printf("\nNumeros a cima de 5: %d ", acimaDeCinco);
        System.out.printf("\nQuantidade de numeros divisiveis de 3: %d", divisivelPorTres);

    }
}
