import java.util.Locale;
import java.util.Scanner;

public class Exercicio002 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, resultado;
		System.out.print("Insira o raio do círculo: ");
		raio = sc.nextDouble();
		resultado = calcularArea(raio);
		System.out.printf("A = %.4f", resultado);
		sc.close();
	}
	
	public static double calcularArea(double r) {
		double area;
		double pi = 3.14159;
		area = pi * Math.pow(r, 2);
		return area;
	}
}
