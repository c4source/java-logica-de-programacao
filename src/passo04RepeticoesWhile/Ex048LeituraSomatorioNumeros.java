package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex048LeituraSomatorioNumeros {
    public static void main(String[] args) {

        /*
            exercicio 048
            Faça um programa que leia 7 números inteiros e no final mostre o somatório
            entre eles.

         */

        Scanner input = new Scanner(System.in);

       int cont = 1;
       int soma = 0;

       while (cont <= 7) {
           System.out.printf("Digite o %dº numero: ", cont);
           int valor = input.nextInt();
           soma += valor;
           cont++;

       }
        System.out.printf("O somatorio dos 7 valores é: %d", soma);



    }
}
