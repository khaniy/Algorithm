import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int line = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];
        for (int i = 0; i < line; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    paper[x + j][y + k] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += paper[i][j];
            }
        }
        bw.write(String.valueOf(sum));
        bw.close();
        br.close();
    }

}