package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex054RepeticaoComImcCondicional {
    public static void main(String[] args) {


        /*
        exercicio 054
        Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
        no final:

        a) Qual foi a média de altura do grupo
        b) Quantas pessoas pesam mais de 90Kg
        c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
        d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.

         */

        Scanner input = new Scanner(System.in);

        int cont = 1;
        double somaAlturas = 0;
        double mediaAltura = 0;

        int pesoAcimaNoventaKg = 0;
        int abaixoDeCinquentaMenorUmSessenta = 0;
        int maisDeUmNoventaMaisDeCemKg = 0;


        while (cont <= 7) {

            System.out.printf("digite sua altura: ");
            double altura = input.nextDouble();

            System.out.printf("digite seu peso: ");
            double peso = input.nextDouble();

            somaAlturas += altura;

            if (peso > 90) {
                pesoAcimaNoventaKg++;
            }

            if (altura < 1.60 && peso < 50) {
                abaixoDeCinquentaMenorUmSessenta++;
            }

            if (peso > 100 && altura > 1.90) {
                maisDeUmNoventaMaisDeCemKg++;
            }

            cont++;

        } //fim enquantop

        mediaAltura = somaAlturas / 7;

        System.out.printf("Média de altura do grupo: %.2f", mediaAltura);
        System.out.printf("\nPessoas com o peso a cima de 90Kg: %d pessoas", pesoAcimaNoventaKg);
        System.out.printf("\nPessoas com menos de 50kg e menos de 1.60m: %d pessoas", abaixoDeCinquentaMenorUmSessenta);
        System.out.printf("\nPessoas com mais de 100kg e 1.90m: %d pessoas", maisDeUmNoventaMaisDeCemKg);



    }
}

//Enquanto o contador for <= que 7 faça:

//Preciso pegar 7 valores de entrada, uso o loop while. while cont <= 7
// Pego uma altura e um peso de uma pessoa.
// Pergunto o peso e a altura até ser false o while, até ser igual 7.

//pergunta? como eu armazeno a cada repeticao o valor do peso e altura de cada pessoa?
//quais variaveis vou precisar usar?
//onde guardo?

//Pesquisei e diz que seria bom armazenar em um array, vetor, list arrylist..

//Se for loop e n posso digitar um input para cada leitura dentro do while.. nao faz sentido.

//14 variaveis para armazenar as leituras ao todo.
//N faz sentido ir por esse caminho de varias variaveis.


