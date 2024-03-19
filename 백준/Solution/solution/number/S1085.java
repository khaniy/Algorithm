package solution.number;

import java.io.IOException;
import java.util.Scanner;

public class S1085 implements Solution {
    @Override
    public void solve() throws IOException {
        Scanner scanner = new Scanner(System.in);

        // x, y, w, h를 입력 받음
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        // x, y, w-x, h-y 중 최솟값을 구하여 출력
        int minDistance = Math.min(Math.min(x, w - x), Math.min(y, h - y));
        System.out.println(minDistance);
    }
}
