import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class RotatedSquare {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean stop = false;
		StringBuilder sb = new StringBuilder();
		// Vector to save the results
		int[] results = new int[4];
		
		while (!stop) {
			String[] line = input.readLine().split(" ");
			int bSize = Integer.parseInt(line[0]);
			int sSize = Integer.parseInt(line[1]);
			
			if (bSize == 0 && sSize == 0)
				stop = true;
			else {
				// Initialize bigSquare
				char[][] bSquare = new char[bSize][bSize];
				// Initialize smallSquare
				char[][] sSquare = new char[sSize][sSize];
				String s;
				
				// Read bigSquare input
				for (int i = 0; i < bSize; i++) {
					s = input.readLine();
					
					for (int j = 0; j < s.length(); j++) 
						bSquare[i][j] = s.charAt(j);
				
				}
				
				// Read smallSquare input
				for (int i = 0; i < sSize; i++) {
					s = input.readLine();
					
					for (int j = 0; j < s.length(); j++) 
						sSquare[i][j] = s.charAt(j);
						
				}
				
				int maxSize = bSize - sSize + 1;
				
				// Loop the different small squares
				for (int k = 0; k < 4; k++) {
					// Rotate only in 2nd iteration
					if (k != 0)
						sSquare = rotateRight(sSquare);
					
					for (int l = 0; l < maxSize; l++)
						for (int c = 0; c < maxSize; c++)
							if (!checkSquares(sSquare, bSquare, l, c)) {
								break;
							} else
								results[k]++;
				}
			}
			// Save the result in StringBuilder
			for (int i = 0; i < 4; i++) {
				if (i < 3)
					sb.append(results[i] + " ");
				else
					sb.append(results[i] + "\n");
			}	
		}
		output.write(sb.toString());
		output.flush();
		input.close();
		output.close();
	}
	
    public static char[][] rotateRight(char[][] m){
        int l = m.length;
        char[][] aux = new char[l][l];
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                aux[j][l-i-1] = m[i][j];
            }
        }
        return aux;
    }
    
    public static boolean checkSquares (char[][] small, char[][] big, int l, int c) {
    	int size = small.length;
    	
    	for (int i = 0; i < size; i++) 
    		for (int j = 0; j < size; j++) 
    			if (small[i][j] != big[i + l][j + c])
    				return false;
    	
    	return true;	
    }
}