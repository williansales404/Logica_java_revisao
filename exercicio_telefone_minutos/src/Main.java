import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempo;
		int m = sc.nextInt();
		
		if( m > 100) {
			tempo = ( m - 100) * 2 + 50;
			System.out.printf("Valor a pagar: R$ %d.00%n",tempo);
		}
		else {
			System.out.printf("Valor a pagar: R$ 50.00");
		}
		
		sc.close();
	}

}
