package ex2;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args){
        int contador = 1;
        int Aluno = 0;
        Scanner input = new Scanner(System.in);
        while (contador < 11){
            System.out.printf("%nO aluno número %d foi aprovado? Digite 1 para sim e 2 para não: ", contador);
            contador += 1;
            Aluno = input.nextInt();

            if (Aluno == 1){
                System.out.print("Aprovado");
            }else {
                if (Aluno == 2) {
                    System.out.print("Reprovado");
                } else {
                    System.out.print("Resultado não reconhecido.");
                }
            }
        }
    }
}
