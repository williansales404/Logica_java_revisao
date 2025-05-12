import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFun = sc.nextInt();
		int numeroHoras = sc.nextInt();
		double horaExtra = sc.nextDouble();
		
		
		System.out.printf("NUMBER = %d%n", numeroFun);
		
		double resultado = numeroHoras * horaExtra;
		
		System.out.printf("SALARY = U$ %.2f%n", resultado);
		
		sc.close();

	}

}
