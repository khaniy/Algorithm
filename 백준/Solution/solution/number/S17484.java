package solution.number;

import solution.Solution;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S17484 implements Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M, COUNT;
    static int[][] board;
    static int[][][] dp;
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
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        dp = new int[N][M][3];
        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(row[j]);
                Arrays.fill(dp[i][j], (int) 1e9);
            }
        }
        for (int j = 0; j < M; j++) {

            dp[0][j][0] = board[0][j];
            dp[0][j][1] = board[0][j];
            dp[0][j][2] = board[0][j];
        }
    }

    private static void when() {
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (j == 0) {
                    dp[i][j][0] = Math.min(dp[i - 1][j + 1][1], dp[i - 1][j + 1][2]) + board[i][j];
                    dp[i][j][1] = dp[i - 1][j][0] + board[i][j];
                } else if (j == M - 1) {
                    dp[i][j][2] = Math.min(dp[i - 1][j - 1][1], dp[i - 1][j - 1][0]) + board[i][j];
                    dp[i][j][1] = dp[i - 1][j][2] + board[i][j];
                } else {
                    dp[i][j][0] = Math.min(dp[i - 1][j + 1][1], dp[i - 1][j + 1][2]) + board[i][j];
                    dp[i][j][1] = Math.min(dp[i - 1][j][0], dp[i - 1][j][2]) + board[i][j];
                    dp[i][j][2] = Math.min(dp[i - 1][j - 1][1], dp[i - 1][j - 1][0]) + board[i][j];
                }
            }
        }
        COUNT = (int) 1e9;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < 3; i++) {
                COUNT = Math.min(COUNT, dp[N - 1][j][i]);
            }
        }
    }

    private static void then() throws IOException {
        System.out.println(COUNT);
    }
}
