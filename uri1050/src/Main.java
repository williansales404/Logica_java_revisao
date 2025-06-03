import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ddd;
		String id = "s";
		
		ddd = sc.nextInt();
		
		switch(ddd) {
		case 61:
			id = "Brasilia";
			break;
		case 71:
			id = "Salvador";
			break;
		case 11:
			id = "Sao Paulo";
			break;
		case 21:
			id = "Rio de Janeiro";
			break;
		case 32:
			id = "Juiz de Fora";
			break;
		case 19:
			id = "Campinas";
			break;
		case 27:
			id = "Vitoria";
			break;
		case 31:
			id = "Belo Horizonte";
			break;
		
		default:
			System.out.println("DDD nao cadastrado");
			break;
		}
		
		if(id != "s") {
			System.out.printf("%s%n",id);
		}
		
		
		sc.close();
	}

}
