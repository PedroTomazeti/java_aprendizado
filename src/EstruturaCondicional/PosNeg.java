package EstruturaCondicional;

import java.util.Scanner;

public class PosNeg {
    public static void main (String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("DETERMINAR SE É POSITIVO OU NEGATIVO.");
        System.out.print("Insira um número inteiro: ");
        num = sc.nextInt();
        if (num < 0){
            System.out.print("NEGATIVO.");
        } else {
            System.out.print("POSITIVO.");
        }
    }
}
