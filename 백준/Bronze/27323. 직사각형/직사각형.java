import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 세로 길이 A와 가로 길이 B를 입력 받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 직사각형의 넓이를 계산하여 출력
        int area = A * B;
        System.out.println(area);
    }
}