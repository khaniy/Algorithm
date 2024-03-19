package solution.number;

import solution.Solution;

import java.io.*;
import java.util.Scanner;

public class S11653 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 소인수분해 수행
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        // 남은 소수 출력
        if (N > 1) {
            System.out.println(N);
        }
    }
}
