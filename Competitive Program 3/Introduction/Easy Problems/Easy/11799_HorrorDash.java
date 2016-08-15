import java.util.Scanner;

public class HorrorDash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		sc.next();
		
		//Looping the tests
		for (int i = 0; i < tests; i++) {
			String[] w = sc.nextLine().split(" ");
			int[] v = new int [w.length];
			
			for (int j = 1; j < w.length; j++)
				v[j] = Integer.parseInt(w[j]);
				
			
			System.out.println("Case " + (i + 1) + ": " + bigList(v));
		}
		sc.close();
	}
	public static int bigList (int[] v) {
		int max = v[0];
		
		for (int i = 1; i < v.length; i++)
			if (v[i] > max)
				max = v[i];
		
		return max;
	}
}
