import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String s1, s2, s3;
		 int x;
		 
		 //nextLine ler a linha inteira
		 //next apos enter ou espaço não ler mais
		 x = sc.nextInt();
		 sc.nextLine(); //esse nextLine vai ser comsumido na quebra de linha
		 s1 = sc.nextLine();
		 s2 = sc.nextLine();
		 s3 = sc.nextLine();
		 
		 System.out.println("DADOS DIGITADOS:");
		 System.out.println(x);
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 
		 sc.close();

	}

}
