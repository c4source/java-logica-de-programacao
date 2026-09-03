package passo05repeticaoWhileFrag;



import java.util.Scanner;

public class Ex060LeituraNomeSexoIdadeEmedia {
    public static void main(String[] args) {

        /*
         exercicio 060
         Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
         O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:

         a) O nome da pessoa mais velha
         b) O nome da mulher mais jovem
         c) A média de idade do grupo
         d) Quantos homens tem mais de 30 anos
         e) Quantas mulheres tem menos de 18 anos

         */

        Scanner input = new Scanner(System.in);

        String nomePessoaMaisVelha = "";
        String nomeMulherMaisJovem = "";

        boolean primeiraMulher = true;

        int idadeFemininaMaisJovem =  0;
        int idadeMaisVelha = 0;

        int homensMaisDeTrintAnos = 0;
        int mulheresMenosDeDezoitoAnos = 0;

        int somaIdadesDoGrupo = 0;
        int totalPessoas = 0;

        String opcao = "";

        while (!opcao.equalsIgnoreCase("N")) {

            System.out.printf("Digite seu nome: ");
            String nome = input.nextLine();

            System.out.printf("Digite sua idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.printf("Digite seu sexo: ");
            String sexo = input.nextLine();

            System.out.printf("Deseja continuar: [S/N] ");
            opcao = input.nextLine();

            if (idade <= 0) {
                System.out.println("Idade inválida");
            }
            else {

                somaIdadesDoGrupo += idade;
                totalPessoas++;

                if (sexo.equalsIgnoreCase("Masculino")) {
                    if(idade > 30) {
                        homensMaisDeTrintAnos++;
                    }
                }

                if (sexo.equalsIgnoreCase("Feminino")){

                    if(idade < 18) {
                        mulheresMenosDeDezoitoAnos++;
                    }
                    if(primeiraMulher) {
                        nomeMulherMaisJovem = nome;
                        idadeFemininaMaisJovem = idade;
                        primeiraMulher = false;
                    }
                    else if (idade < idadeFemininaMaisJovem) {
                        idadeFemininaMaisJovem = idade;
                        nomeMulherMaisJovem = nome;
                    }
                }

               if (idade > idadeMaisVelha ) {
                   idadeMaisVelha = idade;
                   nomePessoaMaisVelha = nome;
               }


            }

        }

        System.out.printf("Nome da pessoa mais velha: %s",  nomePessoaMaisVelha);
        System.out.printf("\nNome da mulher mais jovem: %s", nomeMulherMaisJovem);

        if(totalPessoas > 0) {
            double mediaGrupo = (double) somaIdadesDoGrupo / totalPessoas;
            System.out.printf("\nMedia do grupo: %.2f", mediaGrupo);
        }
        else {
            System.out.println("Nenhum pessoa cadastrada.");
        }

        System.out.printf("\nQuantidade de homens com mais de 30 anos: %d", homensMaisDeTrintAnos);
        System.out.printf("\nQuantidade de mulher com menos de 18 anos: %d", mulheresMenosDeDezoitoAnos);

    }

}
