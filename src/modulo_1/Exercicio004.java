import java.util.Locale;
import java.util.Scanner;

public class Exercicio004 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int num_func, hora_trab;
		float sal_hora, salary;
		System.out.print("Coloque o seu número de identificação: ");
		num_func = sc.nextInt();
		System.out.print("Insira o seu número de horas trabalhadas: ");
		hora_trab = sc.nextInt();
		System.out.print("Quanto você recebe por hora? ");
		sal_hora = sc.nextFloat();
		salary = CalcSal(hora_trab, sal_hora);
		System.out.printf("O funcionário %d, recebe U$%.2f", num_func, salary);
		sc.close();
	}
	
	public static float CalcSal(int hora_trab, float sal_hora) {
		float salary;
		salary = hora_trab * sal_hora;
		return salary;
	}

}
