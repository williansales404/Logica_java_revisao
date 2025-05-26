import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		double a = 0.0, b = 0.0, c = 0.0;

		if (n1 >= n2 && n1 >= n3) {
			a = n1;
			if (n2 >= n3) {
				b = n2;
				c = n3;
			} else {
				b = n3;
				c = n2;
			}
			
		} else if (n2 >= n1 && n2 >= n3) {
			a = n2;
			if(n1 >= n3) {
				b = n1;
				c = n3;
			} else {
				b = n3;
				c = n1;
			}
			
		} else if(n3 >= n1 && n3 >= n2) {
			a = n3;
			if(n1 >= n2) {
				b = n1;
				c = n2;
			} else {
				b = n2;
				c = n1;
			}
			
		}
		
		if(a >= b+c) {
			System.out.println("NAO FORMA TRIANGULO");
			
		} else if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO RETANGULO");
			
			if (a == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if(a == b || a == c || b == c) {
					System.out.println("TRIANGULO ISOSCELES");
					
				}
			
		} else if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
			
			if (a == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if(a == b || a == c || b == c) {
					System.out.println("TRIANGULO ISOSCELES");
					}
			
		} else if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
			
			if (a == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
				
			} else if(a == b || a == c || b == c) {
					System.out.println("TRIANGULO ISOSCELES");
					}
		}
		
		
		sc.close();

	}

}
