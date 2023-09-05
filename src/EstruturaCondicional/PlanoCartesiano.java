package EstruturaCondicional;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CalcQuadrante quad = new CalcQuadrante();
        String res;
        float x, y;
        System.out.println("DEFINIR QUADRANTE DOS EIXOS.");
        System.out.print("Informe o valor do eixo X: ");
        x = sc.nextFloat();
        System.out.print("Informe o valor do eixo Y: ");
        y = sc.nextFloat();
        res = quad.posPlan(x,y);
        System.out.printf("%s", res);
    }
}
