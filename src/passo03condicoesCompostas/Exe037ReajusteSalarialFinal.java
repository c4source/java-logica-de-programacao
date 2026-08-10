package passo03condicoesCompostas;

import java.util.Scanner;

public class Exe037ReajusteSalarialFinal {
    public static void main(String[] args) {
        /*

        exercicio 37
        Uma empresa precisa reajustar o salário dos seus funcionários, dando um
        aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
        o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
        No final, mostre o seu novo salário, baseado na tabela a seguir:

          .Mulheres
        - menos de 15 anos de empresa: +5%
        - de 15 até 20 anos de empresa: +12%
        - mais de 20 anos de empresa: +23%

          .Homens
        - menos de 20 anos de empresa: +3%
        - de 20 até 30 anos de empresa: +13%
        - mais de 30 anos de empresa: +25%

         */

        final double HOMEM_MENOS_DE_VINTE_ANOS_BONUS = 0.03;
        final double HOMEM_ENTRE_VINTE_A_TRINTA_ANOS_BONUS = 0.13;
        final double HOMEM_ACIMA_DE_TRINTA_ANOS_BONUS = 0.25;

        final double MULHER_MENOS_DE_QUINZE_ANOS_BONUS = 0.05;
        final double MULHER_ENTRE_QUINZE_A_VINTE_ANOS_BONUS = 0.12;
        final double MULHER_ACIMA_DE_VINTE_ANOS_BONUS = 0.23;

        Scanner input = new Scanner(System.in);

        // primeiro saber se é homem ou mulher

        // dps comparar os anos trabalhados e aplicar conforte a tabela



        System.out.printf("Digite seu gênero: ");
        String genero = input.nextLine();

        System.out.printf("Digite seu salario atual: ");
        double salarioAtual = input.nextDouble();

        System.out.printf("Digite quantos anos de empresa: ");
        int anosTrabalhados = input.nextInt();


        if (genero.equalsIgnoreCase("feminino")) {

            if(anosTrabalhados < 0) {
                System.out.println("Anos inválidos");
            }
            else if (anosTrabalhados < 15) {
                double salarioFinal = salarioAtual + ( salarioAtual * MULHER_MENOS_DE_QUINZE_ANOS_BONUS);
                System.out.printf("Salário base: R$ %.2f%n \n", salarioAtual);
                System.out.printf("Genero: %s%n", genero);
                System.out.printf("Salario reajustado de 5%% R$ %.2f%n", salarioFinal);

            }
            else if (anosTrabalhados <= 20 ) {
                double salarioFinal = salarioAtual + (salarioAtual * MULHER_ENTRE_QUINZE_A_VINTE_ANOS_BONUS);
                System.out.printf("Salário base: R$ %.2f%n \n", salarioAtual);
                System.out.printf("Genero: %s%n", genero);
                System.out.printf("Salario reajustado de 12%% R$ %.2f%n", salarioFinal);
            }
            else {
                double salarioFinal = salarioAtual + (salarioAtual * MULHER_ACIMA_DE_VINTE_ANOS_BONUS);
                System.out.printf("Salário base: R$ %.2f%n \n", salarioAtual);
                System.out.printf("Genero: %s%n", genero);
                System.out.printf("Salario reajustado de 23%% R$ %.2f%n", salarioFinal);
            }


        }
        else if (genero.equalsIgnoreCase("Masculino")) {
            if (anosTrabalhados < 0) {
                System.out.println("Anos inválidos.");
            }
            else if (anosTrabalhados < 20) {
                double salarioFinal = salarioAtual + (salarioAtual * HOMEM_MENOS_DE_VINTE_ANOS_BONUS);
                System.out.printf("Salário base: R$ %.2f%n ", salarioAtual);
                System.out.printf("Genero: %s%n", genero);
                System.out.printf("Salario reajustado de 3%% R$ %.2f%n", salarioFinal);

            }
            else if (anosTrabalhados <= 30) {
                double salarioFinal = salarioAtual + (salarioAtual * HOMEM_ENTRE_VINTE_A_TRINTA_ANOS_BONUS);
                System.out.printf("Salário base: R$ %.2f%n ", salarioAtual);
                System.out.printf("Genero: %s%n", genero);
                System.out.printf("Salario reajustado de 13%% R$ %.2f%n", salarioFinal);
            }
            else {
                double salarioFinal = salarioAtual + (salarioAtual * HOMEM_ACIMA_DE_TRINTA_ANOS_BONUS);
                System.out.printf("Salário base: R$ %.2f%n ", salarioAtual);
                System.out.printf("Genero: %s%n", genero);
                System.out.printf("Salario reajustado de 25%% R$ %.2f%n", salarioFinal);
            }

        }

    }
}

// se eu for mulher e se meus anos trabalhados forem validos
// e anos trabalhados menor que 15 anos ganho 3% de aumento no meu salario.



// ganho 1000 reais.
// trabalho ha 7 anos

// 3% de 1000 reais = 30 reais.
// somo meu salario + 3% do salario (R$30)

