import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		
		String product1 = "Computer";
		String product2 = "Office desck";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.1f%n", product1, price1);
		System.out.printf("%s,  whichprice is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.println();
		System.out.printf("%d  year sold, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.println("Measue withe ight decimal places:"+ measure);
		System.out.printf(" Rouded (threedecimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		}
	}
