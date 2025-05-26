import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String d;

		switch (x) {
		case 1:
			d = "domingo";
			break;
		case 2:
			d = "segunda-feira";
			break;
		case 3:
			d = "terça-feira";
			break;
		case 4:
			d = "quarta-feira";
			break;
		case 5:
			d = "quinta-feira";
			break;
		case 6:
			d = "sexta-feira";
			break;
		case 7:
			d = "sabado";
			break;
		default:
			d = "invalido";
		}

		System.out.println("dia da semanda " + d);

		sc.close();

	}

}
