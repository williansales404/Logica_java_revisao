import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*que deixar aqui nesse trabalho uma grande observação,
		 *o trabalho estava correto oque faltava era so leitura de dados. 
		 *e espaço entre caracter não solicitado*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia1, hora1, minutos1, segundos1;
		int dia2, hora2, minutos2, segundos2;
		int soma1, soma2;
		String s;
		
		s = sc.next();
		dia1 = sc.nextInt();
		hora1 = sc.nextInt();
		s = sc.next();
		minutos1 = sc.nextInt();
		s = sc.next();
		segundos1 = sc.nextInt();
		
		s = sc.next();
		dia2 = sc.nextInt();
		hora2 = sc.nextInt();
		s = sc.next();
		minutos2 = sc.nextInt();
		s = sc.next();
		segundos2 = sc.nextInt();
		
		soma1 = (dia1 * 86400) + (hora1 * 3600) + (minutos1 * 60) + segundos1;
		soma2 = (dia2 * 86400) + (hora2 * 3600) + (minutos2 * 60) + segundos2;
		
		int somaTotal = soma1 - soma2;
		
		int totalPositivo =  Math.abs(somaTotal);
		
		int restoDias = totalPositivo / 86400;
		int restoD = totalPositivo % 86400;
		
		int restoHoras = restoD / 3600;
		int restoH = restoD % 3600;
		
		int restoMinutos = restoH / 60;
		int restoM = restoH % 60;
		
		
		System.out.printf("%d dia(s)%n",restoDias);
		System.out.printf("%d hora(s)%n",restoHoras);
		System.out.printf("%d minuto(s)%n",restoMinutos);
		System.out.printf("%d segundo(s)%n",restoM);
		
		sc.close();
		
	}

}
