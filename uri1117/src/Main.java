import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double media = 0, cont = 0, soma = 0;
		
		while(cont < 2) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			if(n1 > 0 && n1 <= 10) {
				cont += 1;
				soma += n1;
				
			} else {
				System.out.println("nota invalida");
				
			}
			
			if(n2 > 0 && n2 <= 10){
				cont += 1;
				soma += n2;
				
			} else {
				System.out.println("nota invalida");
				
			}
			
		}
		
		if(cont > 0) {
			media = soma / cont;
			System.out.printf("media = %.2f%n",media);
		}
		
		sc.close();

	}

}
