package ex3;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float temperatura;

        System.out.println("Digite a temperatura do paciente: ");
        temperatura = input.nextFloat();

        while (temperatura < 30 || temperatura > 45){
            System.out.println("Temperatura inválida, digite um valor entre 30 e 45 graus celsius:");
            temperatura = input.nextFloat();
        }

        System.out.printf("A temperatura inserida foi de %.2f° celsius", temperatura);
    }
}
