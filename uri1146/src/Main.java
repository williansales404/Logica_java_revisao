import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//OBS a solução do professor tambem não foi aceita, estava praticamente igual a minha
		
		int n = sc.nextInt();
		
		while(n != 0) {
			
			for(int i = 1; i < n; i++) {
				System.out.printf("%d ",i);
				
			}
			
			System.out.println(n);
			
			n = sc.nextInt();
		}
		
		
		sc.close();

	}

}
