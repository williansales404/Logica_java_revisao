import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cont = 0, contW = 0;
		
		for(int i = 0; i < n; i++) {
			
			contW = 0;
			while(contW < 3) {
				contW ++;
				cont++;
				System.out.print(cont+" ");
			}
			cont += 1;
			System.out.println("PUM");
		}
		
		sc.close();

	}

}
