package ex5;

import java.util.Scanner;

public class ex51 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int escolha;
        int totalPontos = 0;
        boolean continua = true;
        System.out.printf("Menu de sistema de pontos, selecione a opção que deseja:%n ");
        while(continua == true){
            System.out.printf("%nSelecione uma das opções:%n1 - Compra - Adiciona 500 pontos%n2 - Resgate - Remove 200 pontos%n3 - Triplo Pontos - Multiplica o total de pontos por 3%n4 - Fim - Encerra o programa e mostra o total de pontos resultante%n%nDigite sua escolha: ");
            escolha = input.nextInt();
            if (escolha == 1){
                totalPontos += 500;
                System.out.printf("Sua quantidade total de pontos é %d", totalPontos);
            } else if (escolha == 2) {
                totalPontos -= 200;
                System.out.printf("Sua quantidade total de pontos é %d", totalPontos);
            } else if (escolha == 3){
                totalPontos *= 3;
                System.out.printf("Sua quantidade total de pontos é %d", totalPontos);
            } else if (escolha == 4){
                continua = false;
                System.out.printf("Programa finalizado, seu total de pontos final foi %d", totalPontos);
            } else {
                System.out.print("O número não foi reconhecido, tente novamente");
            }
        }
    }
}
