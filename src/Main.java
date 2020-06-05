import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, X, Y, N;
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if (X < Y) {
		for (N = 1; X + N != Y; N ++) {
							
			if((X + N) % 2 == 1 || (X + N) % 2 == -1) {
				soma = soma + X + N;
			}
		}
		}else {
			for (N = 1; X - N != Y; N ++) {
				
				if((X - N) % 2 == 1 || (X - N) % 2 == -1) {
					soma = soma + X - N;
				}
			}
		}
	
		System.out.println(soma);
		
		sc.close();

	}

}
