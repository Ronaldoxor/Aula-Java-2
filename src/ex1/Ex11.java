package ex1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double quilometragem;
        double consumo;

        System.out.print("Digite o valor da quilometragem: ");
        quilometragem = input.nextDouble();

        System.out.print("Digite o valor do consumo: ");
        consumo = input.nextDouble();

        double mediadouble;
        mediadouble = consumo/quilometragem;
        int media = (int) mediadouble;

        System.out.printf("A média de consumo é igual a: %d", media);
    }
}
