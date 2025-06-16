import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[]prod = new String[n];
		double[]comp = new double[n];
		double[]vend = new double[n];
		
		for(int i=0; i<n; i++) {
			prod[i] = sc.next();
			comp[i] = sc.nextDouble();
			vend[i] = sc.nextDouble();
			
		}
		
		double part, p10=0.0, p10e20=0.0,p20=0,compTotal=0,vendTotal=0,lucro=0;
		
		for(int i=0; i<n; i++) {
			part = ((vend[i]-comp[i])/comp[i])*100.00;
			compTotal += comp[i];
			vendTotal += vend[i];
			
			
			if(part < 10.00) {
				p10++;
			} else if(part >= 10.00 && part <= 20.00) {
				p10e20++;
			} else if(part > 20.00) {
				p20++;
			}
			
		}
		
		lucro = vendTotal-compTotal;
		
		System.out.printf("Lucro abaixo de 10%%: %.0f%n",p10);
		System.out.printf("Lucro entre 10%% e 20%%: %.0f%n",p10e20);
		System.out.printf("Lucro acima de 20%%: %.0f%n",p20);
		System.out.printf("Valor total de compra: %.2f%n",compTotal);
		System.out.printf("Valor total de venda: %.2f%n",vendTotal);
		System.out.printf("Lucro total: %.2f%n",lucro);
		
		
		
		
		
		
		
		sc.close();

	}

}
