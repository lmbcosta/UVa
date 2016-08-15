import java.util.Scanner;

public class EventPlanning {
	public static void main(String[] args) {
		final int LINES = 4; //array length with variables
		final int TOPPRICE = 100001; //Top price possible consider + 1
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			//var0 pessoas | var1 budget | var2 hotels | var3 weeks
			int[] var = new int[LINES]; //Array that contains variables
			int[][] table; //matrix: row by hotel column price + column by week
			
			//reading array var
			for (int i = 0; i < LINES; i++)
				var[i] = sc.nextInt();
			
			//initialize table rows 
			//Number of hotels columns: 1 (Price) + Number of weeks
			table = new int[var[2]][var[3] + 1];
			
			//Reading sc for table
			for(int i = 0; i < table.length; i++)
				for(int j = 0; j < table[0].length; j++)
					table[i][j] = sc.nextInt();
			
			//Top price consider + 1
			int lowestPrice = TOPPRICE;
			
			for(int i = 0; i < table.length; i++) {
				//price per person in hotel
				int price = table[i][0];
				//Check the price per person against budget
				if (price * var[0] <= var[1]) {
					for (int j = 1; j < table[0].length; j++) {
						//Number of beds
						int beds = table[i][j];
						//Check number of persons against beds
						if (beds >= var[0]) {
							lowestPrice = price < lowestPrice ?
									price : lowestPrice;
							//Dont need to check the rest of the weeks
							break;
						}
					}
					
				}	
			}
			//Printing results
			if (lowestPrice == TOPPRICE)
				System.out.println("stay home");
			else
				//Lowest price * number of persons
				System.out.println(lowestPrice * var[0]);
		}
	sc.close();	
	}
}
