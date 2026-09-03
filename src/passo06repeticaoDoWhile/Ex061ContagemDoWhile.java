package passo06repeticaoDoWhile;

public class Ex061ContagemDoWhile {
    public static void main(String[] args) {


        /*
         exercicio 061
         Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
         “faça enquanto”

         0 3 6 9 12 15 18 21 24 27 30 Acabou!

         */

        //Do while; "Enquanto isso for verdade, continue repetindo".

        // while = "posso fazer" -> faço.

        // do while = "faço" -> "posso fazer denovo?"

        int cont = 0;

        //Do while; primeiro executa e depois testa
        do {
            System.out.printf(cont  + " ");
            cont += 3;

        } while (cont < 30);

        System.out.println("Acabou!");
    }
}
