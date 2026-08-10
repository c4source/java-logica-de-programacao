package passo03condicoesCompostas;

import java.util.Scanner;

public class Ex036ProgramaSaude {
    public static void main(String[] args) {
        /*
        exercicio 036
        Um programa de vida saudável quer dar pontos atividades físicas que podem
        ser trocados por dinheiro. O sistema funciona assim:

        - Cada hora de atividade física no mês vale pontos
        - até 10h de atividade no mês: ganha 2 pontos por hora
        - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
        - acima de 20h de atividade no mês: ganha 10 pontos por hora
        - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)

        Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
        calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.

         */

        final double VALOR_POR_PONTO = 0.05;

        final int PONTO_HORA_ATE_DEZ_HORAS = 2;
        final int PONTO_HORA_ENTRE_DEZ_E_VINTE_HORAS = 5;
        final int PONTO_HORA_ACIMA_VINTE_HORAS = 10;


        Scanner input = new Scanner(System.in);

        System.out.printf("Quantas horas de atividade física no mês: ");
        int horasAtividade = input.nextInt();


        int pontosPorHora = 0;


         if (horasAtividade < 0) {
             System.out.println("Quantidade de horas inválidos" );
         }

         else if (horasAtividade <= 10) {
             pontosPorHora =  PONTO_HORA_ATE_DEZ_HORAS;
         }

         else if (horasAtividade <= 20) {
             pontosPorHora = PONTO_HORA_ENTRE_DEZ_E_VINTE_HORAS;

         }
         else  {
            pontosPorHora = PONTO_HORA_ACIMA_VINTE_HORAS;

        }

         if (horasAtividade >= 0 ) {
             int pontos = horasAtividade * pontosPorHora;
             double valorPago = pontos * VALOR_POR_PONTO;

             System.out.printf("Pontos: %d%n", pontos);
             System.out.printf("Valor ganho R$ %.2f%n ", valorPago);
         }

    }
}

// se eu treino 8 horas no mês então eu ganho 2 pontos por hora.  8 * 2 = 16 pontos  -- horas * 2 pontos

// logo eu tenho 16 pontos

// a cada ponto eu ganho R$ 0.05 centavos no valor pago no final

// se eu ganhei 16 pontos * R$ 0.05 = logo eu tenho = 0,80 centavos

// se eu treino até 10 horas no mês eu ganho 2 pontos por hora
//se eu treino entre 10 e 20 horas no mes eu ganho cinco pontos por hora
// se eu treino a cima de 20 horas eu ganho 10 pontos por hora.