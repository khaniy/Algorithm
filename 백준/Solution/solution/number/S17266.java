package solution.number;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S17266 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = 0;
        int lastIdx = 0;
        for (int i = 0; i < M; i++) {
            int in = Integer.parseInt(st.nextToken());
            if (M == 1) {
                height = Math.max(N - in, in);
                break;
            }
            if (i == 0) {
                height = Math.max(in, height);
                lastIdx = in;
                continue;
            }
            int gap = in - lastIdx;
            lastIdx = in;
            height = Math.max(gap / 2 + gap % 2, height);
            if (i == M - 1) {
                height = Math.max(N - in, height);
            }
        }
        bw.write(height + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
