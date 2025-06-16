import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] v = new double[n];
		
		double maior = v[0];
		int p=0;
		
		for(int i=0; i<n; i++) {
			v[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			if(v[i] > maior) {
				maior = v[i];
				p=i;
			}
		}
		
		System.out.printf("%.1f%n",maior);
		System.out.println(p);
		
		
		sc.close();

	}

}
