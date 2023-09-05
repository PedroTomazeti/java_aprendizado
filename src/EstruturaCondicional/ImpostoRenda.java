package EstruturaCondicional;

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args){
        CalcImposto imp = new CalcImposto();
        Scanner sc = new Scanner(System.in);
        String res;
        double salario;
        System.out.println("CALCULAR IMPOSTO DE RENDA.");
        System.out.print("Declare seu salário: R$");
        salario = sc.nextDouble();
        res = imp.calcImp(salario);
        if (res.equals("Isento.") || res.equals("Salário inválido.")){
            System.out.printf("%s", res);
        } else {
            System.out.printf("R$%s", res);
        }

    }
}
