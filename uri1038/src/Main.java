import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//esse print não e solitado no uri coloquei por estetica opicional
		System.out.println("*******************************");
		System.out.println("CODIGO  ESPECIFICAÇÃO    PREÇO");
		System.out.println("1       Cachorro Quente  R$4.00");
		System.out.println("2       X-Salada         R$4.50");
		System.out.println("3       X-Bacon          R$5.00");
		System.out.println("4       Torrada simples  R$2.00");
		System.out.println("5       Refrigerante     R$1.50");
		System.out.println("*******************************");
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double resultado;
		
		switch(codigo){
		case 1:
			resultado = 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n",resultado);
			break;
		case 2:
			resultado = 4.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n",resultado);
			break;
		case 3:
			resultado = 5.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n",resultado);
			break;
		case 4:
			resultado = 2.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n",resultado);
			break;
		case 5:
			resultado = 1.50 * quantidade;
			System.out.printf("Total: R$ %.2f%n",resultado);
			break;
		}
		
		sc.close();
	}

}
