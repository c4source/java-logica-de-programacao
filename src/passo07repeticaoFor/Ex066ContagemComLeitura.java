package passo07repeticaoFor;

import java.util.Scanner;

public class Ex066ContagemComLeitura {
    public static void main(String[] args) {

         /*
            exercicio 066
            Faça um programa usando a estrutura “para” que leia um número inteiro
            positivo e mostre na tela uma contagem de 0 até o valor digitado:
            Ex: Digite um valor: 9
            Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
          */

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um numero para contar até ele: ");
        int num = input.nextInt();

        for(int i = 0; i <= num ; i++) {
            System.out.printf("%d" + ", ", i);
        }



    }
}
