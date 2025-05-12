import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int mediaVeiculo = 12;
		int tempoViagem = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double resultado = (double) tempoViagem * velocidadeMedia / mediaVeiculo;
		
		System.out.printf("%.3f%n",resultado);
		
		
		sc.close();

	}

}
