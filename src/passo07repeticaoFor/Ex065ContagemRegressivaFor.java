package passo07repeticaoFor;

public class Ex065ContagemRegressivaFor {
    public static void main(String[] args) {

        /*
         exercicio 064
         Desenvolva um programa usando a estrutura “para” que mostre na tela a
         seguinte contagem:

         100 90 80 70 60 50 40 30 20 10 0 Acabou!

         */

        for (int i = 100; i >= 0; i -= 10){
            System.out.printf(" " + i);
        }
        System.out.printf("Acabou!");
    }
}
