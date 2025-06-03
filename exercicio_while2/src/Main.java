import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		if(x < 0) {
			System.out.println("impossivel calcular");
		}
		
		int i = 0;
		int soma = 0;
		double media;
		while(x >= 0) {
				i += 1;
				soma += x;
				x = sc.nextInt();
		}
		
		//poderia colocar um else logo abaixo para dizer impossivel calcular tambem
		//coloque em cima mas poderia ter colocar abaxio desse if.
		if(i > 0) {
			media = (double) soma / i;
			System.out.printf("%.2f%n",media);
		}
		
		sc.close();

	}

}
