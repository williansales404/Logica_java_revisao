import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quociente, resto, nota, moeda;
		
		double n = sc.nextDouble();
		
		resto = (int) (n * 100.0 + 0.5);
		
		System.out.println("NOTAS:");
		
		nota = 100;
		quociente = resto / (nota * 100);
		System.out.printf(quociente + " nota(s) de R$ " +nota+ ".00%n");
		resto = resto % (nota * 100);
		
		nota = 50;
		quociente = resto / (nota * 100);
		System.out.printf(quociente + " nota(s) de R$ " +nota+ ".00%n");
		resto = resto % (nota * 100);
		
		nota = 20;
		quociente = resto / (nota * 100);
		System.out.printf(quociente + " nota(s) de R$ " +nota+ ".00%n");
		resto = resto % (nota * 100);
		
		nota = 10;
		quociente = resto / (nota * 100);
		System.out.printf(quociente + " nota(s) de R$ " +nota+ ".00%n");
		resto = resto % (nota * 100);
		
		nota = 5;
		quociente = resto / (nota * 100);
		System.out.printf(quociente + " nota(s) de R$ " +nota+ ".00%n");
		resto = resto % (nota * 100);
		
		nota = 2;
		quociente = resto / (nota * 100);
		System.out.printf(quociente + " nota(s) de R$ " +nota+ ".00%n");
		resto = resto % (nota * 100);
		
		System.out.println("MOEDAS:");
		
		moeda = 100;
		quociente = resto / moeda;
		System.out.printf(quociente + " moeda(s) de R$ 1.00%n");
		resto = resto % moeda;
		
		moeda = 50;
		quociente = resto / moeda;
		System.out.printf(quociente + " moeda(s) de R$ 0.50%n");
		resto = resto % moeda;
		
		moeda = 25;
		quociente = resto / moeda;
		System.out.printf(quociente + " moeda(s) de R$ 0.25%n");
		resto = resto % moeda;
		
		moeda = 10;
		quociente = resto / moeda;
		System.out.printf(quociente + " moeda(s) de R$ 0.10%n");
		resto = resto % moeda;
		
		moeda = 5;
		quociente = resto / moeda;
		System.out.printf(quociente + " moeda(s) de R$ 0.05%n");
		resto = resto % moeda;
		
		System.out.printf(resto + " moeda(s) de R$ 0.01%n");
		
				
		sc.close();
		
		

	}

}
