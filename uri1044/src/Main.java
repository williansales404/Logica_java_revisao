import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int maior, menor;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			maior = a;
			menor = b;
		}
		else {
			maior = b;
			menor = a;
		}
		
		if(maior % menor == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		sc.close();
	}

}
