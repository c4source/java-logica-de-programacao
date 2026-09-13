package passo07repeticaoFor;

import java.util.Scanner;

public class Ex067MediaComFor {
    public static void main(String[] args) {

        /*
        exercicio 067
        Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
        “para”. No final, mostre na tela:
        a) Quantas mulheres foram cadastradas
        b) Quantos homens pesam mais de 100Kg
        c) A média de peso entre as mulheres
        d) O maior peso entre os homens
         */

        Scanner input = new Scanner(System.in);

        int mulheresCadastradas = 0;
        int homemCemKgMais = 0;
        double maiorPesoHomens = 0;
        double somaPesosMulheres = 0;

        for (int i = 0; i <= 8; i++) {

            System.out.printf("Digite seu peso: ");
            double peso = input.nextDouble();
            input.nextLine();

            System.out.printf("Digite seu sexo: ");
            String sexo = input.nextLine();

            if (sexo.equalsIgnoreCase("Feminino")) {
                mulheresCadastradas++;
                somaPesosMulheres += peso;
            }

            if (sexo.equalsIgnoreCase("Masculino")) {
                if(peso > 100.0 ) {
                    homemCemKgMais++;
                }

                if (peso > maiorPesoHomens) {
                    maiorPesoHomens = peso;
                }
            }


        }
        if(mulheresCadastradas > 0 ) {
            double media = somaPesosMulheres / mulheresCadastradas;
            System.out.printf("\nMedia de peso entre as mulheres: %.2f", media);
        }
        else {
            System.out.printf("\nNenhuma mulher cadastrada ");
        }
        System.out.printf("Quantidade de mulheres cadastradas: %d", mulheresCadastradas);
        System.out.printf("\nHomens com mais de 100kg: %d", homemCemKgMais);
        System.out.printf("\nMaior peso entre os homens: %.2f Kg", maiorPesoHomens);


    }
}
