package passo07repeticaoFor;

import java.util.Scanner;

public class Ex069ProgressaoAritmetica {
    public static void main(String[] args) {
        /*
        exercicio 069
        Desenvolva um programa que leia o primeiro termo e a razão de uma
        PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
        a soma entre todos os valores da sequência.
         */

        //pa (2, 3, 8, 11,...) progressao aritmetica. --> n = numero de termos, na = ultimo termo,  r = razão, a¹ = 1º termo
        // n = infinito
        //O primeiro termo é a¹ = 2
        //Razao  - R = é o valor da constante que se soma a cada termo para obter o termo seguinte.
        // para achar a razão = a² - a¹ leia: segundo termo - primeiro termo é a razão


        // (1, 3, 5, 2, 9) -->  Numero de termos: n = 5 (conte quantos elementos tem, é o resultado de n)
        // n = 5
        // 3 - 1 = r = 2
        // Se a PA é crescente (razao positivo) r > 0. Se a razao for maior que zero temos uma PA CRESCENTE.

        //(-3, -7, -11)
        //a¹ = -3
        //n = 3
        //an = -11         --> an é o ultimo termo.
        //r = -4
        //PA decrescente (razão é negativa) r < 0

        //(6, 6, 6, 6) é uma PA constante (razão é = 0) R = 0
        // n = 4  an = 6, a¹ = 6, r = 0.

        // t1 = 1
        // r = 3
        // 1 + 3 = 5, 8, 11

        Scanner input = new Scanner(System.in);



        int somaTermos = 0;

        System.out.printf("Digite o primeiro termo: ");
        int termoAtual = input.nextInt();

        System.out.printf("Digite a razão: ");
        int razao = input.nextInt();

        //Digitei 5
        // 5 + 3 = 8
        for(int i = 1; i <= 10; i++) {


            System.out.printf("%d ", termoAtual);
            somaTermos += termoAtual; // acada repeticao primeiro some os termos, e depois some termo atual += razao
            termoAtual += razao;

        }

        System.out.printf("\na soma de todos termos: %d", somaTermos);



    }
}
