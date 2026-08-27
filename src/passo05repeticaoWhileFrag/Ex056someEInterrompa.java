package passo05repeticaoWhileFrag;

import java.util.Scanner;

public class Ex056someEInterrompa {
    public static void main(String[] args) {
        /*
        exercicio 056
        Crie um programa que leia vários números pelo teclado e mostre no final o
        somatório entre eles.
        Obs: O programa será interrompido quando o número 1111 for digitado
         */
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        while(numero != 1111) {

            System.out.printf("Digite um numero: ");
            numero = input.nextInt();

            // 1111 e um valor sentinela..
            if(numero != 1111) { //flag enquanto o numero digitado for diferente de 1111, continuamos somando
                soma += numero; // quando digitado 1111 o loop acaba.
            }

        }

        System.out.println("A soma: " + soma);



    }
}
