package passo04RepeticoesWhile;


import java.util.Scanner;

public class Ex053LeituraSexo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont = 1;

        int somaIdadeGrupo = 0;
        int somaIdadeHomens = 0;

        int homensCadastrados = 0;
        int mulheresCadastradas = 0;

        int mulheresAcimaVinteAnos = 0;

        while (cont <= 5) {

            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();
            input.nextLine();

            System.out.print("Digite seu sexo: ");
            String sexo = input.nextLine();

            if (idade < 0) {
                System.out.println("Valor inválido");
            }
            else {

                somaIdadeGrupo += idade;

                if (sexo.equalsIgnoreCase("Masculino")) {
                    homensCadastrados++;
                    somaIdadeHomens += idade;
                }

                if (sexo.equalsIgnoreCase("Feminino")) {
                    mulheresCadastradas++;

                    if (idade > 20) {
                        mulheresAcimaVinteAnos++;
                    }
                }
            }

            cont++;
        }

        double mediaDoGrupo = somaIdadeGrupo / 5.0;

        double mediaIdadeHomens = 0;

        if (homensCadastrados > 0) {
            mediaIdadeHomens = (double) somaIdadeHomens / homensCadastrados;
        }

        System.out.printf("Homens cadastrados: %d%n", homensCadastrados);
        System.out.printf("Mulheres cadastradas: %d%n", mulheresCadastradas);
        System.out.printf("Média de idade do grupo: %.2f%n", mediaDoGrupo);
        System.out.printf("Média de idade dos homens: %.2f%n", mediaIdadeHomens);
        System.out.printf("Mulheres acima dos vinte anos: %d%n", mulheresAcimaVinteAnos);
    }
}
