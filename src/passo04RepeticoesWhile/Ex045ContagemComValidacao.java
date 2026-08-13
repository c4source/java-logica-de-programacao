package passo04RepeticoesWhile;

import java.util.Scanner;

public class Ex045ContagemComValidacao {
    public static void main(String[] args) {

        /*
            exercicio 045
            Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
            incremento, mostrando em seguida todos os valores no intervalo:
            Ex: Digite o primeiro Valor: 3
            Digite o último Valor: 10
            Digite o incremento: 2
            Contagem: 3 5 7 9 Acabou!

            * O programa acima vai ter um problema quando digitarmos o primeiro valor
              maior que o último. Resolva esse problema com um código que funcione em qualquer
              situação.




         */





        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor: ");
        int primeiroValor = input.nextInt();

        System.out.printf("Digite o ultimo valor: ");
        int ultimoValor = input.nextInt();

        System.out.printf("Digite o valor do incremento: ");
        int valorEncremento = input.nextInt();

        if(primeiroValor < 0) {
            System.out.println("Valor inválido");
        }
        else if (valorEncremento <= 0 ) {
            System.out.println("Encremento inválido");
        }
        else {

            int contador = primeiroValor;

            while (contador <= ultimoValor) {
                System.out.printf("%d ", contador);
                contador += valorEncremento;

            }
            System.out.println("Acabou! ");

        }

    }
}
