import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		System.out.print("Insira o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.printf("SOMA = %d", soma);
		sc.close();
	}

}
