package passo04RepeticoesWhile;

public class Ex040ContadorEmTresEmTres {
    public static void main(String[] args) {

        /*

         exercicio 040
         Crie um aplicativo que mostre na tela a seguinte contagem:
         0 3 6 9 12 15 18 Acabou!


         */

        int contador = 0;

        while (contador <= 18) {
            System.out.printf(contador + " ");
            contador += 3;
        }

        System.out.println("Acabou!");

    }
}
