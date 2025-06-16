import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] matA = new int[l][c];
		int[][] matB = new int[l][c];
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				matA[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				matB[i][j] = sc.nextInt();
			}
		}
		
		
		int [][] matSoma = new int[l][c];
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				matSoma[i][j] = matA[i][j] + matB[i][j];
				System.out.printf("%d ",matSoma[i][j]);
			}
			System.out.println();
		}
		sc.close();

	}

}
