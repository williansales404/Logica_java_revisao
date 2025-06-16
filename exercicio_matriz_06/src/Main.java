import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] > 0) {
					soma += mat[i][j];
				}
			}
		}
		
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n",soma);
		System.out.println("LINHA ESCOLHIDA:");
		int l = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf(mat[l][i]+" ");
		}
		System.out.println();
		
		System.out.println("COLUNA ESCOLHIDA::");
		int c = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf(mat[i][c]+" ");
		}
		System.out.println();
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					mat[i][j] = Math.pow( mat[i][j], 2);
				}
				System.out.printf(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();

	}

}
