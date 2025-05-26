import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempoDeJogo = 0;

		int horaInicio = sc.nextInt();
		int horaFin = sc.nextInt();

		if (horaInicio == horaFin) {
			tempoDeJogo = 24;
			
		} else if (horaInicio > horaFin) {
			tempoDeJogo = horaInicio - (horaFin + 24);
			
		}
		else if(horaInicio < horaFin) {
			tempoDeJogo = ((horaFin * 24) - (horaInicio * 24)) / 24;
			
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n",Math.abs(tempoDeJogo));
		
		
		sc.close();
	}

}
