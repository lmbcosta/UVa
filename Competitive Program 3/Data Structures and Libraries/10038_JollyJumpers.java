import java.util.Scanner;
import java.util.Arrays;

public class JollyJumpers {
	public static void main(String[] args) {
		// Number of elements in one line
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int size = sc.nextInt();	// Number of values per line
			int[] v = new int[size];	// Array containing the read values
			// Array containing diff between consecutive values
			int[] result = new int[size - 1];
			// Boolean to check if is a Jolly
			boolean isJolly = true;
			
			// Loop the values and fill the array v
			for (int i = 0; i < size; i++) {
				v[i] = sc.nextInt();
				if (i > 0) 
					// Fill result array
					result[i - 1] = Math.abs(v[i - 1] - v[i]);
			}
			
			// Sorting result array
			Arrays.sort(result);
			
			// Cases when the sequence possibly could be a not Jolly
			if (size > 1 || (size == 1 && v[0] != 1)) {
				
				// Check result array for Jolly
				for (int i = 0; i  < result.length; i++) {
					if (i == 0)
						isJolly = isJolly && result[i] == 1;
					else
						isJolly = isJolly && result[i - 1] + 1 == result[i];
				}
				
			}
			// sop if the sequence is a jolly or not
			if(isJolly) 
				System.out.println("Jolly");
				
			else 
				System.out.println("Not jolly");
				
		}
		sc.close();
	}
}
