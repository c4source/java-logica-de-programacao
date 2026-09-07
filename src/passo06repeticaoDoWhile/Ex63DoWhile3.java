package passo06repeticaoDoWhile;

import java.util.Scanner;

public class Ex63DoWhile3 {
    public static void main(String[] args) {

        /*
        exercicio 063
        Crie um programa usando a estrutura “faça enquanto” que leia vários números.
        A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
        tela:
        a) O somatório entre todos os valores
        b) Qual foi o menor valor digitado
        c) A média entre todos os valores
        d) Quantos valores são pares
         */

        Scanner input = new Scanner(System.in);

        String opcao = "";

        boolean primeiroValor = true;

        int somatorioValores = 0;
        int quantidadeDeValores = 0;

        int maiorValorDigitado = 0;
        int menorValorDigitado = 0;

        int quantidadeValoresPares = 0;

        do {
            System.out.printf("Digite um valor: ");
            int valor = input.nextInt();
            input.nextLine();

            System.out.printf("Deseja continuar?: [S/N] ");
            opcao = input.nextLine();

            if (valor < 0) {
                System.out.println("valor inválida.");
            }
            else {

                somatorioValores += valor;
                quantidadeDeValores++;

                if (valor % 2 == 0 ) {
                    quantidadeValoresPares ++;
                }

                if (primeiroValor) {
                    menorValorDigitado = valor;
                    primeiroValor = false;
                }
                else if (valor < menorValorDigitado) {
                    menorValorDigitado = valor;
                }

            }

        } while (!opcao.equalsIgnoreCase("N"));

        System.out.printf("Somatorio de todos valores: %d", somatorioValores);
        System.out.printf("\nMenor Valor digitado: %d", menorValorDigitado);

        if(quantidadeDeValores > 0) {
            double media = (double) somatorioValores / quantidadeDeValores;
            System.out.printf("\nMédia dos valores: %.2f", media);
            System.out.printf("\nQuantidade de valores pares: %d", quantidadeValoresPares);
        }
        else {
            System.out.println("Nenhum valor digitado");
        }

    }
}
