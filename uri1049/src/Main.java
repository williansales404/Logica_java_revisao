import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String escolha1 = sc.next();
		String escolha2 = sc.next();
		String escolha3 = sc.next();

		if (escolha1.equals("vertebrado")) {
			if (escolha2.equals("ave")) {
				if (escolha3.equals("carnivoro")) {
					System.out.println("aguia");

				} else if (escolha3.equals("onivoro")) {
					System.out.println("pomba");

				}
			} else if (escolha2.equals("mamifero")) {
				if (escolha3.equals("onivoro")) {
					System.out.println("homem");

				} else if (escolha3.equals("herbivoro")) {
					System.out.println("vaca");

				}
			}

		} else if (escolha1.equals("invertebrado")) {
			if (escolha2.equals("inseto")) {
				if (escolha3.equals("hematofago")) {
					System.out.println("pulga");

				} else if (escolha3.equals("herbivoro")) {
					System.out.println("lagarta");

				}
			} else if (escolha2.equals("anelideo")) {
				if (escolha3.equals("hematofago")) {
					System.out.println("sanguessuga");

				} else if (escolha3.equals("onivoro")) {
					System.out.println("minhoca");

				}
			}

		}

		sc.close();

	}

}
