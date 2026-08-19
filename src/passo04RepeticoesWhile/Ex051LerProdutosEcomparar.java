package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex051LerProdutosEcomparar {
    public static void main(String[] args) {

        /*
        exercicio 051
        Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
        qual foi o maior e qual foi o menor preço digitados.
         */


        Scanner input = new Scanner(System.in);

        int i = 1;
        double menor = 0;
        double maior = 0;


        while (i <= 8) {

            System.out.printf("Digite o preço de um produto: ");
            double precoProduto = input.nextDouble();

            //Traduzindo, o primeiro laço (primeiro valor) a gente guarda o numero lido e armazena nas variaveis
            // menor e maior
            // ex; primeiro valor lido é 30
            // menor = 30 e maior = 30
            // isso permite verificarmos qual num e maior e qual e menor dentro de outro if

            if(i == 1) {
                menor = precoProduto;
                maior = precoProduto;
            }
            if (precoProduto < menor) {
                    menor = precoProduto;
            }
            if (precoProduto > maior) {
                    maior = precoProduto;
            }
            i++;
        }
        System.out.printf("O menor preço digitado é: %.2f%n", menor);
        System.out.printf("O maior preço digitado é: %.2f%n", maior);

    }
}
