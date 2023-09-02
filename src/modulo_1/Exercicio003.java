import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, resultado;
		System.out.println("Insira uma sequência de 4 números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		resultado = calcularDif(a, b, c, d);
		System.out.printf("DIFERENCA = %d", resultado);
		sc.close();
	}
	
	public static int calcularDif(int A, int B, int C, int D) {
		int DIFERENCA;
		DIFERENCA = (A * B - C * D);
		return DIFERENCA;
	}
}
