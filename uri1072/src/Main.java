import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contIn = 0, contOut = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				contIn++;
			} else {
				contOut++;
			}
			
		}
		System.out.printf("%d in%n",contIn);
		System.out.printf("%d out%n",contOut);
		sc.close();

	}

}
