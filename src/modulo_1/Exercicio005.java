import java.util.Locale;
import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        PagTotal pagTotal = new PagTotal();
        int cod_1, cod_2, quant_1, quant_2;
        float val_1, val_2, total;
        System.out.print("Insira o código do produto 1: ");
        cod_1 = sc.nextInt();
        System.out.print("Quantas unidades? ");
        quant_1 = sc.nextInt();
        System.out.print("Coloque o valor unitário do produto: ");
        val_1 = sc.nextFloat();
        System.out.print("Insira o código do produto 2: ");
        cod_2 = sc.nextInt();
        System.out.print("Quantas unidades? ");
        quant_2 = sc.nextInt();
        System.out.print("Coloque o valor unitário do produto: ");
        val_2 = sc.nextFloat();
        total = pagTotal.pagamento(quant_1, quant_2, val_1, val_2);
        System.out.printf("TOTAL A PAGAR: %.2f", total);
        sc.close();
    }
}
