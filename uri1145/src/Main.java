import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//int cont = 2;
		
		for(int i = 1; i <= y; i++) {
			
			for(int j = 0; j < x; j++) {
				System.out.print(i);
				
				if(j < x -1) {
					System.out.print(" ");
				}
				
				i += 1;
			}
			
			if(i != y) {
				System.out.println();
			}
			
			i -= 1;
		}
		
		//solução professor
		/*for (int i=1; i<=y; i++) {
			System.out.print(i);
			if (i % x == 0) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}*/
		
		
		sc.close();

	}

}
