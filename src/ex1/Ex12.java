package ex1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float CustoPedagio;
        float QuilometragemDiaria;
        float CustoPorLitro;
        float GastoTotal;

        System.out.print("Digite o custo do pedágio: ");
        CustoPedagio = input.nextFloat();

        System.out.print("Digite a quilometragem diária total: ");
        QuilometragemDiaria = input.nextFloat();

        System.out.print("Digite o custo por litro: ");
        CustoPorLitro = input.nextFloat();

        GastoTotal = CustoPedagio + QuilometragemDiaria * CustoPorLitro;
        System.out.printf("O Gasto total será igual a %.2f", GastoTotal);
    }
}
