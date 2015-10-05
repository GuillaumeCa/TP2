import java.util.Scanner;

public class NombrePremier {
	
	public static int nombrePremier(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else if (n%2 == 0) {
			return 0;
		}
		double R = Math.sqrt(n);
		if (R == Math.floor(R)) {
			return 0;
		}
		for (int i=3; i <= R; i+=2 ) {
			if (n%i == 0) {
				return 0;
			}
		}
		return 1;
	}
		
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre ? ");
		int n = scan.nextInt();
		int result = nombrePremier(n);
		System.out.println(result);

	}
}