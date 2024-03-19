package solution.number;

import solution.Solution;

import java.io.*;
import java.util.StringTokenizer;

public class S23971 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int x = H % (N + 1) == 0 ? H / (N + 1) : H / (N + 1) + 1;
        int y = W % (M + 1) == 0 ? W / (M + 1) : W / (M + 1) + 1;
        bw.write(String.valueOf(x * y));
        bw.close();
        br.close();
    }
}
