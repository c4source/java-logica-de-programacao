package passo04RepeticoesWhile;

public class Ex043ContagemRegressivaNumeroMarcado {
    public static void main(String[] args) {

        /*
         exercicio 043
         Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
         marcando os números que forem divisíveis por 4,
         exatamente como mostrado abaixo: 30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...

         */

            int contador = 30;

            while (contador >= 1) {

                if (contador % 4 == 0) {
                    System.out.printf("[%d] ", contador);
                }
                else {
                    System.out.printf("%d ", contador);
                }
                contador--;
            }


    }
}
