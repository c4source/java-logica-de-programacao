package passo04RepeticoesWhile;

public class Ex041ContagemRegressivaEmCincoEmCinco {
    public static void main(String[] args) {


        /*
        exercicio 42
        Desenvolva um programa que mostre na tela a seguinte contagem:
        100 95 90 85 80 ... 0 Acabou!

         */

        int contador = 100;

        while (contador >= 0) {
            System.out.printf(contador + " ");
            contador -= 5;
        }

        System.out.println("Acabou!");


    }
}
