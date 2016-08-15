import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class ArmyBuddies {
    public static void main(String[] args) throws IOException {
        BufferedReader input = 
           new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = 
           new BufferedWriter(new OutputStreamWriter(System.out));
        int[] L = new int[100002];
        int[] R = new int[100002];
        String[] line;
        boolean stop = false;
        StringBuilder stringBuilder = new StringBuilder(25000);
        
        while (!stop) {
            line = input.readLine().split(" ");
            int numSoldiers = Integer.parseInt(line[0]);
            int loss = Integer.parseInt(line[1]); 
               
            if (numSoldiers == 0 && loss == 0) 
            	stop = true;
            else {
            	 final int NIL = 0;
                 L[0] = R[0] = NIL;
                 for (int i = 1; i <= numSoldiers; ++i) {
                     L[i] = i - 1;
                     R[i] = i + 1;
                 }
                 R[numSoldiers] = NIL;
                 int lhs, rhs, sL, sR;   //sL = survivor
                 for (int i = 0; i < loss; i++) {
                     line = input.readLine().split(" ");
                     lhs = Integer.parseInt(line[0]);
                     rhs = Integer.parseInt(line[1]);
                     sL = L[lhs];
                     sR = R[rhs];
                     if (sL == 0) stringBuilder.append('*');
                     else stringBuilder.append(sL);
                     stringBuilder.append(' ');
                     if (sR == 0) stringBuilder.append('*');
                     else stringBuilder.append(sR);
                     stringBuilder.append('\n');
                     R[sL] = sR;
                     L[sR] = sL;
                 }
                 stringBuilder.append("-\n");
                 if (stringBuilder.length() >= 10000) {
                     output.write(stringBuilder.toString());
                     stringBuilder = new StringBuilder(25000);
                 }
           
            }
        }
        output.write(stringBuilder.toString());
        output.flush();
        output.close();
    }
}