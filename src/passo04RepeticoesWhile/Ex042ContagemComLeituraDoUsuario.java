package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex042ContagemComLeituraDoUsuario {
    public static void main(String[] args) {

        /*

        exercicio 043
        Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
        qualquer e mostre uma contagem até esse valor:
        Ex: Digite um valor: 35
        Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

         */

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um valor: ");
        int numero = input.nextInt();

        int contador = 1;

        while (contador <= numero) {
            System.out.printf(contador + " ");
            contador++;
        }

        System.out.println("Acabou!");


    }
}
