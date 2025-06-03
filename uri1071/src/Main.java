import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int a, b, soma = 0;
		
		if(n1 < n2) {
			a = n1;
			b = n2;
		} else {
			a = n2;
			b = n1;
		}
		
		
		for(int i = a += 1; i < b; i++) {
			
			if(i % 2 != 0) {
				soma += i;
				
				}
			
			}
		
		
		System.out.println(soma);
		
		sc.close();

	}

}
