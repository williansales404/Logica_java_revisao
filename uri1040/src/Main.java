import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float media, exame, mediaExame;
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		System.out.printf("Media: %.1f%n",media);
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
			
		} else if(media < 5.0) {
			System.out.println("Aluno reprovado.");
			
		} else if(media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			
			exame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n",exame);
			
			mediaExame = (exame + media) / 2;
			
			if(mediaExame >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n",mediaExame);
				
			} else if(mediaExame <= 4.9) {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n",mediaExame);
				
			}
			
		}
		
		sc.close();

	}

}
