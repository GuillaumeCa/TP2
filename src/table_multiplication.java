
public class table_multiplication {
	
	public static void main(String[] args) {
		
		for (int i=0; i<11; i++) {
			String t = new String();
			for (int k=0; k<11; k++) {
				t += Integer.toString(k*i);
				
				if (i*k < 10) {
					t += "  ";
				} else {
					t += " ";
				}
			}
			System.out.println(t);
		}
	}
}
