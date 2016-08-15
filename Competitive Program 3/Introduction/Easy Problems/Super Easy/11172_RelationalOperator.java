import java.util.Scanner;
public class RelationalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numLines = sc.nextInt();
		
		for (int i = 0; i < numLines; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a < b)
				System.out.println("<");
			else if (a == b)
				System.out.println("=");
			else
				System.out.println(">");	
		}
		sc.close();
	}
}
