package passo05repeticaoWhileFrag;

import java.util.Scanner;

public class Ex058MediaComFlagAlunos {
    public static void main(String[] args) {


        /*
         exercicio 058
         Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
         vai parar quando for digitada a idade 999. No final, mostre quantos alunos
         existem na turma e qual é a média de idade do grupo.

         */
        Scanner input = new Scanner(System.in);

        int quantidadeAlunos = 0 ;
        int somaDasIdades = 0 ;

       int idade = 0;

        while (idade != 999) {

            System.out.printf("Digite sua idade: ");
            idade = input.nextInt();
            if(idade == 999) {
                break;
            }
            somaDasIdades += idade;
            quantidadeAlunos++;


        }

        if (quantidadeAlunos > 0 ) {
            double mediaIdade = (double) somaDasIdades / quantidadeAlunos;


            System.out.printf("Quantidade de alunos existentes: %d", quantidadeAlunos);
            System.out.printf("\nMédia de idade do grupo: %.2f", mediaIdade);

        }

        else {
            System.out.println("Nenhum aluno cadastrado");
        }
    }
}
