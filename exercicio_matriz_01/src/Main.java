import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int [][] mat = new int[l][c];
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("valores negativos");
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				if(mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
				
			}
		}
		
		
		
		sc.close();

	}

}
