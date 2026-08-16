package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex049LeituraEverificacaoNumero {
    public static void main(String[] args) {
        /*
            exercicio 049
            Crie um programa que leia 6 números inteiros e no final mostre quantos deles
            são pares e quantos são ímpares.
         */

        Scanner input = new Scanner(System.in);

        int i = 1;

        int numPares = 0;
        int numImpares = 0;

        do {
            System.out.printf("Digite o %d º numero: ", i);
            int numero = input.nextInt();

                if (numero % 2 == 0) {
                    numPares++;

                }
                else {
                    numImpares++;


                }
            i++;
        } while (i <= 6);

        System.out.printf("Quantidade de numeros pares: %d ", numPares);
        System.out.printf("Quantidade de numeros pares: %d ", numImpares);



    }
}

//Repita o contador até 6x
// Enquanto esta repetindo, um a um, veja SE o numero é par ou impar
// se o numero for par coloque em um lugar que armazena o numero par.
//se for impar armazena o numero que é impar.
//E conte quantos numeros pares tem e quantos numeros impares.