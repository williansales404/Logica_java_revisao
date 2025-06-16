import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[]altura = new double[n];
		char[]g = new char[n];
		
		for(int i=0; i<n; i++) {
			altura[i] = sc.nextDouble();
			g[i] = sc.next().charAt(0);
		}
		
		
		double maior = altura[0], menor = altura[0], soma = 0;
		int contF = 0, contM = 0;
		
		for(int i=0; i<n; i++) {
			
			if(altura[i] > maior) {
				maior = altura[i];
			} else if(altura[i] < menor) {
				menor = altura[i];
			}
			
			if(g[i] == 'F') {
				soma += altura[i];
				contF++;
			} else {
				contM++;
			}
			
		}
		double media = soma / contF;
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n",maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n",media);
		System.out.printf("Numero de homens = %d%n",contM);
		
		sc.close();

	}

}
