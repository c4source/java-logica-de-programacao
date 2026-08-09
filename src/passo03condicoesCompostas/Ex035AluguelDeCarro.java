package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex035AluguelDeCarro {
    public static void main(String[] args) {

        /*
            exercicio 036
            Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
            aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
            carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
            que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
            quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
            tabela a seguir:

            - Carros populares (aluguel de R$90 por dia)
            - Até 100Km percorridos: R$0,20 por Km
            - Acima de 100Km percorridos: R$0,10 por Km
            - Carros de luxo (aluguel de R$150 por dia)
            - Até 200Km percorridos: R$0,30 por Km
            - Acima de 200Km percorridos: R$0,25 por Km

         */

        Scanner input = new Scanner(System.in);

        final double PLANO_BASICO = 90.00;        //plano de 90 por dia  - carro popular
        final double PLANO_PREMIUM = 150.00;     //plano de 150 por dia  - carro luxo

        final double ATE_CEM_KM = 0.20;    //Até 100kms por hora taxa de R$ 0.20 reais por km percorrido
        final double ACIMA_DE_CEM_KM = 0.10;  //A cima de 100km taxa de R$ 0,10 reais por km percorrido
        final double ATE_DE_DUZENTOS_KM = 0.30; //....
        final double ACIMA_DE_DUZENTOS_KM = 0.25; //....



        System.out.printf("Tipo do carro alugado: ");
        String tipoDoCarro = input.nextLine();

        System.out.printf("Quantos dias de aluguel: ");
        int diasDeAluguel = input.nextInt();

        System.out.printf("Quantos Km's foram percorridos: ");
        int kmPercorrido = input.nextInt();



        if (tipoDoCarro.equalsIgnoreCase("popular")) {

                if (kmPercorrido <= 0 || diasDeAluguel <= 0 ) {
                    System.out.println("Dados invalidos");
                }
                else if (kmPercorrido > 100 ) {
                    double totalApagar = (PLANO_BASICO * diasDeAluguel) + (kmPercorrido * ACIMA_DE_CEM_KM);
                    System.out.printf("Plano: %s%n", tipoDoCarro);
                    System.out.printf("Quilometros percorridos: %d Km's\n", kmPercorrido);
                    System.out.printf("Total a pagar de acordo com a tabela: R$ %.2f%n",totalApagar);
                }
                else {
                    double totalApagar = (PLANO_BASICO * diasDeAluguel) + (kmPercorrido * ATE_CEM_KM);
                    System.out.printf("Plano: %s%n", tipoDoCarro);
                    System.out.printf("Quilometros percorridos: %d Km's\n", kmPercorrido);
                    System.out.printf("Total a pagar de acordo com a tabela: R$ %.2f%n",totalApagar);
                }


        }
        else if (tipoDoCarro.equalsIgnoreCase("luxo")) {

            if (kmPercorrido <= 0 || diasDeAluguel <= 0) {
                System.out.println("Dados invalidos");
            }
            else if (kmPercorrido <= 200) {
                double totalApagar = (PLANO_PREMIUM * diasDeAluguel) + (kmPercorrido * ATE_DE_DUZENTOS_KM);
                System.out.printf("Plano: %s%n", tipoDoCarro);
                System.out.printf("Quilometros percorridos: %d Km's\n", kmPercorrido);
                System.out.printf("Total a pagar de acordo com a tabela: R$ %.2f%n",totalApagar);
            }
            else {
                double totalApagar = (PLANO_PREMIUM * diasDeAluguel) + (kmPercorrido * ACIMA_DE_DUZENTOS_KM);
                System.out.printf("Plano:  %s%n", tipoDoCarro);
                System.out.printf("Quilometros percorridos: %d Km's\n", kmPercorrido);
                System.out.printf("Total a pagar de acordo com a tabela: R$ %.2f%n",totalApagar);
            }

        }
        else {
            System.out.println("Tipo invalido");
        }

    }
}
