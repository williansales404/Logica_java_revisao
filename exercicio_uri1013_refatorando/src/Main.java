import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maior;
        
        if (a >= b && a >= c) {
            maior = a;
        } else if (b >= a && b >= c) {
            maior = b;
        } else {
            maior = c;
        }
        
        System.out.println(maior);
        
        sc.close();
    }
}
