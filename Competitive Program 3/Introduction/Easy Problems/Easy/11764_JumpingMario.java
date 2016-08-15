import java.util.Scanner;

public class JumpingMario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTests = sc.nextInt();
		
		//Lopping the tests
		for (int i = 0; i < numTests; i++) {
			int hJumps = 0;
			int lJumps = 0;
			
			int walls = sc.nextInt();
			int before = sc.nextInt();
			
			//Looping walls
			for (int j = 1; j < walls; j++) {
				int now = sc.nextInt();
				
				if (before < now)
					hJumps++;
				else if(before > now)
					lJumps++;
				
				before = now;
			}
			System.out.println("Case " + (i+1) + ": " + hJumps + " " + lJumps);	
		}
		sc.close();
	}
}