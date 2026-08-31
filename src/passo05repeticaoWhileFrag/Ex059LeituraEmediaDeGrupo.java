package passo05repeticaoWhileFrag;

import java.util.Scanner;

public class Ex059LeituraEmediaDeGrupo {
    public static void main(String[] args) {

        /*
        exercicio 059
        Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
        perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:

        a) qual é a maior idade lida
        b) quantos homens foram cadastrados
        c) qual é a idade da mulher mais jovem
        d) qual é a média de idade entre os homens

         */

        Scanner input = new Scanner(System.in);

        int maiorIdade = 0;
        int somaIdadesHomens = 0;
        int menorIdadeMulher = 0;
        int quantidadeHomens = 0;

        boolean primeiraMulher = true;
        String opcao = "";

        while (!opcao.equalsIgnoreCase("N" )) {

            System.out.printf("Digite sua idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.printf("Digite seu sexo: ");
            String sexo = input.nextLine();

            System.out.printf("Deseja continuar: [S/N] ");
            opcao = input.nextLine();

            if(sexo.equalsIgnoreCase("Masculino")) {
                somaIdadesHomens += idade;
                quantidadeHomens++;
            }

            if(sexo.equalsIgnoreCase("Feminino")) {

                //Se for a primeira mulher, usamos a menor idade como REFERENCIA..
                //E deixamos primieraMulher false. Ela n e mais a primeira mulher para verificar
                if (primeiraMulher) {
                    menorIdadeMulher = idade;
                    primeiraMulher = false;
                }
                else if (idade < menorIdadeMulher) { //Senao for a primeira mulher, comparamos a idade com  a maior idade que ja temos
                    menorIdadeMulher = idade; // Se for atualizamos o recorde;
                }
            }
            if(idade > maiorIdade) {
                maiorIdade = idade;
            }
        }

        System.out.printf("Maior idade lida: %d", maiorIdade);
        System.out.printf("\nQuantidade de homens cadastrados: %d", quantidadeHomens);

        if(!primeiraMulher) {
            System.out.printf("\nIdade da mulher mais jovem: %d", menorIdadeMulher);
        }
        else {
            System.out.printf("\nNenhuma mulher cadastrada ");
        }
        if(quantidadeHomens > 0) {
            double mediaIdadeHomens = (double) somaIdadesHomens / quantidadeHomens;
            System.out.printf("\nMedia de idade dos homens: %.2f", mediaIdadeHomens);
        }
        else {
            System.out.println("\nNenhum homem foi cadastrado");
        }
    }
}
