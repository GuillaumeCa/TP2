import java.util.Scanner;
import java.util.Arrays;

public class table_multiplication2 {
	
	public static int[] calculerTable(int nb, int max) {
		int tab2 [] = new int[max+1];
		for (int k=0; k <= max; k++) {
			tab2[k]= nb*k;
		}
		return tab2;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre ? ");
		int nb = scan.nextInt();
		System.out.print("Nombre max ? ");
		int max = scan.nextInt();
		int[] tab = calculerTable(nb,max);
		System.out.println(Arrays.toString(tab));
	}
}
