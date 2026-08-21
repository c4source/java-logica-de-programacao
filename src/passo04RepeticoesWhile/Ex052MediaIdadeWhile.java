package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex052MediaIdadeWhile {
    public static void main(String[] args) {



        /*
            exercicio 052
            Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:

            a) Qual é a média de idade do grupo
            b) Quantas pessoas tem mais de 18 anos
            c) Quantas pessoas tem menos de 5 anos
            d) Qual foi a maior idade lida
         */


        Scanner input = new Scanner(System.in);

        int cont = 1;

        int adultos = 0;  //18 anos
        int menosCincoAnos = 0;
        int somaAlturas =0;
        int maiorIdade = 0;
        int menorIdade = 0;

        while (cont <= 10) {

            System.out.printf("Digite sua idade: ");
            int idade = input.nextInt();

            somaAlturas += idade;

            if(idade < 0) {
                System.out.println("Idade inválida");
            }
            else  {
                somaAlturas += idade;

                if(idade > 18) {
                    adultos++;
                }

                if(idade < 5) {
                    menosCincoAnos++;
                }


                //Se existe um valor inicial seguro para comparar, posso começar por ele
                //Se não existe, uso o primeiro valor lido como referência
                if(idade > maiorIdade) {
                    maiorIdade = idade;
                }

                if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }
            cont++;
        }

        double mediaGrupo = somaAlturas / 10.0;

        System.out.printf("Media do grupo: %.2f", mediaGrupo);
        System.out.printf("\nAdultos a cima de 18 anos: %d", adultos);
        System.out.printf("\nCrianças menos de 5 anos: %d", menosCincoAnos);
        System.out.printf("\nMaior idade: %d", maiorIdade);



    }
}
