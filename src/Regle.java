import java.util.Scanner;

public class Regle {
	
	public static void regleGraduee(int longueur, int intervalle) {
		int i;
		int I = longueur/intervalle;
		for (i=0; i<=longueur-1; i++) {
			if (i%I == 0) {
				System.out.print("|");
			}
			System.out.print("-");
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Longueur ? ");
		int L = scan.nextInt();
		System.out.print("Intervalle ? ");
		int I = scan.nextInt();
		regleGraduee(L,I);
	}
}