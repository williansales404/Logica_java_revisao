import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id1 = sc.nextInt();
		int unidades1 = sc.nextInt();
		double priceUn1 = sc.nextDouble();
		
		int id2 = sc.nextInt();
		int unidades2 = sc.nextInt();
		double priceUn2 = sc.nextDouble();
		
		double resultado = (unidades1 * priceUn1) + (unidades2 * priceUn2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);
	
		sc.close();

	}

}
