import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[]a = new double[n];
		
		double soma = 0, media;
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextDouble();
			soma += a[i];
		}
		
		media = soma / n;
		System.out.println(media);
		for(int i=0; i<n; i++) {
			if(a[i]<media) {
				System.out.println(a[i]);
			}
		}
		
		
		
		sc.close();

	}

}
