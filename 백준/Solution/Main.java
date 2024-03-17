import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M, max;
    static int[] requests;

    public static void main(String[] args) throws IOException {

        given();
        when();
        then();
    }

    private static void given() throws IOException {
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        requests = new int[N];
        for (int i = 0; i < N; i++) {
            requests[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
    }

    private static int when() {
        int left = 0;
        int right = Arrays.stream(requests).max().getAsInt();
        max = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(requests, mid, M)) {
                max = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return max;

    }

    private static void then() {
        System.out.println(max);
    }

    private static boolean check(int[] requests, int cap, int totalBudget) {
        int sum = 0;
        for (int request : requests) {
            sum += Math.min(request, cap);
        }
        return sum <= totalBudget;
    }
}