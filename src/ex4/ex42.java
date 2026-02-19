package ex4;

import java.util.Scanner;

public class ex42 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float produto = 0;
        float total = 0;
        while (produto != -1){
            total += produto;
            System.out.println("Insira o valor do próximo produto(Insira -1 para finalizar): ");
            produto = input.nextFloat();
        }
        System.out.printf("O total do valor dos produtos foi igual a %f", total);
    }
}
