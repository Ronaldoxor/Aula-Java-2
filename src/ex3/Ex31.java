package ex3;

public class Ex31 {
    public static void main(String[] args){
        int contador = 1;
        while (contador < 11){
            System.out.printf("%nO quadrado %d de é igual a: ", contador);
            System.out.print(contador*contador);
            contador += 1;
        }
    }
}
