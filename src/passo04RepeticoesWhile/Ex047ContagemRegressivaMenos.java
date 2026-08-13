package passo04RepeticoesWhile;

public class Ex047ContagemRegressivaMenos {
    public static void main(String[] args) {


        /*
         exercicio 047
         Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
         450 + 400 + 350 + 300 + ... + 50 + 0

         */

        int cont = 500;
        int soma = 0;

        while (cont >= 0) {
            System.out.printf(" %d ", cont);

            if (cont > 0 ) {
                System.out.printf(" + ");
            }

            soma += cont;
            cont -= 50;
        }
        System.out.printf("\n Resultado da expressão %d", soma);

    }
}
