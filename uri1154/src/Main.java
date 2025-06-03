import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0, cont = 0;
		
		double media;
		
		while(x > 0) {
			
			soma += x;
			cont += 1;
			
			x = sc.nextInt();
		}
		
		media = (double)soma / cont;
		
		System.out.printf("%.2f%n",media);
		
		sc.close();

	}

}
