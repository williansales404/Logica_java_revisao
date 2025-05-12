import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int hora = n / 3600;
		int minuto = (n - (hora * 3600)) / 60;
		int segundos = (n - (hora * 3600)) - (minuto * 60) ;
		
		System.out.printf("%d:%d:%d%n",hora ,minuto ,segundos);
		
		/*int hora = n / 3600;
		int minutos = (n % 3600) / 60;
		int segundos = (n % 3600) % 60;
		
		System.out.println(hora + ":" + minutos + ":" + segundos);
		*/
		sc.close();

	}

}

