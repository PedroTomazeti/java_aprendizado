package EstruturaCondicional;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args){
        CalcMult mt = new CalcMult();
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String res;
        System.out.println("VALIDAR SE OS NÚMEROS SÃO MULTIPLOS.");
        System.out.print("Coloque o primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Agora o segundo número inteiro: ");
        num2 = sc.nextInt();
        res = mt.calcMult(num1, num2);
        System.out.printf("%s", res);
    }
}
