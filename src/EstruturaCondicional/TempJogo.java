package EstruturaCondicional;

import java.util.Scanner;

public class TempJogo {
    public static void main(String[] args){
        CalcTemp ct = new CalcTemp();
        Scanner sc = new Scanner(System.in);
        int duracao, inicio, fim;
        System.out.println("DEFINIR QUANTO TEMPO DUROU O JOGO.");
        System.out.print("Insira a hora inicial: ");
        inicio = sc.nextInt();
        System.out.print("Insira a hora final: ");
        fim = sc.nextInt();
        duracao = ct.calcHora(inicio, fim);
        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
    }
}
