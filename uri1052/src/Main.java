import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int mes = sc.nextInt();
		
		String id = "mes";
		
		switch(mes) {
		case 1:
			id = "January";
			break;
		case 2:
			id = "February";
			break;
		case 3:
			id = "March";
			break;
		case 4:
			id = "April";
			break;
		case 5:
			id = "May";
			break;
		case 6:
			id = "June";
			break;
		case 7:
			id = "July";
			break;
		case 8:
			id = "August";
			break;
		case 9:
			id = "September";
			break;
		case 10:
			id = "October";
			break;
		case 11:
			id = "November";
			break;
		case 12:
			id = "December";
			break;
		}
		
		System.out.println(id);
		
		sc.close();

	}

}
