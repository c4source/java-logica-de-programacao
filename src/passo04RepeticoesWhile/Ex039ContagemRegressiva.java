package passo04RepeticoesWhile;

public class Ex039ContagemRegressiva {
    public static void main(String[] args) {

        /*

         exercicio 039
         Faça um algoritmo que mostre na tela a seguinte contagem:
         10 9 8 7 6 5 4 3 Acabou!

         */

        int contador = 10;

        while (contador >= 3) {
            System.out.printf(contador  + " ");
            contador--;
        }
        System.out.println("Acabou");
    }
}
