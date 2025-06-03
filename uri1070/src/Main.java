import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 0;
		
		while(i < 6) {
			
			
			if(n % 2 != 0) {
				System.out.println(n);
				i += 1;
			}
			n += 1;
		}
		
		
		sc.close();

	}

}
