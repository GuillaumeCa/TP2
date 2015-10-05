import java.util.Scanner;

public class table_multiplication2 {
	
	public static int[][] calculerTable(int nb, int max) {
		int tab2 [][] = new int[max+1][max+1];
		for (int k=0; k <= max; k++) {
			for (int i=0; i <= max; i++) {
				tab2[k][i] = k*i;
			}
		}
		return tab2;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre départ ? ");
		int nb = scan.nextInt();
		System.out.print("Nombre fin ? ");
		int max = scan.nextInt();
		int[][] tab = calculerTable(nb,max);
	}
}
