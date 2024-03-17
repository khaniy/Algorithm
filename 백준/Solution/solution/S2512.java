package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S2512 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] requests = new int[N];
        for (int i = 0; i < N; i++) {
            requests[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());

        System.out.println(findMaxCap(requests, M));
    }

    private static int findMaxCap(int[] requests, int totalBudget) {
        int left = 0;
        int right = Arrays.stream(requests).max().getAsInt();
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(requests, mid, totalBudget)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static boolean check(int[] requests, int cap, int totalBudget) {
        int sum = 0;
        for (int request : requests) {
            sum += Math.min(request, cap);
        }
        return sum <= totalBudget;
    }
}
