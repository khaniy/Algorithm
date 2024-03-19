package solution.number;

import java.io.IOException;
import java.util.Scanner;

public class S2581 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int first = 0;
        boolean isFirst = true;
        for (int i = M; i <= N; i++) {
            if (isPrimary(i)) {
                sum += i;
                if(isFirst){
                    first = i;
                    isFirst = false;
                }
            }
        }
        if(sum !=0){
            System.out.println(sum);
            System.out.println(first);
        }else {
            System.out.println(-1);
        }

    }

    private static boolean isPrimary(int i) {
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

}
