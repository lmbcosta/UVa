import java.util.Scanner;

public class LoansomeCarBuyer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		
		while (!stop) {
			int nMonths = sc.nextInt();
			if (nMonths < 0)
				stop = true;
			else {
				double entrada = sc.nextFloat();
				double valorCarro = sc.nextFloat();
				int times = sc.nextInt();
				double[][] months = new double[times][2];
				double quantoDeve = valorCarro;
				double prestacao = quantoDeve / nMonths;
				valorCarro+= entrada;
				
				
				for (int i = 0; i < times; i++) 
					for (int j = 0; j < months[0].length; j++) 
						months[i][j] = sc.nextDouble();
				
				int mes = 0;
				double depreciacao = 0;
				
				for (int i = 0; i < nMonths; i++) {
					for(int j = 0; j < months.length; j++)
						if (i == months[j][0]) {
							depreciacao = (1 - months[j][1]);
							break;
						}
					valorCarro*= depreciacao;
					if (mes != 0)
						quantoDeve-= prestacao;
					if (quantoDeve < valorCarro)
						break;
					mes++;	
				}
				mes = mes == 0 ? 0 : mes;
				System.out.print(mes + " month");
				System.out.println(mes != 1 ? "s" : "");
			}
		}
		sc.close();
	}
}
