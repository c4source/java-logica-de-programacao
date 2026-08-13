    package passo04RepeticoesWhile;

    import java.util.Scanner;

    public class Ex044ContagemIncremental {
        public static void main(String[] args) {

            /*
            exercicio 044
            Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
            incremento, mostrando em seguida todos os valores no intervalo:
            Ex: Digite o primeiro Valor: 3
            Digite o último Valor: 10
            Digite o incremento: 2
            Contagem: 3 5 7 9 Acabou!
             */

            Scanner input = new Scanner(System.in);

            System.out.printf("Digite o primeiro valor: ");
            int primeiroValor = input.nextInt();

            System.out.printf("Digite o ultimo valor: ");
            int ultimoValor = input.nextInt();

            System.out.printf("Digite o valor do incremento: ");
            int valorEncremento = input.nextInt();


                int contador = primeiroValor;

                while (contador <= ultimoValor) {
                    System.out.printf("%d ", contador);
                    contador += valorEncremento;
                }


            System.out.println("Acabou!");


        }
    }
