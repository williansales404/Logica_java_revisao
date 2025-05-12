import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	/*int maior;
	int maiorAB = ((a + b + Math.abs(a - b)) /2 );
	
	if (maiorAB < c) {
		maior = c;
	}
	else {
		maior = maiorAB;
	}
	
	System.out.printf("%d eh o maior%n" , maior);
	*/
	
	int testeMaiorAB1 = ((a + b + Math.abs(a - b)) /2 );
	int testeMaiorAB2 = ((testeMaiorAB1 + c + Math.abs(testeMaiorAB1 - c)) / 2);
	
	System.out.printf("%d eh o maior%n" , testeMaiorAB2);
	
	sc.close();

	}

}
