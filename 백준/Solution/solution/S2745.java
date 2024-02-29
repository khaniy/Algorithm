package solution;

import java.io.*;

public class S2745 implements Solution {
    @Override
    public void solve() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int B = Integer.parseInt(input[1]);
        int sum = 0;
        int AByteCode = "A".getBytes()[0];
        int oneByteCode = "1".getBytes()[0];
        String[] N = input[0].split("");
        for (int i=0; i<N.length; i++) {
            byte byteCode = N[i].getBytes()[0];
            int numb;
            if ( AByteCode <= byteCode){
                numb = byteCode - AByteCode + 10;
            }else{
                numb = byteCode - oneByteCode + 1;
            }
            sum += (int) (numb * Math.pow(B,N.length-i-1));
        }
        bw.write(String.valueOf(sum));
        bw.close();
        br.close();
    }
}
