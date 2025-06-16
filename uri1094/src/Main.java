import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nTeste = sc.nextInt();
		
		int somaTotal = 0, totalR = 0, totalS = 0, totalC = 0;
		
		char tipo;
		
		for(int i = 0; i < nTeste; i++) {
			int nCobaia = sc.nextInt();
			tipo = sc.next().charAt(0);
			
			somaTotal += nCobaia;
			
			if(tipo == 'C') {
				totalC += nCobaia;
				
			} else if(tipo == 'R') {
				totalR += nCobaia;
				
			} else if(tipo == 'S') {
				totalS += nCobaia;
				
			}
			
		}
		
		double c = (double)(totalC * 100) / somaTotal;
		double r = (double)(totalR * 100) / somaTotal;
		double s = (double)(totalS * 100) / somaTotal;
		
		System.out.printf("Total: %d cobaias%n",somaTotal);
		System.out.printf("Total de coelhos: %d%n",totalC);
		System.out.printf("Total de ratos: %d%n",totalR);
		System.out.printf("Total de sapos: %d%n",totalS);
		System.out.printf("Percentual de coelhos: %.2f %%%n",c);
		System.out.printf("Percentual de ratos: %.2f %%%n",r);
		System.out.printf("Percentual de sapos: %.2f %%%n",s);
		
		sc.close();

	}

}
