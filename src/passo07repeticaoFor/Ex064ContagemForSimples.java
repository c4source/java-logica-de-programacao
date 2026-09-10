package passo07repeticaoFor;

public class Ex064ContagemForSimples {
    public static void main(String[] args) {

        /*
         exercicio 064

          Desenvolva um programa usando a estrutura “para” que mostre na tela a
          seguinte contagem:

          0 5 10 15 20 25 30 35 40 Acabou!


         */

        for(int i = 0; i <= 40; i += 5 ) {
            System.out.printf(" " + i);
        }
        System.out.printf(" Acabou!");




    }
}
