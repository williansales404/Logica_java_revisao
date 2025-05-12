import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pesoNota1 = 3.5, pesoNota2 = 7.5;
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media = ((nota1 * pesoNota1) + (nota2 * pesoNota2)) / (pesoNota1 + pesoNota2);
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		
		sc.close();
		
		
		
	}

}
