import java.util.Scanner;

public  class TheSnail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		
		while (!stop) {
			double[] v = new double[4];
			
			for (int i = 0; i < 4; i++)
				v[i] = sc.nextInt();
			
			if (v[0] == 0)
				stop = true;
			else {
				double total = 0;
				double lastDist = v[1];
				double fatigue = 0;
				int days = 1;
				
				do {
					double dist = lastDist - fatigue;
					total+= dist > 0 ? dist : 0;
					if (total > v[0]) 
						break;
					total-= v[2];
					if (total < 0)
						break;
					lastDist = dist;
					fatigue = v[1] * v[3] / 100;
					days++;
				} while (total > 0 && total < v[0]);
				
				if(total > 0)
					System.out.println("success on day " + days);
				else
					System.out.println("failure on day " + days);
			}
		}
		sc.close();
	}
}