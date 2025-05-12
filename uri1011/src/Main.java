import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double PI = 3.14159;
		int raio = sc.nextInt();
		
		double volume = (4/3.0) * PI * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
		
	}

}
