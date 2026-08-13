package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex046SomaContador {
    public static void main(String[] args) {

        /*
            exercicio 046
            Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
            8 + 10 + 12 + 14 + ... + 98 + 100.

         */

       int cont = 6;
       int soma = 0;

       while (cont <= 100) {
           System.out.printf(" %d + ", cont);
           soma += cont;
           cont += 2;

       }
        System.out.println("\nA soma: " + soma);

    }
}
