import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		int repetir = 0, contGrenais = 0, contInter = 0, contGremio = 0, empate = 0;

		while (repetir != 2) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			contGrenais += 1;
			
			if(n1 > n2) {
				contInter += 1;
				
			} else if(n1 < n2) {
				contGremio += 1;
				
			} else {
				 empate += 1;
				 
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			repetir = sc.nextInt();
			while(repetir < 1 || repetir > 2 ) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				repetir = sc.nextInt();
			}
		}
		
		System.out.printf("%d grenais%n",contGrenais);
		System.out.printf("Inter:%d%n",contInter);
		System.out.printf("Gremio:%d%n",contGremio);
		System.out.printf("Empates:%d%n",empate);
		
		if(contInter > contGremio) {
			System.out.println("Inter venceu mais");
		} else if(contInter < contGremio) {
			System.out.println("Gremio venceu mais");
		}
		
		
		sc.close();

	}

}
