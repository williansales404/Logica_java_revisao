import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[]nome = new String[n];
		int[]idade = new int[n];
		
		for(int i=0; i<n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
		}
		
		int maior = idade[0];
		int p = 0;
		for(int i=0; i<n; i++) {
			if(idade[i] > maior) {
				maior = idade[i];
				p = i;
			}
		}
		System.out.printf("Pessoa mais velha: %s",nome[p]);
		
		
		sc.close();

	}

}
