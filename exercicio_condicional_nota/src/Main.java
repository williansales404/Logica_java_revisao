import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double nota = n1 + n2;
		
		System.out.printf("NOTA FINAL = %.1f%n",nota);
		
		if (nota < 60) {
			System.out.println("REPROVADO");	
		}
		
		sc.close();

	}

}
