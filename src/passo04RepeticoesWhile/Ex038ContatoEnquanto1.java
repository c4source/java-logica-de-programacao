package passo04RepeticoesWhile;

public class Ex038ContatoEnquanto1 {
    public static void main(String[] args) {


        /*

         Escreva um programa que mostre na tela a seguinte contagem:
         6 7 8 9 10 11 Acabou!

         */

        int contador = 6;

        while (contador <= 11) {
            System.out.printf(contador + " ");
            contador++;

        }

        System.out.println("Acabou!");

    }
}
