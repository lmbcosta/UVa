import java.util.Scanner;

public class SummingDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean stop = false;
		
		while (!stop) {
			int n = sc.nextInt();
			if (n == 0) {
				stop = true;
			} 
			else 
				System.out.println(sumDigits(n));
		}
		
	sc.close();	
	}
	
	public static int sumDigits (int n) {
		int sum = 0;
		
		while (n / 10 >= 1) {
			sum+= n % 10;
			n = n / 10;
		}
		sum+=n;
		
		if (sum / 10 < 1)
			return sum;
		
		return sumDigits(sum);
	}
}
