import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, precoDoterreno;
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		
		//para saber o preço do terreno pego preço do metro quadrado
		precoDoterreno = metroQuadrado * area;
		
		System.out.printf("AREA = %.2f%n",area);
		System.out.printf("PRECO = %.2f%n",precoDoterreno);
		
		
		sc.close();

	}

}
