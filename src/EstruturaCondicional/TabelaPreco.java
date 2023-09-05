package EstruturaCondicional;

import java.util.Scanner;

public class TabelaPreco {
    public static void main(String[] args){
        CalcPedido pedido = new CalcPedido();
        Scanner sc = new Scanner(System.in);
        float contaFinal, pedido1 = 4f, pedido2 = 4.5f, pedido3 = 5f, pedido4 = 2f, pedido5 = 1.5f;
        int cod, quant;
        System.out.printf("1 - Cachorro Quente: R$%.2f%n", pedido1);
        System.out.printf("2 - X-Salada: R$%.2f%n", pedido2);
        System.out.printf("3 - X-Bacon: R$%.2f%n", pedido3);
        System.out.printf("4 - Torrada simples: R$%.2f%n", pedido4);
        System.out.printf("5 - Refrigerante: R$%.2f%n", pedido5);
        System.out.print("Insira o código do item desejado: ");
        cod = sc.nextInt();
        System.out.print("Coloque a quantidade que deseja: ");
        quant = sc.nextInt();
        contaFinal = pedido.calcConta(cod, quant);
        System.out.printf("Total: R$%.2f", contaFinal);
    }
}
