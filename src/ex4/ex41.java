package ex4;

import java.util.Scanner;

public class ex41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int contador = 1;
        float salto;
        float total = 0;
        float media;
        while (contador < 11){
            System.out.printf("%nDigite o valor do %d° salto: ",contador);
            contador += 1;
            salto = input.nextFloat();
            total += salto;
        }
        media = total/10;
        System.out.printf("%nO valor da média aritmética dos saltos é igual a %.2f",media);
    }
}
