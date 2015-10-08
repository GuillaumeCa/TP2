import java.util.Scanner;


public class Recherche {
	public static int recherche(int val, int[] tab) {
		int k=0;
		while (k < tab.length) {
			if (val == tab[k]) {
				return k+1;
			}
			k++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] tab1 = {1,2,3,4,5};
		int ans1 = recherche(55,tab1);
		int ans2 = recherche(5,tab1);
		int [] tab2 = {9,8,7,6,5,4,3,2,1,0};
		int ans3 = recherche(9,tab2);
		int ans4 = recherche(5,tab2);
		System.out.println("Position de 55: " + ans1);
		System.out.println("Position de 5: " + ans2);
		System.out.println("Position de 9: " + ans3);
		System.out.println("Position de 5: " + ans4);
	}
}
