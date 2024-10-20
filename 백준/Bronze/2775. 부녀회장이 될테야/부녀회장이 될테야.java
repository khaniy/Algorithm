import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = readInt(br);
        for (int t = 0; t < T; t++) {
            int k = readInt(br);
            int n = readInt(br);

            int[][] apartment = new int[k + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                apartment[0][i] = i;
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    apartment[i][j] = apartment[i][j - 1] + apartment[i - 1][j];
                }
            }

            bw.write(String.valueOf(apartment[k][n])+System.lineSeparator());
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static int readInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }
}