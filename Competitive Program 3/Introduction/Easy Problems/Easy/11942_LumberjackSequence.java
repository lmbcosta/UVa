import java.util.Scanner;

public class LumberjackSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		boolean isFirst = true;
		
		for(int i = 0; i < tests; i++) {
			int[] v = new int[10];
			
			for(int j = 0; j < v.length; j++) {
				v[j] = sc.nextInt();
			}
			
			if(isFirst) {
				System.out.println("Lumberjacks:");
				isFirst = false;
			}
			
			if(compareArrays(v, sort(v)) || compareArrays(v, switchArray(sort(v))))
				System.out.println("Ordered");
			else
				System.out.println("Unordered");
		}
		sc.close();
	}
	
public static int[] sort (int[] v) {
		
		int[] w = new int[v.length];
		
		for(int i = 0; i < v.length; i++)
			w[i] = v[i];
		
		int aux;
		for(int i = 0; i < w.length; i++)
			for (int j = w.length - 1; j > 0; j--)
				if (w[j] < w[j -1]) {
					aux = w[j];
					w[j] = w[j - 1];
					w[j - 1] = aux;
				}
		return w;			
	}
	
	public static boolean compareArrays (int[] v, int[] w) {
		
		boolean isEqual = true;
		
		for(int i = 0; i < v.length; i++)
			isEqual = isEqual && (v[i] == w[i]);
		
		return isEqual;
	}
	
	public static int[] switchArray (int[] v) {
		int aux;
		int j = v.length -1;
		int[] w = new int[v.length];
		
		for(int i = 0; i < w.length; i++)
			w[i] = v[i];
		
		for(int i = 0; i < v.length; i++) {
			if (i < j) {
				aux = w[i];
				w[i] = w[j];
				w[j] = aux;
			}
			j--;
		}
		return w;
	}
}
