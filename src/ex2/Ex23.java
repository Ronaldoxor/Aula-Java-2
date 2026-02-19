package ex2;

import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float Saldo;
        System.out.print("Digite o saldo do cliente: ");
        Saldo = input.nextFloat();

        if(Saldo >= 0){
            System.out.printf("Saldo Credor, o valor do saldo é %.2f", Saldo);
        }else{
            System.out.printf("Saldo Devedor, o valor do saldo é %.2f", Saldo);
        }
    }
}
