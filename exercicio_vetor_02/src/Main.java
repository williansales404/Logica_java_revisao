import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]v = new int[n];
		
		for(int i=0; i<n; i++) {
			v[i] = sc.nextInt();			
		}
		
		int cont = 0;
		for(int i=0; i<n; i++) {
			if(v[i] % 2 == 0) {
				System.out.printf("%d ",v[i]);
				cont++;
			}
		}
		System.out.println();
		System.out.println(cont);
		
		
		
		sc.close();

	}

}
