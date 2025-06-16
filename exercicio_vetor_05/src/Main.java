import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]v = new int[n];
		
		int soma = 0, cont = 0;
		for(int i=0; i<n; i++) {
			v[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(v[i]%2 == 0) {
				soma += v[i];
				cont++;
			}
		}
		
		double media = (double) soma / cont;
		System.out.println(media);
		
		
		sc.close();

	}

}
