import java.util.Scanner;

public class PackingForHoliday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Number of tests
		int nTests = sc.nextInt();
		
		//Looping the tests
		for (int i = 0; i < nTests; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if (x <= 20 && y <= 20 && z <= 20)
				System.out.println("Case " + (i + 1) + ": good");
			else
				System.out.println("Case " + (i + 1) + ": bad");
		}
		sc.close();
	}
}
