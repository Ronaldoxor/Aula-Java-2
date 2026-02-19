package ex3;

public class Ex33 {
    public static void main(String[] args){
        double cidadeA = 80000;
        double crescimentoA = 0.03;
        double cidadeB = 200000;
        double crescimentoB = 0.015;
        int contaAnos = 1;

        while (cidadeA <= cidadeB){
            cidadeA = cidadeA * (1 + crescimentoA);
            cidadeB = cidadeB * (1 + crescimentoB);
            System.out.printf("%nNo ano %d , a cidade A terá %.0f habitantes e a cidade B terá %.0f habitantes", contaAnos, cidadeA, cidadeB);
            contaAnos += 1;
        }
        contaAnos -= 1;
        System.out.printf("%nNo ano %d , a cidade A terá finalmente passado a cidade B, tendo a cidade A %.0f habitantes e a cidade B %.0f habitantes",contaAnos,cidadeA,cidadeB);
    }
}
