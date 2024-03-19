package solution.number;

import solution.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S19941 implements Solution {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, K, COUNT;
    static String[] input;
    static StringTokenizer st;

    @Override
    public void solve() throws IOException {
        given();
        when();
        then();
    }

    private static void given() throws IOException {
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        input = br.readLine().split("");
    }

    private static void when() {
        for (int i = 0; i < N; i++) {
            if (input[i].contains("P")) {
                for (int j = 0; j <= 2 * K; j++) {
                    int idx = i + j - K;
                    if (idx < 0 || idx >= N)
                        continue;
                    else if (input[idx].contains("H")) {
                        input[idx] = "X";
                        COUNT++;
                        break;
                    }
                }
            }
        }
    }

    private static void then() throws IOException {
        System.out.println(COUNT);
    }
}
