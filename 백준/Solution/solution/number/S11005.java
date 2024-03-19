package solution.number;

import java.io.*;

public class S11005 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        while (true){
            int rest = N % B;
            N = N / B;
            if(10 <= rest){
                sb.append((char) ('A' + rest-10));
            }else{
                sb.append(String.valueOf(rest));
            }
            if (N == 0){
                break;
            }

        }
        bw.write(sb.reverse().toString());
        bw.close();
        br.close();
    }
}
