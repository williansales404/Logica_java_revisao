import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		double imposto = 0, diferenca;
		
		/*neste problema eu trabalho com taxa fixas entre os valores fornecidos*/
		
		if(n > 2000.00 && n <= 3000.00) {
			imposto = (n - 2000.00) * 0.08;
			
		} else if(n > 3000.00 && n <= 4500.00) {
			imposto = 1000.00 * 0.08;
			diferenca = (n - 3000.00) * 0.18;
			imposto += diferenca; 
		} else if(n > 4500) {
			imposto = 1000.00 * 0.08 + 1500 * 0.18;
			diferenca = (n - 4500) * 0.28;
			imposto += diferenca;
		}
		
		if(n < 2000.00) {
			System.out.println("Isento");
			
		} else {
			System.out.printf("R$ %.2f%n",imposto);
		}
		
		sc.close();

	}

}
