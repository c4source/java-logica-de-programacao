package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex53LeituraDeSexo {
    public static void main(String[] args) {


        /*
            exercicio 053
            Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:

            a) Quantos homens foram cadastrados
            b) Quantas mulheres foram cadastradas
            c) A média de idade do grupo
            d) A média de idade dos homens
            e) Quantas mulheres tem mais de 20 anos

         */

        Scanner input = new Scanner(System.in);

        int cont = 1;

        int somaIdadeGrupo = 0;
        int somaIdadeMulheres = 0;
        int somaIdadeHomens = 0;

        int homensCadastrados = 0;
        int mulheresCadastradas = 0;

        int mulheresAcimaVinteAnos = 0;

        while (cont <= 5) {


            System.out.printf("Digite sua idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.printf("Digite seu sexo: ");
            String sexo = input.nextLine();


            somaIdadeMulheres += idade;

            if (idade < 0){
                System.out.println("Valor inválido");
            }

            else {

                    somaIdadeGrupo += idade;


                if (sexo.equalsIgnoreCase("Masculino")){
                    homensCadastrados++;
                    somaIdadeHomens += idade;
                }

                if(sexo.equalsIgnoreCase("Feminino")){
                    mulheresCadastradas++;
                    somaIdadeMulheres += idade;

                    if(idade > 20) {
                        mulheresAcimaVinteAnos++;
                    }
                }
            }
        cont++;
        }

        double mediaDoGrupo = somaIdadeGrupo / 5;

        double mediaDeHomens = 0;

        if(homensCadastrados > 0) {
            mediaDeHomens = (double) somaIdadeHomens / homensCadastrados;
        }

        System.out.printf("Homens cadastrados: %d", homensCadastrados);
        System.out.printf("\nMulheres cadastradas: %d", mulheresCadastradas);
        System.out.printf("\nMedia de idade do grupo: %.2f", mediaDoGrupo);
        System.out.printf("\nMulheres a cima dos vinte anos: %d", mulheresAcimaVinteAnos);
    }



}
