import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);
        int[] st = new int[N];
        for (int i = 0; i < N; i++) {
            st[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]) - 1;
            int end = Integer.parseInt(input[1]) - 1;
            int[] tempSt = new int[end - start + 1];
            for (int j = start; j <= end; j++) {
                tempSt[end - j] = st[j];
            }
            for (int j = 0; j < tempSt.length; j++) {
                st[start + j] = tempSt[j];
            }
        }
        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(st[i]) + " ");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}