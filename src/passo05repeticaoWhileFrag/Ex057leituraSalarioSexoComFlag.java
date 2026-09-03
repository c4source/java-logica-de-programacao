package passo05repeticaoWhileFrag;

import java.util.Scanner;

public class Ex057leituraSalarioSexoComFlag {
    public static void main(String[] args) {
        /*
        exercicio 057
        Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
        No final, mostre o total de salários pagos aos homens e o total pago às
        mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
        sempre que ler os dados de um funcionário.
         */

        Scanner input = new Scanner(System.in);

        double somaSalarioHomens = 0;
        double somaSalarioMulheres = 0;

        String decisao = "";

        while (!decisao.equalsIgnoreCase("N")) {

            System.out.printf("Digite seu salario: ");
            double salario = input.nextDouble();
            input.nextLine();

            System.out.printf("Digite seu sexo: ");
            String sexo = input.nextLine();

            System.out.printf("Deseja continuar [S/N]: ");
            decisao = input.nextLine();


            if(sexo.equalsIgnoreCase("feminino")) {
                somaSalarioMulheres+=salario;
            }
            else if (sexo.equalsIgnoreCase("masculino")){
                somaSalarioHomens+=salario;
            }


        }

        System.out.printf("Salarios totais pagosa os homens: R$ %.2f%n", somaSalarioHomens);
        System.out.printf("\nSalarios totais pago as mulheres: R$ %.2f%n", somaSalarioMulheres);

    }
}
