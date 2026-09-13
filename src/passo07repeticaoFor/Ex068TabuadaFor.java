package passo07repeticaoFor;

import java.util.Scanner;

public class Ex068TabuadaFor {
    public static void main(String[] args) {

        /*
          exercicio 065
          Escreva um programa que leia um número qualquer e mostre a tabuada desse
          número, usando a estrutura “para”.

            Ex: Digite um valor: 5
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15 ...

         */
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um valor: ");
        int valor = input.nextInt();

        for(int i = 1; i <= 10; i++) {
            int resultado =valor * i;
            System.out.printf("\n%d x %d = %d", valor, i, resultado);
        }

    }
}
