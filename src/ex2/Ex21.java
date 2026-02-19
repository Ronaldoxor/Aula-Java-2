package ex2;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int NivelRisco;

        System.out.print("Digite o nível de Risco(de 0 a 10 e valor inteiro): ");
        NivelRisco = input.nextInt();

        if (NivelRisco > 8){
            System.out.print("AlERTA: Ataque Iminente");
        }
    }
}
