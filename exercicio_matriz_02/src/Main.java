import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int [] v = new int [n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				v[i] += mat[i][j]; 
			}
			System.out.println(v[i]);
		}
		
		sc.close();

	}

}
