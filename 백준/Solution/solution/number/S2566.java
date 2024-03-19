package solution.number;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class S2566 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = 1;
        int y = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int inputInt = Integer.parseInt(input[j]);
                if (inputInt > max) {
                    max = inputInt;
                    x = j + 1;
                    y = i + 1;
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(y)+" "+String.valueOf(x));
        bw.close();
        br.close();
    }
}
