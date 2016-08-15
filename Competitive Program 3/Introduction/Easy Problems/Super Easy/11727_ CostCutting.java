import java.util.Scanner;
public class CostCutting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTests = sc.nextInt();
		
		//Looping tests
		for (int i = 0; i < numTests; i++) {
			//Salaries Array
			int[] salaries = new int[3];
			
			//Looping salaries
			for (int j = 0; j < 3; j++)
				salaries[j] = sc.nextInt();
			
			int result = sort3(salaries);
			//Output
			System.out.println("Case " + (i + 1) + ": " + result);	
		}
		sc.close();
	}
	
	public static int sort3 (int[] v) {
		int aux; 
		
		for (int i = 0; i < 3; i++)
			for (int j = 2; j > 0; j--) 
				if (v[j] < v[j-1]) {
					aux = v[j];
					v[j] = v[j-1];
					v[j -1] = aux;
				}
			return v[1];
	}
}
