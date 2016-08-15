import java.util.Scanner;
public class Parking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		
		//Looping the tests
		for (int i = 0; i < tests; i++) {
			int numStores = sc.nextInt();
			int[] stores = new int[numStores];
			
			//Collecting the stores
			for (int j = 0; j < numStores; j++) 
				stores[j] = sc.nextInt();
			
			//sorting the stores
			sort(stores);
			
			//mimimum distance
			int dist = 0;
			
			for (int k = numStores - 1; k > 0; k--)
				dist+= stores[k] - stores[k - 1];
			
			System.out.println(dist * 2);	
		}
		sc.close();	
	}
	
	public static void sort (int[] v) {
		int aux;
		for (int i = 0; i < v.length; i++) {
			for (int j = v.length - 1; j > 0; j--)
				if (v[j] < v[j-1]) {
					aux = v[j];
					v[j] = v[j-1];
					v[j-1] = aux;
				}
		}
			
	}
}
