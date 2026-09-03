package passo06repeticaoDoWhile;

import java.util.Scanner;

public class Ex062DoWhileFlag {
    public static void main(String[] args) {

        /*
        exercicio 062
        Faça um programa usando a estrutura “faça enquanto” que leia a idade de
        várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
        não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
        na tela:
        a) Quantas idades foram digitadas
        b) Qual é a média entre as idades digitadas
        c) Quantas pessoas tem 21 anos ou mais.

         */

        Scanner input = new Scanner(System.in);

        int vinteUmAnos = 0;
        int totalPessoas = 0;
        int somaIdadePessoas = 0;

        String opcao = "";

        do {
            System.out.printf("Idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.printf("Deseja continuar: [S/N]");
            opcao = input.nextLine();

            if (idade < 0) {
                System.out.println("Idade inválida");
            }
            else {

                totalPessoas++;
                somaIdadePessoas += idade;

                if(idade >= 21) {
                    vinteUmAnos++;
                }

            }

        } while(!opcao.equalsIgnoreCase("N"));

        if (totalPessoas > 0) {
            double media = (double) somaIdadePessoas / totalPessoas;
            System.out.printf("\nTotal de idades digitadas: %d", totalPessoas);
            System.out.printf("\nMédia do grupo: %.2f", media);
            System.out.printf("\nPessoas com de 21 anos ou mais: %d", vinteUmAnos);
        }
        else {
            System.out.println("Nenhuma pessoa cadastrada.");
        }
    }
}
