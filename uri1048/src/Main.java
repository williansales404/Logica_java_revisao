import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String porcentagem = "s";
		double salarioNovo = 0, reajuste = 0;

		double salario = sc.nextDouble();

		if (salario >= 0 && salario <= 400.00) {
			salarioNovo = salario * 1.15;
			reajuste = salario * 0.15;
			porcentagem = "15 %";

		} else if (salario >= 400.01 && salario <= 800.00) {
			salarioNovo = salario * 1.12;
			reajuste = salario * 0.12;
			porcentagem = "12 %";
			
		} else if(salario >= 800.01 && salario <= 1200.00) {
			salarioNovo = salario * 1.10;
			reajuste = salario * 0.10;
			porcentagem = "10 %";
			
		} else if(salario >= 1200.01 && salario <= 2000.00) {
			salarioNovo = salario * 1.07;
			reajuste = salario * 0.07;
			porcentagem = "7 %";
			
		} else if(salario > 2000.00) {
			salarioNovo = salario * 1.04;
			reajuste = salario * 0.04;
			porcentagem = "4 %";
		}
		
		System.out.printf("Novo salario: %.2f%n",salarioNovo);
		System.out.printf("Reajuste ganho: %.2f%n",reajuste);
		System.out.printf("Em percentual: %s%n",porcentagem);

		sc.close();

	}

}
