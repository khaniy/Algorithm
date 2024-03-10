import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int newScore = scanner.nextInt();
        int P = scanner.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }
        int rank = findRank(scores, N, newScore, P);
        System.out.println(rank);
    }

    public static int findRank(int[] scores, int N, int newScore, int P) {

        if (N < P || (N == P && newScore > scores[N - 1])) {
            if (N == 0 || newScore > scores[0]) {
                return 1;
            } else {
                for (int i = 0; i < N; i++) {
                    if (newScore >= scores[i]) {
                        return i + 1;
                    }
                }
                return N + 1;
            }
        } else {
            return -1;
        }
    }
}