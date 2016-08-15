import java.util.Scanner;

public class RequestForProposal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		int count = 0;
		
		while (!stop) {
			count ++;
			int numReq = sc.nextInt();
			int numProp = sc.nextInt();
			sc.nextLine();
			
			if (numReq == 0 && numProp == 0) 
				stop = true;
			else {
				if (count != 1)
					System.out.println();
				for (int i = 0; i < numReq; i++)
					sc.nextLine();
				String bestName = sc.nextLine();
				double bestPrice = sc.nextDouble();
				int bestReq = sc.nextInt();
				sc.nextLine();
				
				for (int i = 0; i < bestReq; i++)
					sc.nextLine();
				
				for (int i = 1; i < numProp; i++) {
					String name = sc.nextLine();
					double price = sc.nextDouble();
					int req = sc.nextInt();
					sc.nextLine();
					
					if (req > bestReq || (req == bestReq && price < bestPrice)) {
						bestName = name;
						bestPrice = price;
						bestReq = req;
					}
					
					for(int j = 0; j < req; j++)
						sc.nextLine();
				}
				
				System.out.println("RFP #" + count);
				System.out.println(bestName);
			}
		}
		sc.close();
	}
}
