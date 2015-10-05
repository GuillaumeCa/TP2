import java.util.Scanner;

public class Puissance {
	
	public static void puissance(int a, int n) {
		int i;
		int R = a;
		if (n==0) {
			R = 1;
			System.out.println(R);
		} else if (n < 0) {
			n = -n;
			for (i=0; i<=n-2; i++) {
				R = R*a;
			}
			double R1 = 1/R;
			System.out.println(R1);
		} else {
			for (i=0; i<=n-2; i++) {
				R = R*a;
			}
			System.out.println(R);
		}
		
	}
	
	
	public static void main(String[] args) {
		int a,n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre ? ");
		a = scan.nextInt();
		System.out.print("Puissance ? ");
		n = scan.nextInt();
		puissance(a,n);
		
	}
}