import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		int x = sc.nextInt();
		
		while(x != senha) {
			System.out.println("Senha Invalida");
			x = sc.nextInt();
		}
		
		if(x == senha) {
			System.out.println("Acesso Permitido");
		}
		
		sc.close();

	}

}
