import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int min, max;
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		int soma = 0;
		for(int i = min ; i <= max ; i++) {
			
			if(i % 13 != 0) {
				soma += i;
			}
			
		}
		
		System.out.println(soma);
		
		
		sc.close();

	}

}
