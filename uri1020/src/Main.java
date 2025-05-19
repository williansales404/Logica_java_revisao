import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadeDias = sc.nextInt();
		
		int ano = idadeDias / 365;
		int restoAno = idadeDias % 365;
		
		int mes = restoAno / 30;
		int restoMes = restoAno % 30; // resto desta divsão conderamos dias
		
		System.out.printf("%d ano(s)%n",ano);
		System.out.printf("%d mes(es)%n",mes);
		System.out.printf("%d dia(s)%n",restoMes);
		
		sc.close();
		
		

	}

}
