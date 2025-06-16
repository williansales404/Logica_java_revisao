import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] mat = new int[l+1][c];
		
		
		for(int i=1; i<=l; i++) {
			for(int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int[][]ultimoFila = new int[1][c];
		int linha = sc.nextInt();
		ultimoFila[0][0] = mat[linha][c-1];
		
		for(int j=0; j<c-1; j++) {
			ultimoFila[0][j+1] = mat[linha][j];
		}
		
		for(int j=0; j<c; j++) {
			mat[linha][j] = ultimoFila[0][j];
		}
		
		for(int i=1; i<=l; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
