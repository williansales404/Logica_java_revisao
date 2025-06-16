import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if(x == 0) {
				System.out.println("NULL");
			}
			
			if(x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} else if(x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			}
			
			if(x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else if(x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			}
			
		}
		
		
		
		
		sc.close();

	}

}
