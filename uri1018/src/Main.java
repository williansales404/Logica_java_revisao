import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dinheiro = sc.nextInt();
		
		int cedulas100 = dinheiro / 100;
		int resto100 = dinheiro % 100;
		
		int cedulas50 = resto100 / 50;
		int resto50 = resto100 % 50;
		
		int cedulas20 = resto50 / 20;
		int resto20 = resto50 % 20;
		
		int cedula10 = resto20 / 10;
		int resto10 = resto20 % 10;
		
		int cedula5 = resto10 / 5;
		int resto5 = resto10 % 5;
		
		int cedula2 = resto5 / 2;
		int resto2 = resto5 % 2;
		
		int cedula1 = resto2 / 1;
		//int resto1 = resto2 % 1;
		
		System.out.println(dinheiro);
		System.out.printf("%d nota(s) de R$ 100,00%n",cedulas100);
		System.out.printf("%d nota(s) de R$ 50,00%n", cedulas50);
		System.out.printf("%d nota(s) de R$ 20,00%n",cedulas20);
		System.out.printf("%d nota(s) de R$ 10,00%n",cedula10);
		System.out.printf("%d nota(s) de R$ 5,00%n",cedula5);
		System.out.printf("%d nota(s) de R$ 2,00%n",cedula2);
		System.out.printf("%d nota(s) de R$ 1,00%n",cedula1);
		
		sc.close();
		
		

	}

}
