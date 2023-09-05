package EstruturaCondicional;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("DETERMINAR SE O NÚMERO É PAR OU IMPAR.");
        System.out.print("Insira o número inteiro: ");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.print("PAR.");
        }else {
            System.out.print("IMPAR.");
        }
    }
}
