import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		
		int distanciaPercorrida = distancia * 2;
		
		System.out.printf("%d minutos%n", distanciaPercorrida);
		
		
		
		sc.close();

	}

}
