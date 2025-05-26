import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int h1, m1, h2, m2, tempo1 , tempo2, horas, minutoTotal, minutos;
		
		h1 = sc.nextInt();
		m1 = sc.nextInt();
		h2 = sc.nextInt();
		m2 = sc.nextInt();
		
		tempo1 = (h1 * 60 + m1);
		tempo2 = (h2 * 60 + m2);
		
		if(tempo1 < tempo2) {
			minutoTotal = tempo2 - tempo1;
		} else {
			minutoTotal = (24 * 60 - tempo1) + tempo2;
		}
		
		horas = minutoTotal / 60;
		minutos = minutoTotal % 60;
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",horas ,minutos);
		
		sc.close();

	}

}
