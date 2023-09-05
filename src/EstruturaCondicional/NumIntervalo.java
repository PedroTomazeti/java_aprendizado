package EstruturaCondicional;

import java.util.Scanner;

public class NumIntervalo {
    public static void main(String[] args){
        CalcIntervalo calcIntervalo = new CalcIntervalo();
        Scanner sc = new Scanner(System.in);
        String res;
        float num;
        System.out.println("DEFINIR EM QUAL INTERVALO O NÚMERO ESTÁ.");
        System.out.print("Insira o número que deseja: ");
        num = sc.nextFloat();
        res = calcIntervalo.defInterval(num);
        System.out.printf("%s", res);
    }
}
