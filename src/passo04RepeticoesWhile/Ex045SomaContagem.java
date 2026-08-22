package passo04RepeticoesWhile;

public class Ex045SomaContagem {
    public static void main(String[] args) {

        /*
        exercicio 045
        Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
        8 + 10 + 12 + 14 + ... + 98 + 100.

         */

        int contador = 6;
        int soma = 0;

        while (contador <= 100) {
            System.out.printf("%d + ", contador);
            contador++;
            soma += contador;
        }

        System.out.printf("Soma de todos numeros é: %d", soma);

    }
}
