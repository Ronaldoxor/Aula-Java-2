package ex4;

import java.util.Scanner;

public class ex43 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N;
        int x = 0;
        int y = 0;

        System.out.print("Digite o número de linhas e de colunas que o tabuleiro terá: ");
        N = input.nextInt();

        while (x < N){
            if (x % 2 == 0){
                System.out.print(" ");
            }
            while (y < N){
                System.out.print("* ");
                y += 1;
            }
            y = 0;
            System.out.println(" ");
            x += 1;
        }
    }
}
